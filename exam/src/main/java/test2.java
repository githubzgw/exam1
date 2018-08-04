import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zhao Guowei on 2018/8/4.
 */
public class test2 {
    public int year = 0;
    public int month = 0;
    public int day = 0;
    public boolean flag = false;
    public static void main(String[] args) {

        while(true){
            System.out.println("请输入日期：");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();
            String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(date);
            boolean dateFlag = m.matches();
            if (!dateFlag) {
                System.out.println("格式错误");
            }else{
                new test2().getnextDay(date);

            }
        }

    }

    public void getnextDay(String datestr) {
        String dateString = null;
        year = Integer.parseInt(datestr.substring(0, 4));
        month = Integer.parseInt(datestr.substring(5, 7));
        day = Integer.parseInt(datestr.substring(8, 10));
        int temp = getDayByMonth(year,month);
        if(day>temp)
        {
            System.out.println("您输入的日期不存在");
        }else{
            day = day + 1;
            if (day > temp) {
                month = month + 1;
                if (month == 13) {
                    year = year + 1;
                }
                day = day-temp;
            }
            if (month == 13) {
                month = 1;
            }
            System.out.println("下一天:"+year + "-" + month + "-" + day);
        }
    }


    public boolean isLeapYear(int year) {
        flag = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            flag = true;
        }
        return flag;
    }


    public int getDayByMonth(int year, int month) {
        int day = 0;
        int[] daybymonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (isLeapYear(year)) {
                day = 29;
            } else {
                day = 28;
            }
        } else {
            day = daybymonth[month-1];
        }
        return day;


    }
}
