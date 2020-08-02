use [AdventureWorks2016CTP3]
select * from person.Person
select [PersonType],[FirstName],[MiddleName],[LastName] from Person.Person
select [FirstName]+' '+[LastName] as 'Person Name' from Person.Person
select * from Person.Address
select distinct (city) from person.Address
select top 10 * from person.Address
select top 25 percent * from person.Address
select AVG(rate) from HumanResources.EmployeePayHistory
select COUNT([LoginID]) AS TittleCount from HumanResources.Employee
go
create table Student(
StudNo int primary key,
StudName nvarchar(50) not null,
StudAddr nvarchar(50),
StudPhone bigint,
BirthDate datetime)
go
INSERT INTO Student values
(1, 'Michael John', 'New York', 9145247891,'12-01-1989');
INSERT INTO Student values
(2, 'Anna Lombard', 'Alabama', 8942574632,'08-25-1989');
INSERT INTO Student values
(3, 'Peter Dawson', 'California', 9165688471,'02-15-1963');
INSERT INTO Student values
(4, 'Leonard Thornton', 'New Jersey', 9142563422,'12-20-1991');
INSERT INTO Student values
(5, 'Elizabeth Isaac', 'Atlanta', 9149855771,'07-11-1990');
go
select * from Student
go
alter table Student 
add Country nvarchar(20) Null
update Student set Country = 'USA'
go
create table Batch(
BatchNo nvarchar(5),
Subject nvarchar (25),
SubjDesc nvarchar (25),
StartDt datetime,
EndDt datetime,
Hours int)
go
INSERT INTO Batch values ('A01', 'Java', 'Database', '01-12-2006', '03-15-2006', 96);
INSERT INTO Batch values ('A02', 'Oracle', 'Forms', '08-25-2006', '11-02-2006', 55);
INSERT INTO Batch values ('A03', 'SQL Server 2005', 'Queries', '05-15-2006', '06-06-2006', 46);
INSERT INTO Batch values ('A04', 'Net', 'WinForms', '06-20-2005', '08-16-2005', 48);
INSERT INTO Batch values ('A05', 'JSF & Struts', 'CustomControls', '09-07-2005', '10-18-2005', 120);
go
select * from Batch
go
select Datediff(month,StartDt,EndDt) from Batch
go
SELECT BatchNo, [2005] Y2005, [2006] Y2006 from
(SELECT YEAR(StartDt) StartYear, BatchNo, Hours FROM Batch)pft
PIVOT
(
SUM(Hours)
FOR StartYear in ([2005], [2006])
)pst