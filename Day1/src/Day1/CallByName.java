package Day1;
// Call by value 방식
public class CallByName {
	public static void main(String[] args) {
		
		CallByName.disp2();
		
		CallByName cbn = new CallByName();
		
		cbn.disp1();
		cbn.disp2();
		
		int num = 100;
		
		num = cbn.disp3(num);
		System.out.println(num); // 출력 3
		
		String str = new String("Superman");
		//System.out.println(str);
		
		cbn.disp4(str);
		
	}
	public void disp4(String s) {
		System.out.println(s);
	}
		
	public int disp3(int num) {
		System.out.println(num); // 출력 1 
		num++;
		System.out.println(num); // 출력 2
		
		return num;
	}
	
	public void disp1() {// call by name
	System.out.println("call by name 1");
}
	
	public static void disp2() {// call by name
	System.out.println("call by name 2");
	}
		// call by value는 num 자신을 보내준게 아니라, 100을 보내준 것
}
