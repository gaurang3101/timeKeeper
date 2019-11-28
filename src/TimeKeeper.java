import java.util.Scanner;

public class TimeKeeper {
    private int hour;
    private int minute;
    private int seconds;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int second) {
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void calculateSecondsSinceMidnight() {
        int secondsPassed = (hour * 60 * 60) + (minute * 60) + seconds;
        System.out.println("It has been " + secondsPassed + " seconds since the midnight.");
    }

    public void passedDay() {
        float dayPassed = 100 * ((hour * 60 * 60) + (minute * 60) + seconds) / (24 * 60 * 60);
        System.out.println(dayPassed + "%" +" of the day has passed.");
    }

    public TimeKeeper(int hour, int minute, int seconds) {
        this.hour=hour;
        this.minute=minute;
        this.seconds=seconds;
    }

}

class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,s;
        System.out.println("Please enter the hour - ");
        h=sc.nextInt();
        System.out.println("Please enter the minute - ");
        m=sc.nextInt();
        System.out.println("Please enter the seconds - ");
        s=sc.nextInt();
        TimeKeeper tk = new TimeKeeper(h,m,s);
        System.out.println("Time entered - " + h +":"+ m + ":" + s);
        tk.calculateSecondsSinceMidnight();
        tk.passedDay();
    }
}

