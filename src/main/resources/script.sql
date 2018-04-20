CREATE TABLE rest_msi.shift (
  id SERIAL PRIMARY KEY,
  moderator INTEGER,
  date_start DATE,
  date_end DATE
);
create table rest_msi.ticket (
  id serial not null primary key,
  user_name varchar(20),
  user_email varchar(30),
  shift integer
  references shift,
  moderator integer,
  priority varchar(10),
  status varchar(10),
  title varchar(30),
  description varchar(30),
  task_stage integer,
  task_number varchar(30),
  task_query varchar(200),
  task_modquer varchar(30),
  date_created date
);

CREATE TABLE rest_msi.status_history (
  id SERIAL NOT NULL PRIMARY KEY ,
  ticket INTEGER,
  date_change DATE,
  status VARCHAR(5),
  note VARCHAR(100)
);

CREATE TABLE ticket_chat(
  id SERIAL NOT NULL PRIMARY KEY,
  ticket integer,
  author integer,
  date_create date,
  message varchar(300)
);