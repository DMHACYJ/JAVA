package �ϻ�ʵ��4;
public class Test02 {
    public static void main(String[] args) {
        int [] nums=new int [100];
        int [] result=new int[6];
        for(int i=0;i<100;i++){
            nums[i]=(int) (Math.random()*6)+1;
        }
        for(int i=0;i<100;i++){
            if(nums[i]==1){
                result[0]++;
            }
            else if(nums[i]==2){
                result[1]++;
            }
            else if(nums[i]==3){
                result[2]++;
            }
            else if(nums[i]==4){
                result[3]++;
            }
            else if(nums[i]==5){
                result[4]++;
            }
            else if(nums[i]==6){
                result[5]++;
            }
        }
        System.out.println("1���ֵĸ��ʣ�"+(double)result[0]/100);
        System.out.println("2���ֵĸ��ʣ�"+(double)result[1]/100);
        System.out.println("3���ֵĸ��ʣ�"+(double)result[2]/100);
        System.out.println("4���ֵĸ��ʣ�"+(double)result[3]/100);
        System.out.println("5���ֵĸ��ʣ�"+(double)result[4]/100);
        System.out.println("6���ֵĸ��ʣ�"+(double)result[5]/100);
}
       }
