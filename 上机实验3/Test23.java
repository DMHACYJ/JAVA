package 上机实验3;
public class Test23 {
	private boolean 墨盒用尽;
	private boolean 最后一次打印后超过10万张纸;
	public boolean 需要维修() {
		if(墨盒用尽==true||最后一次打印后超过10万张纸==true)
			return true;
	    return false;
	}
}