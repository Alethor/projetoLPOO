/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapetes;



/**
 *
 * @author erick
 */
public class Triangulo extends Forma{
    
    private double base;
    private double h;
    

    public Triangulo() {
    }

    public Triangulo(double area) {
        super(area);
       
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
   
    
    
    public void calculaAreaTriangulo(double base, double h){
       this.setBase(base);
       this.setH(h);
       this.setArea((base * h)/2);
    
    }
    
    public void calculaBaseAlturaTriangulo(double area){
           this.setBase(Math.sqrt(2*area));
           this.setH(Math.sqrt(2*area));
    }
    
    
}
