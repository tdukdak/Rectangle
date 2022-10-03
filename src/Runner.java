public class Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(80, 100);
        Rectangle rect2 = new Rectangle(50);
        Rectangle rect3 = new Rectangle();

        rect3 = rect1;
        rect1 = rect2;
        rect1.setLength(60);

        Rectangle rect4 = rect3;
        rect3.setWidth(70);
        rect3 = rect1;
        rect3.setLength(40);
        rect2.setWidth(90);

        System.out.println(rect1.area());
        System.out.println(rect2.area());
        System.out.println(rect3.area());
        System.out.println(rect4.area());
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);




    }
}
