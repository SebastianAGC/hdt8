/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 8 - Priority Queue
 * Autores:
 * 		Davis Alvarez -15842
 * 		Sevastian Galindo - 15452
 * 
 * GIT: https://github.com/SebastianAGC/hdt8.git
*/	
package org.uvg.menu;

import org.uvg.utilidades.LectorTXT;
import org.uvg.bean.Pacientes;

import java.util.Scanner;

public class Menu {
	
	private Scanner snr;
	
	public Menu(){
		snr = new Scanner(System.in);
	}
	
	public void menuPrinciapal(){
		String resp="";
		boolean valor = true;
		
		System.out.println("Bienvenido al Centro Medico de la UVG! \n");
		do{
			System.out.println("Menu:");
			System.out.println("1. Mostrar Pacientes");
			System.out.println("2. Ingresar Paciente");
			System.out.println("e. Salir\n");
			
			System.out.print("-> ");
			resp = snr.nextLine();
			switch(resp){
				case "1":
					System.out.println("Los Pacientes en la lista son:");
					System.out.println("__________________________________");
					for(Pacientes p:LectorTXT.getInstancia().getListaPacientes()){
						System.out.println("Nombre: "+p.getName());
						System.out.println("Sintoma: "+p.getSintoma());
						System.out.println("Codigo: "+p.getCodigo());
						System.out.println("__________________________________");
					}
					
					break;
				case "2":
					Pacientes p = new Pacientes();
					System.out.println("Ingrese la informacion del paciente:");
					System.out.print("Nombre: ");
					resp = snr.nextLine();
					p.setName(resp);
					System.out.print("Sintoma: ");
					resp = snr.nextLine();
					p.setSintoma(resp);
					System.out.print("Codigo: ");
					resp = snr.nextLine();
					p.setCodigo(resp);
					LectorTXT.getInstancia().getListaPacientes().add(p);
					break;
				case "e":
					System.out.println("Gracias por su preferencia!");
					valor = false;
					break;
				default:
					System.out.println("No es una opccion!\n");
					break;
			}
			
		}while(valor);
		
	}
}
