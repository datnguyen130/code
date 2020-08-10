CREATE DATABASE LAB08
USE LAB08
GO

CREATE TABLE Customer(
CustomerID int primary key,
CustomerName varchar(50),
Address varchar(100),
Phone varchar(10))
GO

CREATE TABLE Book(
BookCode int primary key,
Category varchar(50),
Author varchar(50),
Publisher varchar(50),
Title varchar(100),
Price int,
InStore int)
GO

CREATE TABLE BookSold(
BookSoldID int primary key,
CustomerID int,
BookCode int,
Date datetime,
Price int,
Amount int,
constraint FK_1 foreign key(CustomerID) references Customer(CustomerID),
constraint FK_2 foreign key(BookCode) references Book(BookCode))
GO

-- 1 Chèn 5 bản ghi vào BOOK, 5 bản ghi vào Customer, 10 bản ghi vào BookSold

INSERT INTO Customer VALUES (1,'Human','VietNam','6668889999')
INSERT INTO Customer VALUES (2,'Dolphin','Cuba','1234567890')
INSERT INTO Customer VALUES (3,'Bufallo','China','8739571892')
INSERT INTO Customer VALUES (4,'Fly','America','777777777')
INSERT INTO Customer VALUES (5,'Bird','Russia','9999988866')
GO

INSERT INTO Book VALUES (101,'Chinh Tri','John Kenedy','America Book','An com cho de thanh ti phu',100,1000)
INSERT INTO Book VALUES (102,'Ngon Tinh','Diep Lac Vo Tam','Love Book','Gio thoi ky uc thanh nhung canh hoa',500,200)
INSERT INTO Book VALUES (103,'Trinh Tham','Dan Brown','Knowleged Book','Thien than va ac quy',800,500)
INSERT INTO Book VALUES (104,'Trinh Tham','Dan Brown','American Book','Hoa Nguc',400,1000)
INSERT INTO Book VALUES (105,'Cuoc Song','‎Paulo Coelho','ABC Book','Nha Gia Kim',1000,500)
GO

INSERT INTO BookSold VALUES (5555,1,105,'2019-05-13',900,10)
INSERT INTO BookSold VALUES (5556,1,104,'2018-05-13',500,20)
INSERT INTO BookSold VALUES (5557,1,102,'2019-02-13',500,50)
INSERT INTO BookSold VALUES (5558,2,103,'2017-05-13',800,100)
INSERT INTO BookSold VALUES (5559,2,105,'2018-05-13',1000,30)
INSERT INTO BookSold VALUES (5560,2,102,'2020-05-13',500,20)
INSERT INTO BookSold VALUES (5561,3,105,'2019-05-13',1000,100)
INSERT INTO BookSold VALUES (5562,4,103,'2016-05-13',800,55)
INSERT INTO BookSold VALUES (5563,5,102,'2019-08-13',500,88)
INSERT INTO BookSold VALUES (5564,5,104,'2020-01-01',400,100)
GO

-- 2. Tạo views chứa danh sách các cuốn sách (BookCode, Tittle,Price) kèm theo số lượng đã bán được của mỗi cuốn sách
CREATE VIEW Book_Sold_Detail
AS
SELECT A.BookCode,A.Title,B.Price,B.SumAmount
FROM (SELECT BookCode,Title from Book)A
JOIN (SELECT Price,Sum(Amount) AS SumAmount,BookCode from BookSold Group BY Price,BookCode)B
ON A.BookCode = B.BookCode
GO

SELECT * FROM Book_Sold_Detail
GO

-- 3. Tạo view chứa danh sách các khách hàng (CustomerID, CustomerName, Address) kèm theo số lượng các cuốn sách mà khách hàng đó đã mua
CREATE VIEW Customer_Book_Details
AS
SELECT A.CustomerID, CustomerName, Address, sumamount
FROM (SELECT CustomerId, CustomerName, Address FROM Customer)A
JOIN (SELECT Sum(Amount) as sumamount,CustomerID FROM BookSold group by CustomerID)B
on A.CustomerID = B.CustomerID
GO

-- 4. Tọa view chứa danh sách các khách hàng (CustomerID, CustomerName, Address) đã mua sách năm 2019 kèm theo tên các cuốn sách mà khách đã mua
Create View Customer_BookSold_Details_2019
as
select A.CustomerID, CustomerName,Address, B.Date, C.NameBook
from (select CustomerID, CustomerName, Address from Customer)A
join (select Date, BookCode, CustomerID from BookSold)B on A.CustomerID = B.CustomerID
join (select BookCode, Title as NameBook from Book)C on B.BookCode = C.BookCode
where YEAR(B.Date) = 2019
go

-- 5. Tạo view chứa danh sách các khách hành kèm theo tổng tiền mà mỗi khách đã chi cho việc mua sách
create view Customer_Amount_Money
as
select A.CustomerID, A.CustomerName, sum(B.Money) AS AmountMoney
from (select CustomerName, CustomerID from Customer) A
join (select Amount,Price, Amount*Price AS Money, CustomerID from BookSold) B
on A.CustomerID = B.CustomerID
group by A.CustomerID, A.CustomerName
