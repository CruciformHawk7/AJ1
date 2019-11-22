import java.io.*;

class DateGen {
    int date;
    months month;
    BufferedReader br;

    DateGen() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static enum months {January, February, March, April, May, June, July, August, September, October, November, December}

    private int validateDate(int date, months month) {
        if ((month == months.January || month == months.March || month == months.May || month == months.July
            || month == months.August || month == months.October || month == months.December) && (date <=31 && date>0)) return 0;
        else if ((date>0 && date<=29 && month == months.February)) return 0;
        else if (date>0 && date<=30) return 0;
        else return -1;
    }

    DateGen(int date, months month) {
        setDate(date, month);
    }

    public void setDate(int date, months month) {
        if (validateDate(date, month) == 0) {
            this.date = date;
            this.month = month;
        }
        else System.out.println("Failed to set date: Invalid date "+ date + ", " + month);
    }

    public int getDate() {
        return this.date;
    }

    public months previousMonth() {
        int p = month.ordinal() - 1;
        if (p<0) p = 11;
        return months.values()[p];
    }

    public months nextMonth() {
        int p = month.ordinal() + 1;
        if (p>11) p = 0;
        return months.values()[p];
    }
    
    public int previousDay() {
        if (( month == months.May || month == months.July
            || month == months.October || month == months.December) && (date-1<0)) return 30;
        else if ((month == months.March) && (date-1<0)) return 29;
        else if ((month == months.January|| month == months.February || month == months.April 
            || month==months.June || month == months.August 
            || month == months.September || month == months.November) && date-1<0) return 31;
        else return (date-1);
    }

    public int nextDay() {
        return date+1;
    }
}

public class DateGenTest {
    public static void main(String args[]) {
        DateGen dates[] = new DateGen[20];
        dates[0] = new DateGen(0, DateGen.months.February);
    }
}