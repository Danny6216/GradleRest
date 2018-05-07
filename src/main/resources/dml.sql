INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (2, 'critical', 'title1', 'discription1', '1', '1', 'query1', '1970-01-01');

INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (1, 'critical', 'title2', 'discription2', '2', '2', 'query2', '1970-01-02');

INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (3, 'critical', 'title2', 'discription2', '2', '2', 'query2', '1970-01-02');
INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (3, 'critical', 'title2', 'discription2', '2', '2', 'query2', '1970-01-02');
INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (4, 'critical', 'title2', 'discription2', '2', '2', 'query2', '1970-01-02');
INSERT INTO rest_msi.ticket(author, priority, title, description, task_stage, task_number, task_query, date_created)
VALUES (4, 'critical', 'title2', 'discription2', '2', '2', 'query2', '1970-01-02');



INSERT INTO rest_msi.shift(moderator, ticket_id, date_start, date_end) VALUES (1, 1, '1970-01-01', '1970-01-02');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (2, 1, '1970-01-02', '1970-01-03');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (3, 1, '1970-01-03', '1970-01-04');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (4, 1, '1970-01-04', '1970-01-05');

INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (1, 2, '1970-01-01', '1970-01-02');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (2, 2, '1970-01-02', '1970-01-03');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (3, 2, '1970-01-03', '1970-01-04');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (4, 2, '1970-01-04', '1970-01-05');

INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (1, 3, '1970-01-01', '1970-01-02');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (2, 3, '1970-01-02', '1970-01-03');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (3, 3, '1970-01-03', '1970-01-04');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (4, 3, '1970-01-04', '1970-01-05');

INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (1, 4, '1970-01-01', '1970-01-02');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (2, 4, '1970-01-02', '1970-01-03');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (3, 4, '1970-01-03', '1970-01-04');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (4, 4, '1970-01-04', '1970-01-05');

INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (1, 5, '1970-01-01', '1970-01-02');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (2, 5, '1970-01-02', '1970-01-03');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (3, 5, '1970-01-03', '1970-01-04');
INSERT INTO rest_msi.shift (moderator, ticket_id, date_start, date_end) VALUES (4, 5, '1970-01-04', '1970-01-05');


INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (1, '1970-01-01', 'new', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (1, '1970-01-02', 'solved', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (2, '1970-01-02', 'new status', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (2, '1970-01-03', 'solved', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (3, '1970-01-03', 'new status', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (3, '1970-01-04', 'solved', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (4, '1970-01-04', 'new status', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (4, '1970-01-05', 'solved', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (5, '1970-01-05', 'new status', 'some note');
INSERT INTO rest_msi.status_history(ticket_id, date_change, status, note)
VALUES (5, '1970-01-06', 'solved', 'some note');


INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (1, 1, '1970-01-01', 'message1');
INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (1, 2, '1970-01-02', 'message2');

INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (2, 3, '1970-01-03', 'message3');
INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (2, 4, '1970-01-04', 'message4');

INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 5, '1970-01-05', 'message5');
INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 1, '1970-01-06', 'message6');

INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 2, '1970-01-07', 'message7');
INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 3, '1970-01-08', 'message8');

INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 4, '1970-01-09', 'message9');
INSERT INTO rest_msi.ticket_chat(ticket_id, author, date_create, message)
VALUES (3, 5, '1970-01-10', 'message10');


INSERT INTO rest_msi.users(username, email) VALUES ('user1','user1@mail.com');
INSERT INTO rest_msi.users(username, email) VALUES ('user2','user2@mail.com');
INSERT INTO rest_msi.users(username, email) VALUES ('user3','user3@mail.com');
INSERT INTO rest_msi.users(username, email) VALUES ('user4','user4@mail.com');
INSERT INTO rest_msi.users(username, email) VALUES ('user5','user5@mail.com');