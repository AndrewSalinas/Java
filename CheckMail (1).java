//Andrew Salinas, 12/15/18, 2:44AM; I want to die
//Umm side note for when I come back to this, Status Report: HCIM still alive
//but too many bots for mining, still low on cash, TimeScape is alright? idk we'll see
public class CheckMail {

    int length;
    int width;
    int height;
    int weight;
    boolean TallNibba = false;       //Variables
    boolean TooThicc = false;

    public CheckMail(){
        int myLength;
        int myWidth;
        int myHeight;
        int myWeight;

    }
    public CheckMail(int myLength, int myWidth, int myHeight, int myWeight){
        length = myLength;
        width = myWidth;
        height = myHeight;      //simply restating my Variables ^^^
        weight = myWeight;


    }
    public void findLength(){
        int dim1 = length;
        int dim2 = width;
        int dim3 = height;
        if(dim1 < dim2){
            int temp = dim1;
            dim1 = dim2;
            dim2 = temp;
            if(dim1 < dim3){
                temp = dim1;
                dim1 = dim3;
                dim3 = temp;
                System.out.println("Height = " + dim1);

            }
            else{
                System.out.println("Width = " + dim1);
            }
        }
        else{
            if(dim1 < dim3){
                int temp = dim1;
                dim1 = dim3;
                dim3 = temp;
                System.out.println("Height = " + dim1);

            }
            else{
                System.out.println("Length = " + dim1);
            }
        }

        System.out.println("Other two dimensions = " + dim2 + " " + dim3);
        System.out.println("Weight = " + weight);


    }
    public boolean calcCircumference(){
        if(length + (2*(width + height)) > 100){
            TallNibba = true;
        }
        else{
            TallNibba = false;  //This is where we do the "Quick Maffs", as
        }                       //the youngsters say
        return TallNibba;


    }
    public boolean calcWeight(){
        if(weight > 70){
            TooThicc = true;
        }
        else{
            TooThicc = false;       //Decides if too THICC: Determines the weight
        }
        return TooThicc;
    }


    public void output(){
        this.calcCircumference();
        this.calcWeight();
        if (TallNibba && TooThicc){
            System.out.println("Too Thiccy && Too Swole");
        }
        if (!TallNibba && TooThicc){
            System.out.println("Far too thiccy vicky");     //My Printy bois for the variables
        }
        if (TallNibba && !TooThicc){
            System.out.println("Too Swole for us");
        }
        if (!TallNibba && !TooThicc){
            System.out.println("It's Gucci Famerino");
        }

    }

}
