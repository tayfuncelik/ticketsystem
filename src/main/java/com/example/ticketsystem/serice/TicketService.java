package com.example.ticketsystem.serice;

import com.example.ticketsystem.Dao.FlightRepository;
import com.example.ticketsystem.Dao.TicketRepository;
import com.example.ticketsystem.model.Flight;
import com.example.ticketsystem.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    FlightRepository flightRepository;

    public List<Ticket> getAll() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(ticket -> tickets.add(ticket));
        return tickets;
    }

    public void addTicket(Ticket ticket) {

        if (ticket.getFlight().getSoldSeat() == null) {
            ticket.getFlight().setSoldSeat(1);
        } else {
            ticket.getFlight().setSoldSeat(ticket.getFlight().getSoldSeat() + 1);
        }

        ticket.setCreditCard(maskCCNumber(convertDigit(ticket.getCreditCard()))); // masked

        int maxSeat = ticket.getFlight().getQuota();
        int soldSeat = ticket.getFlight().getSoldSeat();
        int perc = 10;// %10

        ticket.getFlight().setSoldSeat(soldSeat + 1);
        flightRepository.save(ticket.getFlight());

        int total = calculateIncreament(soldSeat, maxSeat, perc);
        ticket.setCost(total * perc * 1.0 * ticket.getFlight().getPrice());
        
        flightRepository.save(ticket.getFlight());
        ticketRepository.save(ticket);
    }


    private Integer calculateIncreament(Integer soldSeat, Integer totalSeat, Integer perc) {

        int mod = calculateMod(totalSeat, perc);
        int increaseCount = 0;
        for (int i = 1; i <= mod; i++) {
            if (soldSeat > i * perc) {
                increaseCount++;
            }
        }
        return increaseCount;
    }

    private Integer calculateMod(Integer totalSeat, Integer perc) {
        if (totalSeat % perc != 0) {
            return totalSeat % perc;
        } else {
            return totalSeat / perc;
        }
    }

    private String maskCCNumber(String ccnum) {
        int total = ccnum.length();
        int startlen = 6, endlen = 4;
        int masklen = total - (startlen + endlen);
        StringBuffer maskedbuf = new StringBuffer(ccnum.substring(0, startlen));
        for (int i = 0; i < masklen; i++) {
            maskedbuf.append('X');
        }
        maskedbuf.append(ccnum.substring(startlen + masklen, total));
        return maskedbuf.toString();
    }

    private String convertDigit(String value) {
        StringBuffer sBuffer = new StringBuffer();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(value);
        while (matcher.find()) {
            sBuffer.append(matcher.group());
        }
        return sBuffer.toString();
    }

}
