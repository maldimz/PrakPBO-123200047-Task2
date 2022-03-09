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
public class Lingkaran implements MenghitungBidang{
    private double radius, phi = 3.14;

    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return phi * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * phi * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPhi() {
        return phi;
    }
    
    public void circleOut(){
        System.out.println("Circle Area          : " + area());
        System.out.println("Circle Circumference : " + circumference());
    }
    
}
