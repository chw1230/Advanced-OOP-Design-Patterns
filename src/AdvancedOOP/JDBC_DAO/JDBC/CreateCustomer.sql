DROP TABLE IF EXISTS customers;  
CREATE TABLE customers (
id INTEGER PRIMARY KEY AUTOINCREMENT, /* pk */
name TEXT NOT NULL,                
address TEXT NOT NULL,             
email TEXT NOT NULL,               
phone TEXT NOT NULL
);
INSERT INTO customers(name, address, email, phone) 
VALUES ('홍지문', '서울시종로구홍지동7', 
'jmhong@smu.ac.kr', '01012345678');
INSERT INTO customers(name, address, email, phone) 
VALUES ('Hong, Jisam', 'Hongji-dong 7 Jongro-gu
Seoul', 'jshong@smu.ac.kr', '01012345679');
.tables
.schema customers
SELECT * FROM customers;