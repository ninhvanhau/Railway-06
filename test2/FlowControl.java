import java.time.LocalDate;

public class FlowControl {

	public static void main(String[] args) {
		// Create departments
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "IT";

		// Create positions
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.PM;

		// Create accounts
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nguyenvana@gmail.com";
		account1.userName = "nguyenvana";
		account1.fullName = "Nguyen Van A";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.of(2020, 6, 1);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "lethib@gmail.com";
		account2.userName = "lethib";
		account2.fullName = "Le Thi B";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.of(2020, 6, 2);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "tranvanc@gmail.com";
		account3.userName = "tranvanc";
		account3.fullName = "Tran Van C";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = LocalDate.of(2020, 6, 3);

		// Create groups
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "C++ Fresher";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2020, 6, 1);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Java Fresher";
		group2.creator = account2;
		group2.createDate = LocalDate.of(2020, 6, 2);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "C# Fresher";
		group3.creator = account3;
		group3.createDate = LocalDate.of(2020, 6, 3);

		Group[] groupsOfAccount1 = { group1, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group2, group3 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group3 };
		account3.groups = groupsOfAccount3;

		Account[] accountsOfGroup1 = { account1, account3 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account1, account2 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account2, account3 };
		group3.accounts = accountsOfGroup3;

		// Create types of question
		TypeQuestion type1 = new TypeQuestion();
		type1.id = 1;
		type1.name = TypeName.ESSAY;

		TypeQuestion type2 = new TypeQuestion();
		type2.id = 2;
		type2.name = TypeName.MULTIPLE_CHOICE;

		// Create categories of question
		CategoryQuestion category1 = new CategoryQuestion();
		category1.id = 1;
		category1.name = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.id = 2;
		category2.name = ".NET";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.id = 3;
		category3.name = "SQL";

		// Create questions
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Question 1";
		question1.category = category1;
		question1.type = type1;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2020, 6, 1);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Question 2";
		question2.category = category2;
		question2.type = type2;
		question2.creator = account2;
		question2.createDate = LocalDate.of(2020, 6, 2);

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Question 3";
		question3.category = category3;
		question3.type = type1;
		question3.creator = account3;
		question3.createDate = LocalDate.of(2020, 6, 3);

		// Create answers
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Answer 1";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Answer 2";
		answer2.question = question2;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Answer 3";
		answer3.question = question3;
		answer3.isCorrect = true;

		// Create exams
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "Code 1";
		exam1.title = "Title 1";
		exam1.category = category1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2020, 6, 1);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "Code 2";
		exam2.title = "Title 2";
		exam2.category = category2;
		exam2.duration = 90;
		exam2.creator = account2;
		exam2.createDate = LocalDate.of(2020, 6, 2);

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "Code 3";
		exam3.title = "Title 3";
		exam3.category = category3;
		exam3.duration = 180;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2020, 6, 3);

		Exam[] examsOfQuestion1 = { exam1, exam2 };
		question1.exams = examsOfQuestion1;

		Exam[] examsOfQuestion2 = { exam2, exam3 };
		question2.exams = examsOfQuestion2;

		Exam[] examsOfQuestion3 = { exam1, exam3 };
		question3.exams = examsOfQuestion3;

		Question[] questionsOfExam1 = { question1, question3 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question1, question2 };
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question2, question3 };
		exam3.questions = questionsOfExam3;

//		// IF
//		// Question 1
//		if (account2.department == null) {
//			System.out.println("Nhân viên này chưa có phòng ban");
//		} else {
//			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
//		}
//		System.out.println("\n");

		// Question 2
		if (account2.groups.length == 0) {
			System.out.println("Nhân viên này chưa thuộc group nào");
		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
			System.out.println("Group của nhân viên này là:");
			for (Group group : groupsOfAccount2) {
				System.out.println(group.name);
			}
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (account2.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
//		System.out.println("\n");
//
//		// Question 3
//		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
//				: "Phòng ban của nhân viên này là: " + account2.department.name);
//		System.out.println("\n");
//
//		// Question 4
//		System.out.println(
//				account1.position.name == PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer");
//		System.out.println("\n");

		// SWITCH CASE
		// Question 5
//		switch (group1.accounts.length) {
//		case 1:
//			System.out.println("Nhóm có một thành viên");
//			break;
//		case 2:
//			System.out.println("Nhóm có hai thành viên");
//			break;
//		case 3:
//			System.out.println("Nhóm có ba thành viên");
//			break;
//		default:
//			System.out.println("Nhóm có nhiều thành viên");
//			break;
//		}
//		System.out.println("\n");
//
//		// Question 6
//		switch (account2.groups.length) {
//		case 0:
//			System.out.println("Nhân viên này chưa có group");
//			break;
//		case 1:
//		case 2:
//			System.out.println("Group của nhân viên này là:");
//			for (Group group : groupsOfAccount2) {
//				System.out.println(group.name);
//			}
//			break;
//		case 3:
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		case 4:
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//			break;
//		default:
//			break;
//		}
//		System.out.println("\n");
//
//		// FOREACH
//		// Question 8
//		Account[] accounts = { account1, account2, account3 };
//		int i = 1;
//		for (Account account : accounts) {
//			System.out.println("Thông tin account thứ " + i + " là:");
//			System.out.println("Email: " + account.email);
//			System.out.println("Full Name: " + account.fullName);
//			System.out.println("Phòng ban: " + account.department.name);
//			System.out.println("\n");
//			i++;
//		}
//
//		// Question 9
//		Department[] departments = { department1, department2, department3 };
//		i = 1;
//		for (Department department : departments) {
//			System.out.println("Thông tin department thứ " + i + " là:");
//			System.out.println("Id: " + department.id);
//			System.out.println("Name: " + department.name);
//			System.out.println("\n");
//			i++;
//		}
//
//		// FOR
//		// Question 10
//		for (i = 0; i < accounts.length; i++) {
//			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phòng ban: " + accounts[i].department.name);
//			System.out.println("\n");
//		}
//
//		// Question 11
//		for (i = 0; i < departments.length; i++) {
//			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//			System.out.println("Id: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//			System.out.println("\n");
//		}
//
//		// Question 12
//		for (i = 0; i < 2; i++) {
//			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
//			System.out.println("Id: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//			System.out.println("\n");
//		}
//
//		// Question 13
//		for (i = 0; i < accounts.length; i++) {
//			if (i == 1) {
//				continue;
//			}
//			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Full Name: " + accounts[i].fullName);
//			System.out.println("Phòng ban: " + accounts[i].department.name);
//			System.out.println("\n");
//		}
//
//		// Question 14
//		for (i = 0; i < accounts.length; i++) {
//			if (accounts[i].id < 4) {
//				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Full Name: " + accounts[i].fullName);
//				System.out.println("Phòng ban: " + accounts[i].department.name);
//				System.out.println("\n");
//			}
//		}
//
//		// Question 15
//		for (i = 0; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("\n");
//

//
//		// Exercise 2: System out printf
//		// Question 6: In ra thông tin account (như Question 8 phần FOREACH)
//		// theo
//		// định dạng table (giống trong Database)
//
//		System.out.printf("%10s", "Email");
//		System.out.printf("%30s", "Full Name");
//		System.out.printf("%25s", "Department");
//		System.out.println();
//
//		for (Account account : accounts) {
//			System.out.printf("%10s", account.email);
//			System.out.printf("%23s", account.fullName);
//			System.out.printf("%18s", account.department.name);
//			System.out.println();
//			
//		
//		}
	}
}
