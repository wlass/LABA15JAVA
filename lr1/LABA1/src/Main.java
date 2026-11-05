import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите номе задания..1,2,3. (0 - Выход.)     - ");
            int chois = sc.nextInt();
            switch (chois) {
                case 1:
                    System.out.println("Задание 1. Перевести градусы Кельвины в Цельсии");
                    System.out.print("Введите градусы Кельваина - ");
                    double gradus = sc.nextDouble();
                    System.out.println("Ваши " + gradus + "K в Цельсии = " + (gradus - 273.15) + "°C");
                    break;
                case 2:
                    System.out.println("Задание 2. Проверить, является ли число кратным 7 или 11, но не одновременно.");
                    System.out.print("Ввидеите число для проверки - ");
                    double number = sc.nextDouble();
                    if ((number % 7 == 0) && (number % 11 == 0)) {
                        System.out.println("Число одновременно делится и на 11 и на 7..((");
                    } else if (number % 7 == 0) {
                        System.out.println("Ваше число делится на 7!");
                    } else if (number % 11 == 0) {
                        System.out.println("Ваше число делится на 11!");
                    } else {
                        System.out.println("Ваше число не делится на 7 или 11");
                    }
                    break;
                case 3:
                    System.out.println("Задание 3. Найти максимальную цифру в числе.");
                    System.out.print("Введите число - ");
                    int num = sc.nextInt();
                    while (num > -10 && num < 10) {
                        System.out.print("Введите число, а не цифру - ");
                        num = sc.nextInt();
                    }
                    int max = 0;
                    int a;
                    while (num != 0) {
                        a = Math.abs(num % 10);
                        if (a > max) {
                            max = a;
                        }
                        num = num / 10;
                    }
                    System.out.println("Максимальная цифра в числе = " + max);
                    break;
                case 4:
                    System.out.println("Введите страну - ");
                    String cont=sc.next();
                    switch (cont){
                        case "Беларусь":
                            System.out.println("Минск");break;
                        case "Россия": System.out.println("Москва"); break;
                        default: System.out.print("БРЕД!!");
                    }
                case 0:
                    return;
                default:
                    System.out.println("Вы ввели бред.");
                    break;
            }
        }
    }
}