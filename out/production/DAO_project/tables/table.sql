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

mysql> insert into crimedetails values("Raj","2020-12-01","RajajiNagar","bank Robery",null,"suspect with his mask on and was carrying a gun threatened bank manager for money");
Query OK, 1 row affected (0.09 sec)

mysql> insert into crimedetails values("john","2022-09-29","Electronic city","Hit and Run","90 years old man","suspect was over speeding in a residential area, hit an old man and escaped from the crime scene");
Query OK, 1 row affected (0.05 sec)

mysql> insert into crimedetails values("Cena","2022-09-15","Kormangala","Murder","opposite gang member","suspect killed rival gang member with the knife");
Query OK, 1 row affected (0.12 sec)

mysql> select * from crimedetails;
+-------------+-------------+-----------------+-------------+----------------------+--------------------------------------------------------------------------------------------------+
| suspectName | dateOfCrime | place           | description | victims              | detailedDescription                                                                              |
+-------------+-------------+-----------------+-------------+----------------------+--------------------------------------------------------------------------------------------------+
| Cena        | 2022-09-15  | Kormangala      | Murder      | opposite gang member | suspect killed rival gang member with the knife                                                  |
| john        | 2022-09-29  | Electronic city | Hit and Run | 90 years old man     | suspect was over speeding in a residential area, hit an old man and escaped from the crime scene |
| Raj         | 2020-12-01  | RajajiNagar     | bank Robery | NULL                 | suspect with his mask on and was carrying a gun threatened bank manager for money                |
+-------------+-------------+-----------------+-------------+----------------------+--------------------------------------------------------------------------------------------------+
3 rows in set (0.00 sec)

mysql> insert into criminalinformation values("Cena",29,"Male","Kormangala","Stiches on his face","Kormangala","Murder");
Query OK, 1 row affected (0.18 sec)

mysql> insert into criminalinformation values("John",35,"Male","Jayanagar","Brown eyes","Electronic city","Hit and Run");
Query OK, 1 row affected (0.12 sec)

mysql> insert into criminalinformation values("Raj",32,"Male","Kengeri","Mole on right face","Rajajinagar","bank robery");
Query OK, 1 row affected (0.03 sec)

mysql> select *  from criminalinformation;
+------+------+--------+------------+---------------------+-----------------+---------------+
| name | age  | gender | address    | identifyingMarks    | areaOfCrime     | attachedCrime |
+------+------+--------+------------+---------------------+-----------------+---------------+
| Cena |   29 | Male   | Kormangala | Stiches on his face | Kormangala      | Murder        |
| John |   35 | Male   | Jayanagar  | Brown eyes          | Electronic city | Hit and Run   |
| Raj  |   32 | Male   | Kengeri    | Mole on right face  | Rajajinagar     | bank robery   |
+------+------+--------+------------+---------------------+-----------------+---------------+
3 rows in set (0.00 sec)

mysql> insert into crimestatus values("Cena","Unsolved");
Query OK, 1 row affected (0.13 sec)

mysql> insert into crimestatus values("John","Unsolved");
Query OK, 1 row affected (0.13 sec)

mysql> insert into crimestatus values("Raj","Solved");
Query OK, 1 row affected (0.04 sec)

mysql> select * from crimestatus;
+-------+----------+
| cname | status   |
+-------+----------+
| Cena  | Unsolved |
| John  | Unsolved |
| Raj   | Solved   |
+-------+----------+
3 rows in set (0.00 sec)

----------------------------------------------------------------------------------------------------------------------------------------

