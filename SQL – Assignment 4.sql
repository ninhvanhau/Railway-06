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
SELECT *
FROM `account` 
JOIN position USING (PositionID)
WHERE PositionName = 'Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT				COUNT(1),DepartmentID,DepartmentName
FROM 				`Account`
JOIN				Department USING (DepartmentID)
GROUP BY 			(DepartmentID)
HAVING 				COUNT(1) >='3' ;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT 				GROUP_CONCAT(ExamID),QuestionID, COUNT(1)
FROM 				ExamQuestion
GROUP BY 			QuestionID  
HAVING				COUNT(1)=	(	SELECT 				COUNT(1) 
									FROM 				ExamQuestion
									GROUP BY 			QuestionID  
									ORDER BY        	COUNT(1) DESC 
									LIMIT 				1)   ;


-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 				*, COUNT(QuestionID)
FROM 				CategoryQuestion
LEFT JOIN 			Question USING (CategoryID)
GROUP BY  			CategoryID;


-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT 				*,COUNT(QuestionID)
FROM 				Question
LEFT JOIN 			ExamQuestion USING (QuestionID)
GROUP  BY 			QuestionID  ;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

SELECT 				*,COUNT(1) 
FROM 				Answer
LEFT JOIN			Question USING (QuestionID)
GROUP BY 			QuestionID  
ORDER BY        	COUNT(1) DESC 
LIMIT 				1;

-- Question 9: Thống kê số lượng account trong mỗi group 
SELECT 				*, COUNT(GroupID)
FROM 				`Group`	
LEFT JOIN 			`GroupAccount` USING (GroupID)
GROUP BY  			GroupID;

-- Question 10: Tìm chức vụ có ít người nhất
SELECT *, COUNT(AccountID) AS SoNguoi
FROM Position 
JOIN `account` USING (PositionID)
GROUP BY PositionID 
HAVING COUNT(AccountID) = (
	SELECT COUNT(AccountID)
	FROM `account`
	GROUP BY PositionID
	ORDER BY COUNT(AccountID)
	LIMIT 1)
;


-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của  question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT *
FROM Question
JOIN Answer USING (QuestionID)
JOIN TypeQuestion USING (TypeID)
;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT 				*, COUNT(1)
FROM 				TypeQuestion	
JOIN 				Question USING (TypeID)
GROUP BY  			TypeID;

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


