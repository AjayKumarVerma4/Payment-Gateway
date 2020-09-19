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

### The following will be the response payload

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
   
   
## Images
   
![Screenshot from 2020-09-19 17-21-25](https://user-images.githubusercontent.com/66169115/93667311-a0f0c100-faa2-11ea-84b9-c859c04a8c63.png)
   
![Screenshot from 2020-09-19 17-21-36](https://user-images.githubusercontent.com/66169115/93667347-d4335000-faa2-11ea-9a1b-54686d62612b.png)

![Screenshot from 2020-09-19 **16-48-05](https://user-images.githubusercontent.com/66169115/93667350-dbf2f480-faa2-11ea-8a46-57a19a57a8dd.png)**


   
   
   
   
  
   
   
   
   
   
   
   
