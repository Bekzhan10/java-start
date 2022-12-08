import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //#1
        ////////////////////////////////////////
        System.out.println("#1");
        findMin(32,27,35);

        //#2
        ////////////////////////////////////////
        System.out.println("#2");
        avgOfThree(15,20,28);

        //#3
        ////////////////////////////////////////
        System.out.println("#3");
        System.out.println("Гласных букв: " + vowelLetters("DarTech123"));
        //#4
        ////////////////////////////////////////
        System.out.println("#4");
        wordCount("Java is good to learn Object Oriented programming.");
        //#5
        ////////////////////////////////////////
        System.out.println("#5");
        twoCount(2222);
        //#5.2
        ////////////////////////////////////////
        System.out.println("#5.2");
        System.out.println(checkIfAllVowel("AEOIS"));
        //#6
        ////////////////////////////////////////
        System.out.println("#6");
        findArea(6);
        //#7
        ////////////////////////////////////////
        System.out.println("#7");
        sumOfDigits(1234);
    }
    public static void findMin(int a, int b, int c){
        int min = Integer.MAX_VALUE;
        if(a<min)
            min = a;
        if(b<min)
            min = b;
        if(c<min)
            min = c;
        System.out.println("Наименьшее значение: " + min);
    }
    public static void avgOfThree(int a,int b, int c){
        System.out.println("Среднее значение: " + ((a+b+c) / 3.0));
    }
    public static int vowelLetters(String word){
        int count = 0;
        word = word.toLowerCase();
        for(char c : word.toCharArray()){
            if(c == 'a' || c == 'o' || c == 'i' || c == 'u' || c == 'e')
                count++;
        }
        return count;
    }
    public static void wordCount(String sentence){
        String[] words = sentence.split(" ");
        System.out.println("Количество слов в строке: " + words.length);
    }
    public static void twoCount(int a){
        int count = 0;
        while (a>0){
            if(a % 10 == 2)
                count++;
            a/=10;
        }
        System.out.println("Цифр 2 в этой числе: " + count);
    }
    public static boolean checkIfAllVowel(String s){
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(c != 'a' && c != 'e' && c != 'o' && c != 'i' && c != 'u')
                return false;
        }
        return true;
    }
    public static void findArea(int length){
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        System.out.println("Площадь пятиугольника равна: " + numberFormat.format((length*length*Math.sqrt(25+10*Math.sqrt(5))/4)));
    }
    public static void sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println("Сумма = " + sum);
    }
}