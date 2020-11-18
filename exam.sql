-- CREATE database
 -- DROP
 	

DROP DATABASE IF EXISTS interns;
CREATE DATABASE 		interns;
USE 					interns;

DROP TABLE IF EXISTS country;
CREATE TABLE country(
country_id   		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
country_name 		NVARCHAR(100)

);

DROP TABLE IF EXISTS location ;
CREATE TABLE location(
location_id 		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
street_address 		NVARCHAR (300),
postal_code  		INT,
country_id 			INT UNSIGNED,
FOREIGN KEY(country_id) REFERENCES country(country_id)

);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
employee_id    	INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
full_name      	NVARCHAR(100),
email			VARCHAR(100),
location_id		INT UNSIGNED,
FOREIGN KEY(location_id) REFERENCES location(location_id)

);



INSERT INTO 	country 	(				country_name	)
VALUES 						(				'Viet Nam'		),
							(				'Viet Nam'		),
							(				'Cuba'			);
INSERT INTO 	location 	(			street_address,					postal_code				,country_id	)
VALUES						(			'leninh - kinhmon -  haiduong',				131002		,	3		),
							(			'laclong - kinhmon - haiduong',				271202		,	1		),
							(			'duytan-caugiay-hanoi',						325473		,	2		);
                
  INSERT INTO    employee	(employee_id,			full_name,					email					,location_id)
  VALUES   					(1,				'ninh van hau',				'vanhau12apt@gmail.com'			,		3		),
							(2,				'tran thi thanh thuy',		'thanhthuy13102002@gmail.com'	,		2		),
							(3,				'tony start',				'nn03@gmail.com'				,		1		),
                            (4,				'tony start',				'nn03@gmail.com'				,		1		),
                            (5,				'tony start',				'nn03@gmail.com'				,		1		),
                            (6,				'tony start',				'nn03@gmail.com'				,		1		),
                            (7,				'tony start',				'nn03@gmail.com'				,		1		),
                            (8,				'tony start',				'nn03@gmail.com'				,		1		),
                            (9,				'tony start',				'nn03@gmail.com'				,		1		),
                            (10,			'tony start',				'nn03@gmail.com'				,		1		),
                            (11,			'tony start',				'nn03@gmail.com'				,		1		),
                            (12,			'tony start',				'nn03@gmail.com'				,		1		),
                            (13,			'tony start',				'nn03@gmail.com'				,		1		);
                            
                            
-- 2.a Lấy tất cả các nhân viên thuộc Việt nam
-- ---------------------------------------------
SELECT *
FROM `employee` 
JOIN location USING (location_id)
JOIN country USING (country_id)
WHERE country_name = 'Viet Nam';

-- 2.b Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
	SELECT full_name , country_name
	FROM `employee` 
	JOIN location USING (location_id)
	JOIN country USING (country_id)
	WHERE email = 'nn03@gmail.com';
    
    
-- 2.c  Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.





-- 3.3. Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee











-- 4 Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
-- location đó sẽ có location_id = null
DROP TRIGGER IF EXISTS trigger_baby2;
 DELIMITER $$
CREATE TRIGGER trigger_baby2
BEFORE DELETE ON location
FOR EACH ROW
BEGIN
		UPDATE employee
		SET location_id = NULL 
		WHERE location_id = OLD.location_id ;
END $$    

DELETE FROM location
WHERE location_id = 1 ;
SELECT *
FROM employee
 


                