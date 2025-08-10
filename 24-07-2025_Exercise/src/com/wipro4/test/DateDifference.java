package com.wipro4.test;
import java.time.LocalDate;
import java.time.Period;
public class DateDifference {
    public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
        // Ensure dt1 is before dt2 for consistency
        if (dt1.isAfter(dt2)) {
            LocalDate temp = dt1;
            dt1 = dt2;
            dt2 = temp;
        }

        Period diff = Period.between(dt1, dt2);

        System.out.println("Difference is " + diff.getYears() + " years, " +
                           diff.getMonths() + " months, and " +
                           diff.getDays() + " days.");
    }

    // Test the method
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2001, 10, 23);
        LocalDate date2 = LocalDate.of(2002, 5, 29);

        getDateDiff(date1, date2);
    }

}
