DROP TABLE IF EXISTS rest_msi.users;
CREATE TABLE rest_msi.users(
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(30),
  email VARCHAR(30)
);

DROP TABLE IF EXISTS rest_msi.ticket;
CREATE TABLE rest_msi.ticket (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  priority VARCHAR(10),
  title VARCHAR(30),
  description VARCHAR(30),
  author INTEGER,
  task_stage INTEGER,
  task_number INTEGER,
  task_query VARCHAR(200),
  date_created DATE,
  FOREIGN KEY (author) REFERENCES rest_msi.users(id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS rest_msi.status_history;
CREATE TABLE rest_msi.status_history (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  ticket_id INTEGER,
  date_change DATE,
  status VARCHAR(30),
  note VARCHAR(100),
  FOREIGN KEY (ticket_id) REFERENCES rest_msi.ticket(id)
);

DROP TABLE IF EXISTS rest_msi.ticket_chat;
CREATE TABLE rest_msi.ticket_chat(
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  ticket_id INTEGER,
  author INTEGER,
  date_create DATE,
  message VARCHAR(300),
  FOREIGN KEY (ticket_id) REFERENCES rest_msi.ticket(id),
  FOREIGN KEY (author) REFERENCES rest_msi.users(id)
);

DROP TABLE IF EXISTS rest_msi.shift;
CREATE TABLE rest_msi.shift (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  moderator INTEGER,
  ticket_id INTEGER,
  date_start DATE,
  date_end DATE,
  FOREIGN KEY (ticket_id) REFERENCES rest_msi.ticket(id),
  FOREIGN KEY (moderator) REFERENCES rest_msi.users(id)
);