package com.company;

public class PruebaMetodos {

    public static void main (String [] args){

        Cuenta miCuenta = new Cuenta();


        miCuenta.depositar(200);
        System.out.println("Despues del deposito tu saldo es " + miCuenta.getSaldo());

        miCuenta.retirar(100);
        System.out.println("Retiraste 100 tu saldo es:"+miCuenta.getSaldo());

        Cuenta cuentaDeYueimar = new Cuenta();
        cuentaDeYueimar.depositar(1000);

        /*if(cuentaDeYueimar.transferir(400,miCuenta)){
            System.out.println("Transferencia Exitosa!!");
        }else{
            System.out.println("No es posible");
        }*/

        boolean puedeTransferir = cuentaDeYueimar.transferir(1200, miCuenta);

        if(puedeTransferir){
            System.out.println("Transferencia Exitosa!!");
        }else{
            System.out.println("No es posible saldo insuficiente!!");
        }


        System.out.println(miCuenta.getSaldo());
        System.out.println(cuentaDeYueimar.getSaldo());

    }
}
