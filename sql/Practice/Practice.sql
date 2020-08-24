CREATE DATABASE MyBlog
USE MyBlog
GO
CREATE TABLE Users (
UserID int primary key identity(1,1),
UserName varchar(20),
Passwords varchar(30),
Email varchar(30) Unique,
Address nvarchar(200))
GO
CREATE TABLE Posts (
PostID int primary key identity(11,1),
Title nvarchar(200),
Content nvarchar,
Tag nvarchar(100),
Status bit,
CreateTime datetime default(getdate()),
UpdateTime datetime,
UserID int foreign key references Users(UserID))
GO
CREATE TABLE Comments (
CommentID int primary key identity(101,1),
Content nvarchar(500),
Status bit,
CreateTime datetime default(getdate()),
AUthor nvarchar(30),
Email varchar(50) not null,
PostID int foreign key references Posts(PostID))
GO
ALTER TABLE Users
ADD Constraint CHK1 CHECK (Email like '%@%')
GO
ALTER TABLE Comments 
ADD Constraint CHK1 CHECK (Email like '%@%')
GO
CREATE unique nonclustered INDEX IX_UserName 
ON Users(UserName)
GO
INSERT INTO Users VALUES ('Nguyen Van a','nguyenvana','nguyenvana@gmail.com','Ha Noi')
INSERT INTO Users VALUES ('Nguyen Van b','nguyenvanb','nguyenvanb@gmail.com','Bac Ninh')
INSERT INTO Users VALUES ('Nguyen Van c','nguyenvanc','nguyenvanc@gmail.com','Bac Giang')
GO
INSERT INTO Posts VALUES ('Homo Sapiens','A','Social','1','2016-5-12','2020-4-23',1)
INSERT INTO Posts VALUES ('Harry Porter','B','Harry','1','2018-2-22','2018-4-23',2)
INSERT INTO Posts VALUES ('Santa Clause','C','Santa','0','2014-8-5','2019-5-2',3)
GO
INSERT INTO Comments VALUES ('kjasfhjksahfkha','1','2020-4-29','good','author1@gmail.com',11)
INSERT INTO Comments VALUES ('kjujahkjavhjkasfllkiasopfi','1','2020-5-9','best','author2@gmail.com',12)
INSERT INTO Comments VALUES ('iauyfiyfuiwqykjhvdsjkvhsdhf','0','2020-3-2','bad','author3@gmail.com',13)
GO
SELECT * FROM Posts
WHERE Tag = 'Social'
GO
SELECT Posts.PostID, Posts.Title,Posts.Content,Comments.Email
FROM Posts
JOIN Comments ON Posts.PostID = Comments.PostID
WHERE Comments.Email = 'abc@gmail.com'
GO
SELECT Posts.PostID,COUNT(Comments.CommentID) AS COUNTED
FROM Posts
JOIN Comments ON Posts.PostID = Comments.PostID
GROUP BY Posts.PostID
GO
CREATE VIEW V_NewPost 
AS
SELECT Title,UserName,CreateTime
FROM Users
JOIN Posts ON Users.UserID = Posts.UserID
ORDER BY CreateTime DESC
GO
CREATE PROC SP_GetComment 
@PostID int
AS
SELECT CommentID, Content,Status,CreateTime
FROM Comments 
WHERE PostID = @PostID
GO
CREATE TRIGGER TG_UpdateTime
ON Posts
FOR UPDATE
AS
BEGIN
	UPDATE Posts
	SET UpdateTime = GETDATE()
	WHERE PostID in ( SELECT PostID FROM DELETED)
END
GO
