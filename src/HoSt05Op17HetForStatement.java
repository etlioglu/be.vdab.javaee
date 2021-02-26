public class HoSt05Op17HetForStatement {

    public static void main(String[] args) {

        // 1
        System.out.println("Tussen 450 en 350");
        for (int i = 450; i >= 350; i--) {
            System.out.println(i);
        }

        // 2
        for (int i = 7; i < 200; i += 7) {
            System.out.println(i);
        }

        //for(int i = 0; i < 100000; )

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.println(i);
        }

        for (int i = -10; i <= 10; i++) {
            if (i > 0) {
                System.out.println("+" + i);
            } else {
                System.out.println(i);
            }
        }
/*
        for (int i = -10; i <= 10; i++) {
            (i > 0) ? i+1 : i;

        }

        */

        for(int i = 28; i <10000; i+=28) {
            if (i % 28 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }

        // Priemgetallen
        System.out.println("Priemgetallen");

        for(int i = 2; i < 1000; i++) {
            if (i == 2) {
                System.out.println(i);
            }
            else if (i % 2 == 0) {
                continue;
            } else {

            }
        }
        }

    }
