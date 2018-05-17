-- Register a new user
insert into register (username, password) 
values
("john", CAST(150 as CHAR)),
("billy", CAST(120 as CHAR));

-- Create sample categories
insert into categories (register_id, name) values
(1000, "funny"),
(1000, "silly"),
(1001, "crazy"),
(1001, "neat"),
(1001, "sunshine");

-- Create sample gif entries for 1000
insert into gifs (giphy_id, register_id) values
("00001", 1000),
("00002", 1000),
("00001", 1001),
("00003", 1001);
