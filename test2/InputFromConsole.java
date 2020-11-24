import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class InputFromConsole {

	public static void main(String[] args) throws ParseException {
		// Question 1
		// question1();
		// System.out.println("\n");

		// Question 2
		// question2();
		// System.out.println("\n");

		// Question 3:
		// question3();
		// System.out.println("\n");

		// Question 4:
		// question4();
		// System.out.println("\n");

		// Question 5:
		// creatAccount();
		// System.out.println("\n");

		// Question 6:
		// createDepartment();
		// System.out.println("\n");

		// Question 7:
		// inputEvenNumber();
		// System.out.println("\n");

		// Question 8:
		// menu();
		// System.out.println("\n");

		// Question 9:
		// addAccountToGroup();
		// System.out.println("\n");

		// Question 10:
		// question10();
		// System.out.println("\n");

		// Question 11:
		question11();
		System.out.println("\n");
	}

	// Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
	@SuppressWarnings("resource")
	public static void question1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moi ban nhap vao so nguyen thu nhat: ");
		int int1 = scanner.nextInt();
		System.out.println("Number 1: " + int1);

		System.out.print("Moi ban nhap vao so nguyen thu hai: ");
		int int2 = scanner.nextInt();
		System.out.println("Number 2: " + int2);

		System.out.print("Moi ban nhap vao so nguyen thu ba: ");
		int int3 = scanner.nextInt();
		System.out.println("Number 3: " + int3);
	}

	// Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
	@SuppressWarnings("resource")
	public static void question2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moi ban nhap vao so thuc thu nhat: ");
		float real1 = scanner.nextFloat();
		System.out.println("Number 1: " + real1);

		System.out.print("Moi ban nhap vao so thuc thu hai: ");
		double real2 = scanner.nextDouble();
		System.out.println("Number 2: " + real2);
	}

	// Question 3: Viết lệnh cho phép người dùng nhập họ và tên
	@SuppressWarnings("resource")
	public static void question3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moi ban nhap vao ho: ");
		String firstName = scanner.next();

		System.out.print("Moi ban nhap vao ten: ");
		String lastName = scanner.next();

		String fullName = firstName + lastName;
		System.out.println("Ho va ten: " + fullName);
	}

	// Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
	@SuppressWarnings("resource")
	public static void question4() throws ParseException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Moi nhap vao ngay sinh nhat cua ban theo dinh dang day-month-year:");
		String input = scanner.next();

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date dateOfBirth = dateFormat.parse(input);

		System.out.println("Date of Birth: " + dateOfBirth);
	}

	// Question 5: Viết lệnh cho phép người dùng tạo account (viết thành method)
	// Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào
	// chương trình sẽ chuyển thành Position.Dev, Position.Test,
	// Position.ScrumMaster, Position.PM
	@SuppressWarnings("resource")
	public static void creatAccount() {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

		System.out.println("Moi ban nhap vao Id: ");
		int id = scanner.nextInt();
		account.id = id;

		scanner.nextLine();
		System.out.println("Moi ban nhap vao email: ");
		String email = scanner.nextLine();
		account.email = email;

		System.out.println("Moi ban nhap vao user name: ");
		String userName = scanner.nextLine();
		account.userName = userName;

		System.out.println("Moi ban nhap vao full name: ");
		String fullName = scanner.nextLine();
		account.fullName = fullName;

		System.out.println("Moi ban nhap vao position (1-4): ");
		int position = scanner.nextInt();

		System.out.println("\nTao thanh cong!");
		System.out.println("Thong tin cua account:");
		System.out.println("Id: " + account.id);
		System.out.println("Email: " + account.email);
		System.out.println("User Name: " + account.userName);
		System.out.println("Full Name: " + account.fullName);

		switch (position) {
		case 1:
			System.out.println("Position: Dev");
			break;
		case 2:
			System.out.println("Position: Test");
			break;
		case 3:
			System.out.println("Position: Scrum Master");
			break;
		case 4:
			System.out.println("Position: PM");
			break;
		default:
			break;
		}
	}

	// Question 6: Viết lệnh cho phép người dùng tạo department
	@SuppressWarnings("resource")
	public static void createDepartment() {
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();

		System.out.println("Moi ban nhap vao Id:");
		byte id = scanner.nextByte();
		department.id = id;

		scanner.nextLine();
		System.out.println("Moi ban nhap vao department name:");
		String name = scanner.nextLine();
		department.name = name;

		System.out.println("\nTao thanh cong!");
		System.out.println("Thong tin cua department:");
		System.out.println("Id: " + department.id);
		System.out.println("Name: " + department.name);
	}

	// Question 7: Nhập số chẵn từ console
	@SuppressWarnings("resource")
	public static void inputEvenNumber() {
		Scanner scanner = new Scanner(System.in);
		int input;

		do {
			System.out.println("Moi ban nhap vao mot so chan:");
			input = scanner.nextInt();

			if (input % 2 != 0) {
				System.out.println("So ban vua nhap la so le, moi ban nhap lai!");
			} else {
				System.out.println("So ban vua nhap hop le!");
			}
		} while (input % 2 != 0);
	}

	// Question 8:
	@SuppressWarnings("resource")
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		int selection;

		do {
			System.out.println("Moi ban nhap vao chuc nang muon su dung:");
			System.out.println("1. Create Account");
			System.out.println("2. Create Department");
			selection = scanner.nextInt();

			switch (selection) {
			case 1:
				System.out.println();
				creatAccount();
				break;
			case 2:
				System.out.println();
				createDepartment();
				break;
			default:
				System.out.println("\nMoi ban nhap lai!");
				break;
			}
		} while (selection != 1 && selection != 2);
	}

	// Question 9
	@SuppressWarnings("resource")
	public static void addAccountToGroup() {
		Scanner scanner = new Scanner(System.in);

		Group[] groups = inputGroups();
		Account[] accounts = inputAccounts();

		System.out.println("Danh sach cac username:");
		for (Account account : accounts) {
			System.out.println(account.userName);
		}

		String userName;
		do {
			System.out.println("\nMoi ban nhap vao username ban muon chon:");
			userName = scanner.nextLine();

			if (findAccountByUserName(accounts, userName) == null) {
				System.out.println("Nguoi dung khong ton tai! Moi ban nhap lai!");
			}
		} while (findAccountByUserName(accounts, userName) == null);

		System.out.println("\nDanh sach cac group:");
		for (Group group : groups) {
			System.out.println(group.name);
		}

		String groupName;
		do {
			System.out.println("\nMoi ban nhap vao ten group ban muon chon:");
			groupName = scanner.nextLine();

			if (findGroupByName(groups, groupName) == null) {
				System.out.println("Nhom khong ton tai! Moi ban nhap lai!");
			}
		} while (findGroupByName(groups, groupName) == null);

		Account[] accountsOfSelectedGroup = { findAccountByUserName(accounts, userName) };
		findGroupByName(groups, groupName).accounts = accountsOfSelectedGroup;

		System.out.println("\nThem thanh cong!");
		System.out.println("Danh sach account thuoc group " + groupName + ":");
		for (Account account : accountsOfSelectedGroup) {
			System.out.println(account.userName);
		}
	}

	public static Group[] inputGroups() {
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "C++ Fresher";
		group1.createDate = LocalDate.of(2020, 6, 1);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Java Fresher";
		group2.createDate = LocalDate.of(2020, 6, 2);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "C# Fresher";
		group3.createDate = LocalDate.of(2020, 6, 3);

		Group[] groups = { group1, group2, group3 };

		return groups;
	}

	public static Account[] inputAccounts() {
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "vanhientk111@gmail.com";
		account1.userName = "hiennguyen";
		account1.fullName = "Nguyen Van Hien";
		account1.createDate = LocalDate.of(2020, 6, 1);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "duynguyenngoc@gmail.com";
		account2.userName = "duynguyen";
		account2.fullName = "Nguyen Ngoc Duy";
		account2.createDate = LocalDate.of(2020, 6, 2);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "datlaituan@gmail.com";
		account3.userName = "datlai";
		account3.fullName = "Lai Tuan Dat";
		account3.createDate = LocalDate.of(2020, 6, 3);

		Account[] accounts = { account1, account2, account3 };

		return accounts;
	}

	public static Group findGroupByName(Group[] groups, String groupName) {
		for (Group group : groups) {
			if (group.name.equals(groupName)) {
				return group;
			}
		}
		return null;
	}

	public static Account findAccountByUserName(Account[] accounts, String userName) {
		for (Account account : accounts) {
			if (account.userName.equals(userName)) {
				return account;
			}
		}
		return null;
	}

	// Question 10
	@SuppressWarnings("resource")
	public static void question10() {
		Scanner scanner = new Scanner(System.in);
		int selection;

		do {
			System.out.println("Moi ban nhap vao chuc nang muon su dung:");
			System.out.println("1. Create Account");
			System.out.println("2. Create Department");
			System.out.println("3. Add Account To Group\n");
			selection = scanner.nextInt();

			switch (selection) {
			case 1:
				System.out.println();
				creatAccount();
				break;
			case 2:
				System.out.println();
				createDepartment();
				break;
			case 3:
				System.out.println();
				addAccountToGroup();
				break;
			default:
				System.out.println("\nMoi ban nhap lai!");
				break;
			}

			scanner.nextLine();
			System.out.println("\nBan co muon thuc hien chuc nang khac khong?(c/k)");
			String input = scanner.nextLine();
			System.out.println();
			if (input.equals("k")) {
				System.out.println("Da thoat chuong trinh!");
				break;
			}

		} while (true);
	}

	// Question 11
	@SuppressWarnings("resource")
	public static void question11() {
		Scanner scanner = new Scanner(System.in);
		int selection;

		do {
			System.out.println("Moi ban nhap vao chuc nang muon su dung:");
			System.out.println("1. Create Account");
			System.out.println("2. Create Department");
			System.out.println("3. Add Account To Group");
			System.out.println("4. Add Account To Random Group\n");
			selection = scanner.nextInt();

			switch (selection) {
			case 1:
				System.out.println();
				creatAccount();
				break;
			case 2:
				System.out.println();
				createDepartment();
				break;
			case 3:
				System.out.println();
				addAccountToGroup();
				break;
			case 4:
				System.out.println();
				addAccountToRandomGroup();
				break;
			default:
				System.out.println("\nMoi ban nhap lai!");
				break;
			}

			scanner.nextLine();
			System.out.println("\nBan co muon thuc hien chuc nang khac khong?(c/k)");
			String input = scanner.nextLine();
			System.out.println();
			if (input.equals("k")) {
				System.out.println("Da thoat chuong trinh!");
				break;
			}

		} while (true);
	}

	@SuppressWarnings("resource")
	public static void addAccountToRandomGroup() {
		Scanner scanner = new Scanner(System.in);

		Group[] groups = inputGroups();
		Account[] accounts = inputAccounts();

		System.out.println("Danh sach cac username:");
		for (Account account : accounts) {
			System.out.println(account.userName);
		}

		String userName;
		do {
			System.out.println("\nMoi ban nhap vao username ban muon chon:");
			userName = scanner.nextLine();

			if (findAccountByUserName(accounts, userName) == null) {
				System.out.println("Nguoi dung khong ton tai! Moi ban nhap lai!");
			}
		} while (findAccountByUserName(accounts, userName) == null);

		System.out.println("\nDanh sach cac group:");
		for (Group group : groups) {
			System.out.println(group.name);
		}

		Group randomGroup = getRandomGroup(groups);
		System.out.println("\nGroup duoc chon ngau nhien: " + randomGroup.name);

		Account[] accountsOfSelectedGroup = { findAccountByUserName(accounts, userName) };
		randomGroup.accounts = accountsOfSelectedGroup;

		System.out.println("\nThem thanh cong!");
		System.out.println("Danh sach account thuoc group " + randomGroup.name + ":");
		for (Account account : accountsOfSelectedGroup) {
			System.out.println(account.userName);
		}
	}

	public static Group getRandomGroup(Group[] groups) {
		Random random = new Random();
		int randomIndex = random.nextInt(groups.length);
		return groups[randomIndex];
	}
}
