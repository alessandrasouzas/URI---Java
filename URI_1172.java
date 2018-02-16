

	import java.io.IOException;
	import java.util.Scanner;

	public class URI_1172 {
		public static void main(String[] args) throws IOException {
			Scanner scan = new Scanner(System.in);  
			int x [] = new int[10];
			int i;
			
			//Preenche o vetor
			for (i=0;i<x.length;i++){
				x[i] = scan.nextInt();
			
				if(x[i]<=0) {		 //Compara se o numero <=0, caso seja trocar por 1
					x[i] = 1;
				} 		
			}		
			for(i=0;i<x.length;i++) {
				System.out.println("X["+i+"] = "+x[i]);
			}		   
		}
	}

