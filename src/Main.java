public class Main {
        public static void main(String[] args) {

            taskOneTwo (); // 1 и 2 задание
            taskThree (); // 3 задание
            taskFour (); // 4 задание
        }
        public static void taskOneTwo () {

            // 1 массив
            int [] a = new int []{1, 2, 3};
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                if (i < a.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();

            // 2 массив
            double [] b = {1.57, 7.654, 9.986};
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]);
                if (i < b.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();

            // 3 массив
            byte [] c = {2, 3, 4, 5};
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
                if (i < c.length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println();
        }
        public static void taskThree () {

            // 1 массив
            int [] a1 = new int []{1, 2, 3};
            for (int i = a1.length - 1; i >= 0; i--) {
                System.out.print(a1[i]);
                if (i != 0){
                    System.out.print(", ");
                }
            }
            System.out.println();

            // 2 массив
            double [] b2 = {1.57, 7.654, 9.986};
            for (int i = b2.length - 1; i >= 0; i--) {
                System.out.print(b2[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            // 3 массив
            byte [] c2 = {2, 3, 4, 5};
            for (int i = c2.length - 1; i >= 0; i--) {
                System.out.print(c2[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        public static void taskFour (){
            System.out.println();
            int [] a3 = new int []{1, 2, 3};
            for (int i =0; i < a3.length; i++) {
                if (a3[i] % 2 != 0){
                    a3[i] +=1;
                }
                System.out.print(a3[i]);
                if (i < a3.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }