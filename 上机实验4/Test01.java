package 上机实验4;

public class Test01 {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        double d=Math.PI;
        System.out.println(x+ "的" +y+ "次方："+Math.pow(x,y));
        System.out.println(x+ "和" +y+ "的最小值："+Math.min(x,y));
        System.out.println(d+ "向上取整：" +Math.ceil(d));
        System.out.println(d+ "向下取整：" +Math.floor(d));
        System.out.println(d+ "四舍五入：" +Math.round(d));
        System.out.println("atan(" +d+ ")的值为："+Math.atan(d));
    }
}