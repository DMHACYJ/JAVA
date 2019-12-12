package 人工智能导论;

import java.util.*;

class EightDigit {
	private int[] _num = new int[9];//9个格子输入三排三列   
    private int _cur;//起始状态走到当前状态的步骤数
    private int _startTarget;//从起始状态到目标的最小估计值
    private int _curTarget;//当前状态到目标的最小估计
    private EightDigit _parent;//当前状态的父状态
    public int[] getNum() {
        return _num;
    }
    public void setNum(int[] num) {
        _num = num;
    }
    public int getCur() {
        return _cur;
    }
    public void setCur(int cur) {
        _cur = cur;
    }
    public int getStartTarget() {
        return _startTarget;
    }
    public void setStartTarget(int startTarget) {
    	_startTarget = startTarget;
    }
    public int getCurTarget() {
        return _curTarget;
    }
    public void setCurTarget(int curTarget) {
    	_curTarget = curTarget;
    }
    public EightDigit getParent() {
        return _parent;
    }
    public void setParent(EightDigit parent) {
        _parent = parent;
    }
   
    public boolean isTarget(EightDigit target){//判断当前状态是否为目标状态
        return Arrays.equals(getNum(), target.getNum());//当前状态的8数码数组和目标状态的8数码数组相同
    }
    public int getZeroPos() {//找到可移动数字0的位置
        for(int i = 0; i < 9; i++) {
            if(_num[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public int isContains(ArrayList<EightDigit> open){//判断当前状态是否存在于open表中
        for(int i = 0; i < open.size(); i++){
            if(Arrays.equals(open.get(i).getNum(), getNum())){
                return i;//存在返回在open表中位置
            }
        }
        return -1;//不存在
    }
    public void print(){//输出打印
        for(int i=0;i<9;i++){
            if(i%3 == 2){
                System.out.println(this._num[i]);
            }else{
                System.out.print(this._num[i]+" | ");
            }
        }
    }
}

public class Eight {
	public static void main(String[] args) {
		//定义open、close表
        ArrayList<EightDigit> open = new ArrayList<EightDigit>();
        ArrayList<EightDigit> close = new ArrayList<EightDigit>();
        EightDigit start = new EightDigit();
        EightDigit target = new EightDigit();
        
//        int stnum[] = {2,1,6,4,0,8,7,5,3};
//        int tanum[] = {1,2,3,8,0,4,7,6,5};
        int[] stnum = new int[9];
        int[] tanum = new int[9];
        @SuppressWarnings("resource")
		Scanner In = new Scanner(System.in);
        System.out.println("请输入八数码起始状态：九个数字，0代表空格：");
        for(int i = 0; i < 9; i++) {
        	tanum[i] = In.nextInt();
        }
        System.out.println("请输入八数码目标状态：九个数字，0代表空格：");
        for(int i = 0; i < 9; i++) {
        	stnum[i] = In.nextInt();
        }
        
        start.setNum(stnum);
        target.setNum(tanum);
        long startTime=System.currentTimeMillis();   //获取开始时间
        if(Solvable(start, target)) {
        	Init(start, target);            
            open.add(start);
            while(open.isEmpty() == false){ 
            	Collections.sort(open, new Comparator<Object>() {
                	public int compare(Object a, Object b) {
                        EightDigit c = (EightDigit) a;
                        EightDigit d = (EightDigit) b;
                        return c.getStartTarget()-d.getStartTarget();//open表中按open存放的8数码状态到目标状态的最小估计值排序
                    }
                });           
                EightDigit best = open.get(0);//从open表中取出最小值的状态并移出open表
                open.remove(0);
                close.add(best);
                if(best.isTarget(target)){            
                    //输出路径
                    PrintPath(best);
                    long end=System.currentTimeMillis(); //获取结束时间  
                    System.out.println("程序运行时间： "+(end-startTime)+"ms");
                    System.exit(0);
                }
                int[] mov = {-3, 3, -1, 1};//上移，下移，左移，右移
                for(int i = 0; i < 4; i++) {//扩展节点
                	int pos = best.getZeroPos();
                	if(pos + mov[i] >= 0 && pos + mov[i] < 9) {//首先排除移出边界的
                		if((pos==2&&i==3)||(pos==3&&i==2)||(pos==5&&i==3)||(pos==6&&i==2))
                			continue;//排除掉第二，五个位置右移，第三，六个位置左移，因为会换行
                		EightDigit cur = new EightDigit();//创建一个移动的8数码
                        int[] curnum = (int[])best.getNum().clone();
                        cur.setNum(curnum);//从open最小值状态开始移动
                		cur.getNum()[pos] = best.getNum()[pos + mov[i]];
                		cur.getNum()[pos + mov[i]] = 0;
                		if(cur.isContains(close) == -1){//如果close里面有说明已经确定移动过，close中没有才移动
                            int position = cur.isContains(open);
                            if(position == -1) {//open表中没有，初始化当前移动的cur放入open，
                                cur.setParent(best);//并将之前确定移动位置添加到close表中节的节点设为当前cur的父节点
                                Init(cur, target);
                                open.add(cur);
                            }else{
                                if(cur.getCur() < open.get(position).getCur()){//每次把最小的放进去
                                    open.remove(position);
                                    cur.setParent(best);
                                    Init(cur, target);
                                    open.add(cur);
                                }
                            }
                        }
                	}
                }
            }   
        }
        else System.out.println("没有解，请重新输入");
	}
	public static void Init(EightDigit start, EightDigit target){//初始化各属性
        int temp = 0;
        for(int i=0;i<9;i++){
            //if(start.getNum()[i] != target.getNum()[i]) {//不在位数
            //    temp++;
            //}
        	for(int j = 0; j < 9; j++) {//各数码移到目标位置所需距离和
        		if(start.getNum()[i] == target.getNum()[j] && i != j) {
        			temp += Math.abs((j + 1)/3 - (i + 1)/3) + Math.abs((j + 1)%3 - (i + 1)%3);
        		}
        	}
        }
        start.setCurTarget(temp);
        if(start.getParent() == null){
        	start.setCur(0);
        }else{
            start.setCur(start.getParent().getCur() + 1);
        }
        start.setStartTarget(start.getCur() + start.getCurTarget());
    }
	public static boolean Solvable(EightDigit start, EightDigit target){//求逆序值判断是否有解 
        int reverse = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < i; j++){
                if(start.getNum()[j] > start.getNum()[i])
                    reverse++;
                if(target.getNum()[j] > target.getNum()[i])
                    reverse++;
            }
        }
        if(reverse % 2 == 0)//偶数返回true，有解，可相互到达
            return true;
        return false;//奇数无解，不能相互到达
    }
	public static void PrintPath(EightDigit target){//打印路径
         EightDigit temp = null;
         int count = 0;
         temp = target;
         while(temp!=null){
             temp.print();
             System.out.println("---第"+ (count + 1) +"步---");
             temp = temp.getParent();
             count++;
         }
         System.out.println("步骤数："+(count-1));
     }
}