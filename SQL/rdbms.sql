CREATE TABLE
    ITEM_MAST (
        PRO_ID INT,
        PRO_NAME VARCHAR(20),
        PRO_PRICE INT,
        PRO_COM INT
    );

INSERT INTO
    ITEM_MAST
VALUES
    (101, 'Mother Board', 3200, 15);

INSERT INTO
    ITEM_MAST
VALUES
    (102, 'Key Board', 450, 16);

INSERT INTO
    ITEM_MAST
VALUES
    (103, 'Zip Drive', 250, 14);

INSERT INTO
    ITEM_MAST
VALUES
    (104, 'Speaker', 550, 16);

INSERT INTO
    ITEM_MAST
VALUES
    (105, 'Mointer', 5000, 11);

INSERT INTO
    ITEM_MAST
VALUES
    (106, 'DVD Drive', 900, 12);

INSERT INTO
    ITEM_MAST
VALUES
    (107, 'CD Drive', 800, 12);

INSERT INTO
    ITEM_MAST
VALUES
    (108, 'Printer', 2600, 13);

INSERT INTO
    ITEM_MAST
VALUES
    (109, 'Refill cartridge', 350, 13);

INSERT INTO
    ITEM_MAST
VALUES
    (110, 'Mouse', 250, 12);

SELECT
    *
FROM
    ITEM_MAST;

--24.Write a SQL query to find all the products with a price between Rs.200 and Rs.600.
SELECT
    *
FROM
    ITEM_MAST
WHERE
    PRO_PRICE BETWEEN 200 AND 600;

--26.Write a SQL query to calculate the average price of all products of the manufacturer which code is 16.
SELECT
    AVG(PRO_PRICE)
FROM
    ITEM_MAST
WHERE
    PRO_COM = 16;

--27.Write a SQL query to find the item nmae and price in Rs.
SELECT
    PRO_NAME,
    PRO_PRICE
FROM
    ITEM_MAST;

--28.Write a SQL query to display the name and price of all items with a price is equal or more than Rs.250, and the list contains the larger price and then by name in ascending order.
SELECT
    PRO_NAME,
    PRO_PRICE
FROM
    ITEM_MAST
WHERE
    PRO_PRICE >= 250
ORDER BY
    PRO_PRICE DESC,
    PRO_NAME ASC;

--29.Write a SQL query to display the average price of the items for each company , showing only the comapany code