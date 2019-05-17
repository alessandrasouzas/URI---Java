import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), n = scan.nextInt(), soma = 0;
        while(n<=0)
        	n = scan.nextInt();
        for(int i = a; i < (a+n); i++)
    		soma+=i;
    	System.out.println(soma);
    }
}