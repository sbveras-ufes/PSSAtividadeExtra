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
public class DescontoEducacao extends Chain{
    private IChain next;
    
    @Override
    public void setNext(IChain next){
        this.next=next;
    }
 
    
    @Override
    public void handle(Pedido pedido){
        for (int i = 0; i < pedido.getItens().getsize(); i++) {
          if(((pedido.getItens().geti(i)).getNome()) == "Lápis"){
              pedido.addPCDesconto(0.005);
            break;
          }
          
        }
              this.next.handle(pedido);
     if(isFim(this)==true)return;
    
    }   
}
