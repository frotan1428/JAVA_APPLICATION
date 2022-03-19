package CircleAndCylinder;

import GFGOveridding10.M;

public class Circle {



   private double radius;


    public double getRadius() {
        return radius;

    }

    public Circle(double radius) {

        this.radius = radius;
        if (radius<0){
            this.radius=0;
        }

    }

    public double getArea(){
        return  radius*radius* Math.PI;
    }
}
