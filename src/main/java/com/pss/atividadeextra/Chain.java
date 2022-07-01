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
public abstract class Chain implements IChain{
    private IChain next;
//    @Override
//    public void setNext(IChain next){
//        this.next=next;
//    }
    @Override
    public IChain getNext(){
        return next;
    }
    @Override
    public boolean isFim(IChain chain){
        if(chain.getNext()==null)return true;
        
        else return false;
        
    }
}