package zhizhang;
interface Animal{
	String a="��";
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
		System.out.println("�ĸ�"+a+"�������ڴ��ϻ�����ë");
	}
	public void beathe() {
		System.out.println("���");
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
