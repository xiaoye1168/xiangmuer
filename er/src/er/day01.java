package er;
interface Animal { 
	   String a="��Ϊ";
		public void eat(); 
		public void travel();
}
interface loy extends Animal{
public void att();
}
	class dog implements loy{
	public void eat(){
	System.out.println(a+":"+"���ں���");
	}
	public void travel(){
	System.out.println(a+":"+"���ڱ���");
	}
	
	public void att() {
		// TODO Auto-generated method stub
		System.out.println(a+":"+"����");
	}
	}
	public class day01 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	       dog a1=new dog();
	       a1.eat();
	       a1.travel();
	       a1.att();
		}

	}


