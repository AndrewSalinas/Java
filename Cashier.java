public class Cashier extends CheckMail{
    public static void main(String args[]){
        CheckMail box1 = new CheckMail(3,14,6,76);
        CheckMail box2 = new CheckMail();
        box1.findLength();  //This is how you activate CheckMail
        box1.output();
    }
}
