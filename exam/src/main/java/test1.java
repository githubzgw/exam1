import java.util.Scanner;

/**
 * Created by Zhao Guowei on 2018/8/4.
 */
public class test1 {
    public static void main(String[] args) {
        while(true){
            System.out.println("请输入工资:");
            Scanner scanner = new Scanner(System.in);
            double a = Double.parseDouble(scanner.nextLine())-3500;
            double b = 0;
            if (a>=0 && a<1500){
                b = a *0.03;
            }else if (a>=1500 && a<4500){
                b = a * 0.1 - 105;
            } else if(a>=4500 && a<9000){
                b = a * 0.2 - 555;
            }else if(a>=9000 && a<35000){
                b = a*0.25 - 1005;
            }else if(a>=35000 && a<55000){
                b = a*0.3 -2755;
            }else if(a>=55000 && a<80000){
                b = a*0.35 - 5505;
            }else if(a>=80000){
                b = a*0.45 - 13505;
            }
            System.out.println("所需要缴纳的税费为:"+b);

        }
    }
}
