package Modelo;

public class Cuadrado {
	private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }
    public double getperimetroCuadrado(){
    	return perimetroCuadrado;
    }
    
    
    public void area() 
    {
        areaCuadrado = lado * lado;
    } 
    public void perimetro(){
    	perimetroCuadrado= lado * 4;
    }

}

