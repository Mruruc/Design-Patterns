package com.mruruc.factory_pattern;

public class ShapeFactory {
    public ShapeFactory(){}
    public static Shape getShapeInstance(Shape shape){

        if(shape==null){
            return null;
        }
        else if (shape instanceof Rectangle) {
            return new Rectangle();

        }
        else if (shape instanceof Circle) {
            return new Circle();
        }
        else return new Triangle();
    }
}
