package day2;

public class Patterns {
    int size;

//    A
//    A B
//    A B C
//    A B C D
//    A B C D E
    void pattern1(){
        for (int i = 1; i <= 5; i++) {
            char ch='A';
            for (int j = 1; j <= i ; j++,ch++) {
                System.out.print(ch+" ");

            }
            System.out.println();

        }
    }

//    A A A A A
//    A       A
//    A       A
//    A       A
//    A A A A A
    void pattern2(){

        char ch='A';
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(j==1 || j==size || i==1 || i==size)
                    System.out.print(ch+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
//            A
//          A B A
//        A B C B A
//      A B C D C B A
//    A B C D E D C B A
    void pattern3(){
        for (int i = 1; i <= size; i++) {

            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }

//    A
//    B B
//    C C C
//    D D D D
//    E E E E E
    void pattern4(){

        char ch='A';
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }

//    A B C D E
//    A B C D
//    A B C
//    A B
//    A
    void pattern5(){

        for (int i = 1; i <= size; i++) {
            char ch='A';
            for (int j = 0; j <= size-i; j++,ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {

        Patterns p=new Patterns();
        p.size=5;
//        p.pattern1();
//        p.pattern2();
//        p.pattern3();
//        p.pattern4();
        p.pattern5();

    }
}
