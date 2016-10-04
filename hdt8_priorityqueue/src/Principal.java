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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Principal {

    static ArrayList<Pacientes> arrayPacientes = new ArrayList<Pacientes>();
    static ArrayList<Pacientes> arrayPacientes2 = new ArrayList<Pacientes>();
    static VectorHeap<Pacientes> vector = new VectorHeap<Pacientes>();
    static String laCadena = "";
    
            //Método en donde se crea el diccionario leyendo el contendido del archivo txt
    public static void crearArray(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\pacientes.txt"));
            String linea;
            while((linea = br.readLine()) != null)
            {
                //String tmp = br.readLine();
                String[] palabras = linea.split(", ");      
                Pacientes nuevoPaciente = new Pacientes(palabras[0], palabras[1], palabras[2]);
                vector.add(nuevoPaciente);
                laCadena = laCadena + "\n"+nuevoPaciente.toString();
            }
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

                crearArray();

                System.out.println("Los pacientes ingresaron de esta manera: ");
                System.out.println(laCadena + "\n");      
                System.out.println("Los pacientes deben ser atendidos de la siguiente manera: \n");
                while(!vector.isEmpty()){
                    System.out.println(vector.remove().toString());
                } 
	}

}
