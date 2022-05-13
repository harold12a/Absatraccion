package com.PruebaAbstracta;

public class Salario extends Empleado {

    private  double salario;

    public Salario(String nombre,String direccion,int numero,double salario){
        super(nombre,direccion,numero);
        setSalario(salario);
    }
    public  void chequeCorreo(){
        System.out.println("dentro del chequeCorreo la clase Salario");
        System.out.println("Enviado cheque a "+getNombre()+"con salario"+getSalario());
    }
    public double getSalario(){
        return salario;
    }

    private void setSalario(double nuevo) {
        if(nuevo>=0.0)
            salario=nuevo;
    }
    public double pagoComputado(){
        System.out.println("Computando el pago del salario a"+getNombre());
        return salario/52;
    }

}
