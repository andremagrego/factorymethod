/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patterns.factorymethodexemplo;

/**
 *
 * @author ftfer
 */
public class Main {

    public static void main(String[] args) {
       
        int unidadesConsumidas = 100;
        
        //Testo a factory residencias
        IContaFactory contaResindenciasFactory = new ContaResidenciasFactory();
        
        IConta conta = contaResindenciasFactory.getConta("residencialrural");
        conta.calcularTaxa(unidadesConsumidas);
        
        IConta contaResidencia = contaResindenciasFactory.getConta("residencial");
        contaResidencia.calcularTaxa(unidadesConsumidas);
        
        //Testo a factory empresas
        IContaFactory contaEmpresasFactory = new ContaEmpresasFactory();
        
        IConta contaComercial = contaEmpresasFactory.getConta("comercial");
        contaComercial.calcularTaxa(unidadesConsumidas);
        
        IConta contaIndustrial = contaEmpresasFactory.getConta("industrial");
        contaIndustrial.calcularTaxa(unidadesConsumidas);
    }
}
