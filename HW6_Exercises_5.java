
public class HW6_Exercises_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		while (n>1){
			System.out.println(n);
			if (n%2==0){
				n=n/2;
			}
			else{
				n=3*n+1;
			}
		}
	}

}
