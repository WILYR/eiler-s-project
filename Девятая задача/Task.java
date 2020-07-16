public class Task {
    public static void main(String[] args) {
        int a, b, c, answer = 0;
        for (a = 1; a < 2000; a++) {
            for (b = 1; b < 2000; b++) {
                for (c = 1; c < 2000; c++) {
                    if (a < b && b < c) {
                        if (c * c == a * a + b * b) {
                            answer = a + b + c;
                            System.out.println("a = " + a + " b = " + b + " c = " + c + " answer = " + answer);
                            if (answer == 1000) {
                                System.out.println("");
                                System.out.println("A N S W E R");
                                System.out.println("");
                                System.out.println("a = " + a + "b = " + b + "c = " + c);
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                }
                if (answer == 1000) {
                    break;
                }
            }
            if (answer == 1000) {
                break;
            }
        }
    }
}