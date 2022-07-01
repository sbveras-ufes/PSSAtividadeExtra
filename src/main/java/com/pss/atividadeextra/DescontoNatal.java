/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.atividadeextra;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

/**
 *
 * @author Sylvio
 */
public class DescontoNatal extends Chain{
    private IChain next;
    private final int year=Year.now().getValue();
    private LocalDateTime Natal =LocalDateTime.of(year, Month.DECEMBER, 25, 0, 0);
    
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
          if((pedido.getData().plusWeeks(2)).isAfter(Natal)){
              pedido.addPCDesconto(0.03);
              this.next.handle(pedido);
          }
          else this.next.handle(pedido);
          
     if(isFim(this)==true)return;
        }
    
    }   



