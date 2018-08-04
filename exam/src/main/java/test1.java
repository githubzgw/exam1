import java.util.Scanner;

/**
 * Created by Zhao Guowei on 2018/8/4.
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入工资:");
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = 0;
        if(a > 1500){
            b = 1500*0.03+(a-1500)*0.1;
            System.out.println("所需要缴纳的税费为:"+b);
        }else if(a>4500){
            b = 1500*0.03+3000*0.1+(a-4500)*0.2;
            System.out.println("所需要缴纳的税费为:"+b);
        }else if(a>9000){
            b = 1500*0.03+3000*0.1+4500*0.1+(a-9000)*0.25;
            System.out.println("所需要缴纳的税费为:"+b);
        }else if(a>35000){
            b = 1500*0.03+3000*0.1+4500*0.1+26000*0.2+(a-35000)*0.3;
            System.out.println("所需要缴纳的税费为:"+b);
        }else if(a>55000){
            b = 1500*0.03+3000*0.1+4500*0.1+26000*0.2+20000*0.25+(a-55000)*0.35;
            System.out.println("所需要缴纳的税费为:"+b);
        }else if(a>80000) {
            b = 1500*0.03+3000*0.1+4500*0.1+26000*0.2+20000*0.25+25000*0.35+(a-80000)*0.45;
            System.out.println("所需要缴纳的税费为:"+b);
        }else {
            System.out.println("所需要缴纳的税费为:"+a*0.03);
        }
    }
}
