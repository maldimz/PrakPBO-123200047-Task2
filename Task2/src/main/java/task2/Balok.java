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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    double height;

    public Balok(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double surfaceArea() {
        return 2*(super.area()+super.area(super.getLength(), height)+super.area(super.getWidth(), height));
    }

    @Override
    public double volume() {
        return super.area() * height;
    }
    
    public void cuboidOut(){
        System.out.println("Cuboid Volume       : " + volume());
        System.out.println("Cuboid Surface Area : " + surfaceArea());
    }
}
