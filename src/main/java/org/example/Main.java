import java.util.Scanner;

 class DivisibleBy7BetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;
        System.out.println("Numbers between " + num1 + " and " + num2 + " divisible by 7:");

        for (int i = num1; i <= num2; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of numbers divisible by 7: " + sum);
        scanner.close();
    }
}
