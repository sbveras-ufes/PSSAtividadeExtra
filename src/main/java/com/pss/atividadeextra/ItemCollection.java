/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.atividadeextra;

import java.util.ArrayList;

/**
 *
 * @author Sylvio
 */
public class ItemCollection {
    private ArrayList<Item> Itens;
     public ItemCollection(){
       Itens = new ArrayList<>();
   }
   public void add(Item item){
       if (Itens.contains (item)){
           throw new RuntimeException("Já Existente");
       }
       if (item != null) {
           Itens.add(item);
       }
       else{
           throw new RuntimeException("Inválido");
       }
   }
    public Item geti(int index){
    
//       if (item != null) {
           return Itens.get(index);
//                   }
//       else{
//           throw new RuntimeException("Inválido");
//       }   
   }
    public int getsize(){
        return Itens.size();
    }
    
    public double getTotal(){
        var total=0.0;
        for (int i = 0; i < Itens.size(); i++) {
            total+=Itens.get(i).getValorTotal();
        }
        return total;
    }
}

        