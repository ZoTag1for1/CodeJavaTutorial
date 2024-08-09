public class ContRectangle {
    private double length;
    private double width;
    /*
     *      public void SetWidth(double len){
     *  Length = w;
     * }
     *    * public void SetWidth(double w){
     *  width = w;
     * }
     */
    public ContRectangle(){
        length = 1.0;
        width = ;
    }
    public ContRectangle(double len, double w){
        length = len;
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
