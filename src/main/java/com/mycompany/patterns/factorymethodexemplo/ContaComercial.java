/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.factorymethodexemplo;

/**
 *
 * @author ftfer
 */
public class ContaComercial implements IConta {

    private double taxa;
    
    public ContaComercial(){
        this.taxa = 20;
    }
    
    @Override
    public double getTaxa() {
        return this.taxa;
    }

    @Override
    public void setTaxa(double valor) {
        this.taxa = valor;
    }

    @Override
    public void calcularTaxa(int unidadesConsumo) {
        double resultado = unidadesConsumo * taxa;
        System.out.printf("Conta: %s - Taxa: %.2f - Valor: %s\n", this.getClass().getSimpleName(),this.taxa ,resultado);
    }
    
}
