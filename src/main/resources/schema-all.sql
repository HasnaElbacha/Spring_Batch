drop table Orders if exists;
CREATE TABLE orders (
                        order_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
                        customer_name VARCHAR(100) NOT NULL,
                        amount DOUBLE NOT NULL
);