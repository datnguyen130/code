/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [EmployeeID]
      ,[LastName]
      ,[FirstName]
      ,[Title]
      ,[TitleOfCourtesy]
      ,[BirthDate]
      ,[HireDate]
      ,[Address]
      ,[City]
      ,[Region]
      ,[PostalCode]
      ,[Country]
      ,[HomePhone]
      ,[Extension]
      ,[Photo]
      ,[Notes]
      ,[ReportsTo]
      ,[PhotoPath]
  FROM [Northwind].[dbo].[Employees]

declare @id int = '1'
select FirstName, LastName from [Employees] where EmployeeID = @id


select N'đạt'
select convert(date,birthdate)
from [Northwind].[dbo].[Employees]
