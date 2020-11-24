import java.time.LocalDate;

public class Method {

	public static void main(String[] args) {
		// Question 1
		// question1_1();
		// question1_2();
		// question1_3();
		// question1_4();
		// System.out.println("\n");

		// Question 2
		// printInformationOfAccounts();
		// System.out.println("\n");

		// Question 3
		// question3_1();
		// question3_2();
		question3_3();
		System.out.println("\n");
	}

	// Question 1:
	// Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10F
	public static void question1_1() {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void question1_2() {
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void question1_3() {
		int i = 1;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void question1_4() {
		int i = 1;
		while (i < 10) {
			if (i % 2 != 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

	// Question 2: Tạo method để in thông tin các account
	public static void printInformationOfAccounts() {
		Account[] accounts = inputAccounts();

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin cua account thu " + (i + 1) + ":");
			System.out.println("Id: " + accounts[i].id);
			System.out.println("Email: " + accounts[i].email);
			System.out.println("User Name: " + accounts[i].userName);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Create Date: " + accounts[i].createDate);
			System.out.println("\n");
		}
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

	// Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
	public static void question3_1() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void question3_2() {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void question3_3() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}
}
