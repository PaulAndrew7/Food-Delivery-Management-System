CREATE
OR REPLACE PROCEDURE CheckLocationPincode (p_pincode IN VARCHAR2, p_exists OUT NUMBER) AS BEGIN
SELECT
    COUNT(*) INTO p_exists
FROM
    location
WHERE
    pincode = p_pincode;

END;

/
-- Create users table
DROP TABLE users CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    users (
        user_id VARCHAR2 (4) CONSTRAINT user_id_pk PRIMARY KEY,
        username VARCHAR2 (20) UNIQUE NOT NULL,
        password VARCHAR2 (30) NOT NULL,
        phone_no VARCHAR2 (10) NOT NULL,
        email_id VARCHAR2 (30),
        CONSTRAINT user_id_check CHECK (user_id LIKE 'U%'),
        CONSTRAINT email_id_check CHECK (email_id LIKE '%@%.com'),
        CONSTRAINT phone_no_check CHECK (
            LENGTH (phone_no) = 10
            AND REGEXP_LIKE (phone_no, '^[0-9]+$')
        )
    );

-- Create user_address table
DROP TABLE user_address CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    user_address (
        user_id VARCHAR2 (4) CONSTRAINT user_id_fk REFERENCES users (user_id),
        door_no VARCHAR2 (10),
        street VARCHAR2 (50),
        pincode VARCHAR2 (6) CONSTRAINT pincode_check CHECK (
            LENGTH (pincode) = 6
            AND REGEXP_LIKE (pincode, '^[0-9]+$')
        )
    );

-- Create restaurant table
DROP TABLE restaurant CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    restaurant (
        restaurant_id VARCHAR2 (4) CONSTRAINT restaurant_id_pk PRIMARY KEY,
        restaurant_name VARCHAR2 (50) UNIQUE,
        address VARCHAR2 (100),
        cuisine_type VARCHAR2 (30) CONSTRAINT cuisine_type_check CHECK (
            cuisine_type IN (
                'Italian',
                'Chinese',
                'Indian',
                'Mexican',
                'American',
                'Japanese',
                'French',
                'Thai',
                'Greek',
                'Spanish'
            )
        ),
        CONSTRAINT restaurant_id_check CHECK (restaurant_id LIKE 'R%')
    );

-- Create menu
DROP TABLE menu_item CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    menu_item (
        item_id VARCHAR2 (5) CONSTRAINT item_id_pk PRIMARY KEY,
        restaurant_id VARCHAR2 (4) CONSTRAINT restaurant_id_fk REFERENCES restaurant (restaurant_id),
        item_name VARCHAR2 (50),
        price FLOAT,
        CONSTRAINT menu_item_id_check CHECK (item_id LIKE 'M%')
    );

-- Create delivery_personnel table
DROP TABLE delivery_personnel CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    delivery_personnel (
        dp_id VARCHAR2 (4) CONSTRAINT dp_id_pk PRIMARY KEY,
        vehicle_no VARCHAR2 (15) CONSTRAINT vehicle_no_unique UNIQUE,
        availability VARCHAR2 (20) CONSTRAINT availability_check CHECK (availability IN ('Available', 'Unavailable')),
        dp_name VARCHAR2 (50),
        dp_no NUMBER (10) CONSTRAINT dp_no_unique UNIQUE,
        CONSTRAINT dp_id_check CHECK (dp_id LIKE 'D%')
    );

-- Create orders table
DROP TABLE orders CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    orders (
        order_id VARCHAR2 (4),
        user_id VARCHAR2 (4) CONSTRAINT orders_user_id_fk REFERENCES users (user_id),
        restaurant_id VARCHAR2 (4) CONSTRAINT orders_restaurant_id_fk REFERENCES restaurant (restaurant_id),
        dp_id VARCHAR2 (4) CONSTRAINT orders_dp_id_fk REFERENCES delivery_personnel (dp_id),
        order_time TIMESTAMP,
        delivery_time TIMESTAMP,
        payment_id VARCHAR2 (4),
        status VARCHAR2 (10) CONSTRAINT status_check CHECK (status IN ('Preparing', 'Delivered')),
        CONSTRAINT order_payment_id_pk PRIMARY KEY (order_id),
        CONSTRAINT order_id_check CHECK (order_id LIKE 'O%')
    );

-- Create payment table
DROP TABLE payment CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    payment (
        payment_id VARCHAR2 (4) CONSTRAINT payment_id_pk PRIMARY KEY,
        amount NUMBER,
        payment_date DATE,
        CONSTRAINT payment_id_check CHECK (payment_id LIKE 'P%')
    );

-- Create order_item table
DROP TABLE order_item CASCADE CONSTRAINTS PURGE;
CREATE TABLE
    order_item (
        order_id VARCHAR2 (4),
        item_id VARCHAR2 (4),
        quantity NUMBER,
        CONSTRAINT order_item_order_id_fk FOREIGN KEY (order_id) REFERENCES orders (order_id),
        CONSTRAINT order_item_item_id_fk FOREIGN KEY (item_id) REFERENCES menu_item (item_id)
    );