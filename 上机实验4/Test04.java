package �ϻ�ʵ��4;
import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) {
        int[] num={9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(num);
        int max = num[num.length - 1];
        int min = num[0];
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum+=num[i];
        }
        double avg = sum / num.length;
        System.out.println("���ֵ��" +max);
        System.out.println("��Сֵ��" +min);
        System.out.println("ƽ��ֵ��" +avg);
        System.out.println("�����ܺͣ�" +sum);
    }
}