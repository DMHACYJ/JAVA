package 上机实验4;

public class Test07 {

    public static void main(String[] args) {
        String str="Let us study Java";
        System.out.println("字符串转化为大写为："+str.toUpperCase());
        System.out.println("字符串转化为小写为："+str.toLowerCase());
        System.out.println("字符串中的空格用#替换为："+str.replace(" ","#"));
    }
}