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
    
   
    protected Material material;
    protected double preco;
    protected Forma forma;
    
    public Tapete(){}

    public Tapete(Material material, double preco) {
       
        this.material = material;
        this.preco = preco;
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
    
     public void calculaPreco(){
        this.setPreco((this.getMaterial().getPreco()) * (this.getForma().getArea()));
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }
     
     
     
}
