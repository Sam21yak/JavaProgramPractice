import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CountDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		Month month = today.getMonth();
		int year = today.getYear();
		
		//find the last day of the month
		LocalDate lastDayOfMonth = LocalDate.of(year, month, month.length(false));
		
		//calculate the difference in days
		long totalDays = ChronoUnit.DAYS.between(today, lastDayOfMonth);
		System.out.println(totalDays);
	}

}
