CREATE DATABASE ASM6
USE ASM6
GO

-- 1.TẠO BẢNG
CREATE TABLE Author(
TenTacGia varchar(20) PRIMARY KEY ,
DiaChiTG varchar(20)
)
GO
CREATE TABLE Company(
MaNhaXB int primary key,
TenNhaXB varchar(30),
Diachi varchar(30))
GO
CREATE TABLE TypeBook(
MaLoaiSach int PRIMARY KEY,
LoaiSach varchar(20))
GO
CREATE TABLE Book(
MaSach varchar(5) PRIMARY KEY,
TenSach varchar(30),
TenTacGia varchar(20),
NoiDung varchar(100),
MaNhaXB int,
NamXB date,
LanXB int,
SoLuong int,
GiaBan money,
MaLoai int,
Constraint FK1 foreign key (TenTacGia) references Author(TenTacGia),
Constraint FK2 foreign key (MaNhaXB) references Company(MaNhaXB),
Constraint FK3 foreign key (Maloai) references TypeBook(MaLoaiSach)
)
GO

-- 2 CHÈN CƠ SỞ DỮ LIỆU
 
INSERT INTO Author VALUES ('Nguyen Van A','Ha Noi')
INSERT INTO Author VALUES ('Nguyen Van B','Ha Noi')
INSERT INTO Author VALUES ('Nguyen Van C','TP HCM')
INSERT INTO Author VALUES ('Nguyen Van D','Bac Giang')
INSERT INTO Author VALUES ('Nguyen Van E','Da Nang')

INSERT INTO Company VALUES (111,'ABC BOOK','Ha Noi')
INSERT INTO Company VALUES (112,'Nha Nam','Sai Gon')
INSERT INTO Company VALUES (113,'Kim Dong','Nha Trang')
INSERT INTO Company VALUES (114,'Thang Loi','Ha Noi')
INSERT INTO Company VALUES (115,'XYZ BOOK','SaPa')

INSERT INTO TypeBook VALUES (211,'Toan Hoc')
INSERT INTO TypeBook VALUES (212,'Tin Hoc')
INSERT INTO TypeBook VALUES (213,'Van Hoc')
INSERT INTO TypeBook VALUES (214,'Anh Hoc')
INSERT INTO TypeBook VALUES (215,'Vat Ly')

INSERT INTO Book VALUES ('B001','Sach 1','Nguyen Van A','AAAAA',111,'2005',3,200,100.00,211)
INSERT INTO Book VALUES ('B002','Sach 2','Nguyen Van A','AAAAA',112,'2003',1,400,200.00,212)
INSERT INTO Book VALUES ('B003','Sach 3','Nguyen Van A','AAAAA',113,'2004',2,200,300.00,213)
INSERT INTO Book VALUES ('B004','Sach 4','Nguyen Van B','AAAAA',114,'2009',5,100,400.00,214)
INSERT INTO Book VALUES ('B005','Sach 5','Nguyen Van B','AAAAA',115,'2010',1,200,500.00,215)
INSERT INTO Book VALUES ('B006','Sach 6','Nguyen Van C','AAAAA',111,'2015',1,600,200.00,211)
INSERT INTO Book VALUES ('B007','Sach 7','Nguyen Van C','AAAAA',113,'2020',2,300,100.00,211)
INSERT INTO Book VALUES ('B008','Sach 8','Nguyen Van D','AAAAA',114,'2014',3,200,300.00,212)
INSERT INTO Book VALUES ('B009','Sach 9','Nguyen Van E','AAAAA',115,'2017',3,100,300.00,213)
INSERT INTO Book VALUES ('B010','Sach 10','Nguyen Van A','AAAAA',111,'2005',1,200,100.00,211)
GO

-- 3. Liệt kê các cuốn sách có năm xuất bản từ 2008 đến nay
SELECT TenSach, NamXB FROM Book
WHERE YEAR(NamXB) >= 2008
GO

-- 4. Liệt kê 5 cuốn sách có giá bán cao nhất
SELECT TOP(5) TenSach,GiaBan FROM Book
ORDER BY GiaBan DESC
GO

-- 5.Tìm những cuốn sách có tiêu đề chứa chữ 'Sach 1'
SELECT TenSach FROM Book
WHERE TenSach like '%Sach 1%'
GO

-- 6. Liệt kê các cuốn sách bắt đầu với chữ 'S'
SELECT TenSach FROM Book
WHERE TenSach like 'S%'
GO

-- 7. Liệt kê các cuốn sách của nhà sách 'Nha Nam'
SELECT TenSach, TenNhaXB
FROM Book 
JOIN Company ON Book.MaNhaXB = Company.MaNhaXB
WHERE TenNhaXB = 'Nha Nam'
GO

-- 8. Lấy thông tin chi tiết về nhà xuất bản cuốn sách 'Sach 1'
SELECT TenSach, TenNhaXB, Book.MaNhaXB
FROM Book 
JOIN Company ON Book.MaNhaXB = Company.MaNhaXB
WHERE Book.TenSach = 'Sach 1'
GO

-- 9. Hiển thị các thông tin sau về cuốn sách: Mã sách,Tên Sách, Năm xuất bản, Nhà Xuất bản, loại sách
SELECT MASACH, TENSACH,NAMXB,TENNHAXB,LOAISACH
FROM Book
JOIN Company ON Book.MaNhaXB = Company.MaNhaXB
JOIN TypeBook ON Book.MaLoai = TypeBook.MaLoaiSach
GO

-- 10. Tìm cuốn sách có giá bán cao nhất 
SELECT TOP(1) * FROM Book
ORDER BY GiaBan DESC
GO
-- 11. tìm cuốn sách có số lượng lớn nhất trong kho
SELECT TOP(1) * FROM Book 
ORDER BY SoLuong DESC
GO

-- 12. Tìm các cuốn sách có tác giả là 'nguyen van a'
SELECT TENSACH, TENTACGIA
FROM Book
WHERE TenTacGia = 'NGUYEN VAN A'
GO

-- 13. Giảm giá bán 10% các cuốn sách xuất bản từ năm 2008 trở về trước
UPDATE Book
SET GiaBan = GiaBan * 0.9
WHERE YEAR(NamXB) < 2008
GO

-- 14. 
SELECT  TENNHAXB, COUNT(MASACH) AS SODAUSACH
FROM Book
JOIN Company ON Book.MaNhaXB = Company.MaNhaXB
GROUP BY TENNHAXB
GO

-- 15.
SELECT LOAISACH, COUNT(MASACH) AS SODAUSACH
FROM Book
JOIN TypeBook ON Book.MaLoai = TypeBook.MaLoaiSach
GROUP BY LoaiSach
GO

-- 16.
CREATE INDEX IX1 ON BOOK(TENSACH)
GO

-- 17.
CREATE VIEW VIEW1
AS
SELECT MASACH, TENSACH, TENTACGIA, TENNHAXB, GIABAN
FROM BOOK
JOIN Company ON Book.MaNhaXB = Company.MaNhaXB
GO

-- 18.
CREATE PROC SP_THEM_SACH 
@MaSach varchar(5),
@TenSach varchar(30),
@TenTacGia varchar(20),
@NoiDung varchar(100),
@MaNhaXB int,
@NamXB date,
@LanXB int,
@SoLuong int,
@GiaBan money,
@MaLoai int 
AS
INSERT INTO Book(MaSach,TenSach,TenTacGia,NoiDung,MaNhaXB,NamXB,LanXB,SoLuong,GiaBan,MaLoai)
VALUES (@MaSach, @TenSach, @TenTacGia, @NoiDung ,@MaNhaXB ,@NamXB ,@LanXB,@SoLuong ,@GiaBan ,@MaLoai)
GO

CREATE PROC SP_TIM_SACH
@KeyWord varchar(30)
AS
SELECT * FROM Book
WHERE TenSach like '%'+@KeyWord+'%' OR NoiDung like '%'+@KeyWord+'%'
GO
exec SP_TIM_SACH 'sach 1'
GO

CREATE PROC SP_Sach_ChuyenMuc 
@Maloai int 
AS
SELECT * FROM Book
WHERE MaLoai = @Maloai
GO

-- 19. 
CREATE TRIGGER BEFORE_BOOK_DELETE
ON BOOK
FOR DELETE
AS
BEGIN
	IF EXISTS ( SELECT SOLUONG FROM DELETED WHERE SoLuong > 0)
	BEGIN
	PRINT 'STILL HAVING BOOK. NOT ALLOWED TO DELETED'
	ROLLBACK TRAN
	END
END
GO

-- 20. 
CREATE TRIGGER BEFORE_TYPEBOOK_DELETE
ON TYPEBOOK
FOR DELETE
AS
BEGIN
	IF EXISTS ( SELECT * FROM Book WHERE Book.MaLoai IN (SELECT MaLoaiSach FROM DELETED))
	BEGIN
	PRINT ' STILL HAVING BOOK OF THIS TYPEBOOK. NOT ALLOWED TO DELETE'
	ROLLBACK TRAN
	END
END

