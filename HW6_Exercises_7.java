
public class HW6_Exercises_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 5;
		int y=1;
	System.out.println("START");	

	while(y <= x){
		System.out.println(y);
	
		double a = y;
	
		int b = 0;
	
			while(b < y){
				a = a + .1;
				a = Math.round(a * 100);
				a = a/100;
				System.out.println(a);
				b++;
			}
				y++;
	
		}
			System.out.println("END");	
	}

}
