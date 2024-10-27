public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(){}
    public MyDate(int y, int m,int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
