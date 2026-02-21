create database bankmanagement;
show databases;
use bankmanagement;

create table signup(formno varchar(10),name varchar(20),fname varchar(20),dob varchar(20),gender varchar(20),email varchar(30),address varchar(40),city varchar(25),state varchar(20),pin varchar(6));
show tables;
select * from signup;

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),educ varchar(20),occ varchar(20),aadhar varchar(12),pan varchar(12),exacc varchar(5));
select * from signuptwo;

create table signup3(formno varchar(20),acctype varchar(40),cardno varchar(25),pin varchar(10),facility varchar(100));
select * from signup3;

create table login(formno varchar(20),cardNumber varchar(25),pin varchar(10));
select * from login;

create table bank(cardNumber varchar(20), date varchar(40),type varchar(25),amount varchar(20));
desc bank;
select * from bank;
