package 上机实验4;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String ch=scanner.next();
        char [] array=str.toCharArray();
        int count=0;
        for(int i=0;i<array.length;i++){
            if(ch.charAt(0)==array[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
