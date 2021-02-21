/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pessoal.Pedido;
import tapetes.Tapete;

/**
 *
 * @author erick
 */
public class PedidoTableModel extends AbstractTableModel {

    private String[] colunas = {"Forma", "Material", "Tamanho (m²)", "Preço"};
    private List<Tapete> itens = new ArrayList<>();
    
    @Override
    public String getColumnName(int column) {
       return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return itens.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;    
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return itens.get(linha).getForma().getTipo();
            case 1:
                return itens.get(linha).getMaterial().getTipo();
            case 2:
                return itens.get(linha).getForma().getArea();
            case 3:
                return itens.get(linha).getPreco();
            default:
                return null;
        }
    }
    
    
    public void addRow(Tapete t){
        this.itens.add(t);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.itens.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    
    }

    public List<Tapete> getItens() {
        return itens;
    }

    public void setItens(List<Tapete> itens) {
        this.itens = itens;
    }
    
    
    
    
}
