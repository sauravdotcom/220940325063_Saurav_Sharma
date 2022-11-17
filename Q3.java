class Shape{
    void draw(){
        System.out.println("Shape is drawing");
    }
    void erase() {
        System.out.println("Shape is Erasing");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle is drawing");
    }
    void erase() {
        System.out.println("Circle is Erasing");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle is drawing");
    }
    void erase() {
        System.out.println("Triangle is Erasing");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Shape is drawing");
    }
    void erase() {
        System.out.println("Shape is Erasing");
    }
}
public class Q3 {
    public static void main(String[] args){
        Shape a = new Circle();
        Shape b = new Triangle();
        Shape c = new Square();
        a.draw();
        a.erase();
        b.draw();
        b.erase();
        c.draw();
        c.erase();
    }
}
