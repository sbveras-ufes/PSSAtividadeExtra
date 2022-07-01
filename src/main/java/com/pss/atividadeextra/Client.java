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
public class Client {
        
        Client(Pedido request){
        var Desconto1=new DescontoEducacao();
        var Desconto2=new DescontoNatal();
        var Desconto3=new DescontoPapelaria();
        
        var Imposto1=new ICMS();
        var Imposto2=new ISS();
        
        Desconto1.setNext(Desconto2);
        Desconto2.setNext(Desconto3);
        Desconto3.setNext(Imposto1);
        Imposto1.setNext(Imposto2);
        Imposto2.setNext(null);
        
        Desconto1.handle(request);
    }
}
