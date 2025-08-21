package tipos_de_variables;

import java.util.Scanner;

public class estandar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] edades = new int[5];
 Scanner captura = new Scanner(System.in);
 for (int i = 0; i <= edades.length; i++) {
	 System.out.println("Dame la eda:"+i);
	 edades[i] = captura.nextInt();
 }
 int x = 0;
 while(x >= edades.length-1) {
	 System.out.println("Valor de x:" + edades[x]);
	 x++;
 }
	}
}