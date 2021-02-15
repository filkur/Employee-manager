DROP TABLE if EXISTS employees;
CREATE TABLE employees (
    id INT PRIMARY KEY auto_increment,
    name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    jobTitle varchar(100) NOT NULL,
    phone varchar(100) NOT NULL,
    imageUrl varchar(100) NOT NULL,
    employeeCode varchar(100) NOT NULL
);