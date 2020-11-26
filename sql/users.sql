create table user(
    id int primary key auto_increment,
    name varchar(20),
    pwd varchar(20),
    age int ,
    sex varchar(2),
    tel varchar(15),
    email varchar(20),
    address varchar(50)
);

insert into user(name, pwd, age, sex, tel, email, address) values
                        ('user1','1234',21,'男','1785656129','1278789@QQ.COM','广东珠海'),
                        ('user2','2314',20,'女','1757576739','26786877@QQ.COM','江西赣州'),
                        ('user3','4564',23,'男','1478656785','25688667@QQ.COM','湖南长沙'),
                        ('user4','6786',26,'女','1767678678','29678965@QQ.COM','广东深圳');

select * from user;


select id, name, pwd, age, sex, tel, email, address from user
select id, name,pwd, age, sex, tel, email, address from user