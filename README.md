
# CAFE POS SYSTEM

This project aims to create a simple terminal based menu Point Of Sale system, creating an efficient interface for order listing, transactions, and total computations.  


## Technologies used
- Java 23
## Technical Specifications
- Java 8 or higher
- Command Line interface
- File system access & IDE Authorization trust

## Features

- **Transaction History**: automated listing after every successful trannsaction.
- **Dynamic Menu Listing**: Dynamic changes within menus across system when chaged.
`when 'itemElem.txt' & 'prices.txt' are manipulated.`

- **CRUD**: Ability to Create, Read, Update, and Delete orders as needed.
## System Architecture
### Core classes
- **Main.java**: Entry point of the program and the system's main interface
- **itemPrice.java**: System data file readers and storage attributes
- **orderInterface.java**: Core order input and data manipulation logic interface
- **Operations.java**: Arithmetic logics and transaction record utilities

### File Structure
```
Cafe-POS-system
│   itemPrice.java
│   Main.java
│   Operations.java
│   orderInterface.java
│
└───Data
        itemElem.txt
        items.txt
        prices.txt
        transactions.txt
```
## In-depth to key features

**Transaction History**

- In each successful transaction, history will be dynamically written within system data
- Includes timestamps and transaction total

**Dynamic menu listing**

- In system data changes dynamically, prior to changes made in data files

**Core Actions (CRUD)**

- **Add**: request for order input, follows stack structure based on insertion order

- **Done**: manipulates boolean values to proceed for order confirmation

- **Remove**: removes order based on choice