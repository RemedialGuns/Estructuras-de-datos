import java.util.Scanner;


public class Piramide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner capt = new Scanner(System.in);
		System.out.println("ingrese el numero de pisos.");
		int n = capt.nextInt();
		for (int i = n;i>0;i--){
		    System.out.println('\n');
		    for(int j=1;j<=n;j++){

		    if(j<i) System.out.print(" ");
		    
		    else    System.out.print(" *");
		            }
		    }
		
	}

}
