CREATE DATABASE LAB12
USE LAB12
GO
CREATE TABLE Employee(
EmployeeID int, 
Name varchar(100),
Tel char(11),
Email varchar(30),
Constraint PK_Employee primary key(EmployeeID))
GO
CREATE TABLE Groups(
GroupID int,
GroupName varchar(30),
LeaderID int,
ProjectID int,
Constraint PK_GroupID primary key(GroupID),
Constraint FK_ProjectID foreign key (ProjectID) references Project(ProjectID)
)
GO
CREATE TABLE Project (
ProjectID int,
ProjectName varchar(30),
StartDate datetime,
EndDate datetime,
Period int,
Cost money,
Constraint PK_ProjectID primary key(ProjectID)
)
GO
CREATE TABLE GroupDetail(
GroupID int,
EmployeeID int,
Status char(20) check (Status in ('dang lam','da lam','sap lam')),
Constraint FK_GroupID foreign key(GroupID) references Groups(GroupID),
Constraint FK_EmployeeID foreign key (EmployeeID) references Employee(EmployeeID)
)
GO
-- 2
INSERT INTO Employee VALUES (1,'Nguyen Van A','12345678901','NguyenVanA@gmail.com')
INSERT INTO Employee VALUES (2,'Nguyen Van B','34545678901','NguyenVanB@gmail.com')
INSERT INTO Employee VALUES (3,'Nguyen Van C','12345674561','NguyenVanC@gmail.com')
INSERT INTO Employee VALUES (4,'Nguyen Van D','12345672781','NguyenVanD@gmail.com')
INSERT INTO Employee VALUES (5,'Nguyen Van E','12340388901','NguyenVanE@gmail.com')
INSERT INTO Employee VALUES (6,'Nguyen Van F','12783978901','NguyenVanF@gmail.com')
INSERT INTO Employee VALUES (7,'Nguyen Van G','39164878901','NguyenVanG@gmail.com')
INSERT INTO Employee VALUES (8,'Nguyen Van H','12019674561','NguyenVanH@gmail.com')
INSERT INTO Employee VALUES (9,'Nguyen Van I','12392772781','NguyenVanI@gmail.com')
INSERT INTO Employee VALUES (10,'Nguyen Van J','12341128901','NguyenVaJ@gmail.com')

GO
INSERT INTO Project VALUES (1101,'Thuy Loi','2017-05-02','2021-10-20',40,10000)
INSERT INTO Project VALUES (1102,'Dia Chat','2018-05-02','2020-10-20',29,100000.00)
INSERT INTO Project VALUES (1103,'Thien Van','2014-05-02','2022-10-20',100,50000.00)
INSERT INTO Project VALUES (1104,'Dai Duong','2020-11-02','2024-10-20',50,92000.00)
INSERT INTO Project VALUES (1105,'Rung Xoi Mon','2018-05-02','2021-10-20',40,20000.00)
GO
INSERT INTO Groups VALUES (901,'Nhom mot',1,1101)
INSERT INTO Groups VALUES (902,'Nhom hai',5,1101)
INSERT INTO Groups VALUES (903,'Nhom ba',7,1102)
INSERT INTO Groups VALUES (904,'Nhom bon',8,1103)
INSERT INTO Groups VALUES (905,'Nhom nam',9,1104)
GO
INSERT INTO GroupDetail VALUES (901,1,'dang lam')
INSERT INTO GroupDetail VALUES (901,2,'dang lam')
INSERT INTO GroupDetail VALUES (901,3,'da lam')
INSERT INTO GroupDetail VALUES (901,4,'sap lam')
INSERT INTO GroupDetail VALUES (902,5,'dang lam')
INSERT INTO GroupDetail VALUES (902,6,'sap lam')
INSERT INTO GroupDetail VALUES (903,7,'dang lam')
INSERT INTO GroupDetail VALUES (904,8,'dang lam')
INSERT INTO GroupDetail VALUES (905,9,'dang lam')
INSERT INTO GroupDetail VALUES (905,10,'da lam')
GO
DELETE FROM GroupDetail WHERE EmployeeID =1
-- 3
--- A. HIỂN THỊ THÔNG TIN CÁC NHÂN VIÊN
SELECT * FROM Employee
GO
--- B. HIỂN THỊ THÔNG TIN CÁC NHÂN VIÊN ĐANG LÀM DỰ ÁN 'THUY LOI'
SELECT Project.ProjectName,Employee.EmployeeID,Employee.Name,Employee.Tel,Employee.Email
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groups ON GroupDetail.GroupID = Groups.GroupID
JOIN Project ON Groups .ProjectID = Project.ProjectID
WHERE Project.ProjectName = 'thuy loi'
GO
--- C. THỐNG KÊ SỐ LƯỢNG NHÂN VIÊN ĐANG LÀM VIỆC TẠI MỖI NHÓM
SELECT A.GroupName, SoLuongNhanVien
FROM Groups A
JOIN (SELECT GroupID, COUNT(EmployeeID) AS SoLuongNhanVien FROM GroupDetail GROUP BY GroupID) B
ON A.GroupID = B.GroupID
GO
--- D. Liệt kê thông tin cá nhân các trưởng nhóm
SELECT * FROM EmPloyee
WHERE [EmployeeID] IN (SELECT [LeaderID] FROM [dbo].[Groups])
GO
--- E. LIỆT KÊ THÔNG TIN VỀ NHÓM VÀ NHÂN VIÊN ĐANG LÀM CÁC DỰ ÁN CÓ NGÀY BẮT ĐẦU TRƯỚC 10/11/2017
SELECT Groups.GroupID,Groups.GroupName,Groups.LeaderID,Groups.ProjectID,
Employee.EmployeeID,Employee.Name,
GroupDetail.Status,
Project.StartDate
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groups ON GroupDetail.GroupID = Groups.GroupID
JOIN Project ON Groups .ProjectID = Project.ProjectID
WHERE Project.StartDate < '2017-11-10'
GO
--- F. lIỆT KÊ TẤT CẢ CÁC NHÂN VIÊN DỰ KIẾN ĐƯỢC PHÂN VÀO CÁC NHÓM LÀM VIỆC
SELECT Employee.EmployeeID,Employee.Name,Employee.Tel,Employee.Email,Status
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
WHERE Status = 'sap lam'
GO
--- G. LIỆT KÊ TẤT CẢ THÔNG TIN VỀ NHÂN VIÊN, NHÓM LÀM VỆC, DỰ ÁN CỦA NHỮNG DỰ ÁN ĐÃ HOÀN THÀNH
SELECT Employee.EmployeeID,Employee.Name,Employee.Tel,Employee.Email,
Groups.GroupID, Groups.GroupName,Groups.LeaderID,Groups.ProjectID,
Project.ProjectName, Project.EndDate
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groups ON GroupDetail.GroupID = Groups.GroupID
JOIN Project ON Groups .ProjectID = Project.ProjectID
WHERE Project.EndDate < GETDATE()
GO
-- 4. VIẾT CÂU LỆNH KIỂM TRA
 --- A
 ALTER TABLE Project
 ADD Constraint CHK_Date Check([StartDate] <[EndDate])
 GO
 --- B
 ALTER TABLE Employee
 ALTER COLUMN [Name] varchar(100) not null
 GO
 --- C (ALREADY DONE)
 --- D
 ALTER TABLE Project
 ADD Constraint CHK_Cost check (Cost >100)
 GO
 --- E
 ALTER TABLE Groups
 ADD Constraint FK_LeaderID foreign key (LeaderID) references Employee(EMployeeID)
GO
 --- F
 ALTER TABLE Employee
 ADD Constraint CHK_Tell check (len(tel) = 11 and isnumeric(tel) =1)
 GO
 -- 5. TẠO THỦ TỤC LƯU TRỮ 
 --- A
 CREATE PROC PROC_EXTRA
 AS
 UPDATE Project
 SET Cost = Cost * 1.1
 WHERE Cost < 20000
 GO
 --- B
 CREATE PROC PROC_DIPLAY_PROJECT
 AS
 SELECT * FROM Project
 WHERE StartDate < GETDATE()
 GO
 --- C
 CREATE PROC PROC_DISPALY_PROJECT_DONE
 AS
 SELECT * FROM Project
 WHERE EndDate < GETDATE()
 GO
 -- 6. TẠO CHỈ MỤC
 --- A
 CREATE INDEX IX_GROUP 
 ON GroupDetail(GroupID,EmployeeID)
 GO
 --- B
 CREATE INDEX IX_PROJECT
 ON Project([ProjectName],[StartDate],[EndDate])
 GO
 -- 7. TẠO KHUNG NHÌN (VIEW)
 --- A 
 CREATE VIEW VIEW_EMP_GROUP
 AS
SELECT Groups.GroupID,Groups.GroupName,Groups.LeaderID,Groups.ProjectID,
Employee.EmployeeID,Employee.Name,
GroupDetail.Status,
Project.StartDate, Project.EndDate
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groups ON GroupDetail.GroupID = Groups.GroupID
JOIN Project ON Groups .ProjectID = Project.ProjectID
WHERE Project.StartDate < GETDATE() AND Project.EndDate > GETDATE()
GO
--- B
CREATE VIEW RANDOM 
AS
SELECT Employee.Name,Groups.GroupName,Project.ProjectName,GroupDetail.Status
FROM Employee
JOIN GroupDetail ON Employee.EmployeeID = GroupDetail.EmployeeID
JOIN Groups ON GroupDetail.GroupID = Groups.GroupID
JOIN Project ON Groups .ProjectID = Project.ProjectID
GO
-- 8
--- A
CREATE TRIGGER AFTER_PROJECT_UPDATE
ON PROJECT
FOR UPDATE
AS
	BEGIN
	DECLARE @DATE DATETIME
	SELECT @DATE = EndDate FROM DELETED
	UPDATE Project
	SET Period = DATEDIFF(MONTH,StartDate,@DATE)
	END
GO
--- B
CREATE TRIGGER AFTER_GROUPS_DELETED
ON Groups
FOR DELETE
AS
	BEGIN
	DELETE FROM GroupDetail 
	WHERE GroupID IN (SELECT GroupID FROM DELETED)
	END
GO
--- C
CREATE TRIGGER BEFORE_GROUPS_UPDATE
ON GROUPS
FOR UPDATE
AS
	BEGIN
	IF EXISTS (SELECT GroupName FROM INSERTED WHERE GroupName IN (SELECT GroupName FROM Groups))
		BEGIN
		PRINT 'CANNOT UPDATE BECAUSE THE GROUPNAME ALREADY AVAILABLE'
		ROLLBACK TRAN
		END
	END