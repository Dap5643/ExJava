public class Ex102 {
    public static void main(String[] args) {
        int ar4[] = new int[]{10, 20, 33, 44, 23, 10};
        int cntrr10 = 0;
        int cntr30 = 0;
        for(int i = 0; i < ar4.length; i++) {
            if (ar4[i] == 10)
                cntrr10++;
            else if (ar4[i] == 30)
                cntr30++;
        }
        System.out.println("10 appears " + cntrr10 + " times");
        System.out.println("30 appears " + cntr30 + " times");
    }
    }

