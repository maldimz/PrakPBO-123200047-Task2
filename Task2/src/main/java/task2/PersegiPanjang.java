/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Dimas
 */
public class PersegiPanjang implements MenghitungBidang{
    double length, width;

    public PersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area(double a, double b){
        return a * b;
    }
    
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (length * width);
    }
    
    public void rectangleOut(){
        System.out.println("Rectangle Area          : " + area());
        System.out.println("Rectangle Circumference : " + circumference());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
