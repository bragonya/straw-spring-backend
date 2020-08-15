-- Reference: https://dba.stackexchange.com/a/122624
CREATE TABLE customers(
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(20) NOT NULL,
    secondName VARCHAR(20),
    firstLastName VARCHAR(20) NOT NULL,
    secondLastName VARCHAR(20),
    address VARCHAR(250) NOT NULL,
    created_on timestamp without time zone DEFAULT NOW(),
    updated_on timestamp without time zone DEFAULT NOW(),
    active BOOLEAN DEFAULT true
);
