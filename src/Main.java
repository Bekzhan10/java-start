
public class Main {
    public static void main(String[] args) {
        int c = 10*5;
        System.out.println(c);

        double d = 20/2.5;
        System.out.println(d);

        int length = 15;
        int height = 9;
        int area = length * height;
        int perimeter = (length + height) * 2;

        int x = 2;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        x+=5;
        System.out.println(x);

        boolean isEqual = (25 == 43);
        System.out.println(isEqual);

        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int fahrenheit = 150;
        int celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);

        System.out.println(((451 + 10) % 3 + 5) * 5);

        a = 65;
        b = 80;
        System.out.println(a < 50);
        System.out.println(a < b);
    }
}