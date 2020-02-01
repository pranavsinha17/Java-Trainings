package Lab6;
import java.time.LocalDate;
import java.time.Period;
class Dates{
	public void getGap(LocalDate ld)
	{
	 
		LocalDate now=LocalDate.now();
		Period pd=Period.between(ld, now);
		System.out.println("Gap in years: "+pd.getYears());
		System.out.println("Gap in months: "+pd.getMonths());
		System.out.println("Gap in days: "+pd.getDays());
	}
}
public class Exercise9 {
public static void main(String[] args)
{
Dates date=new Dates();
LocalDate ld=LocalDate.of(2018,01,01);
date.getGap(ld);
}
}
