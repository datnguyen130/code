CREATE DATABASE Asm5
USE Asm5
GO
--2
CREATE TABLE TenDB(
MaDB int,
HoTen varchar(30),
DiaChi varchar(100),
NgaySinh datetime)
GO
CREATE TABLE SoDT(
MaDB int,
SoDT varchar(10) CHECK (SoDT LIKE '0%'))
GO
--3
INSERT INTO TenDB VALUES (111,'Nguyen Van A','111 Nguyen Trai, Thanh Xuan','1987-11-18')
INSERT INTO TenDB VALUES (121,'Nguyen Van B','1 Cau Am, Ha Dong','1996-5-13')
INSERT INTO TenDB VALUES (131,'Nguyen Van C','20 Nguyen Tuan, Thanh Xuan','1992-4-19')
INSERT INTO TenDB VALUES (141,'Nguyen Van D','341 Le Van Luong, Cau Giay','1994-9-5')
INSERT INTO TenDB VALUES (151,'Nguyen Van E','51 Nguyen Tri Phuong, Hoan Kiem','1989-12-18')
GO
INSERT INTO SoDT VALUES (111,'0987654321')
INSERT INTO SoDT VALUES (111,'0987345243')
INSERT INTO SoDT VALUES (111,'0984739457')
INSERT INTO SoDT VALUES (121,'0993401232')
INSERT INTO SoDT VALUES (121,'0821468312')
INSERT INTO SoDT VALUES (131,'0793239843')
INSERT INTO SoDT VALUES (141,'0938479203')
INSERT INTO SoDT VALUES (141,'0123908211')
INSERT INTO SoDT VALUES (151,'0938749282')
INSERT INTO SoDT VALUES (151,'0983748921')
INSERT INTO SoDT VALUES (151,'0843748294')
GO
--4
SELECT *  FROM TenDB
GO
SELECT * FROM SoDT
GO
--5
SELECT * FROM TenDB
ORDER BY HoTen
GO
SELECT HoTen,SoDT FROM TenDB
JOIN SoDT ON TenDB.MaDB = SoDT.MaDB
WHERE HoTen = 'Nguyen Van A'
GO
SELECT * FROM TenDB
WHERE NgaySinh = '1994-9-5'
GO
--6
SELECT HoTen, COUNT(SoDT) AS TongSoDT FROM TenDB
JOIN SoDT ON SoDT.MaDB=TenDB.MaDB
GROUP BY HoTen
GO
SELECT COUNT(MaDB) AS SoNguoiSinhT12 FROM TenDB
WHERE DATEPART(mm,NgaySinh) = 12
GO
SELECT TenDB.MaDB,HoTen,SoDT,DiaChi,NgaySinh FROM TenDB
JOIN SoDT ON TenDB.MaDB = SoDT.MaDB
GO
SELECT TenDB.MaDB, HoTen, DiaChi, NgaySinh FROM TenDB
JOIN SoDT ON TenDB.MaDB=SoDT.MaDB
WHERE SoDT = '0938749282'
GO
--7
ALTER TABLE TenDB
ADD CONSTRAINT ch1 CHECK (NgaySinh < GETDATE())
GO
ALTER TABLE TenDB
ALTER COLUMN MaDB int NOT NULL
GO
ALTER TABLE TenDB
ADD CONSTRAINT pk1 PRIMARY KEY (MaDB)
GO
ALTER TABLE SoDT
ADD CONSTRAINT fk1 FOREIGN KEY (MaDB) REFERENCES TenDB(MaDB)
GO
ALTER TABLE SoDT
ADD NgayBDLL Datetime
GO
--8
CREATE INDEX IX_HoTen ON TenDB(HoTen)
GO
CREATE INDEX IX_SoDienThoai ON SoDT(SoDT)
GO
CREATE VIEW View_SoDienThoai
AS
SELECT HoTen, SoDT FROM TenDB
JOIN SoDT ON TenDB.MaDB=SoDT.MaDB
GO
CREATE VIEW View_SinhNhat
AS
SELECT HoTen,NgaySinh,SoDT FROM TenDB
JOIN SoDT ON TenDB.MaDB=SoDT.MaDB
WHERE DATEPART(mm,NgaySinh) = DATEPART(mm,getdate())
GO
CREATE PROC SP_Them_DanhBa
@MaDB int,
@HoTen varchar(30),
@DiaChi varchar(100),
@NgaySinh datetime,
@SoDT varchar(10)
AS
INSERT INTO TenDB(MaDB,HoTen,DiaChi,NgaySinh) VALUES (@MaDB,@HoTen,@DiaChi,@NgaySinh)
INSERT INTO SoDT(MaDB,SoDT) VALUES (@MaDB,@SoDT)
GO
CREATE PROC SP_Tim_DanhBa
@HoTen varchar(30)
AS
SELECT TenDB.MaDB,HoTen,DiaChi,NgaySinh,SoDT FROM TenDB
JOIN SoDT ON TenDB.MaDB=SoDT.MaDB
WHERE HoTen LIKE '%' + @HoTen + '%'
GO