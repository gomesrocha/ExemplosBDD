/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabio
 */
public class CalcularINSS {
	private String usuario;
	private Double salario, inss, salarioLiquido;

	public void setUsuario(String usuario) {
		this.usuario = usuario;
		
	}

	public boolean getUsuarioLogado() {
		boolean usr=false;
		if(this.usuario.equals("GERRH")){
			usr=true;
		}
		return usr;
	}

	public void setSalario(double salario) {
		this.salario = salario;
		
	}

	public double getSalario() {
		return this.salario;
	}

	public void calcularINSS() {
		if(this.salario<=1751.81) {
			this.inss = this.salario * 0.08;
		} else if(this.salario>1751.81 && this.salario<2919.73) {
			this.inss = this.salario * 0.09;
		} else if(this.salario>=2919.73 && this.salario<5839.46) {
			this.inss = this.salario * 0.11;
		} else if(this.salario>=5839.46) {
			this.inss = 642.33;
		}
		
		
	}

	public double getINSS() {
		return this.inss;
	}
	public void calcularSalario() {
		this.salarioLiquido = getSalario() - getINSS();
	}
	public double getSalarioLiquido() {
		calcularSalario();
		return this.salarioLiquido;
	}
    
}
