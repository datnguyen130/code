create database lab09
use lab09
go
-- Tạo bảng
Create table Hang_SX(
MaHangSX int primary key,
TenHangSX varchar(20),
DiaChi varchar(10),
DienThoai varchar(10) )
go

Create table SP_CH(
MaSP int,
TenSP nvarchar(30),
DonVi nvarchar(10) default(N'Chiếc'),
MaHangSX int,
Gia money check (Gia >0),
SoLuong int check (SoLuong >0),
constraint PK_1 primary key(MaSP),
constraint FK_1 foreign key (MaHangSX) references Hang_SX(MaHangSX))
go
-- Nhập dữ liệu vào bảng 
insert into Hang_SX values (111,'ASUS','USA','1234567890')
insert into Hang_SX values (112,'NOKIA','FINLAND','012345869')
insert into Hang_SX values (113,'SAMSUNG','KOREA','2345678901')
GO
insert into SP_CH values (1,'May Tinh',N'Chiếc',111,1000,10)
insert into SP_CH values (2,'Dien Thoai',N'Chiếc',112,200,200)
insert into SP_CH values (3,'May In',N'Chiếc',113,100,10)
insert into SP_CH values (4,'May Giat',N'Chiếc',113,2000,20)
insert into SP_CH values (5,'Dieu Hoa',N'Chiếc',113,3000,10)
go

-- 4
select * from Hang_SX
go
select * from SP_CH
go

-- 5
select * from Hang_SX
order by TenHangSX 
go
select * from SP_CH
order by Gia desc
go
select * from Hang_SX
where TenHangSX ='ASUS'
go
select * from SP_CH
where SoLuong < 11
go
select * from SP_CH
where MaHangSX = 111
go

-- 6
select COUNT(MaHangSX) as SoLuongHangSX FROM Hang_SX
go
select COUNT(MaSP) as SoMatHang from SP_CH
go
select MaHangSX, COUNT(tensp) as SoLoaiSP from SP_CH group by MaHangSX
go
select sum(SoLuong) as TongSoSP from SP_CH
go

-- 7 
alter table Hang_SX 
add constraint CHK1 check (DienThoai like '%0%')
go

--8

create index IX1 on SP_CH(TenSP)
go
create view View_sanpham 
as
select MaSP, TenSP, Gia 
from SP_CH
go
create view view_SP_Hang
as
select MaSP,TenSP,TenHangSX
from SP_CH
join Hang_SX
on SP_CH.MaHangSX = Hang_SX.MaHangSX
