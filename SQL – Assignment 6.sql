-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
-- ---------------------------------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question1 ;
DELIMITER $$
CREATE PROCEDURE 				question1					( IN name_department VARCHAR(100 ))
													
	BEGIN 
			SELECT 				*
			FROM 				`Account` 
            JOIN 				Department USING			(DepartmentID) 
            WHERE 				DepartmentName LIKE CONCAT  ('%' ,name_department  ,'%');
	END $$ 
DELIMITER ;

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
-- ---------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question2 ;
DELIMITER $$
CREATE PROCEDURE 				question2()
													
	BEGIN 
			SELECT 				*,COUNT(1)
			FROM 				`groupaccount`
            GROUP BY 			GroupID ;
	END $$ 
DELIMITER ;

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
-- -------------------------------------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question3;
DELIMITER $$
CREATE PROCEDURE 				question3()
	BEGIN
			SELECT 				TypeID, COUNT(QuestionID) AS SoLuongCauHoi
			FROM 				Question
			WHERE 				CreateDate >= '2020-11-01'
			GROUP BY 			TypeID;
	END $$
DELIMITER ;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
-- --------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question4;
DELIMITER $$
CREATE PROCEDURE 				question4()
	BEGIN
		SELECT  				COUNT(1), TypeID
		FROM 					Question
		GROUP BY 				TypeID
		HAVING 					COUNT(1) = (SELECT 			COUNT(1)
											FROM 			Question
											GROUP BY 		TypeID
											ORDER BY 		COUNT(1) DESC
											LIMIT 			1);
		END $$
	DELIMITER ;



-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
-- ----------------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question5;
DELIMITER $$
CREATE PROCEDURE 				question5()
	BEGIN
		SELECT  				COUNT(1), TypeID,Typename
		FROM 					Question
        JOIN 					TypeQuestion  USINg (TypeID)
		GROUP BY 				TypeID
		HAVING 					COUNT(1) = (SELECT 			COUNT(1)
											FROM 			Question
											GROUP BY 		TypeID
											ORDER BY 		COUNT(1) DESC
											LIMIT 			1);
		END $$
	DELIMITER ;


-- Question 6: 
/* Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào */
-- ------------------------------------------------------------------------
DROP PROCEDURE IF EXISTS 		question6;
DELIMITER $$
CREATE PROCEDURE 				question6(IN in_name VARCHAR(50))
BEGIN
		SELECT 					g.GroupID, g.GroupName, a.AccountID, a.Username
        FROM 					`GroupAccount` ga
        JOIN 					`group` g ON ga.GroupID = g.GroupID
        JOIN 					`account` a ON ga.AccountID = a.AccountID
        WHERE 					Username LIKE CONCAT('%' , in_name , '%') OR GroupName LIKE CONCAT('%' , in_name , '%')
        ;
END $$
DELIMITER ;


