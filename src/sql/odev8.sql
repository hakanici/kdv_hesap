create table employee(
	id serial primary key,
	name varchar(50) not null,
	birthday date,
	email varchar(100)

);

insert into employee (name, birthday, email) values ('Cahra', '1972-03-06', 'cmilesap0@quantcast.com');
insert into employee (name, birthday, email) values ('Honoria', '1966-06-09', 'hglasby1@w3.org');
insert into employee (name, birthday, email) values ('Carlo', '1990-01-26', 'ctatem2@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Garreth', '1984-02-08', 'gtaynton3@bbb.org');
insert into employee (name, birthday, email) values ('Ruby', '1985-09-23', 'rgilham4@redcross.org');
insert into employee (name, birthday, email) values ('Ingemar', '1968-09-17', 'imcguffog5@amazon.com');
insert into employee (name, birthday, email) values ('Ware', '2000-11-16', 'wsagg6@scribd.com');
insert into employee (name, birthday, email) values ('Merna', '1966-06-27', 'mstendall7@i2i.jp');
insert into employee (name, birthday, email) values ('Francisca', '1968-01-12', 'fstobo8@marketwatch.com');
insert into employee (name, birthday, email) values ('Muffin', '1991-03-28', 'mmegarrell9@vistaprint.com');
insert into employee (name, birthday, email) values ('Gar', '1973-08-06', 'greddinga@ovh.net');
insert into employee (name, birthday, email) values ('Joela', '1964-12-08', 'jfriftb@nydailynews.com');
insert into employee (name, birthday, email) values ('Mart', '1965-10-17', 'mwringec@eepurl.com');
insert into employee (name, birthday, email) values ('Derick', '1981-05-15', 'dbalmforthd@xrea.com');
insert into employee (name, birthday, email) values ('Mikol', '1997-08-20', 'manglisse@a8.net');
insert into employee (name, birthday, email) values ('Say', '1989-10-08', 'sbullierf@mit.edu');
insert into employee (name, birthday, email) values ('Rriocard', '1988-01-21', 'rcastardg@godaddy.com');
insert into employee (name, birthday, email) values ('Abner', '1972-11-18', 'acazaleth@123-reg.co.uk');
insert into employee (name, birthday, email) values ('Carlee', '1988-03-09', 'creefi@dyndns.org');
insert into employee (name, birthday, email) values ('Cesar', '1997-04-05', 'ckolushevj@redcross.org');
insert into employee (name, birthday, email) values ('Noelle', '1984-07-19', 'nstrelitzk@soup.io');
insert into employee (name, birthday, email) values ('Ronny', '2004-12-08', 'rmcrobbiel@elpais.com');
insert into employee (name, birthday, email) values ('Angel', '1981-06-09', 'adidomenicom@marriott.com');
insert into employee (name, birthday, email) values ('Vaughn', '1981-10-31', 'vbellanyn@twitpic.com');
insert into employee (name, birthday, email) values ('Hermina', '1966-04-24', 'hwinstono@ezinearticles.com');
insert into employee (name, birthday, email) values ('Flor', '1976-04-18', 'fgawthorpp@live.com');
insert into employee (name, birthday, email) values ('Nollie', '1966-04-17', 'npurkisq@latimes.com');
insert into employee (name, birthday, email) values ('Thekla', '1962-06-09', 'tphilipponr@edublogs.org');
insert into employee (name, birthday, email) values ('Horst', '1996-10-29', 'hbowers@yandex.ru');
insert into employee (name, birthday, email) values ('Carlie', '1978-05-05', 'cjornt@disqus.com');
insert into employee (name, birthday, email) values ('Andris', '1987-06-19', 'abroadisu@sourceforge.net');
insert into employee (name, birthday, email) values ('Dalton', '1972-12-08', 'dedghinnv@thetimes.co.uk');
insert into employee (name, birthday, email) values ('Corbett', '1995-12-20', 'csweeneyw@bbb.org');
insert into employee (name, birthday, email) values ('Janna', '1990-06-24', 'jwitherupx@europa.eu');
insert into employee (name, birthday, email) values ('Gwenora', '1986-02-20', 'gprobyy@techcrunch.com');
insert into employee (name, birthday, email) values ('Ileana', '1995-04-18', 'istienhamz@rakuten.co.jp');
insert into employee (name, birthday, email) values ('Starlin', '1967-08-19', 'sboliver10@aol.com');
insert into employee (name, birthday, email) values ('Jess', '1979-01-07', 'jaikin11@smh.com.au');
insert into employee (name, birthday, email) values ('Lona', '1969-02-09', 'lkopje12@slideshare.net');
insert into employee (name, birthday, email) values ('Benedetta', '1972-05-29', 'bdeetlefs13@dmoz.org');
insert into employee (name, birthday, email) values ('Ophelie', '1990-12-06', 'ogilbee14@oakley.com');
insert into employee (name, birthday, email) values ('Gloriana', '1992-07-29', 'gferrai15@hc360.com');
insert into employee (name, birthday, email) values ('Minette', '1989-01-19', 'mnesey16@flavors.me');
insert into employee (name, birthday, email) values ('Saul', '1994-02-06', 'sflintiff17@wunderground.com');
insert into employee (name, birthday, email) values ('Wilt', '1998-03-20', 'wgleed18@ebay.com');
insert into employee (name, birthday, email) values ('Jaime', '1971-03-27', 'jfenich19@ft.com');
insert into employee (name, birthday, email) values ('Ephraim', '1999-02-01', 'egorce1a@wisc.edu');
insert into employee (name, birthday, email) values ('Arlie', '1999-04-11', 'acairney1b@printfriendly.com');
insert into employee (name, birthday, email) values ('Mill', '1962-12-12', 'mokielt1c@cdc.gov');
insert into employee (name, birthday, email) values ('Nisse', '1978-01-16', 'nhardy1d@army.mil');

update employee
set name='Hakan',
birthday='1998-10-07',
email='hakanici123@gmail.com'
WHERE name='Muffin'
RETURNING *;

DELETE FROM employee
where id=7
returning *;