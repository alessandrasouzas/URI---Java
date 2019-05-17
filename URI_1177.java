import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		int[] vet = new int[10001];
		int t, u=0, aux=0;
		t = sc.nextInt();
			
		if (t>=2 && t<=50){
					
			while (u<1000){ 
				for(int i=0; i<t; i++){
					vet[aux] = i;
					u++;
					aux++;
				}
			}
		}
				
		for (int z = 0; z < 1000; z++)
			System.out.printf("N[%d] = %d\n",z,vet[z]);
		sc.close();
	}
}