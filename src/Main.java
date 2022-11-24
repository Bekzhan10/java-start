
public class Main {
    public static void main(String[] args) {
        int length = 5;
        int width = 6;
        if (length == width)
            System.out.println(true);
        else
            System.out.println(false);
        ////////////////////////////////////////////////
//        #2
        int price = 7000;
        if (price > 5000)
            price = price - price / 10;
        System.out.println(price);
        ////////////////////////////////////////////////
//        #3
        int grade = 44;
        if (grade < 25)
            System.out.println("F");
        else if (grade < 45)
            System.out.println("E");
        else if (grade < 50)
            System.out.println("D");
        else if (grade < 60)
            System.out.println("C");
        else if (grade < 80)
            System.out.println("B");
        else
            System.out.println("A");
        ////////////////////////////////////////////////
//        #4
        int e = 12345;
        int f = 0;
        while (e > 0) {
            int temp = e % 10;
            f = f * 10 + temp;
            e = e / 10;
        }
        System.out.println(f);
        ////////////////////////////////////////////////
//        #5
        int num = 5;
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num == 2) {
                flag = 0;
                break;
            }
            if (num % i == 0)
                flag = 1;
        }
        if (flag == 1)
            System.out.println("It is not prime number");
        else
            System.out.println("It is prime number");
        ////////////////////////////////////////////////
//        #6
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ////////////////////////////////////////////////
//        #6.2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ////////////////////////////////////////////////
//        #6.3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9 - i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j < i + 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        ////////////////////////////////////////////////
//        #7
        int a = 10;
        int b = 12;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);

    ////////////////////////////////////////////////
//        #8
    int salary = 5000;
    String workClass = "A";
    switch (workClass){
        case "A": salary = salary + salary / 2;
            break;
        case "B": salary = salary + salary / 4;
            break;
        case "C": salary = salary;
            break;
    }
        System.out.println(salary);
        ////////////////////////////////////////////////
//        #8
        int n = 10;
        if(n==1)
            System.out.print(0);
        else  
            System.out.print(0 + " " + 1);
        int first = 0;
        int sec = 1;
        int third = 1;
        for (int i = 2; i < n; i++) {
            third = first + sec;
            System.out.print(" " + third);
            first = sec;
            sec = third;
        }
    }
}