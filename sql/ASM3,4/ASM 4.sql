CREATE DATABASE LAB12_2
USE LAB12_2
GO
CREATE TABLE San_Pham (
MaSP varchar(10) primary key,
NgaySX datetime,
Ma_loaiSP varchar(5),
Ma_NV_TN int,
Constraint FK_Ma_loaiSP foreign key (Ma_loaiSP) references Loai_SP(Ma_loaiSP),
Constraint FK_Ma_Nv_TN foreign key (Ma_NV_TN) references NhanVien(Ma_NV_TN))
GO
CREATE TABLE Loai_SP (
Ma_loaiSP varchar(5) primary key,
Ten_loaiSP varchar(20))
GO
CREATE TABLE NhanVien(
Ten_NV varchar(20),
Ma_NV_TN int PRIMARY KEY)
GO

-- 3. Viết câu lệnh thêm dữ liệu
INSERT INTO NhanVien VALUES ('Nguyen Van A',988)
INSERT INTO NhanVien VALUES ('Nguyen Van B',989)
INSERT INTO NhanVien VALUES ('Nguyen Van C',990)
INSERT INTO NhanVien VALUES ('Nguyen Van D',991)
INSERT INTO NhanVien VALUES ('Nguyen Van E',992)
GO
INSERT INTO Loai_SP VALUES ('Z37E','May tinh Z37')
INSERT INTO Loai_SP VALUES ('MG11','May giat 11')
INSERT INTO Loai_SP VALUES ('IPXS','Dien thoai XS MAX')
INSERT INTO Loai_SP VALUES ('PS04','Playtation 04')
INSERT INTO Loai_SP VALUES ('AP3','Tai nghe Airphone 3')
GO
INSERT INTO San_Pham VALUES ('Z37 111','2019-01-01','Z37E',988)
INSERT INTO San_Pham VALUES ('Z37 112','2019-01-01','Z37E',988)
INSERT INTO San_Pham VALUES ('Z37 113','2020-02-01','Z37E',989)
INSERT INTO San_Pham VALUES ('Z37 114','2021-01-01','Z37E',990)
INSERT INTO San_Pham VALUES ('MG11 111','2018-01-01','MG11',988)
INSERT INTO San_Pham VALUES ('MG11 112','2019-05-01','MG11',991)
INSERT INTO San_Pham VALUES ('IPXS 111','2017-01-01','IPXS',991)
INSERT INTO San_Pham VALUES ('IPXS 112','2019-08-01','IPXS',988)
INSERT INTO San_Pham VALUES ('IPXS 113','2019-08-01','IPXS',989)
INSERT INTO San_Pham VALUES ('PS04 111','2019-01-01','PS04',992)
INSERT INTO San_Pham VALUES ('AP3 111','2019-01-01','AP3',992)
GO
-- 4. Viết câu lệnh truy vấn
--- A
SELECT * FROM Loai_SP
GO
--- B
SELECT * FROM San_Pham
GO
--- C
SELECT * FROM NhanVien
GO
-- 5. Viết các câu lệnh truy vấn để lấy
--- A
SELECT * FROM Loai_SP
ORDER BY Ten_loaiSP 
GO
--- B
SELECT * FROM NhanVien
ORDER BY Ten_NV
GO
--- C
SELECT * FROM San_Pham
WHERE Ma_loaiSP ='Z37E'
GO
--- D
SELECT * 
FROM San_Pham
JOIN NhanVien ON San_Pham.Ma_NV_TN = NhanVien.Ma_NV_TN
WHERE NhanVien.Ten_NV = 'Nguyen Van A'
ORDER BY MaSP DESC
GO
-- 6. Viết câu lệnh truy vấn để
--- A
SELECT A.Ten_loaiSP, A.Ma_loaiSP, SoLuongSP
FROM Loai_SP A
JOIN (SELECT Ma_loaiSP, COUNT(MaSP) AS SoLuongSP FROM San_Pham GROUP BY Ma_loaiSP) B
ON A.Ma_loaiSP = B.Ma_loaiSP
--- C
SELECT * 
FROM San_Pham
JOIN Loai_SP ON San_Pham.Ma_loaiSP = Loai_SP.Ma_loaiSP
GO
--- D
SELECT * FROM San_Pham
GO
-- 7 .Thay dổi cơ sở dữ liệu
--- A
ALTER TABLE San_Pham
ADD Constraint CK_NgaySX CHECK(NgaySX <= getdate())
GO
--- B 
-- ALREADY DONE 
--- C
ALTER TABLE San_Pham
ADD PhienBan varchar(10)
GO
-- 8
--- A 
CREATE INDEX IX1 
ON NhanVien(Ten_NV)
GO
--- B 
CREATE VIEW VIEW_SanPham 
AS
SELECT MaSP,NgaySX,Ma_loaiSP
FROM San_Pham
GO
CREATE VIEW VIEW_SanPham_NCTN
AS
SELECT MaSP,NgaySX,Ten_NV
FROM San_Pham
JOIN NhanVien
ON San_Pham.Ma_NV_TN = NhanVien.Ma_NV_TN
GO
CREATE VIEW View_Top_SanPham
AS
SELECT top(5) MaSP,Ma_loaiSP,NgaySX
FROM San_Pham
ORDER BY NgaySX DESC
GO
--- C
CREATE PROC SP_Them_LoaiSP
@Ma_loaiSP varchar(5),
@Ten_loaiSP varchar(20)
AS
INSERT INTO Loai_SP(Ma_loaiSP,Ten_loaiSP) VALUES (@Ma_loaiSP,@Ten_loaiSP)
GO
CREATE PROC  SP_Them_NCTN
@Ten_NV varchar(20),
@Ma_NV_TN int
AS
INSERT INTO NhanVien(Ten_NV,Ma_NV_TN) VALUES (@Ten_NV,@Ma_NV_TN)
GO
CREATE PROC  SP_Them_SanPham
@MaSP varchar(10),
@NgaySX datetime,
@MaloaiSP varchar(5),
@MaNv int
AS
INSERT INTO San_Pham(MaSP,NgaySX,Ma_loaiSP,Ma_NV_TN) VALUES (@MaSP,@NgaySX,@MaloaiSP,@MaNv)
GO
CREATE PROC SP_Xoa_SanPham
@MaSP varchar(10)
AS
DELETE FROM San_Pham WHERE MaSP = @MaSP
GO
EXEC SP_Xoa_SanPham 'Z37 111'
GO
CREATE PROC SP_Xoa_SanPham_TheoLoai
@MaLoai varchar(5)
AS
DELETE FROM San_Pham 
WHERE Ma_loaiSP = @MaLoai
GO
