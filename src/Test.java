import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("输入算式：");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        String opration = input.next();
        double num2 = input.nextDouble();
        JS(num1, opration, num2);
    }

    public static void JS(double num1, String opration, double num2) {
        char oprate = opration.charAt(0);
        double result = 0.0;
        switch (oprate) {
            case '*':
                result = num1 * num2;
                System.out.println("计算结果为：" + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("计算除数为零无法计算：");
                    break;
                } else {
                    result = num1 / num2;
                }
                System.out.println("计算结果为：" + result);
                break;
            case '+':
                result = num1 + num2;
                System.out.println("计算结果为：" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("计算结果为：" + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("计算结果为：" + result);
                break;
            default:
                System.out.println("输入错误，运算式退出！");
                break;
        }
    }
}