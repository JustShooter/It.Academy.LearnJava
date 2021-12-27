package HomeWork8.Task24;

public class TimeInterval {
    private int sec;
    private int min;
    private int hrs;

    public TimeInterval(int sec, int min, int hrs) {
        this.sec = sec;
        this.min = min;
        this.hrs = hrs;
    }

    public TimeInterval(int sec) {
        this.sec = sec % 60;
        sec -= this.sec;
        this.min = (sec / 60) % 60;
        sec -= this.min;
        this.hrs = (sec / 3600);
    }

    public int printTotalSec() {
        int totalSec;
        totalSec = (this.hrs * 3600) + (this.min * 60) + this.sec;
        return totalSec;
    }

    public int compareTo(TimeInterval other) {
        int val1 = (this.hrs * 3600) + (this.min * 60) + this.sec;
        int val2 = (other.hrs * 3600) + (other.min * 60) + other.sec;
        return val1 - val2;
    }

}
