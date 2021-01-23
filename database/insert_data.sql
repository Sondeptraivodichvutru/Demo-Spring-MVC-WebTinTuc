use webtintuc;

insert into role(code,name) values('ADMIN','Quản trị');
insert into role(code,name) values('USER','Người dùng');

insert into user(username,password,fullname,status)
values('truongson','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','SonSieuSao',1);
insert into user(username,password,fullname,status)
values('minhquan','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','QuanNguDan',1);
insert into user(username,password,fullname,status)
values('hoangduongcategory','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','DuongMongLung',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);


insert into category(code,name) values('the-thao','Thể thao');
insert into category(code,name) values('giai-tri','Giải trí');
insert into category(code,name) values('gioi-nghe-si','Xâu bít');
insert into category(code,name) values('btec-fpt','Trường BTEC FPT');