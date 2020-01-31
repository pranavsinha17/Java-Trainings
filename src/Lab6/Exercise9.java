package Lab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Exercise9 {
@SuppressWarnings("deprecation")
public static void main(String[] args)
{
LocalDate ld= LocalDate.of(2018,01,01);
LocalDate now=LocalDate.now();
Period pd=Period.between(ld, now);
System.out.println("Gap in years: "+pd.getYears());
System.out.println("Gap in months: "+pd.getMonths());
System.out.println("Gap in days: "+pd.getDays());
}
}
