package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cubo {
	
	public static void main(String[] args) throws IOException{
		double perimetrocubo,volumencubo,lad;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Scanner leer=new Scanner(System.in);
		Scanner sn=new Scanner(System.in);
		char seguir;
		boolean salir=false;
		int op;
		System.out.println("porfavor ingrese el valor de la arista 'lado' del cuadrado o cubo:");
		lad=leer.nextDouble();
		while(!salir){
			Cuadrado cuadro=new Cuadrado(lad);
			System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
			System.out.println("---------------Menu---------------");
			System.out.println("1.- calcular perimetro de un cadrado");
			System.out.println("2.- calcular area de un cauadrado");
			System.out.println("3.- calcular perimetro de un cubo");
			System.out.println("4.- calcular volumen de un cubo");
			System.out.println("5.- cancelar");
			System.out.println("6.- salir");
			try{
			System.out.println("Escribe tu opcion: ");
			op=sn.nextInt();
			switch (op){
			case 1:
				cuadro.perimetro();
				System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
				System.out.println("El Perimetro del cuadrado de lado: " +lad+ " es "+
		                cuadro.getperimetroCuadrado()+"\n");
				 System.out.println("que decea hacer a continuacion??");
				 System.out.println("    regrasar al menu con el mismo dato = M   o   ingresar un nuevo valor  =  N ");
				 seguir = (entrada.readLine ()).charAt(0);
				 
				 if(seguir=='m'| seguir=='M'){
					 break;
				 }else if(seguir=='n' | seguir=='N'){
					 System.out.println("porfavor ingrese el valor de la arista 'lado' del cuadrado o cubo:");
						lad=leer.nextDouble();
						break;
				 }
				
			case 2:
				cuadro.area();
				System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
				System.out.println("Área del cuadrado de lado: " + lad+" es "+
		                cuadro.getareaCuadrado()+"\n");
				System.out.println("que decea hacer a continuacion??");
				 System.out.println("    regrasar al menu con el mismo dato = M   o   ingresar un nuevo valor  =  N ");
				 seguir = (entrada.readLine ()).charAt(0);
				if(seguir=='m'| seguir=='M'){
					 break;
				 }else if(seguir=='n' | seguir=='N'){
					 System.out.println("porfavor ingrese el valor de la arista 'lado' del cuadrado o cubo:");
						lad=leer.nextDouble();
						break;
				 }
			case 3:
				 perimetrocubo= lad*12;
				 System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
			        System.out.println("Perimetro del cubo de lado: " + lad+" es "+
			                perimetrocubo+"\n");
			        System.out.println("que decea hacer a continuacion??");
					 System.out.println("    regrasar al menu con el mismo dato = M   o   ingresar un nuevo valor  =  N ");
					 seguir = (entrada.readLine ()).charAt(0);
					 if(seguir=='m'| seguir=='M'){
						 break;
					 }else if(seguir=='n' | seguir=='N'){
						 System.out.println("porfavor ingrese el valor de la arista 'lado' del cuadrado o cubo:");
							lad=leer.nextDouble();
							break;
					 }
			case 4:
			        volumencubo=lad*lad*lad;
			        System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
			        System.out.println("Volumen del cubo de lado: " +lad+" es "+ 
			                volumencubo+"cm^3\n");
			        System.out.println("que decea hacer a continuacion??");
					 System.out.println("    regrasar al menu con el mismo dato = M   o   ingresar un nuevo valor  =  N ");
					 seguir = (entrada.readLine ()).charAt(0);
					 if(seguir=='m'| seguir=='M'){
						 break;
					 }else if(seguir=='n' | seguir=='N'){
						 System.out.println("porfavor ingrese el valor de la arista 'lado' del cuadrado o cubo:");
							lad=leer.nextDouble();
							break;
					 }
			case 5:
				System.out.println("El valor con el que esta trabajando en este momento es: "+lad+"\n");
				System.out.println("porfavor ingrese el nuevo valor de la arista 'lado' del cuadrado o cubo:");
				lad=leer.nextDouble();
				break;
			case 6:
				salir=true;
				System.out.println("   HASTA PRONTO  ");
				break;
				default:
					System.out.println("porfavor seleccione solo una da las opciones");
				
			}
			}catch (InputMismatchException e) {
				System.out.println("Debes seleccionar una de las opciones");
	            sn.next();
			}  
		}
		
        
	}

}
