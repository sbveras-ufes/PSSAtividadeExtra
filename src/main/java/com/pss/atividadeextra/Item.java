/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.atividadeextra;

/**
 *
 * @author Sylvio
 */
public class Item {
    private String Nome;
    private int Quantidade;
    private String Categoria;
    private double ValorUnitario;
    private double ValorTotal;

   

    Item(String nome,int quant,String cat,double Vu){
        this.Nome=nome;
        this.Quantidade=quant;
        this.Categoria=cat;
        this.ValorUnitario=Vu;
        this.setValorTotal();
        
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public final void setValorTotal() {
        this.ValorTotal = (getValorUnitario()*getQuantidade());
    }
}
