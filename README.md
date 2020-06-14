# ticketsystem

ALTER TABLE TICKET ALTER COLUMN FLIGHT VARCHAR(16777216) ;

```
I increase the size  because I saved  as json
```

en son response

```

add Company
--------------------
[
    {
        "id": 1,
        "name": "THY"
    }
]

add Route 
--------------------
{
    "originDestination":"Istanbul",
    "destination":"Izmir",
    "departureTime":"02/022020 15:00",
    "landingTime":"02/022020 16:00"
}


add Airport
-----------------

{
    "name":"SABIHA GOKCEN"
}

add Flight 
-------------

{
    "company": {
        "id": 1,
        "name": "THY"
    },
    "route": {
        "id": 2,
        "originDestination": "Istanbul",
        "destination": "Izmir",
        "departureTime": "02/022020 15:00",
        "landingTime": "02/022020 16:00"
    },
    "airport": {
        "id": 3,
        "name": "SABIHA GOKCEN"
    },
    "quota": 120,
    "price": 100.0
}



add Ticket 
----------------

{
    "flight": {
        "id": 4,
        "company": {
            "id": 1,
            "name": "THY"
        },
        "route": {
            "id": 2,
            "originDestination": "Istanbul",
            "destination": "Izmir",
            "departureTime": "02/022020 15:00",
            "landingTime": "02/022020 16:00"
        },
        "airport": {
            "id": 3,
            "name": "SABIHA GOKCEN"
        },
        "price": 100.0,
        "soldSeat": null,
        "quota": 120
    },
    "ticketStatus": "SOLD",
    "cost": 12.0,
    "creditCard":"4221-1611-2233-0005"
}

```

We will expose our API 


        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
and will be avaliable to see 
http://localhost:8080/v2/api-docs



and there is also UI tool for these
http://localhost:8080/swagger-ui.html

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        
        