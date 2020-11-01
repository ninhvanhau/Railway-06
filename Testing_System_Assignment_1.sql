DROP DATABASE IF EXISTS testing_tystem;
CREATE DATABASE	IF NOT EXISTS testing_tystem;
USE testing_tystem; 

DROP TABLE IF EXISTS departments;
CREATE TABLE departments(
	department_id 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	department_name				NVARCHAR(100) NOT NULL
    
);

DROP TABLE IF EXISTS positions;

CREATE TABLE positions(
	position_id					TINYINT PRIMARY KEY AUTO_INCREMENT,
	position_name				ENUM( 'DEV' ,'Test','Scrum Master','PM')
);

DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts(
	account_id					TINYINT PRIMARY KEY AUTO_INCREMENT,
	email						VARCHAR(100) UNIQUE KEY NOT NULL ,
	user_name					NVARCHAR(100) NOT NULL,
	full_name					NVARCHAR(100)NOT NULL,
	department_id				INT UNSIGNED  DEFAULT(1),
	position_id 				INT UNSIGNED  NOT NULL ,
	create_date 				DATE,
	FOREIGN KEY (department_id) REFERENCES departments (department_id)
);

DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups`(
	group_id					TINYINT PRIMARY KEY AUTO_INCREMENT,
	group_name					NVARCHAR(100) NOT NULL,
	creator_id					INT UNSIGNED ,
	create_date					DATE,
	FOREIGN KEY (creator_id) 	REFERENCES category_question (creator_id)
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE group_account(
	group_id					TINYINT UNSIGNED ,
	account_id					TINYINT UNSIGNED ,
	join_date					DATE,
    PRIMARY KEY ( group_id,account_id),
	FOREIGN KEY (account_id) 	REFERENCES accounts (account_id)  
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE type_question(
	type_id						TINYINT UNSIGNED  PRIMARY KEY AUTO_INCREMENT,
	type_name					ENUM('essay','Multiple-Choice') 
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE category_question(
	creator_id					TINYINT UNSIGNED  PRIMARY KEY AUTO_INCREMENT,
	caregory_name				NVARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
	question_id					TINYINT PRIMARY KEY AUTO_INCREMENT,
	content						VARCHAR(100),
	category_id					TINYINT UNSIGNED ,
	type_id						TINYINT UNSIGNED ,
	creator_id					TINYINT UNSIGNED ,
	create_date					DATE,
    FOREIGN KEY (category_id) 	REFERENCES category_question (creator_id)
);

DROP TABLE IF EXISTS answers;
CREATE TABLE answers(
	answer_id					TINYINT UNSIGNED  PRIMARY KEY,
	content						VARCHAR(100),
	question_id					TINYINT UNSIGNED ,
	is_correct					ENUM('yes','no'),
    FOREIGN KEY (question_id) 	REFERENCES questions (question_id)
);

DROP TABLE IF EXISTS exams;
CREATE TABLE exams(
	exam_id						TINYINT UNSIGNED  PRIMARY KEY,
	`code`						TINYINT UNSIGNED ,
	title						VARCHAR(100),
	category_id					DATE,
	duration					VARCHAR(100),
	creator_id					TINYINT UNSIGNED  ,
	create_date					DATE
);

DROP TABLE IF EXISTS exam_question;
CREATE TABLE exam_question(
	exam_id						TINYINT UNSIGNED ,
	question_id					TINYINT UNSIGNED ,
    PRIMARY KEY(exam_id,question_id	),
    FOREIGN KEY (exam_id) 		REFERENCES exams (exam_id),
    FOREIGN KEY (exam_id) 		REFERENCES exams (exam_id),
    FOREIGN KEY (question_id) 	REFERENCES questions (question_id)
    );