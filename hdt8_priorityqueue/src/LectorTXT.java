/*
 * UVG
 * Algoritmos y Estructura de Datos
 * HT 8 - Priority Queue
 * Autores:
 * 		Davis Alvarez -15842
 * 		Sevastian Galindo - 15
 * 
 * GIT: https://github.com/SebastianAGC/hdt8.git
*/	

package org.uvg.utilidades;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.ArrayList;

import org.uvg.bean.Pacientes;

public class LectorTXT {
	
	private static LectorTXT instancia;
	private ArrayList<Pacientes> listaPacientes;
	public LectorTXT(){
		listaPacientes = new ArrayList<Pacientes>(); 
		
	}
	
	
    
    public static LectorTXT getInstancia(){
		if(instancia==null)
			instancia=new LectorTXT();
		return instancia;
	}
	
	public void lectorArchivo(){
		File datos;
		FileReader datosLeidos=null;
		BufferedReader br;
		try{
			datos = new File ("./pacientes.txt");
			datosLeidos = new FileReader (datos);
			br = new BufferedReader(datosLeidos);
			
			String linea;
			while((linea=br.readLine())!=null){
            		String [] infoPaciente = linea.split(",");
            		Pacientes nuevo = new Pacientes(infoPaciente[0],infoPaciente[1],infoPaciente[2]);
            		//System.out.println(infoPaciente[0]);
            		//System.out.println(infoPaciente[1]);
            		//System.out.println(infoPaciente[2]);
            		listaPacientes.add(nuevo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{                    
            if( null != datosLeidos ){   
            	datosLeidos.close();     
            }                  
         }catch (Exception e){ 
            e.printStackTrace();
         }
	}
	public ArrayList<Pacientes> getListaPacientes(){
		return this.listaPacientes;
	}
}
