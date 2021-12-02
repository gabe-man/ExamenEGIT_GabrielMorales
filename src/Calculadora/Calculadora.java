package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		int resultado=0;
		String opc=null;
		System.out.println("x: ");
		x=Integer.parseInt(sc.nextLine());
		System.out.println("y: ");
		y=Integer.parseInt(sc.nextLine());
		System.out.println("¿Quiere sumar, restar, multiplicar o dividir?");
		opc=sc.nextLine();
		if(opc.equals("sumar"))
		{
			resultado=x+y;
		}
		if(opc.equals("restar"))
		{
			resultado=x-y;
		}
		if(opc.equals("multiplicar"))
		{
			resultado=x*y;
		}
		if(opc.equals("dividir"))
		{
			resultado=x/y;
		}
		System.out.println(resultado);

	}

}
