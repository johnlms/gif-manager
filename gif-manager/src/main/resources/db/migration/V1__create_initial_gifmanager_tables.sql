use gifmanager;
-- table register
--	contains information pertaining to registered users
--		id ->  		The primary key for each record.  Initialized to start at 1000.
--		username ->	user name of the registered user
--		password -> encrypted SHA-256 password
--
create table register (
	id int NOT NULL AUTO_INCREMENT,
	username varchar(255) NOT NULL,
	password char(64) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE KEY (username)
)ENGINE=InnoDB;
alter table register AUTO_INCREMENT = 1000;


-- table register_info
--	contains additional information regarding a user
--		register_id
--		name
--
create table register_info (
	register_id int NOT NULL,
	name varchar(255),
	birthday date,
	email varchar(255),
	FOREIGN KEY (register_id) REFERENCES register(id) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;		


-- table gifs
--	associates a registered user with a giphy file
--		id ->			unique primary identifier, initialized to start at 1000
--		gif_id ->		unique key provided by giphy
--		register_id ->	foreign key to the registered user
--
create table gifs (
	id int NOT NULL AUTO_INCREMENT,
	giphy_id varchar(255) NOT NULL,
	register_id int NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (register_id) REFERENCES register(id) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;
alter table gifs AUTO_INCREMENT = 1000;


-- table categories
--	contains user defined categories to associate with gifs
--	table is cleared of entries when the registered user is removed from the parent table
--		id				unique identifier and primary key
--		register_id		associates the entry with a registered user
--		name			category name
--
create table categories (
	id int NOT NULL AUTO_INCREMENT,
	register_id int NOT NULL,
	name varchar(255) NOT NULL,
	PRIMARY KEY (id),
	KEY (register_id, name),
	FOREIGN KEY (register_id) REFERENCES register(id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;
alter table categories AUTO_INCREMENT = 1000;


-- table gif_categories
--	a cross-reference table associating gif files with a specified category
--		gif_id		the primary key of the gifs table indicating which gif the category is assigned to
--		category_id	the primary key of the categories table indicating which category to assign with the gif
--
create table gif_categories (
	gif_id int NOT NULL,
	category_id int NOT NULL,
	PRIMARY KEY (gif_id, category_id),
	FOREIGN KEY (gif_id) REFERENCES gifs(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE ON UPDATE CASCADE
)Engine=InnoDB;

