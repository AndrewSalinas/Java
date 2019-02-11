import gpdraw.*;
public class Benzene
{
        private DrawingTool pencil;
        private SketchPad paper;

        public Benzene(){
                paper = new SketchPad(300,300);
                pencil = new DrawingTool(paper);

        }

        public void drawHexagon(int side){

                int i = 0;
                pencil.up();
                pencil.move(0,side);
                pencil.down();
                pencil.setDirection(330);

                for (i = 0; i < 6 ; i++){
                        pencil.forward(side);
                        pencil.turnRight(60);
                }

        }

        public void drawCir(int radius){pencil.drawCircle(radius);}
        public static void main(String[] args){
                Benzene benOne = new Benzene();
                benOne.drawCir(40);
                benOne.drawHexagon(65);

        }



}