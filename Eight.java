package �˹����ܵ���;

import java.util.*;

class EightDigit {
	private int[] _num = new int[9];//9������������������   
    private int _cur;//��ʼ״̬�ߵ���ǰ״̬�Ĳ�����
    private int _startTarget;//����ʼ״̬��Ŀ�����С����ֵ
    private int _curTarget;//��ǰ״̬��Ŀ�����С����
    private EightDigit _parent;//��ǰ״̬�ĸ�״̬
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
   
    public boolean isTarget(EightDigit target){//�жϵ�ǰ״̬�Ƿ�ΪĿ��״̬
        return Arrays.equals(getNum(), target.getNum());//��ǰ״̬��8���������Ŀ��״̬��8����������ͬ
    }
    public int getZeroPos() {//�ҵ����ƶ�����0��λ��
        for(int i = 0; i < 9; i++) {
            if(_num[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public int isContains(ArrayList<EightDigit> open){//�жϵ�ǰ״̬�Ƿ������open����
        for(int i = 0; i < open.size(); i++){
            if(Arrays.equals(open.get(i).getNum(), getNum())){
                return i;//���ڷ�����open����λ��
            }
        }
        return -1;//������
    }
    public void print(){//�����ӡ
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
		//����open��close��
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
        System.out.println("�������������ʼ״̬���Ÿ����֣�0����ո�");
        for(int i = 0; i < 9; i++) {
        	tanum[i] = In.nextInt();
        }
        System.out.println("�����������Ŀ��״̬���Ÿ����֣�0����ո�");
        for(int i = 0; i < 9; i++) {
        	stnum[i] = In.nextInt();
        }
        
        start.setNum(stnum);
        target.setNum(tanum);
        long startTime=System.currentTimeMillis();   //��ȡ��ʼʱ��
        if(Solvable(start, target)) {
        	Init(start, target);            
            open.add(start);
            while(open.isEmpty() == false){ 
            	Collections.sort(open, new Comparator<Object>() {
                	public int compare(Object a, Object b) {
                        EightDigit c = (EightDigit) a;
                        EightDigit d = (EightDigit) b;
                        return c.getStartTarget()-d.getStartTarget();//open���а�open��ŵ�8����״̬��Ŀ��״̬����С����ֵ����
                    }
                });           
                EightDigit best = open.get(0);//��open����ȡ����Сֵ��״̬���Ƴ�open��
                open.remove(0);
                close.add(best);
                if(best.isTarget(target)){            
                    //���·��
                    PrintPath(best);
                    long end=System.currentTimeMillis(); //��ȡ����ʱ��  
                    System.out.println("��������ʱ�䣺 "+(end-startTime)+"ms");
                    System.exit(0);
                }
                int[] mov = {-3, 3, -1, 1};//���ƣ����ƣ����ƣ�����
                for(int i = 0; i < 4; i++) {//��չ�ڵ�
                	int pos = best.getZeroPos();
                	if(pos + mov[i] >= 0 && pos + mov[i] < 9) {//�����ų��Ƴ��߽��
                		if((pos==2&&i==3)||(pos==3&&i==2)||(pos==5&&i==3)||(pos==6&&i==2))
                			continue;//�ų����ڶ������λ�����ƣ�����������λ�����ƣ���Ϊ�ỻ��
                		EightDigit cur = new EightDigit();//����һ���ƶ���8����
                        int[] curnum = (int[])best.getNum().clone();
                        cur.setNum(curnum);//��open��Сֵ״̬��ʼ�ƶ�
                		cur.getNum()[pos] = best.getNum()[pos + mov[i]];
                		cur.getNum()[pos + mov[i]] = 0;
                		if(cur.isContains(close) == -1){//���close������˵���Ѿ�ȷ���ƶ�����close��û�в��ƶ�
                            int position = cur.isContains(open);
                            if(position == -1) {//open����û�У���ʼ����ǰ�ƶ���cur����open��
                                cur.setParent(best);//����֮ǰȷ���ƶ�λ����ӵ�close���нڵĽڵ���Ϊ��ǰcur�ĸ��ڵ�
                                Init(cur, target);
                                open.add(cur);
                            }else{
                                if(cur.getCur() < open.get(position).getCur()){//ÿ�ΰ���С�ķŽ�ȥ
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
        else System.out.println("û�н⣬����������");
	}
	public static void Init(EightDigit start, EightDigit target){//��ʼ��������
        int temp = 0;
        for(int i=0;i<9;i++){
            //if(start.getNum()[i] != target.getNum()[i]) {//����λ��
            //    temp++;
            //}
        	for(int j = 0; j < 9; j++) {//�������Ƶ�Ŀ��λ����������
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
	public static boolean Solvable(EightDigit start, EightDigit target){//������ֵ�ж��Ƿ��н� 
        int reverse = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < i; j++){
                if(start.getNum()[j] > start.getNum()[i])
                    reverse++;
                if(target.getNum()[j] > target.getNum()[i])
                    reverse++;
            }
        }
        if(reverse % 2 == 0)//ż������true���н⣬���໥����
            return true;
        return false;//�����޽⣬�����໥����
    }
	public static void PrintPath(EightDigit target){//��ӡ·��
         EightDigit temp = null;
         int count = 0;
         temp = target;
         while(temp!=null){
             temp.print();
             System.out.println("---��"+ (count + 1) +"��---");
             temp = temp.getParent();
             count++;
         }
         System.out.println("��������"+(count-1));
     }
}