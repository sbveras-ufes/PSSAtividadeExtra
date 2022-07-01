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
public class Demo {
    public static void main(String[] args) {
      ItemCollection compras=new ItemCollection();
      Item papel=new Item("Papel A4",5,"Papelaria",15.0);
      Item bic=new Item("Caneta",6,"Papelaria",7.0);
      Item borracha=new Item("Borracha",6,"Papelaria",2.0);
      Item lapis=new Item("Lápis",6,"Papelaria",1.2);
      
      compras.add(papel);
      compras.add(bic);
      compras.add(borracha);
      compras.add(lapis);
      
      Pedido pedido=new Pedido("Fulano","MG",compras);
      var caixa=new Client(pedido);
      pedido.setValorTotal();
      pedido.setValorImposto();
      pedido.setValorDesconto();
      pedido.setValorFinal();

    }
}
