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
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double height;

    public Tabung(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return  2*super.area()+2*super.getPhi()*height*super.getRadius();
    }

    @Override
    public double volume() {
        return super.area() * height;
    } 
    
    public void cylinderOut(){
        System.out.println("Cylinder Volume       : " + volume());
        System.out.println("Cylinder Surface Area : " + surfaceArea());
    }
}
