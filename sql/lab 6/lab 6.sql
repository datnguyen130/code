create database lab6
use lab6
go
-- T?o c�c b?ng
create table Mat_Hang (
MaSP int,
TenSP nvarchar(30),
DonVi nvarchar(10) default(N'Chi?c'),
Gia money check (Gia >0),
constraint PK_1 primary key(MaSP,TenSP))
go
create table Khach_Hang (
MaKH int primary key ,
TenKH nvarchar(50),
Diachi nvarchar(100),
SDT bigint)
go
create table Don_Hang(
MaDon int primary key,
MaKH int foreign key references Khach_Hang(MaKH),
NgayDat datetime check(NgayDat<Getdate()),
TongTien money,
TrangThai varchar(20) check (TrangThai in ('NhanDon','VanChuyen','HoanThanh'))
)
go
create table Don_Hang_CT(
MaDon int foreign key references Don_Hang(MaDon),
MaSP int ,
TenSP nvarchar(30),
SoLuong int check (SoLuong >0),
GiaBan money check (GiaBan >0),
constraint FK_1 foreign key(MaSP,TenSP) references Mat_Hang(MaSP,TenSP))
GO
--3
INSERT INTO Mat_Hang VALUES (001,N'M�y T�nh T450',N'Chi?c',1000)
INSERT INTO Mat_Hang VALUES (002,N'�i?n Tho?i Nokia 5670',N'Chi?c',200)
INSERT INTO Mat_Hang VALUES (003,N'M�y In Samsung 450',N'Chi?c',100)
GO

INSERT INTO Khach_Hang VALUES (111,'Nguyen Van A','Ha Noi',0938234782)
INSERT INTO Khach_Hang VALUES (222,'Duong Van B','Bac Giang',0482917382)
INSERT INTO Khach_Hang VALUES (333,'Hoang Van C','Bac Ninh',064312394)
GO

INSERT INTO Don_Hang VALUES (001111,111,'2020-4-20',1200,'VanChuyen')
INSERT INTO Don_Hang VALUES (001222,222,'2020-5-13',1000,'NhanDon')
INSERT INTO Don_Hang VALUES (001333,222,'2020-3-15',100,'HoanThanh')
GO

INSERT INTO Don_Hang_CT VALUES (001111,001,'M�y T�nh T450',1,1000)
INSERT INTO Don_Hang_CT VALUES (001111,002,'�i?n Tho?i Nokia 5670',1,200)
INSERT INTO Don_Hang_CT VALUES (001222,001,'M�y T�nh T450',1,1000)
INSERT INTO Don_Hang_CT VALUES (001333,003,'M�y In Samsung 450',1,100)
GO
--4
SELECT distinct Don_Hang.MaKH, TenKH, DiaChi
FROM Don_Hang
inner join Khach_Hang
on Don_Hang.MaKH = Khach_Hang.MaKH
GO
SELECT * FROM Mat_Hang
GO
SELECT * FROM Don_Hang
GO
--5
SELECT * FROM Khach_Hang
ORDER BY TenKH
GO
SELECT * FROM Mat_Hang
ORDER BY Gia DESC
GO
SELECT Don_Hang .MaKH,TenSP FROM Don_Hang_CT
INNER JOIN Don_Hang ON Don_Hang_CT.MaDon=Don_Hang.MaDon
WHERE MaKH=222
GO
--6
SELECT COUNT(DISTINCT MaKH) AS SoKH FROM Don_Hang
GO
SELECT COUNT(DISTINCT MaSP) AS SoSP FROM Mat_Hang
GO
SELECT MaDon,TongTien FROM Don_Hang
GO
--7
ALTER TABLE Mat_Hang
ADD CONSTRAINT chk CHECK(Gia > 0)
GO
ALTER TABLE Don_Hang
ADD CONSTRAINT chk2 CHECK(NgayDat > getdate())
GO
ALTER TABLE Mat_Hang
ADD NgayXH datetime
GO
CREATE INDEX Index1 ON Mat_Hang(TenSP)
CREATE INDEX Index2 ON Khach_Hang(TenKH)
GO
CREATE VIEW View_KhachHang AS 
SELECT TenKH,Diachi,SDT FROM Khach_Hang
GO
CREATE VIEW View_SanPham AS 
SELECT TenSP,Gia FROM Mat_Hang
GO
CREATE VIEW View_KhachHang_SanPham AS
SELECT TenKH,SDT, TenSP,SoLuong,NgayDat FROM Khach_Hang
JOIN Don_Hang ON Khach_Hang.MaKH=Don_Hang.MaKH
JOIN Don_Hang_CT ON Don_Hang.MaDon=Don_Hang_CT.MaDon
GO