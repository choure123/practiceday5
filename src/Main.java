public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a value for N as a command-line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30.");
            return;
        }

        for (int i = 0; i <= N; i++) {
            int powerOfTwo = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}

class repeat {

        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please provide a value for N as a command-line argument.");
                return;
            }

            int N = Integer.parseInt(args[0]);

            if (N < 0 || N >= 31) {
                System.out.println("N should be between 0 and 30.");
                return;
            }

            int i = 0;
            while (i != N) {
                if (i == 31) {
                    System.out.println("2^" + i + " = Value exceeds integer limit");
                    break;
                }
                int powerOfTwo = 1 << i;
                System.out.println("2^" + i + " = " + powerOfTwo);
                i++;
            }
        }
    }





