-- PHẦN 1
Create database lab07
use AdventureWorks2016CTP3
select * into lab07.dbo.Workorder from Production.WorkOrder
use lab07
Select * into WorkorderIX from Workorder
SELECT*FROM Workorder
SELECT*FROM WorkorderIX
Create index IX_workorderID on WorkorderIX(WorkorderID)
SELECT*FROM WorkOrder where WorkOrderID=72000 
SELECT*FROM WorkOrderIX where WorkOrderID=72000 


-- PHẦN 2
create database Aptech 
use Aptech
create table CLasses(
ClassName char(6),
Teacher varchar(30),
TimeSlot varchar(30),
Class int,
Lab int)
create unique clustered index MyClusteredIndex on Classes(ClassName) with (Pad_index = on,FillFactor = 70,Ignore_Dup_Key = on)
create nonclustered index Teacherindex on Classes(teacher)
drop index Teacherindex on Classes
create clustered index MyClusteredIndex on Classes(Classname) with(DROP_EXISTING = on, ALLOW_ROW_LOCKS = off,ALLOW_PAGE_LOCKS= ON, MAXDOP = 2) 
create index CLasslabindex on Classes(Class,Lab)
execute sp_helpindex Classes
----
CREATE DATABASE Lab8
USE Lab8

CREATE TABLE Student(
StudentNo int PRIMARY KEY,
StudentName varchar(50),
StudentAddress varchar(100),
PhoneNo int)
GO
CREATE TABLE Department(
DeptNo int PRIMARY KEY,
DeptName varchar(50),
ManagerName char(30))
GO
CREATE TABLE Assignment(
AssignmentNo int PRIMARY KEY,
Description varchar(100))
GO
CREATE TABLE Works_Assign(
JobID int PRIMARY KEY,
StudentNo int,
AssignmentNo int,
TotalHours int,
JobDetails XML,
CONSTRAINT fk1 FOREIGN KEY (StudentNo) REFERENCES Student(StudentNo),
CONSTRAINT fk2 FOREIGN KEY (AssignmentNo) REFERENCES Assignment(AssignmentNo))
GO
ALTER TABLE Works_Assign
DROP CONSTRAINT fk1, fk2
ALTER TABLE [dbo].[Student]
DROP constraint [PK__Student__32C4C02A5119C4C2]
CREATE CLUSTERED INDEX IX_Student ON Student(StudentNo)
WITH (DROP_EXISTING = ON)
execute sp_helpindex Student


ALTER INDEX IX_Student ON Student DISABLE

CREATE NONCLUSTERED INDEX IX_Dept ON Department(DeptNo,DeptName,ManagerName)