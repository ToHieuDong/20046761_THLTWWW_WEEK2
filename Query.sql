USE orderdb

INSERT INTO customer (address, email, name, phone) VALUES ("Dong Thanh", "hieudong.dongthanh", "Dong", "0859505384");
INSERT INTO customer (address, email, name, phone) VALUES ("Go Vap", "dat.govap", "Dat", "0855625384");
INSERT INTO customer (address, email, name, phone) VALUES ("Tan Tap", "fit.bgf", "Dong", "0815240321");


INSERT INTO employee (address, dob, email, full_name, phone, `status`) VALUES ("Tan Tap", "2002-11-02", "fit.bgf", "Dong", "0815240321", 1);
INSERT INTO employee (address, dob, email, full_name, phone, `status`) VALUES ("Can Giuoc", "2002-03-28", "dong.cangiuoc", "Gnoodd", "0811524921", 1);
INSERT INTO employee (address, dob, email, full_name, phone, `status`) VALUES ("Long An", "2002-01-15", "nam.iunh", "Kian", "0815861421", 1);





SELECT * FROM employee;orders