/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoal;


import java.util.ArrayList;
import java.util.List;
import tapetes.Tapete;

/**
 *
 * @author erick
 */
public class Pedido {
    
    private int id;
    private double total;
    private List<Tapete> tapetes = new ArrayList<>();
    

    public Pedido() {
    }
    
    public List<Tapete> getTapete() {
        return tapetes;
    }

    public void setTapete(List<Tapete> tapete) {
        this.tapetes = tapete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   public void atualizaTotal(){
       this.total = 0;
       for(Tapete t : this.getTapete()){
           this.total += t.getPreco();
       }
   }
    
    
}
