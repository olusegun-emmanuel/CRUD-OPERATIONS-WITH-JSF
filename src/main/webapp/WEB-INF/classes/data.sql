DROP TABLE IF EXISTS SKILL_ENTITY;

CREATE TABLE SKILL_ENTITY (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   skill VARCHAR(250),
);

INSERT into SKILL_ENTITY(id, skill) VALUES (1, 'Core Java Programming');
INSERT into SKILL_ENTITY(id, skill) VALUES (2, 'Java Spring Framework');
INSERT into SKILL_ENTITY(id, skill) VALUES (3, 'JavaScript');
INSERT into SKILL_ENTITY(id, skill) VALUES (4, 'Node JS');
INSERT into SKILL_ENTITY(id, skill) VALUES (5, 'Angular JS');
INSERT into SKILL_ENTITY(id, skill) VALUES (6, 'PHP');

