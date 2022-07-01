/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.atividadeextra;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Sylvio
 */
public class Pedido {
    long id;
    String Nome;
    LocalDateTime Data;
    String UF;
    ItemCollection Itens;
    double ValorTotal;
    double PCDesconto=0.0;
    double ValorDesconto;
    double PCImposto=0.0;
    double ValorImposto;
    double ValorFinal;

    Pedido(String nome,String UF,ItemCollection itens){
    this.id=ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    this.Nome=nome;
    this.setData();
    this.setUF(UF);
    this.Itens=itens;
}
    public long getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public LocalDateTime getData() {
        return Data;
    }

    public void setData() {
        this.Data = LocalDateTime.now();
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        if(UF.length()>2)UF=UF.substring(0,2);
        this.UF = UF;
    }

    public ItemCollection getItens() {
        return Itens;
    }

    public void setItens(Item item) {
        this.Itens.add(item);
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal() {
        this.ValorTotal =Itens.getTotal();
    }

    public double getPCDesconto() {
        return PCDesconto;
    }


    public void addPCDesconto(double PCDesconto) {
        this.PCDesconto += PCDesconto;
    }

    public double getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto() {
        this.ValorDesconto = this.getValorTotal()*this.getPCDesconto();
    }

    public double getPCImposto() {
        return PCImposto;
    }


        public void addPCImposto(double PCImposto) {
        this.PCImposto += PCImposto;
    }

    public double getValorImposto() {
        return ValorImposto;
    }

    public void setValorImposto() {
        this.ValorImposto= this.getValorTotal()*this.getPCImposto();
    }

    public double getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal() {
        this.ValorFinal = (this.getValorTotal()+this.getValorImposto())-this.getValorDesconto();
        
    }
}
