mysql> use miniproject;
Database changed
mysql> create table crimedetails(suspectName varchar(30) primary key,dateOfCrime date,place varchar(30),description varchar(30),victims varchar(30),detailedDescription varchar(100));
Query OK, 0 rows affected (2.71 sec)

mysql> desc crimedetails;
+---------------------+--------------+------+-----+---------+-------+
| Field               | Type         | Null | Key | Default | Extra |
+---------------------+--------------+------+-----+---------+-------+
| suspectName         | varchar(30)  | NO   | PRI | NULL    |       |
| dateOfCrime         | date         | YES  |     | NULL    |       |
| place               | varchar(30)  | YES  |     | NULL    |       |
| description         | varchar(30)  | YES  |     | NULL    |       |
| victims             | varchar(30)  | YES  |     | NULL    |       |
| detailedDescription | varchar(100) | YES  |     | NULL    |       |
+---------------------+--------------+------+-----+---------+-------+
6 rows in set (0.29 sec)

mysql> create table criminalInformation(name varchar(30),age int,gender varchar(10),address varchar(20),identifyingMarks varchar(20),areaOfCrime varchar(20),attachedCrime varchar(20),foreign key(name) references crimedetails(suspectName));
Query OK, 0 rows affected (1.31 sec)

mysql> desc criminalinformation;
+------------------+-------------+------+-----+---------+-------+
| Field            | Type        | Null | Key | Default | Extra |
+------------------+-------------+------+-----+---------+-------+
| name             | varchar(30) | YES  | MUL | NULL    |       |
| age              | int         | YES  |     | NULL    |       |
| gender           | varchar(10) | YES  |     | NULL    |       |
| address          | varchar(20) | YES  |     | NULL    |       |
| identifyingMarks | varchar(20) | YES  |     | NULL    |       |
| areaOfCrime      | varchar(20) | YES  |     | NULL    |       |
| attachedCrime    | varchar(20) | YES  |     | NULL    |       |
+------------------+-------------+------+-----+---------+-------+
7 rows in set (0.00 sec)

mysql> create table crimeStatus(cname varchar(30),status varchar(10),foreign key(cname) references crimedetails(suspectName));
Query OK, 0 rows affected (0.38 sec)

mysql> desc crimestatus;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| cname  | varchar(30) | YES  | MUL | NULL    |       |
| status | varchar(10) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)