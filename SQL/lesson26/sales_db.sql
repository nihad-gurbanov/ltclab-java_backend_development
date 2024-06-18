-- Create Sales Table
CREATE TABLE Sales (
    sale_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    quantity_sold INT,
    unit_price DECIMAL(10, 2)
);

-- Create a new column named product_category:
ALTER TABLE Sales
ADD COLUMN product_category VARCHAR(50);


-- Insert 30 records into Sales Table
INSERT INTO Sales (sale_id, product_name, quantity_sold, unit_price, product_category)
VALUES
    (1, 'Laptop', 10, 1200.00, 'Electronics'),
    (2, 'T-shirt', 50, 20.00, 'Clothing'),
    (3, 'Shampoo', 100, 8.50, 'Personal Care'),
    (4, 'Smartphone', 30, 800.00, 'Electronics'),
    (5, 'Jeans', 40, 35.00, 'Clothing'),
    (6, 'Soap', 200, 2.50, 'Personal Care'),
    (7, 'Blender', 15, 75.00, 'Home and Kitchen'),
    (8, 'Sneakers', 25, 50.00, 'Clothing'),
    (9, 'Toothpaste', 150, 3.00, 'Personal Care'),
    (10, 'Coffee Maker', 8, 120.00, 'Home and Kitchen'),
    (11, 'Tablet', 12, 500.00, 'Electronics'),
    (12, 'Dress', 30, 45.00, 'Clothing'),
    (13, 'Conditioner', 80, 7.00, 'Personal Care'),
    (14, 'Vacuum Cleaner', 10, 200.00, 'Home and Kitchen'),
    (15, 'Headphones', 20, 150.00, 'Electronics'),
    (16, 'Sweater', 35, 30.00, 'Clothing'),
    (17, 'Hand Sanitizer', 120, 4.50, 'Personal Care'),
    (18, 'Microwave Oven', 5, 250.00, 'Home and Kitchen'),
    (19, 'Camera', 6, 700.00, 'Electronics'),
    (20, 'Shorts', 60, 25.00, 'Clothing'),
    (21, 'Body Lotion', 90, 6.50, 'Personal Care'),
    (22, 'Air Fryer', 7, 180.00, 'Home and Kitchen'),
    (23, 'Smart Watch', 15, 300.00, 'Electronics'),
    (24, 'Jacket', 25, 70.00, 'Clothing'),
    (25, 'Face Mask', 200, 1.50, 'Personal Care'),
    (26, 'Rice Cooker', 12, 100.00, 'Home and Kitchen'),
    (27, 'Printer', 4, 150.00, 'Electronics'),
    (28, 'Skirt', 20, 40.00, 'Clothing'),
    (29, 'Sunscreen', 70, 5.00, 'Personal Care'),
    (30, 'Cookware Set', 5, 150.00, 'Home and Kitchen');

-- Delete a sale with a specific sale_id
DELETE FROM Sales
WHERE sale_id = 10;

-- Update the quantity sold of a sale with a specific sale_id to a new value
UPDATE Sales
SET quantity_sold = 25
WHERE sale_id = 5;

-- Calculate and display the average unit price of all sales
SELECT AVG(unit_price) AS average_unit_price
FROM Sales;

-- Retrieve the sale with the maximum unit price
SELECT *
FROM Sales
WHERE unit_price = (SELECT MAX(unit_price) FROM Sales);

-- Retrieve the sale with the minimum unit price
SELECT *
FROM Sales
WHERE unit_price = (SELECT MIN(unit_price) FROM Sales);

-- Retrieve sales where the unit price is greater than average unit price
SELECT *
FROM Sales
WHERE unit_price > (SELECT AVG(unit_price) FROM Sales);

-- Retrieve all sales, ordered by unit price in ascending order
SELECT *
FROM Sales
ORDER BY unit_price ASC;

-- Count the number of sales for each product category
SELECT product_category, COUNT(*) AS num_sales
FROM Sales
GROUP BY product_category;

-- Calculate the total revenue generated from all sales
SELECT SUM(quantity_sold * unit_price) AS total_revenue
FROM Sales;

-- Retrieve the top 5 best-selling products (based on quantity sold)
SELECT *
FROM Sales
ORDER BY quantity_sold DESC
LIMIT 5;

-- Calculate the total revenue generated from each product category
SELECT product_category, SUM(quantity_sold * unit_price) AS category_revenue
FROM Sales
GROUP BY product_category;
