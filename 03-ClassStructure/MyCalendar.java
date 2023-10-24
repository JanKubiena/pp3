public class MyCalendar {
    static int year = 2023;
    static int month = 10;
    static int day = 24;
    static int daysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    static String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    static String myDate(){
        return String.format("%4d-%2d-%02d", year, month, day);
    }

    static int days(){
         
        int allDays = 0;

        for (int i = 0; i < month - 1; i++){
            allDays += daysInMonth[i];
        }
 
        return allDays + day;
    }

    static String monthName(){

        return monthNames[month - 1];
    }
}
