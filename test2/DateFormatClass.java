import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "nguyenvana@gmail.com";
		account1.userName = "nguyenvana";
		account1.fullName = "Nguyen Van A";
		account1.createDate = LocalDate.of(2020, 6, 1);

		// Question 1: In ra thông tin account thứ 1 và property create date sẽ
		// được
		// format theo định dạng vietnamese
		System.out.println("Question 1:");
		System.out.println("Thông tin account thứ 1:");
		System.out.println("ID: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("User Name: " + account1.userName);
		System.out.println("Full Name: " + account1.fullName);
		Locale locale = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(account1.createDate.atStartOfDay(defaultZoneId).toInstant());
		String createDate1 = dateFormat.format(date);
		System.out.println("Create Date: " + createDate1);
		System.out.println("\n");


	}
}
