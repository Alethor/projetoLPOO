/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapetes;

import materiais.Material;

/**
 *
 * @author erick
 */
public class Circulo extends Tapete{
    
    private double raio;

    public Circulo(){
    }
    
    public Circulo(double area, Material material, double preco, double raio) {
        super(area, material, preco);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void calculaAreaCirculo(double raio){
        this.setArea((3.14 * (Math.pow(raio, 2))));
    }
    
}
