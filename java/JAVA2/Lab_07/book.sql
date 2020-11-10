DROP DATABASE Libary;
CREATE DATABASE IF NOT EXISTS Libary;
USE Libary;
CREATE TABLE Categorys(
    Idcate int ,
    Category varchar(50) PRIMARY KEY,
	Created date,
    Updated date);
DROP TABLE IF EXISTS Books;
CREATE TABLE Books(
    IdBook int PRIMARY KEY,
    NameBook varchar(50),
    Author varchar(50),
    YearPushlish year,
    Category varchar(50),
    Price decimal,
    Qty int,
    Status int, -- 0: hết hàng, 1: còn hàng, 2: sắp về
    Created date,
    Updated date,
    FOREIGN KEY (Category) REFERENCES Categorys(Category));

DROP TABLE IF EXISTS Users;
CREATE TABLE Users(
    IdUser int NOT NULL  AUTO_INCREMENT PRIMARY KEY,
    Username varchar(20) UNIQUE ,
    Password varchar(20),
    Role int CHECK (Role in (1,2)),
    Created date,
    Updated date
);

DROP TABLE IF EXISTS Customer;
CREATE TABLE Customer(
    IdCus int NOT NULL ,
    NameCus varchar(50),
    Address varchar(50),
	Email varchar(50),
	Phone int,
	level int CHECK (level in (1,2,3)), -- 1: nomarl, 2: VIP, 3: V VIP
	Created date,
    Updated date,
    FOREIGN KEY (IdCus) REFERENCES Users(IdUser));
DROP TABLE IF EXISTS Orders;
CREATE TABLE Orders(
    IdOrders varchar(10) PRIMARY KEY,
    IdCus int,
    Status int, -- 0: đơn hàng bị hủy, 1: đơn hàng mới tiếp nhận, 2: đơn hàng chờ xử lý, 3: đơn hàng đã đóng gói, 4: đơn hàng đã gửi vận chuyển, 5: đơn hàng đã giao thành công
    Total decimal,
    TimeOrder date,
    Created date,
    Updated date,
    FOREIGN KEY (IdCus) REFERENCES Users(IdUser));
DROP TABLE IF EXISTS OrderDetail;
CREATE TABLE OrderDetail(
    IdOrder varchar(10),
    IdBook int,
    Qty int,
    Price decimal,
    Created date,
    Updated date,
	CONSTRAINT Fk_IdOrder FOREIGN KEY (IdOrder) REFERENCES Orders(IdOrders),
    CONSTRAINT Fk_IdBook FOREIGN KEY (IdBook) REFERENCES Books(IdBook));

INSERT INTO Categorys(Idcate, Category, Created) VALUES (1,'Category_1',CURRENT_DATE());
INSERT INTO Categorys(Idcate, Category, Created) VALUES (2,'Category_2',CURRENT_DATE());
INSERT INTO Categorys(Idcate, Category, Created) VALUES (3,'Category_3',CURRENT_DATE());
INSERT INTO Categorys(Idcate, Category, Created) VALUES (4,'Category_4',CURRENT_DATE());
INSERT INTO Categorys(Idcate, Category, Created) VALUES (5,'Category_5',CURRENT_DATE());


INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (101, 'Book_1', 'Author_1', 2000, 'Category_1', 200, 50, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (102, 'Book_2', 'Author_2', 2010, 'Category_1', 300, 0, 0, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (103, 'Book_3', 'Author_3', 2000, 'Category_1', 250, 0, 2, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (104, 'Book_4', 'Author_4', 2002, 'Category_2', 200, 100, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (105, 'Book_5', 'Author_5', 2003, 'Category_2', 400, 0, 0, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (106, 'Book_6', 'Author_6', 2004, 'Category_2', 250, 0, 2, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (107, 'Book_7', 'Author_7', 2005, 'Category_1', 200, 60, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (108, 'Book_8', 'Author_1', 2006, 'Category_3', 350, 70, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (109, 'Book_9', 'Author_2', 2000, 'Category_4', 200, 0, 2, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (110, 'Book_10', 'Author_1', 2001, 'Category_5', 300, 50, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (111, 'Book_11', 'Author_8', 2001, 'Category_5', 200, 0, 2, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (112, 'Book_12', 'Author_3', 2010, 'Category_1', 500, 100, 1, CURRENT_DATE());
INSERT INTO Books(IdBook, NameBook, Author, YearPushlish, Category, Price, Qty, Status, Created)
VALUES (113, 'Book_13', 'Author_2', 2005, 'Category_2', 100, 50, 1, CURRENT_DATE());

INSERT INTO Users(IdUser, Username, Password, Role, Created) VALUES -- role in (0,1,2,3)
(501,'User_name_1','dvefdf',1,CURRENT_DATE()),
(502,'User_name_2','fvernr',2,CURRENT_DATE()),
(503,'User_name_3','ferq3fg',2,CURRENT_DATE()),
(504,'User_name_4','13rergg5',2,CURRENT_DATE()),
(505,'User_name_5','e45wefd',2,CURRENT_DATE()),
(506,'User_name_6','4t4erg5',2,CURRENT_DATE()),
(507,'User_name_7','e45wefd',2,CURRENT_DATE()),
(508,'User_name_8','e45wefd',2,CURRENT_DATE()),
(509,'User_name_9','e45wefd',2,CURRENT_DATE()),
(510,'User_name_10','e45wefd',2,CURRENT_DATE()),
(511,'User_name_11','24gv342',2,CURRENT_DATE());


INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (501, 'Customer_1', 'Address_1', 'Email_1@email.com', 123456789, 1, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (502, 'Customer_2', 'Address_2', 'Email_2@email.com', 223456789, 1, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (503, 'Customer_3', 'Address_3', 'Email_3@email.com', 323456789, 2, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (504, 'Customer_4', 'Address_4', 'Email_4@email.com', 423456789, 2, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (505, 'Customer_5', 'Address_5', 'Email_5@email.com', 523456789, 3, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (506, 'Customer_6', 'Address_6', 'Email_6@email.com', 623456789, 1, CURRENT_DATE());
INSERT INTO Customer(IdCus, NameCus, Address, Email, Phone, level, Created) VALUES (507, 'Customer_7', 'Address_7', 'Email_7@email.com', 723456789, 1, CURRENT_DATE());


INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A001', 501, 1, 1200, '2020-10-30', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A002', 501, 0, 2000, '2020-10-20', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A003', 501, 2, 1500, '2020-10-25', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A004', 502, 2, 500, '2020-10-28', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A005', 503, 3, 2500, '2020-10-26', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A006', 504, 4, 900, '2020-10-30', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A007', 501, 5, 1500, '2020-9-20', CURRENT_DATE());
INSERT INTO Orders(IdOrders, IdCus, Status, Total, TimeOrder, Created)
VALUES ('A008', 502, 5, 2500, '2020-9-10', CURRENT_DATE());

INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A001', 101, 2, 180, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A001', 102, 1, 150, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A001', 103, 1, 250, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A008', 104, 1, 220, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A002', 105, 1, 300, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A002', 106, 2, 150, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A003', 107, 2, 180, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A004', 108, 2, 180, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A005', 101, 4, 180, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A006', 102, 2, 180, CURRENT_DATE());
INSERT INTO OrderDetail(IdOrder, IdBook, Qty, Price, Created) VALUES ('A007', 101, 2, 180, CURRENT_DATE());

