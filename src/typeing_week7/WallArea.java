package typeing_week7;

public class WallArea {
    // Instance variables
    double width;
    double height;
    // Default Constructor
    WallArea(){

    }
    // Parameterized Constructor
    WallArea(double width, double height){
       if(width < 0) {
           this.width = 0;
       }else
           this.width = width;

       if(height < 0) {
           this.height = 0;
       }else {
           this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        if(width < 0){
          this.width = 0;
        }else
            this.width = width;
    }
    public void setHeight(double height){
        if(height < 0){
           this.height = 0;
        }else
            this.height = height;
    }
    public double getArea(){
        return (getHeight() * getWidth());
    }

    public static void main(String[] args) {
    WallArea wall = new WallArea();
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
