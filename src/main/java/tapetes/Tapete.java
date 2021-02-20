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
public class Tapete {
    
    protected double area;
    protected Material material;
    protected double preco;
    
    public Tapete(){}

    public Tapete(double area, Material material, double preco) {
        this.area = area;
        this.material = material;
        this.preco = preco;
    }
    
   
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     public void calculaPreco(double area){
        this.setPreco(this.getMaterial().getPreco() * area);
    }
}
