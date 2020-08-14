
CREATE DATABASE Lab10
USE Lab10
GO
CREATE TABLE Toys(
ProductCode varchar(5) PRIMARY KEY,
Name varchar(30),
Category varchar(30),
Manufacturer varchar(40),
AgeRange varchar(15),
UnitPrice money,
Netweight int,
QtyOnHand int)
GO
INSERT INTO Toys VALUES ('A111','Police Office','Lap ghep','ABC Corp','3-5 tuoi',100.000,300,25)
INSERT INTO Toys VALUES ('A112','Racing','Game','ABC Corp','5-7 tuoi',150.000,500,23)
INSERT INTO Toys VALUES ('A113','Pikachu','Gau bong','ABC Corp','3-10 tuoi',200.000,350,52)
INSERT INTO Toys VALUES ('A114','Tau hoa','Tu dong','ABC Corp','3-5 tuoi',90.000,700,48)
INSERT INTO Toys VALUES ('A115','Ship','Lap ghep','ABC Corp','5-7 tuoi',300.000,600,22)
INSERT INTO Toys VALUES ('A116','Mining','Game','ABC Corp','5-15 tuoi',120.000,800,90)
INSERT INTO Toys VALUES ('A117','Contra','Game','ABC Corp','3-5 tuoi',150.000,450,43)
INSERT INTO Toys VALUES ('A118','O to','Dieu khien tu xa','ABC Corp','3-10 tuoi',300.000,800,27)
INSERT INTO Toys VALUES ('A119','Port','Lap ghep','ABC Corp','5-15 tuoi',80.000,550,29)
INSERT INTO Toys VALUES ('A120','May bay','Dieu khien tu xa','ABC Corp','3-5 tuoi',500.000,200,30)
INSERT INTO Toys VALUES ('A121','Xe may','Dieu khien tu xa','ABC Corp','5-7 tuoi',180.000,600,56)
INSERT INTO Toys VALUES ('A122','Doraemon','Gau bong','ABC Corp','3-5 tuoi',260.000,530,71)
INSERT INTO Toys VALUES ('A123','Donald','Gau bong','ABC Corp','3-10 tuoi',320.000,420,22)
INSERT INTO Toys VALUES ('A124','Theme Park','Lap ghep','ABC Corp','5-15 tuoi',110.000,330,34)
INSERT INTO Toys VALUES ('A125','Elsa','Tu dong','ABC Corp','5-7 tuoi',170.000,190,45)
GO

-- 2
CREATE PROC HeavyToys 
@Weight int
AS
SELECT * FROM Toys 
WHERE Netweight > @Weight
GO
EXEC HeavyToys 500
GO

-- 3
CREATE PROC PriceIncrease
@PricePlus money
AS
UPDATE Toys
SET UnitPrice = UnitPrice + @PricePlus
GO
EXEC PriceIncrease 10
GO
SELECT * FROM Toys
GO
-- 4
CREATE PROC QtyOnHand
@QtyPlus int
AS
UPDATE Toys
SET QtyOnHand = QtyOnHand - @QtyPlus
GO
EXEC QtyOnHand 5
GO

-- 6
EXEC sp_helptext 'HeavyToys'
EXEC sp_helptext 'PriceIncrease'
EXEC sp_helptext 'QtyOnHand'
GO

-- 7
EXEC sp_depends 'HeavyToys'
EXEC sp_depends 'PriceIncrease'
EXEC sp_depends 'QtyOnHand'
GO
-- 8
ALTER PROC PriceIncrease
@PricePlus money
AS
BEGIN
UPDATE Toys
SET UnitPrice = UnitPrice + @PricePlus
END
BEGIN
SELECT UnitPrice FROM Toys
END
GO
EXEC PriceIncrease 0
GO

-- 9
CREATE PROC SpectificPriceIncrese 
AS
BEGIN
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
END
BEGIN
SELECT UnitPrice FROM Toys
END
GO
EXEC SpectificPriceIncrese
GO

-- 10
ALTER PROC SpectificPriceIncrese 
@Count int OUTPUT
AS
BEGIN
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
END
BEGIN
SELECT @Count = COUNT (UnitPrice) FROM Toys
END
GO
DECLARE @number int
EXEC SpectificPriceIncrese @number OUTPUT
PRINT @number 
GO

-- 11
ALTER PROC SpectificPriceIncrese 
AS
BEGIN
UPDATE Toys
SET UnitPrice = UnitPrice + QtyOnHand
END
BEGIN
EXEC HeavyToys 500
END
GO
EXEC SpectificPriceIncrese
GO
-- 12
ALTER PROC HeavyToys 
@Weight int
AS
BEGIN TRY
SELECT * FROM Toys 
WHERE Netweight > @Weight
END TRY
BEGIN CATCH
SELECT  
        ERROR_NUMBER() AS ErrorNumber  
        ,ERROR_SEVERITY() AS ErrorSeverity  
        ,ERROR_STATE() AS ErrorState  
        ,ERROR_PROCEDURE() AS ErrorProcedure  
        ,ERROR_LINE() AS ErrorLine  
        ,ERROR_MESSAGE() AS ErrorMessage;  
END CATCH
GO
