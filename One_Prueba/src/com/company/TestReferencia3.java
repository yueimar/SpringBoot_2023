package com.company;

public class TestReferencia3 {
    public static void main(String[] args){
        Cuenta cuentaDeYueimar = new Cuenta();
        Cliente cliente = new Cliente();
        cuentaDeYueimar.titular = cliente;
        cuentaDeYueimar.titular.setNomnbre("Andres");

        System.out.println(cuentaDeYueimar.titular.getNomnbre());

    }
}
