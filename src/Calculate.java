import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (Например 2 + 2): ");

        String input = scanner.nextLine();
        String [] parts = input.split(" ");

        if (parts.length !=3) {
            throw new IllegalArgumentException("Неверный ввод! Используйте формат 'a оператор b'.");
        }

        int result = getResult(parts);

        System.out.println("Результат: " + result);
    }

    private static int getResult(String[] parts) {
        int a = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно.");
        }

        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Неправильная операция! Используйте +, -, * или /.");
        };
    }

}
