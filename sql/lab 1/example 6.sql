drop table if exists NewEmployees
CREATE TABLE NewEmployees (EmployeeID smallint,FirstName char(10),
LastName char(10), Department varchar(50), HiredDate datetime, Salary
money );
INSERT INTO NewEmployees VALUES(11,'Kevin','Blaine','Research','2006-07-31 00:00:00.000',54000);
CREATE TABLE Employeestemp (EmployeeID smallint,FirstName char(10),
LastName char(10), Department varchar(50), HiredDate datetime, Salary
money );



insert into Employeestemp ( [EmployeeID], [FirstName])
select EmployeeID, FirstName  from  NewEmployees
where Employeeid = 0

