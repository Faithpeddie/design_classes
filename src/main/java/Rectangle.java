public class Rectangle {

    //properties ((Label))
   private int length;
   private int width;

    // constructor ((facts))
    public Rectangle (int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
    }

    //first behaviour ((method))
    public int generateArea(){
        return length * width;
    }

    //2nd behaviour
    public boolean isSquare(){
        return length == width;
    }

}


