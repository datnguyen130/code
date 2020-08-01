drop table if exists contact
create table contact
(MailID varchar(20),
Name text,
TelephoneNumber int)

alter table contact add faxnumber int
alter table contact alter column Name nvarchar(100)
alter table contact drop column TelephoneNumber
insert into contact values('heksalty','dat',123456)
insert into contact values('bengsuger','son',1234567)
select top 10 * from contact