/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.factorymethodexemplo;

/**
 *
 * @author ftfer
 */
public class ContaResidenciasFactory implements IContaFactory {

    @Override
    public IConta getConta(String tipo) {
    
        IConta conta;
        
        switch(tipo.toUpperCase()){
                case "RESIDENCIAL": conta = new ContaResidencial();
                                    break;
                case "RESIDENCIALRURAL": conta = new ContaResidencialRural();
                                         break;
                default: 
                    conta = new ContaResidencial();
                    break;
                
        }
        
        return conta;
    }
    
}
