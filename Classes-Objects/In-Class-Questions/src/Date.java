import java.util.Scanner;

class Date
{
    int month, day, year;

    Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }

    Date(int month, int day, int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    void displayDate()
    {
        System.out.println(" The date is : "+ day + "/"+month+"/"+year);
    }
}
public class DateTest {
    static Scanner x = new Scanner(System.in);

    public static void main(String args[])
    {
        int month, day, year, a, b, c;

        System.out.println(" Enter day : ");
        a = x.nextInt();

        for (;;)
        {
                if (a >= 1 && a <= 31) {
                    day = a;
                    break;
                }
                else {
                    System.out.println(" Re-enter day : ");
                    a = x.nextInt();
                }
        }

        System.out.println(" Enter month : ");
        b = x.nextInt();
        for (;;)
        {
                if (b >= 1 && b <= 12)
                {   month = b;
                    break;
                }
                else
                {
                    System.out.println(" Re-enter month : ");
                    b = x.nextInt();
                }
        }

        System.out.println(" Enter year  ");
        year = x.nextInt();

        Date ob1= new Date(month,day,year);
        ob1.displayDate();
    }
}