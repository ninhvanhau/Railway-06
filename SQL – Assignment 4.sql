-- SQL – Assignment 4
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT				*
FROM				Department
JOIN				`Account` USING (DepartmentID);

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT				*
FROM				`Account` 
WHERE				CreateDate > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer 

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT				COUNT(1),DepartmentID,DepartmentName
FROM 				`Account`
JOIN				Department USING (DepartmentID)
GROUP BY 			(DepartmentID)
HAVING 				COUNT(1) >='3' ;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT 				*,COUNT(1) 
FROM 				Answer
LEFT JOIN			Question USING (QuestionID)
GROUP BY 			QuestionID  
ORDER BY        	COUNT(1) DESC 
LIMIT 				1;

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT *
FROM 				CategoryQuestion
LEFT JOIN 			Question USING (CategoryID) 
ORDER BY 			CategoryID  ;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT *
FROM 				Question
LEFT JOIN 			Exam USING (CategoryID)
ORDER BY 			CategoryID  ;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

SELECT 				*,COUNT(1) 
FROM 				Answer
LEFT JOIN			Question USING (QuestionID)
GROUP BY 			QuestionID  
ORDER BY        	COUNT(1) DESC 
LIMIT 				1;




