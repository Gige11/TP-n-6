package Ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void punto1(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(80,3);
        Assertions.assertEquals(240,resultado,0.01);
    }

    @Test
    public void punto2(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(calculadora.sumar(150,180),3);
        Assertions.assertEquals(110,resultado,0.01);
    }

    @Test
    public void punto3(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(calculadora.restar(90,50),15);
        Assertions.assertNotEquals(605,resultado,0.01);
    }

    @Test
    public void punto4(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(calculadora.sumar(70,40),25);
        Assertions.assertNotEquals(2700,resultado,0.01);
    }

}
