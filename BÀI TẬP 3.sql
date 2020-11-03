-- SQL – Assignment 3 
-- Question 2: lấy ra tất cả các phòng ban
SELECT			DepartmentName
FROM 			Department;

-- Question 3: lấy ra id của phòng ban "Sale"
SELECT 			DepartmentID
FROM 			Department
WHERE 			DepartmentName = 'sale';

-- Question 4: lấy ra thông tin account có full name dài nhất 
SELECT 			*
FROM 			`Account`
WHERE 			length(FullName)= (SELECT MAX(length(FullName))
FROM			`Account`);

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3 
SELECT 			*
FROM 			`Account`
WHERE 			length(FullName)= (
SELECT 			MAX(length(FullName))
FROM  			`Account`
WHERE 			DepartmentID =3
);          

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019 
SELECT 			GroupName
FROM			`Group`
WHERE 			CreateDate < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT 			COUNT(1) ,QuestionID
FROM 			Answer
GROUP BY 		QuestionID
HAVING 			COUNT(1) >= '4';


-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT 			`Code`
FROM 			Exam
WHERE 			Duration >= '60' AND CreateDate < '2019-12-20' ;

-- Question 9: Lấy ra 5 group được tạo gần đây nhất 
SELECT 			*
FROM			`Group`
ORDER BY		CreateDate DESC
LIMIT			5;		

-- Question 10: Đếm số nhân viên thuộc department có id = 2 
SELECT 			COUNT(1) ,DepartmentID
FROM 			`Account`
GROUP BY 		DepartmentID
HAVING 			COUNT(1) = '2';

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o" 	
SELECT 			*
FROM			`Account`
WHERE			FullName LIKE ('D%o');

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
SET 			FOREIGN_KEY_CHECKS = 0;
DELETE FROM 	Exam 
WHERE 			CreateDate < '2019-12-20';
SELECT *
FROM 			Exam ;

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
SET 			FOREIGN_KEY_CHECKS = 0;
DELETE FROM 	Question 
WHERE 			Content LIKE ('câu hỏi%');
SELECT *
FROM 			Question ;

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE 			`account`
SET 			FullName = 'Nguyễn Bá Lộc',
				Email = 'loc.nguyenba@vti.com.vn'
WHERE 			AccountID = '1';
SELECT *
FROM 			`account`;

-- 



