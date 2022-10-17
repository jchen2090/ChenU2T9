public class CricleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1.getInfo());

        circle1.setRadius(9.2);
        System.out.println(circle1.getInfo());

        Circle circle2 = new Circle(10.0);
        System.out.println(circle2.getInfo());

        circle2.setRadius(14.2);
        System.out.println(circle2.getInfo());
    }
}
