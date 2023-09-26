DROP TABLE products IF EXISTS;

CREATE TABLE products (
    id VARCHAR(25) PRIMARY KEY,
    name VARCHAR(50),
    description VARCHAR(250),
    unit_price DECIMAL,
    manufacturer VARCHAR(50),
    category VARCHAR(50),
    condition VARCHAR(50),
    units_in_stock BIGINT,
    units_in_order BIGINT,
    discontinued BOOLEAN
);

DROP TABLE customers IF EXISTS;

CREATE TABLE customers (
    id VARCHAR(25) PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(250),
    no_of_orders BIGINT
);