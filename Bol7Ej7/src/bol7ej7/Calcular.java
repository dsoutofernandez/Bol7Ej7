
package bol7ej7;

public class Calcular {
    double num1;
    double num2;
    
    public Calcular(){}
    
    public Calcular(double num1){
    this.num1  =num1;
    }
    
    public Calcular(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double AreaCuadrado(double num1){
    double area;
    area = num1 * num1;
    return area;
    }
    
    public double AreaTriangulo(double base, double altura){
    double area;
    num1 = base;
    num2 = altura;
    area = (num1 * num2)/2;
    return area;
    }
    
    public double AreaCirculo(double num1){
    double area;
    area = Math.pow((3.1416 * num1),2);
    return area;
    }
    
}
