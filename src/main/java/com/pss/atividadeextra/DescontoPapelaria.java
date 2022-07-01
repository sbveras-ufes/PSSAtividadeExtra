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
public class DescontoPapelaria extends Chain{
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
       double aux=0.00;
        for (int i = 0; i < pedido.getItens().getsize(); i++) {
          if(((pedido.getItens().geti(i)).getCategoria()) == "Papelaria"){
              if(aux<=0.05){
              aux+=0.0025;
             
              }
          }
        }
          pedido.addPCDesconto(aux);
          this.next.handle(pedido);
     if(isFim(this)==true)return;
    
    }   
}

