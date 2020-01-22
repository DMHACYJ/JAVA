package 上机实验4;
import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String ch=scanner.next();
        System.out.println(str.replace(ch,""));

    }
}