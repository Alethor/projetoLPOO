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
public class Circulo extends Forma{
    
    private double raio;

    public Circulo(){
    }

    public Circulo(double area) {
        super(area);
        
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void calculaAreaCirculo(double raio){
        this.setRaio(raio);
        this.setArea((3.14 * (Math.pow(raio, 2))));
    }
    
    public void calculaRaioCirculo(double area){
        this.setRaio(Math.sqrt(area/3.14));
    }
    
}

