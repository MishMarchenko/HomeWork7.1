import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What homework part do you want to check?");
        System.out.println("Choose 1,2,3");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                firstPart();//Надеюсь ничего, что в отдельном методе. по домашке в main требовалось, но метод в мейне и запускается, просто для удобства сделал,
                            // но можно и сразу в мейне организовать
                break;
            case 2:
                secondPart();
                break;
            case 3:
                thirdPart();
                break;
            default:
                System.out.println("I'm sorry, I've only done the required part so far :(");
        }
    }
    static void firstPart(){
        ClassA.Computers hp = new ClassA.Computers("Windows", 256);
        ClassA.Computers mac = new ClassA.Computers("Ventura", 256);
        System.out.println(hp);
        System.out.println(mac);
    }
    static void secondPart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time from 1 to 24");
        int i = scanner.nextInt();
        if (i < 7 && i > 0){
            System.out.println(Time.Sleep.getTime());
        }else if (i > 6 && i < 13) {
            System.out.println(Time.Breakfast.getTime());
        } else if (i > 12 && i < 18) {
            System.out.println(Time.Lunch.getTime());
        } else if (i > 17 && i < 25) {
            System.out.println(Time.Dinner.getTime());
        }else {
            System.out.println("Incorrect time");
        }
    }
    static void thirdPart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println("I'm simple, so I can only do simple operations!");
        System.out.println("So let start!");
        System.out.println();
        System.out.println("Add first number");
        int a = scanner.nextInt();
        System.out.println("Add second number");
        int b = scanner.nextInt();
        System.out.println("Add calculation operator(+,-,*,/)");
        System.out.println("Or type 'p' to raise in pow the first number, where the second number is the power");
        char op = scanner.next().charAt(0);

        if (op == '+'){
            System.out.println(Calc.sum.action(a, b));
        } else if (op == '-') {
            System.out.println(Calc.subtract.action(a, b));
        } else if (op == '*') {
            System.out.println(Calc.multiply.action(a, b));
        } else if (op == '/') {
            System.out.println(Calc.divide.action(a, b));
        } else if (op == 'p') {
            System.out.println(Calc.pow.action(a, b));
        }else {
            System.out.println("Sorry! I don't know this operator");
        }
    }
}