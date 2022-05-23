public class cycles {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int number2 = 10; number2 > 0; number2 = number2 - 1) {
            System.out.print(number2 + " ");
        }
        System.out.println();
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        int date = 2021;
        int date1821 = date - 200;
        int date2121 = date + 100;
        for (int i = 0;i < date2121; i = i + 79) {
            while (i > date1821 && i < date2121) {
                System.out.println(i);
                i = i + 79;
            }
        }
        }
    }

