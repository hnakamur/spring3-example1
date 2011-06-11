DROP SEQUENCE admin_seq;
CREATE SEQUENCE admin_seq;

DROP TABLE admin;
CREATE TABLE admin (
id INTEGER,
login_id VARCHAR(50),
name VARCHAR(255),
PRIMARY KEY (id)
);

CREATE UNIQUE INDEX admin_idx ON admin (login_id);
