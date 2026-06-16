import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Input the date (1-31): ");
        int date = sc.nextInt();
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {
            "Thursday", "Friday", "Saturday",
            "Sunday", "Monday", "Tuesday", "Wednesday"
        };
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += date - 1;
        int day = totalDays % 7;
        System.out.println("Name of the date:");
        System.out.println(week[day]);
        sc.close();
    }
}