package 上机实验4;
public class Test03 {
public static void main(String[] args) {
        int [] nums=new int [1000];
        int [] result=new int[6];
        for(int i=0;i<1000;i++){
            nums[i]=(int) (Math.random()*6)+1;
        }
        for(int i=0;i<1000;i++){
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
        System.out.println("1出现的概率："+(double)result[0]/1000);
        System.out.println("2出现的概率："+(double)result[1]/1000);
        System.out.println("3出现的概率："+(double)result[2]/1000);
        System.out.println("4出现的概率："+(double)result[3]/1000);
        System.out.println("5出现的概率："+(double)result[4]/1000);
        System.out.println("6出现的概率："+(double)result[5]/1000);

    }

}