package march;

public class LeapYearNonLeapYearInArray {
    public static void main(String[] args) {
        int[] years = {2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007};
        for (int year : years) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }
                } else {
                    System.out.println(year + " is a leap year");
                }
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
