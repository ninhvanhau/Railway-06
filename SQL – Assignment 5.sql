-- SQL – Assignment 5

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
-- ---------------------------------------------------------------------
CREATE OR REPLACE VIEW 	view_1 AS
SELECT 						*
FROM 						`Account`
JOIN 						Department USING (DepartmentID)
WHERE 						DepartmentName = 'sale';
SELECT 						* 
FROM 						view_1;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
-- --------------------------------------------------------------------------------
CREATE OR REPLACE VIEW 	view_2 AS
SELECT 						*,COUNT(1)
FROM 						`Account`
JOIN 						`GroupAccount` USING (AccountID)
GROUP BY 					AccountID
HAVING 						COUNT(1) =(	SELECT 			COUNT(1)
										FROM 			`Account`
										JOIN 			`GroupAccount` USING (AccountID)
										GROUP BY 		AccountID
										ORDER BY 		COUNT(1) DESC 
										LIMIT 			1
);
SELECT 						*
FROM 						view_2;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
-- -------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW 		view_3 AS
SELECT 						*,length(Content)
FROM 						Question
WHERE						length(Content)>15;
SET 						FOREIGN_KEY_CHECKS = 0;
DELETE FROM 				view_3 ;
SELECT 						*,length(Content)
FROM 						Question;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
-- ----------------------------------------------------------------------------
CREATE OR REPLACE VIEW view_4 AS
SELECT 						COUNT(1),DepartmentID,DepartmentName
FROM 						`Account`
JOIN 						Department USING (DepartmentID)
GROUP BY 					DepartmentID
HAVING 						COUNT(1) = (SELECT 		COUNT(1)
										FROM 		`Account`
										GROUP BY 	DepartmentID
										ORDER BY 	COUNT(1 ) DESC
										LIMIT 		1);
SELECT 						*
FROM 						view_4;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
-- ----------------------------------------------------------------------
CREATE OR REPLACE VIEW view_5 AS
SELECT 						FullName,Content
FROM 						`Account` a
JOIN 						Question  q 		ON 		a.AccountID = q.CreatorID
WHERE 						FullName 			LIKE 	('Nguyen%');
SELECT 						*
FROM 						view_5;
