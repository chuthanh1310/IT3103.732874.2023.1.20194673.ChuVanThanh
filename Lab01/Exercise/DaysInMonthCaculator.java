import java.util.Scanner;
public class DaysInMonthCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, year;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the year: ");
            year = scanner.nextInt();
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();

            if (isValidMonth(month) ) {
                validInput = true;
                int daysInMonth = getDaysInMonth(month, year);
                System.out.println("Number of days in the entered month: " + daysInMonth);
            } else {
                System.out.println("Invalid month or year. Please enter valid values.");
            }
        }

        scanner.close();
    }
    public static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }
    public static int getDaysInMonth(int month,int year){
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
            return 30;
            case 2:
            return isLeapYear(year)?29:28;
            default:
            return 31;
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
