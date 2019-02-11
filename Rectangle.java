//Andrew Salinas  Last Modified: 10/11/18
//Dynamic Rectangle

import gpdraw.*;

public class Rectangle {

    private static DrawingTool pen;
    private static SketchPad paper;

    private double myX;      // the x coordinate of the rectangle
    private double myY;      // the y coordinate of the rectangle
    private double myWidth;  // the width of the rectangle
    private double myHeight; // the height of the rectangle


    public Rectangle(){

        myX = 0.0;
        myY = 0.0;
        myWidth = 0.0;          //Default Constructor
        myHeight = 0.0;
        this.draw();
    }

    public Rectangle(double x, double y, double width, double height) {
        myX = x;
        myY = y;
        myWidth = width;        //The part that makes the homie Dynamic
        myHeight = height;
        this.draw();

    }
    public double getPerimeter(){

        double prim = myHeight + myHeight + myWidth + myWidth;

        return prim;        //You know what this is home slice
    }

    public double getArea(){

        double area = myHeight * myWidth;

        return area;            //You know what this is home slice
    }

    public void draw(){
        pen.up();
        pen.setDirection(90);
        pen.move(myY, myX);
        pen.down();
        pen.forward(myWidth);
        pen.turnLeft();
        pen.forward(myHeight);      //This thingy is the template for rec
        pen.turnLeft();
        pen.forward(myWidth);
        pen.turnLeft();
        pen.forward(myHeight);
    }

    public static void main(String []args){

        paper = new SketchPad(500, 500);
        pen = new DrawingTool(paper);

        Rectangle rec1 = new Rectangle(50, 20 , 120, 140);
        Rectangle rec2 = new Rectangle(0, -80, 100, 60);
        Rectangle rec3 = new Rectangle(50, -100, 20, 300);


    }

}