import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Moi nhap vao ngay sinh nhat cua ban theo dinh dang day-month-year:");
		String input = scanner.next();

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date dateOfBirth = dateFormat.parse(input);

		System.out.println("Date of Birth: " + dateOfBirth);
	}
}
