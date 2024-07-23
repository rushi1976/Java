import java.util.Scanner;

public class DayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date (dd): ");
        int dd = sc.nextInt();

        System.out.println("Enter the month (mm): ");
        int mm = sc.nextInt();

        System.out.println("Enter the year (yy): ");
        int yy = sc.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((yy % 4 == 0 && yy % 100!= 0) || (yy % 400 == 0)) {
            daysInMonth[2] = 29;
        }

        if (mm < 1 || mm > 12) {
            System.out.println("Enter a valid month.");
            return;
        }

        if (dd < 1 || dd > daysInMonth[mm]) {
            System.out.println("Enter a valid date for the month.");
            return;
        }

        int totalDays = 0;
        for (int i = 1; i < mm; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += dd;

        totalDays += (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400;

        int totalOddDays = totalDays % 7;

        switch (totalOddDays) {
            case 0:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Sunday");
                break;
            case 1:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Monday");
                break;
            case 2:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Tuesday");
                break;
            case 3:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Wednesday");
                break;
            case 4:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Thursday");
                break;
            case 5:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Friday");
                break;
            case 6:
                System.out.println("On " + dd + " - " + mm + " - " + yy + " the day is: Saturday");
                break;
        }

        sc.close();
    }
}