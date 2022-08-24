Create database school;
use school;
Create table staff(
staff_id int(4) auto_increment,
name varchar(50) Not null,
position varchar(50) Not null,
age int(3) Not null,
years_teaching int(2) Not null,
salary int(6) Not null,
primary key(staff_id));


INSERT INTO staff(name,position,age,years_teaching,salary) VALUES ("GREG POPAVICH","HeadMaster",60,40,900000);
select * From staff;


