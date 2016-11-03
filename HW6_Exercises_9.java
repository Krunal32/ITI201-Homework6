
public class HW6_Exercises_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x =1; x<50;x++){
		
			if (x%4==0 && x%6==0){
				System.out.println("JavaBean");
			}
			else if (x%4==0){
				System.out.println("Java");
			}
			else if(x%6==0){
				System.out.println("Java");

			}
			else
				System.out.println(x);
		}
	}

}
