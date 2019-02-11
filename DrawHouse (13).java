//Andrew Salinas, Last edited 8/25/18.
//This program simply draws a very scuffed house mate :/

import gpdraw.*;
public class DrawHouse {

    private DrawingTool myPencil;
    private SketchPad myPaper;


    public DrawHouse(){

        myPaper = new SketchPad(750, 750);

        myPencil = new DrawingTool(myPaper);

    }



    public void draw() {

        myPencil.forward(150);

        myPencil.turnLeft();

        myPencil.forward(200);

        myPencil.turnLeft();   //Making my square home slice :)

        myPencil.forward(150);

        myPencil.turnLeft();

        myPencil.forward(200);



        myPencil.backward(100);
        myPencil.turnLeft();
        myPencil.up();
        myPencil.move(25);            //Door
        myPencil.down();
        myPencil.drawRect(30, 50);


        myPencil.up();
        myPencil.move(125);
        myPencil.turnLeft();
        myPencil.forward(100);
        myPencil.down();
        myPencil.move(-99,240);
        myPencil.move(130,31);
        myPencil.forward(10);

      //  myPencil.move( 1, 1);
    }



        public static void main (String[]args){
        DrawHouse house = new DrawHouse();
        house.draw();
    }
    }




