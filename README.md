# Payment-Gateway

## Objective

Implementation of API for a Payment Gateway using Sping Boot, Hibernate and MySQL Database.

## Functionl Requirements:
  The Following Payment type should be supported:
     1. Credit Card
     2. Debit Card
     
### The following will be the request  payload

 {
"amount": "100",
"currency": "USD",
"type": "creditcard",
"card": {
"number": "4111111111111111",
"expirationMonth": "2",
"expirationYear": "2020",
"cvv": "111"
}
}

### The following will be the request  payload

{
    "amount": 100.0,
    "currency": "USD",
    "type": "creditcard",
    "card": {
        "number": 4111111111111111
    },
    "time": "2020-09-19T17:48:39.616",
    "status": "success",
    "authorization_code": "SDSD23232334"
}

## Technologies used
 
   Spring Boot, Hibernate, MYSQL database.
   
   
   
   
   
   
   
  
   
   
   
   
   
   
   
