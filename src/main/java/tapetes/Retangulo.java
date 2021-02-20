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
public class Retangulo extends Tapete{
    
    private double base;
    private double h;
    

    public Retangulo() {
    }

    public Retangulo(double base, double h, double area, Material material, double preco) {
        super(area, material, preco);
        this.base = base;
        this.h = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    public void calculaAreaRetangulo(double base, double h){
        this.setArea(base * h);
    
    }
     
    
    
}
