public class Rectangle {
    double height;
    double width;

    void displayDimensions(){
        System.out.println("height: "+height+" width: "+width);
    }
    void perimeter(){
        double perimeter = height*2 + width*2;
        System.out.println("perimeter: "+perimeter);
    }
    void surfaceArea(){
        double surfaceArea = height * width;
        System.out.println("surface area: "+surfaceArea); 
    }
}
