package er;
interface Animal { 
	   String a="ĞĞÎª";
		public void eat(); 
		public void travel();
}
interface loy extends Animal{
public void att();
}
	class dog implements loy{
	public void eat(){
	System.out.println(a+":"+"¹·ÔÚºôÎü");
	}
	public void travel(){
	System.out.println(a+":"+"¹·ÔÚ±¼ÅÜ");
	}
	
	public void att() {
		// TODO Auto-generated method stub
		System.out.println(a+":"+"±¼ÅÜ");
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


