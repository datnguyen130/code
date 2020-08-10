GO
CREATE DATABASE Example5
GO
USE Example5
GO
CREATE TABLE LopHoc(
MaLopHoc INT PRIMARY KEY IDENTITY,
TenLopHoc VARCHAR(10)
)
GO
CREATE TABLE SinhVien(
MaSV int PRIMARY KEY,
TenSV varchar(40),
MaLopHoc int,
CONSTRAINT fk FOREIGN KEY (MaLopHoc) REFERENCES LopHoc(MaLopHoc)
)
GO
CREATE TABLE SanPham (
MaSP int NOT NULL,
TenSP varchar(40) Null
)
GO
create table StoreProduct(
ProductID int not null,
Name varchar(40) not null,
Price money not null default(100)
)
go
insert into [dbo].[StoreProduct] (ProductID,Name) values (111,'Rivets')
go
create table ContactPhone
( Person_ID int identity(500,1) not null,
MobileNumber bigint not null)
go
create table CellularPhone 
( Person_ID uniqueidentifier default newid() not null,
PersonName varchar(60) not null)
go
insert into [dbo].[CellularPhone](PersonName) values ('William Smitch')
go
select * from [dbo].[CellularPhone]
go
create table ContactPhone2 
(Person_ID int primary key,
MobileNumber bigint unique,
ServiceProvider varchar(30),
LandlineNumber bigint unique)
go
insert into ContactPhone2 values (101,983345674,'Hutch',110291)
insert into ContactPhone2 values (102,983345675,'Alex',110982)
go
alter table ContactPhone
add constraint pk_CP primary key (MobileNumber)
go
create table PhoneExpenses
(Expense_ID int primary key,
MobileNumber bigint foreign key references ContactPhone(MobileNumber),
Amount bigint check (amount >0)
)
go
alter table ContactPhone2 
alter column ServiceProvider varchar(45)
go
alter table ContactPhone add RentalCharges int
go
alter table ContactPhone add constraint chk_rc check(rentalcharges >0)
go
alter table ContactPhone 
drop constraint chk_rc