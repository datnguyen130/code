CREATE DATABASE LAB11
USE LAB11
GO
CREATE TABLE Class(
ClassCode varchar(10) PRIMARY KEY,
HeadTeacher varchar(30),
Room varchar(30),
TimeSlot char,
CloseDate datetime)
GO
CREATE TABLE Student(
RollNO varchar(10) PRIMARY KEY,
ClassCode varchar(10),
FullName varchar(30),
Male bit,
BirthDate datetime,
Address varchar(30),
Province char(20),
Email varchar(30),
CONSTRAINT fk1 FOREIGN KEY (ClassCode) REFERENCES Class(ClassCode))
GO
CREATE TABLE Subject(
SubjectCode varchar(10) PRIMARY KEY,
SubjectName varchar(40),
WMark bit,
PMark bit,
WTest_per int,
PTest_per int
)
GO
CREATE TABLE Mark(
RollNo varchar(10),
SubjectCode varchar(10),
WMark float,
PMark float,
Mark float,
CONSTRAINT pr1 PRIMARY KEY (RollNo, SubjectCode),
CONSTRAINT fk2 FOREIGN KEY (RollNO) REFERENCES Student(RollNo),
CONSTRAINT fk3 FOREIGN KEY (SubjectCode) REFERENCES Subject(SubjectCode))
GO
--1
INSERT INTO Class VALUES ('FPT1','Mr A','P207','M','2020-9-28')
INSERT INTO Class VALUES ('FPT2','Ms B','P206','I','2020-4-20')
INSERT INTO Class VALUES ('FPT3','Mrs C','P205','L','2020-2-15')
INSERT INTO Class VALUES ('FPT4','Mr D','P208','M','2020-7-7')
INSERT INTO Class VALUES ('FPT5','Ms E','P209','G','2020-8-6')
GO
INSERT INTO Student VALUES ('A23475','FPT1','Nguyen Van A','1','1995-10-11','Hoang mai','hn','nguyenvana@gmail.com')
INSERT INTO Student VALUES ('A36276','FPT2','Nguyen Van B','0','1996-1-11','Hoang Van thu','bg','nguyenvanb@gmail.com')
INSERT INTO Student VALUES ('A26135','FPT4','Nguyen Van C','1','1997-5-11','Ha dong','ht','nguyenvanc@gmail.com')
INSERT INTO Student VALUES ('A94628','FPT3','Nguyen Van D','0','1998-4-2','Quan 1','sg','nguyenvand@gmail.com')
INSERT INTO Student VALUES ('A26175','FPT5','Nguyen Van E','1','1994-9-11','Do quang','hn','nguyenvane@gmail.com')
GO
INSERT INTO Subject VALUES ('TH','Toan Hoc','0','1',2,3)
INSERT INTO Subject VALUES ('VH','Van Hoc','1','0',1,3)
INSERT INTO Subject VALUES ('DL','Dia Ly','1','1',2,2)
INSERT INTO Subject VALUES ('SH','Sinh Hoc','0','1',3,3)
INSERT INTO Subject VALUES ('EN','Tieng Anh','1','1',1,1)
GO
INSERT INTO Mark VALUES ('A23475','VH',7.5,NULL,7.5)
INSERT INTO Mark VALUES ('A23475','TH',NULL,9,9)
INSERT INTO Mark VALUES ('A26175','SH',NULL,10,10)
INSERT INTO Mark VALUES ('A26135','EN',7.5,8.5,8)
INSERT INTO Mark VALUES ('A36276','DL',6,7,6.5)
INSERT INTO Mark VALUES ('A94628','TH',NULL,7,7)
INSERT INTO Mark VALUES ('A94628','VH',3,NULL,3)
INSERT INTO Mark VALUES ('A26135','DL',3,8.5,5.75)
GO
--2
CREATE VIEW SV_2Test
AS
SELECT Student.RollNo, FullName, Count(SubjectCode) as SLTest FROM Student
JOIN Mark ON Student.RollNO = Mark.RollNo
GROUP BY Student.RollNo, FullName
HAVING COUNT(SubjectCode) >=2
GO
--3
CREATE VIEW SV_Truot
AS
SELECT Student.RollNo, FullName, SubjectName as FailedSBJ FROM Student
JOIN Mark ON Student.RollNO = Mark.RollNo
JOIN Subject ON Mark.SubjectCode=Subject.SubjectCode
WHERE (Mark.WMark < 4 AND Mark.WMark IS NOT NULL) OR (Mark.PMark < 4 AND Mark.PMark IS NOT NULL)
GO
--4
CREATE VIEW TimeSlot_G
AS
SELECT RollNo, FullName, TimeSlot FROM Student
JOIN Class ON Student.ClassCode = Class.ClassCode
WHERE TimeSlot='G'
GO
--5
CREATE VIEW GV_Toi AS
SELECT HeadTeacher as Gv_Toi, COUNT(Student.RollNo) as SLHS_Toi FROM Class
JOIN Student ON Class.ClassCode=Student.ClassCode
JOIN Mark ON Student.RollNO = Mark.RollNo
WHERE (Mark.WMark < 4 AND Mark.WMark IS NOT NULL) OR (Mark.PMark < 4 AND Mark.PMark IS NOT NULL)
GROUP BY HeadTeacher
GO
--6
CREATE VIEW SV_TruotMon AS
SELECT Class.ClassCode, FullName, HeadTeacher, WMark, PMark FROM Student
JOIN Mark ON Mark.RollNo=Student.RollNO
JOIN Class ON Class.ClassCode = Student.ClassCode
WHERE SubjectCode='VH' AND (Mark.WMark < 4 AND Mark.WMark IS NOT NULL) OR (Mark.PMark < 4 AND Mark.PMark IS NOT NULL)
GO