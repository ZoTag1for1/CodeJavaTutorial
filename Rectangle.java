public class Rectangle {
    private double length;
    private double wirdth;
    private void  setLength(double len){
        length = len;
    }
        public void setWidth(double w){
            wirdth = w;
        }
        public double getLength(){
            return length;
        }
        public double getWidth(){
            return wirdth;
        }
        public double getArea(){
            return length * wirdth;
        }
    }

