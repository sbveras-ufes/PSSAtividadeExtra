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
public interface IChain {
        public abstract void setNext(IChain chain);
        public abstract IChain getNext();
	public abstract void handle(Pedido pedido);
        public abstract boolean isFim(IChain chain);
}
