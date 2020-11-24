import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();

	}

	// Question 1:
	// Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
	// thể cách nhau bằng nhiều khoảng trắng );
	private static void question1() {
		// Nhập một xâu kí tự, đếm số lượng các từ 
		// trong xâu kí tự đó (các từ có
		// thể cách nhau bằng nhiều khoảng trắng );		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập 1 xâu ký tự :");		
		String chuoi1 = scanner.nextLine();
		System.out.println(chuoi1);
		
		chuoi1 = chuoi1.trim();
		chuoi1 = chuoi1.replaceAll("\\s+", " ");
		System.out.println(chuoi1);				
		String[] words = chuoi1.split("\\s");
		
		for (String string : words) {
			System.out.println(string);
		}
		System.out.println(words.length);
		
	}

	// Question 2:
	// Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
	public static void question2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chuỗi 1: ");
		String s1 = scanner.nextLine();

		System.out.println("Nhập chuỗi 2: ");
		String s2 = scanner.nextLine();

		System.out.println("Sau khi nối chuỗi : " + s1.concat(s2));

		scanner.close();
	}

	// Question 3:
	// Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
	// viết hoa chữ cái đầu thì viết hoa lên
	private static void question3() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Moi ban nhap 1 xau ky tu: ");
		 String chuoi2 = scanner.nextLine();
		 System.out.println(chuoi2);
		 chuoi2 = chuoi2.trim(); //cat bot ky tu ngoai - chuan hoa chuoi
		 chuoi2 = chuoi2.replaceAll("\\s+", " "); //replace toan bo whitespace - thanh 1 whitespace
		 System.out.println(chuoi2);
		 //chuan hoa chuoi s2
		 // chia nhỏ chuỗi s2 thành từng từ vào trong mảng words -> chuoi2.split("\\s");
		 String[] words = chuoi2.split("\\s");
		 for(int i = 0 ; i < words.length; i++) {
		 String string1 = words[i];
		 //viet hoa chữ cái đầu của từng từ
		 words[i] = string1.substring(0,1).toUpperCase() 
		 + string1.substring(1);
		 System.out.println(words[i]); 
		 }
		 String s4 = "";
		 // cộng các từ ở mảng words  lại với nhau , giữa mỗi từ có thêm dấu " "
		 for (String string1 : words) {
		 s4 = s4 + string1 + " "; 
		 }
		 System.out.println(s4);
		 }

	// Question 4:
	// Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
	// của người dùng ra
	// VD:
	// Người dùng nhập vào "Nam", hệ thống sẽ in ra
	// "Ký tự thứ 1 là: N"
	// "Ký tự thứ 1 là: A"
	// "Ký tự thứ 1 là: M"
	public static void question4() {
		String name;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên: ");
		name = scanner.nextLine();

		name = name.toUpperCase();

		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
		}

		scanner.close();
	}

	// Question 5:
	// Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
	// dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
	public static void question5() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ: ");
		String firstName = scanner.nextLine();

		System.out.println("Nhập tên: ");
		String lastName = scanner.nextLine();

		System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));

		scanner.close();

	}

	// Question 6:
	// Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
	// sau đó hệ thống sẽ tách ra họ, tên , tên đệm
	// VD:
	// Người dùng nhập vào "Nguyễn Văn Nam"
	// Hệ thống sẽ in ra
	// "Họ là: Nguyễn"
	// "Họ là: Văn"
	// "Họ là: Nam"
	public static void question6() {
		String fullName;
		String lastName = "", middleName = "", firstName = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ tên đầy đủ:");
		fullName = scanner.nextLine();

		// Chuẩn hóa xâu
		fullName = fullName.trim();

		String[] words = fullName.split(" ");

		lastName = words[0];
		firstName = words[words.length - 1];

		for (int i = 1; i <= words.length - 2; i++) {
			middleName += words[i] + " ";
		}

		System.out.println("Họ là: " + lastName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName);

		scanner.close();
	}
}

