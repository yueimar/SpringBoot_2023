package com.company;

public class PruebaEncapsulamiento {
    public static void main(String [] args){
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNomnbre("Yueimar");
        cliente.setDocumento("1038416830");

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNomnbre());
        System.out.println(cuenta.getTitular().getNomnbre());
    }
}
