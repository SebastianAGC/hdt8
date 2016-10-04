package org.uvg.bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Galindo
 */
public class Pacientes implements Comparable<Pacientes>{
    
    private String name;
    private String sintoma;
    private String codigo;

    public Pacientes(String name, String sintoma, String codigo) {
        this.name = name;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }
    

    public Pacientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
        this.name = name;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "name=" + name + ", sintoma=" + sintoma + ", codigo=" + codigo + '}';
    }

    @Override
    public int compareTo(Pacientes o) {
        return this.codigo.compareTo(o.codigo);
    }
    
   
    
    
}