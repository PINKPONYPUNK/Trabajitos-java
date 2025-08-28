package arreglos;
import java.util.*;
public class cadenaaaa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arreglos de tipo cadena 
		String[] nombres; //declaracion de un arreglo
		String[] estados = new String[5]; //
		int elementos;
		estados[0] = "jalisco";
		Scaner sc = new Scaner(System.in);
		System.out.println ("cuantos elementos quieres almacenar?");
		nombres = new String[elementos];
		for(int i=0; i < nombres.length; i++) {
			System.out.println("nombre:" +i)
			nombres[i] = sc.netxline();
		}
		for(String nombre : nombres) {
			System.out.println(nombre)
			}
	}
}