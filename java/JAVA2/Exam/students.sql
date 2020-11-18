DROP DATABASE class;
CREATE DATABASE IF NOT EXISTS class;
USE class;
DROP TABLE IF EXISTS student;
CREATE TABLE student (
    StudentId varchar(10) PRIMARY KEY,
    Name varchar(20) ,
    Address varchar(20),
    Phone varchar(10)
);

