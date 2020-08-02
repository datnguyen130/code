if exists (select * from sys.databases where name = 'BookLibary')
drop database BookLibary

go 
create database BookLibary
go
use Booklibary
go
create table Book (
BookCode int primary key,
BookTitle varchar(100) not null,
Author varchar(50) not null,
Edition int,
BookPrice money,
Copies int)
go
create table Member(
MemberCode int primary key,
Name varchar(50) not null,
Address varchar(100) not null,
PhoneNumber int)
go
create table IssueDetails(
BookCode int,
MemberCode int,
IssueDate datetime,
ReturnDate datetime,
constraint fk_Bookcode foreign key (Bookcode) references Book(BookCode),
constraint fk_MemberCode foreign key (MemberCode) references Member(MemberCode)
)
go
alter table [dbo].[IssueDetails]
drop constraint fk_Bookcode
alter table [dbo].[IssueDetails]
drop constraint fk_MemberCode
go
alter table Member
drop constraint [PK__Member__84CA6376340627AB]
alter table Book
drop constraint [PK__Book__0A5FFCC664A13F0A]
go
alter table Member
add constraint pk_Membercode primary key (MemberCode)
alter table Book
add constraint pk_Bookcode primary key(Bookcode)
go
alter table [dbo].[IssueDetails]
add constraint fk_MemberCode foreign key (MemberCode) references Member(MemberCode)
go
alter table Book
add constraint chk_BookPrice check(BookPrice>0 and BookPrice <200)
go
alter table Member
add constraint uniquephone unique([PhoneNumber])
go
alter table [dbo].[IssueDetails]
alter column [BookCode] int not null
alter table [dbo].[IssueDetails]
alter column [MemberCode] int not null
go
alter table [dbo].[IssueDetails]
add constraint pk_BC_MC primary key ([BookCode],[MemberCode])
go
insert into Book values(1,'The Choose','Unknow',10,100,50)

