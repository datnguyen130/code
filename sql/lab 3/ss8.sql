DECLARE @admissionDate date = GETDATE()
SELECT @admissionDate

DECLARE @startTime time = '10:10:30.1234567';
DECLARE @startTime1 time(0) = '10:10:30.1234567';
DECLARE @startTime2 time(1) = '10:10:30.1234567';
DECLARE @startTime3 time(2) = '10:10:30.1234567';
DECLARE @startTime4 time(3) = '10:10:30.1234567';
DECLARE @startTime5 time(4) = '10:10:30.1234567';
DECLARE @startTime6 time(5) = '10:10:30.1234567';
DECLARE @startTime7 time(6) = '10:10:30.1234567';
DECLARE @startTime8 time(7) = '10:10:30.1234567';
SELECT @startTime;
SELECT @startTime1;
SELECT @startTime2;
SELECT @startTime3;
SELECT @startTime4;
SELECT @startTime5;
SELECT @startTime6;
SELECT @startTime7;
SELECT @startTime8;
go
DECLARE @spoint geometry;
SET @spoint = geometry::Parse('POINT(2 5)');
SELECT @spoint
go
DECLARE @mpoint geometry;
SET @mpoint = geometry::Parse('MULTIPOINT((6 8), (5 7))');
SELECT @mpoint
go
declare @line geometry;
set @line = geometry::Parse('linestring(1 1, 4 5, 10 13, 19 25)');
select @line
go 
DECLARE @line geometry;
SET @line = geometry::Parse('LINESTRING(1 1, 4 5, 10 13, 19 25)');
SELECT @line
go
DECLARE @multiline geometry;
SET @multiline = geometry::Parse('MULTILINESTRING((0 2, 1 1), (1 2, 2 1, 2 2))');
SELECT @multiline
go
SELECT CONVERT(varbinary(6),'aptech')
SELECT CONVERT(varchar(18), 0x617074656368, 0) AS 'Style 0'
SELECT CONVERT(varchar(18), 0x617074656368, 1) AS 'Style 1'
SELECT CONVERT(varchar(18), 0x617074656368, 2) AS 'Style 2'