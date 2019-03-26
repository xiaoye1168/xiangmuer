package zhizhang;
interface Animal{
	String a="会";
	void run();
	void beathe();
}
interface Wangdao extends Animal{
	void php();
}
class wo{
	void shuaiqi() {
	}
}
 class sige extends wo implements Animal,Wangdao{
	public void run() {
		System.out.println("四哥"+a+"和王军在床上互拔腿毛");
	}
	public void beathe() {
		System.out.println("嗷嗷嗷");
	}
	public void php() {
		
	}
}
public class Wangzong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sige b=new sige();
b.run();
b.beathe();
	}

}
