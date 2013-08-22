import java.util.Scanner;


public class MCM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner capt = new Scanner(System.in);
		       int a, b, x, z, y=1, i=2;
		       System.out.println("ingrese primer numero:" );
		       a = capt.nextInt();
		       System.out.println("ingrese segundo numero:");
		       b = capt.nextInt();
		       if (a<b){x=a; z=b;} else {x=b; z=a;}

		            do{
		              if (x%i==0){
		                  if(z%i==0){
		                  y=y*i;
		                  x=x/i; z=z/i;   i=2;
		                  }
		                  else i++;
		               }
		               else i++;
		               }  while(i<=x);

		             y=y*z*x;

		              System.out.println("el MCM es " + y);
		}

	}


