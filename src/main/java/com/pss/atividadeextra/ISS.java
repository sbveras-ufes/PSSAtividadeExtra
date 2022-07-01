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
public class ISS extends Chain{
     private IChain next;
    
      @Override
    public void setNext(IChain next){
        this.next=next;
    }
    @Override
    public IChain getNext(){
        return next;
    }
    
    @Override
    public void handle(Pedido pedido){
        pedido.addPCImposto(0.02);
        if(isFim(this)==true)return;
        this.next.handle(pedido);
        }
    
    }
