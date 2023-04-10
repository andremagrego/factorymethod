/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.patterns.factorymethodexemplo;

/**
 *
 * @author ftfer
 */
public interface IConta {
    
    public double getTaxa();
    public void setTaxa(double valor);
    public void calcularTaxa(int unidadesConsumo);
    
}
