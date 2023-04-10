/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.factorymethodexemplo;

/**
 *
 * @author ftfer
 */
public class ContaEmpresasFactory implements IContaFactory {

    @Override
    public IConta getConta(String tipo) {
    
        IConta conta;
        
        switch(tipo.toUpperCase()){
                case "COMERCIAL": conta = new ContaComercial();
                                    break;
                case "INDUSTRIAL": conta = new ContaIndustrial();
                                         break;
                default: 
                                    conta = new ContaComercial();
                                    break;
                
        }
        
        return conta;
    
    }
    
    
    
}
