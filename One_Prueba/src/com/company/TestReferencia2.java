package com.company;

public class TestReferencia2 {

    public static void main (String [] args){
        Cliente andres = new Cliente();
        andres.setNomnbre("Andres");
        andres.setDocumento("1038416830");
        andres.setTelefono("3147206275");

        Cuenta cuentaDeYueimar = new Cuenta();
        cuentaDeYueimar.titular = andres;

        System.out.println(cuentaDeYueimar.retirar(Double.parseDouble("5.00")));
    }


}
