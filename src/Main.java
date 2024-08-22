public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int summ = 0;
        int[] salaries = {100000, 120000, 150000, 170000, 200000};
        for (int i = 0; i < salaries.length; i++) {
            summ += salaries[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n%n", summ);


        System.out.println( "Задача 2");
        int[] salariesTwo = {190000, 120000, 150000, 170000, 200000};
        int min = salariesTwo[0];
        int max = salariesTwo[0];
        for (int i = 0; i <salariesTwo.length; i++) {
            if (max < salariesTwo[i])
            {
                max = salariesTwo[i];
            }
            if (min > salariesTwo[i]){
            min = salariesTwo[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. " +
                "Максимальная сумма трат за неделю составила %s рублей%n%n", min, max);

        System.out.println( "Задача 3");
        int summThree = 0;
        int[] salariesThree = {100000, 120000, 150000, 170000, 200000};
        for (int i = 0; i < salariesThree.length; i++) {
            summThree += salariesThree[i];
        }
        int avg = summThree/salariesThree.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей%n%n", avg);

        System.out.println( "Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1 ; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}

