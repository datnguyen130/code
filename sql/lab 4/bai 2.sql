-- Tạo, sử dụng CSDL 
create database lab05
use lab05
-- Tạo bảng phòng ban
go
create table PhongBan (
MaPB varchar(7) primary key,
tenPB nvarchar(50)
)
-- Tạo bảng nhân viên
go
create table NhanVien(
MaNV varchar(7) primary key,
TenNV nvarchar(50),
Ngaysinh datetime check (Ngaysinh < getdate()),
soCMND char(9) check (soCMND like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]%'),
GioiTinh char(1) default('M') check (GioiTinh like '[FM]'),
DiaChi nvarchar(100),
NgayVaoLam datetime,
Ma_PB varchar(7) foreign key references PhongBan(MaPB),
constraint CHK1 check (datediff(year,Ngaysinh,NgayVaoLam)>20)
)
-- Tạo bảng Lương Dự án
go
create table LuongDA (
MaDA varchar(8),
Ma_NV varchar(7),
NgayNhan Datetime default (getdate()) not null,
Sotien money check(Sotien >0)--Số tiền của dự án
constraint pk_MaDA_MaNV primary key (maDA,Ma_NV),
constraint fk_MaNv foreign key (Ma_Nv) references NhanVien(MaNv)
)
-- Nhập dữ liệu cho bảng Phòng Ban
go
insert into PhongBan values('CSHS',N'Cảnh sát hình sự')
insert into PhongBan values('CSTT',N'Cảnh sát trật tự')
insert into PhongBan values('CSKV',N'Cảnh sát khu vực')
insert into PhongBan values('CSMT',N'Cảnh sát ma túy')
insert into PhongBan values('CSKT',N'Cảnh sát kinh tế')
-- Nhập dữ liệu cho bảng Nhân Viên
go
insert into NhanVien values(01,N'Đạt','1996-05-13','017502342','M',N'Hà Nội','2017-10-02','CSHS')
insert into NhanVien values(02,N'Sơn','1990-02-11','017502343','M',N'Hà Nội','2018-05-04','CSKV')
insert into NhanVien values(03,N'Linh','1991-06-15','017502321','F',N'Bình Đà','2017-02-02','CSKT')
insert into NhanVien values(04,N'Huần','1991-02-05','017502112','M',N'HCM','2019-08-14','CSTT')
insert into NhanVien values(05,N'Bún','1998-02-27','017559849','F',N'Sài Gòn','2020-01-02','CSMT')
insert into NhanVien values(06,N'Phở','1999-02-25','017559001','M',N'Đà Nẵng','2020-01-05','CSMT')

-- Nhập dữ liệu cho bảng Lương Dự Án
go
insert into LuongDA values('MBTPMT',01,'2018-10-02',100)
insert into LuongDA values('DCBTP',05,'2020-04-02',500)
insert into LuongDA values('NCTP',02,'2020-03-15',200)
insert into LuongDA values('DCBTP',03,'2019-10-20',400)
insert into LuongDA values('MBTPMT',02,'2018-10-02',100)

-- Query hiển thị thông tin các bảng 
go
select * from LuongDA
select * from NhanVien
select * from PhongBan

-- Query hiển thị nhân viên có giới tính F
go
select * from NhanVien
where GioiTinh = 'F'

-- Hiển thị tất cả các dự án 
go
select MaDA,Ma_NV
from LuongDA

-- 5.Hiển thị tổng lương của từng nhân viên 
select Ma_NV, sum(Sotien)
from LuongDA
group by Ma_NV

-- 6.Hiển thị tất cả các nhân viên trên một phòng ban cho trước
select * from NhanVien
where Ma_PB = 'CSHS'

-- 7.Hiển thị lương nhân viên trong phòng CSHS
select Ma_NV,Sotien,Ma_PB,tenPB
from LuongDA 
inner join NhanVien on LuongDA.Ma_NV = NhanVien.MaNV
inner join PhongBan on NhanVien.Ma_PB = PhongBan.MaPB
where Ma_PB = 'CSHS'

-- 8.Hiển thị số lượng nhan viên của từng phòng
select Ma_PB,SL,tenPB
from (select count(MaNv) as 'SL',Ma_PB from NhanVien group by Ma_PB)A
left join (select MaPB,tenPB from PhongBan)B
on A.Ma_PB = B.MaPB

select Ma_PB,count(distinct Nhanvien.MaNV) as 'SoNV'
from NhanVien group by Ma_PB


-- 9. Hiển thị những nhân viên tham gia ít nhất vào một dự án
select MaNV,TenNV,SoDAjoin
from (select MaNv,TenNv from NhanVien)D
left join (select Ma_NV,count(Ma_NV) as 'SoDAjoin' from LuongDA group by Ma_NV)C
on D.MaNV = C.Ma_NV
where SoDAjoin is not null

-- 10. Hiển thị ra phòng ban có lượng nhân viên nhiều nhất
select top(1) A.Ma_PB,B.tenPB,Max(A.SL) as 'MAXSL'
from (select count(MaNv) as 'SL',Ma_PB from NhanVien group by Ma_PB)A
left join (select MaPB,tenPB from PhongBan)B
on A.Ma_PB = B.MaPB
group by A.Ma_PB,B.tenPB
order by MAXSL desc


select ma_pb, max(A.SL) as 'MAXNV'
from (select ma_pb,count(manv) as 'SL' from NhanVien group by Ma_PB)A
group by ma_pb
order by MAXNV desc

--11. Hiển thị tổng số lượng các nhân viên tổ Cảnh sát ma túy
select Ma_PB,count(distinct Nhanvien.MaNV) as 'SoNV'
from NhanVien 
where Ma_PB = 'CSMT' 
group by Ma_PB

-- 12. Hiển thị tổng lương của các nhân viên có số CMND tận cùng bằng 9
select Ma_NV,soCMND, sum(Sotien) as 'TongLuong'
from LuongDA
inner join (select MaNv,soCMND from NhanVien)A
on LuongDA.Ma_NV = A.MaNV
where soCMND like '%9'
group by Ma_NV,soCMND

-- 13.Tìm nhân viên có số lương cao nhất
select top(1) Ma_NV,TenNV, max(TongLuong) as 'LuongMax'
from (select Ma_NV,sum(Sotien) as 'TongLuong' from LuongDA group by Ma_NV)A
inner join (select MaNv,TenNV from NhanVien)B
on A.Ma_NV = B.MaNV
group by Ma_NV,TenNv
order by LuongMax desc

-- 14.Hiển thị nhân viên phòng CSMT có giới tính bằng 'F' và mức lương >120
select MaNV,TenNV,GioiTinh,Ma_PB,Sotien
from NhanVien
inner join LuongDA
on NhanVien.MaNV = LuongDA.Ma_NV
where Ma_PB = 'CSMT' and GioiTinh = 'F' and Sotien > 120

-- 15. Hiển thị tổng lương trên từng phòng 
select Ma_PB,tenPB,sum(sotien) as 'TongLuong'
from NhanVien
inner join PhongBan on NhanVien.Ma_PB = PhongBan.MaPB
inner join (select Sotien,Ma_NV from LuongDA)A 
on NhanVien.MaNV = A.Ma_NV
group by Ma_PB,tenPB
order by TongLuong

-- 16.Liệt kê dự án có ít nhất 2 người tham gia
select MaDA, count(Ma_NV) as 'SoNguoiThamGia' 
from LuongDA
group by MaDA
having count(Ma_NV) >= 2

-- 17.Liệt kê thông tin chi tiết của nhân viên có tên bắt đầu bằng ký tự 'B'
select * from NhanVien
where TenNV like 'B%'

-- 18.Hiển thị thông tin chi tiết nhân viên được nhận tiền dự án trong năm 2018
select MaNv,tenNv,ngaysinh,socmnd,gioitinh,diachi,ngayvaolam,ma_pb,year(Ngaynhan)
from NhanVien
inner join LuongDA
on NhanVien.MaNV = LuongDA.Ma_NV
where year(Ngaynhan) = 2018

-- 19.Hiển thị thông tin chi tiết của nhân viên không tham gia bất kỳ dự án nào
select MaNV,TenNV,[Ngaysinh],[soCMND],[GioiTinh],[DiaChi],[NgayVaoLam],[Ma_PB]
from NhanVien
left join (select Ma_NV,count(Ma_NV) as 'SoDAjoin' from LuongDA group by Ma_NV)C
on NhanVien.MaNV = C.Ma_NV
where SoDAjoin is null

-- 20.Xóa dự án có mã là 'TTTPMT'
delete from LuongDA
where MaDA = 'TTTPMT'

-- 21 xóa từ bảng LuongDA những nhan viên có mức lương 800
delete from NhanVien
where exists
(select * from LuongDA
where NhanVien.MaNV = LuongDA.Ma_NV
and Sotien = 800)

-- 22. Cập nhật lại lương cho những người tham gia dự án 'MBTPMT' thêm 10% lương cũ

update LuongDA
set Sotien = Sotien*1.1
where MaDA = 'MBTPMT'

select * from LuongDA -- Xem thử đã update chưa?

-- 23.Xóa các bản ghi tương ứng từ bảng nhanVien đối với những nhân viên không có mã tồn tại trong bảng LuongDA
delete from NhanVien 
where exists
(select MaNV,TenNV,[Ngaysinh],[soCMND],[GioiTinh],[DiaChi],[NgayVaoLam],[Ma_PB]
from NhanVien
left join (select Ma_NV,count(Ma_NV) as 'SoDAjoin' from LuongDA group by Ma_NV)C
on NhanVien.MaNV = C.Ma_NV
where SoDAjoin = 3) -- ở đây ghi là 3 để không bị xóa dữ liệu từ bảng :)) tức là nhân viên tham gia 3 dự án đó ạ
go

--24 Viết truy vấn đặt lại ngày vào làm của tất cả các nhân viên thuộc phòng CSMT là ngày 13/05/2020
update NhanVien
set NgayVaoLam = '2020-05-13'
where Ma_PB = 'CSMT'
go
select*from NhanVien
where NgayVaoLam = '2020-05-13'