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

-- Question 14 && Question15 :Lấy ra group không có account nào
SELECT *
FROM 				`Group`
LEFT JOIN 			`GroupAccount` USING (GroupID)
WHERE 				`GroupAccount`.GroupID IS NULL;

-- Question 16: Lấy ra question không có answer nào
SELECT *
FROM 				Question
LEFT JOIN 			Answer USING (QuestionID)
WHERE 				Answer.QuestionID IS NULL;

-- Question 17: 
-- a-Lấy các account thuộc nhóm thứ 1
SELECT *
FROM 				`Account`
JOIN 				`GroupAccount` USING (AccountID)
Where 				GroupID ='1' ;
-- b-Lấy các account thuộc nhóm thứ 2
SELECT *
FROM 				`Account`
JOIN 				`GroupAccount` USING (AccountID)
Where				GroupID ='2' ;
-- c- Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT 				Username
FROM 				`Account`
JOIN 				`GroupAccount` USING (AccountID)
Where				GroupID ='3' 
UNION
SELECT 				Username
FROM 				`Account`
JOIN 				`GroupAccount` USING (AccountID)
Where 				GroupID ='1'; 

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
SELECT				COUNT(1),GroupID,GroupName,CreatorID,CreateDate
FROM 				`Group`
LEFT JOIN			GroupAccount USING (GroupID)
GROUP BY 			(GroupID)
HAVING 				COUNT(1) >= '5' ;
-- b) Lấy các group có nhỏ hơn 7 thành viên
SELECT				COUNT(1),GroupID,GroupName,CreatorID,CreateDate
FROM 				`Group`
LEFT JOIN			GroupAccount USING (GroupID)
GROUP BY 			(GroupID)
HAVING 				COUNT(1) <'7' ;
-- c) Ghép 2 kết quả từ câu a) và câu b)
SELECT				COUNT(1),GroupID,GroupName,CreatorID,CreateDate
FROM 				`Group`
LEFT JOIN			GroupAccount USING (GroupID)
GROUP BY 			(GroupID)
HAVING 				COUNT(1) >= '5' 
UNION
SELECT				COUNT(1),GroupID,GroupName,CreatorID,CreateDate
FROM 				`Group`
LEFT JOIN			GroupAccount USING (GroupID)
GROUP BY 			(GroupID)
HAVING 				COUNT(1) <'7' ;


