/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;


/**
 *
 * @author fabio
 */
public class CalcularINSSTest extends Steps{
    
    public CalcularINSSTest() {
    }

    CalcularINSS ci = new CalcularINSS();
    @Given("que esteja logado como gerente de RG $usuario")
    public void popularUsuario(@Named("usuario") String usuario) {
    	ci.setUsuario(usuario);
        assertTrue(ci.getUsuarioLogado());
    }
    @When("quando eu inserir o salário bruto de R$ $salario")
    public void popularSalario(@Named("salario") double salario) {
    	ci.setSalario(salario);    
        assertEquals(ci.getSalario(), salario, 2);
    }
    @Then("o sistema retorna o INSS de R$ $inss e o salário líquido será R$ $salarioLiquido")
    public void inssTest(@Named("inss") double inss, @Named("salarioLiquido") double salarioLiquido) {
    	ci.calcularINSS();
        assertEquals(ci.getINSS(), inss, 2);
        assertEquals(ci.getSalarioLiquido(), salarioLiquido, 2);
    }
    

}
