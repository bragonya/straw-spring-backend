-- Reference: https://dba.stackexchange.com/a/122624
CREATE TABLE points(
    id SERIAL PRIMARY KEY,
    longitude DOUBLE PRECISION NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    customer_fk INTEGER REFERENCES customers(id)
);
