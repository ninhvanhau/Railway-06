DROP DATABASE IF EXISTS testing_tystem;
CREATE DATABASE	testing_tystem;
USE testing_tystem; 

DROP TABLE IF EXISTS departments;
CREATE TABLE departments(
	department_id 				INT,
	department_name				VARCHAR(50)
);

DROP TABLE IF EXISTS positions;
CREATE TABLE positions(
	position_id					INT,
	position_name				VARCHAR(50)	
);

DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts(
	account_id					INT,
	email						VARCHAR(50),
	user_name					VARCHAR(50),
	full_name					VARCHAR(50),
	department_id				INT,
	position_id 				INT,
	create_date 				DATE
);

DROP TABLE IF EXISTS `groups`;
CREATE TABLE `groups`(
	group_id					INT,
	group_name					VARCHAR(50),
	creator_id					INT,
	create_date					DATE
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE group_account(
	group_id					INT,
	account_id					INT,
	join_date					DATE
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE type_question(
	type_id						INT,
	type_name					VARCHAR(50)
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE category_question(
	category_id					INT,
	caregory_name				VARCHAR(50)
);

DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
	question_id					INT,
	content						VARCHAR(50),
	category_id					INT,
	type_id						INT,
	creator_id					INT,
	create_date					DATE
);

DROP TABLE IF EXISTS answers;
CREATE TABLE answers(
	answer_id					INT,
	content						VARCHAR(50),
	question_id					INT,
	is_correct					VARCHAR(50)
);

DROP TABLE IF EXISTS exams;
CREATE TABLE exams(
	exam_id						INT,
	`code`						INT,
	title						VARCHAR(50),
	category_id					DATE,
	duration					VARCHAR(50),
	creator_id					INT,
	create_date					DATE
);

DROP TABLE IF EXISTS exam_question;
CREATE TABLE exam_question(
	exam_id						INT,
	question_id					INT
);