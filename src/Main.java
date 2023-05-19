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


class leepyear {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a year as a command-line argument.");
            return;
        }

        int year = Integer.parseInt(args[0]);

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}



