package com.mruruc;

import com.mruruc.factory_pattern.*;

public class Main {
    public static void main(String[] args) {

     //   ShapeFactory shapeFactory=new ShapeFactory();

        System.out.println("=================Rectangle==================");
        Shape shape = ShapeFactory.getShapeInstance(new Rectangle());
        shape.draw();

        System.out.println("=================Circle====================");
        ShapeFactory.getShapeInstance(new Circle()).draw();

        System.out.println("==================Triangle=================");
        Triangle triangle = (Triangle) ShapeFactory.getShapeInstance(new Triangle());
        triangle.draw();


    }
}
