package PracticeDemo90;

public class primeNumbers<n> {
    public static void main(String[]args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 0; i < 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--)
                if (i % num == 0) {
                    counter = counter + 1;
                }


            if (counter == 2) {
                primeNumbers = primeNumbers + i + "";
                System.out.println("Prime numbers between 1 to 100:");
                System.out.println(primeNumbers);
            }

        }


    }
}

