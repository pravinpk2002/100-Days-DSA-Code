package day1;

public class Patterns {
    int size;


//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
    void pattern1(){
        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    void pattern2(){
        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <=(size+1)- i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
//                            *
//                          * *
//                        * * *
//                      * * * *
//                    * * * * *
    void pattern3(){
        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <=size-i ; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

//                            *
//                          * * *
//                        * * * * *
//                      * * * * * * *
//                    * * * * * * * * *
    void pattern4(){
        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <=size-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i+i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *
    void pattern5(){
        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*size)+1 -(i+i) ; k++) {
                System.out.print("* ");
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
