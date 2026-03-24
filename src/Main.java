

public class Main {
    //

     public static void main(String[] args) {

         for(int i=1;i<=6;i++){

             for(int j=1;j<i;j++){
                 System.out.print("  ");

             }
             for(int j=6;j>=i;j--){
                 System.out.print(j+"  ");

             }
             System.out.println();

         }
     }

}
























/*

=================================================/Payramid Patterns/=================================================

        public static void main(String[] args) {

       for(int i=1;i<=4;i++){

           for(int j=4; j>i; j--){
               System.out.print("   ");

           }
           for(int j=1; j<=i; j++){
               System.out.print(j+"  ");
           }

           for(int j=i-1; j>=1; j--){
                System.out.print(j +"   ");

           }
             System.out.println();

       }

   }
========================================================================================================================

    public static void main(String[] args) {

        for(int i=4; i>=1; i--){

            for(int j=4; j>i; j--){
                System.out.print("   ");

            }
            for(int j=1; j<=i; j++){
                System.out.print(j+"  ");
            }
            for(int j = i - 1; j >= 1; j--){
                System.out.print(j+"  ");
            }
            System.out.println();

        }

    }

 ========================================================================================================================

    public static void main(String[] args) {

         int rows =4;

         for(int i=1;i<=rows;i++){

             for(int j=1;j<=i;j++){
                 System.out.print(j+"  ");

             }
             for(int j=1;j<=(rows-i)*2;j++){
                 System.out.print("   ");

             }
             for(int j=i;j>=1;j--){
                 System.out.print(j+"  ");

             }
             System.out.println();

         }

     }


========================================================================================================================


        public static void main(String[] args) {

                for(int i=1;i<=4;i++){

                    for(int j=4; j>i; j--){
                        System.out.print("   ");

                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*  ");

                    }
                    for(int j=i-1; j>=1; j--){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }

            }

























=================================================/Patterns/=================================================

public static void main(String[] args) {
        for(int i=1; i<=4;i++){
            for(int j=1; j<=4; j++){
                System.out.print( i+" ");
            }
            System.out.println();
        }
    }
========================================================================================================================

     Patterns
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(j+ " ");

            }
            System.out.println();

        }
    }
========================================================================================================================

     Patterns
   public static void main(String[] args) {

       for(int i=1; i<=4;i++){

           for(int j=1; j<=4; j++){
               System.out.print("* ");

           }
           System.out.println();
       }

   }
========================================================================================================================

        public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            for(int j=1;j<=4;j++){
                     System.out.print(i+"  ");
            }
            System.out.println();

        }

    }

   ========================================================================================================================

        public static void main(String[] args) {

        for(int i=1;i<=4;i++){

            for(int j=4;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }

  ========================================================================================================================

     public static void main(String[] args) {

        for(int i=1;i<=4;i++){

            if (i%2!=0){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();

            }else{
                for(int j=i;j>=1;j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        }

    }

 ========================================================================================================================


     public static void main(String[] args) {

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){

                if(j==1){
                    System.out.print(j);

                }else{
                    System.out.print(" # "+j);
                }

            }
            System.out.println();

        }

    }

========================================================================================================================

        public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){

                if(i==j){
                    System.out.print(" * ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();

        }
    }


========================================================================================================================

           public static void main(String[] args) {

         for(int i=1;i<=4;i++){
             for(int j=1;j<=4;j++){

                 if(i==1 || i==4 || j==1 || j==4){
                     System.out.print("* ");
                 }else {
                     System.out.print("  ");
                 }
             }
             System.out.println();

         }

     }

========================================================================================================================

                    Patterns
                        public static void main(String[] args) {
                            for(int i=1;i<=5;i++){

                                for(int j=1;j<=5;j++){

                                    if(i==j || i+j==6){
                                        System.out.print("* ");
                                    }else{
                                        System.out.print("- ");
                                    }

                                }
                                System.out.println();
                            }

                    }
========================================================================================================================

                public static void main(String[] args) {

                            int size =7, num =4;

                            for(int i =0;i<size;i++){

                                for(int j =0;j<size;j++){
                                    int result = num-Math.min(Math.min(i,j),Math.min(size-i-1,size-j-1));
                                    System.out.print(result+ " ");

                                }
                                System.out.println();
                            }

                        }
========================================================================================================================
                        public static void main(String[] args) {
                        for(int i=1; i<=5;i++) {
                             for(int j=1;j<=5;j++){

                                 System.out.print("* ");

                             }
                             System.out.println();
                        }

                    }

========================================================================================================================

                              Patterns
                                public static void main(String[] args) {
                                    for(int i=1;i<=5;i++){

                                        for(int j=1;j<=i;j++){
                                            System.out.print("*  ");
                                        }
                                        System.out.println();
                                    }
                                }
========================================================================================================================
 public static void main(String[] args) {
         for(int i=1; i<=5;i++){

             for(int j=1; j<=i;j++){
                 System.out.print(i+" ");

             }
             System.out.println( );
         }

     }

========================================================================================================================

                      public static void main(String[] args) {

                        for(int i=5; i>=1; i--) {
                            for(int j=1; j<=i; j++) {

                                System.out.print(i+"  ");
                            }
                            System.out.println();

                        }

                   }
========================================================================================================================
        public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
========================================================================================================================































=================================================/for-Loop/=================================================

//Print numbers from 1 to 10 using a for loop.

   public static void main(String[] args) {

       Scanner Scn = new Scanner(System.in);

       System.out.print("Enter Number");
       int num = Scn.nextInt();

       for(int i =1; i<=10;i++){
           if(num%i==0){

           }
           System.out.println(i);

       }

   }

========================================================================================================================

              // Print numbers from 1 to 50 Using for-loop.

                public static void main(String[] args) {

                    int i = 1;

                    for(int j=0;j<=50; j++){

                        if(i%1==0){
                            System.out.println(j);
                        }

                    }

                }

 ========================================================================================================================

               // prime number
                    public static void main(String[] args) {

                        Scanner scn = new Scanner(System.in);
                        System.out.println("Enter Number:");
                        int num = scn.nextInt();

                        boolean prime = true;

                        for(int i=2;i<=num/2; i++){
                            if(num%i==0){
                                prime = false;
                                break;
                            }
                        }
                        if(prime){
                            System.out.print("Prime Number");

                        }else
                            System.out.print("Not Prime Number");

                    }

========================================================================================================================

                 public static void main(String[] args) {

                    int wellLength = 10;
                    int Jumps = 2;
                    int  rolback =1;

                    int currentPosition = 0;
                    int days =0;

                    while(currentPosition<wellLength) {

                        currentPosition += Jumps;
                        if(currentPosition>wellLength) {

                            break;
                        }
                        currentPosition -= rolback;
                        days++;
                    }
                    System.out.println("In " +days+" days Frog will come out from well");

                }

========================================================================================================================

                  //Print numbers from 10 to 1 (reverse order)
                        public static void main(String[] args) {

                            int i = 1;

                            for(i =10; i>=1; i--){
                                System.out.println(i);

                            }
                        }


                         // Palindrome Number.

                public static void main(String[] args) {

                    Scanner Scn = new Scanner(System.in);
                    System.out.print("Enter Number:");
                    int num = Scn.nextInt();

                    int temp = num;

                    int rem, rev = 0;
                    while(num>0){
                        rem = num%10;
                        rev  = rev*10+rem;
                        num = num/10;
                    }
                    if(temp==rev){
                        System.out.println("Is Palindrome");
                    }else{
                        System.out.println("Is Not Palindrome");
                    }

                }

========================================================================================================================

                //Fabinocie;

                        public static void main(String[] args) {

                            Scanner Scn  = new Scanner(System.in);
                            System.out.print("Enter Number:");
                            int num = Scn.nextInt();

                            int a =0,b = 1,c;
                            System.out.print(a+" " +b+" ");
                            for(int i=2;i<=num;i++){
                                c = a +b;
                                System.out.print(c+" ");
                                a=b;
                                b=c;


                            }



                        }

========================================================================================================================

                 //How many PrimeNumbers;
                public static void main(String[] args) {

                    for (int num=2; num<=100; num++) {

                        boolean prime = true;
                        for(int i=2; i<=num/2; i++) {
                            if(num%i==0) {
                                prime = false;
                                break;
                            }
                        }
                        if(prime == true) {
                            System.out.println(num);
                        }
                    }

                }

========================================================================================================================

                        // Reverse num;
                    public static void main(String[] args) {

                        Scanner scn  = new Scanner(System.in);
                        System.out.print("Enter Number:");
                        int num = scn.nextInt();

                        int rem,rev = 0;
                        while(num>0){
                            rem = num%10;
                            rev = rev*10+rem;
                            num = num/10;


                        }
                        System.out.println("The Reverse of "+num+" is "+rev);



                    }

========================================================================================================================

                    Print numbers from 1 to 100 In for-loop.
                        public static void main(String[] args) {
                            int i = 1;

                            for(i = 0; i<=100;i++){
                                System.out.println(i);

                            }


                        }

========================================================================================================================
                     // 1-100
                        public static void main(String[] args) {

                            Scanner Scn  = new Scanner(System.in);
                            System.out.print("Enter Number:");
                            int num = Scn.nextInt();
                            for(int i = 1; i<=100; i++){
                                if(i%5==0){
                                    System.out.println(i);

                                }
                            }


                        }

     ==================================================================================================

                        //Print numbers 1 to 100 but skip numbers divisible by 3

                            public static void main(String[] args) {

                                //Scanner Scn = new Scanner(System.in);
                                //System.out.print("Enter Number:");
                                //int num = Scn.nextInt();
                                int i = 1;

                                for(int j = 1; i<=100; i++){
                                    if(i%3!=0){
                                        System.out.println(i);


                                    }
                                }

                            }

   ==================================================================================================

                           // Print numbers 1 to 100 skipping every 4th number

                                    public static void main(String[] args) {

                                        for (int i =1; i<=100;i++){
                                            if(i%4==0){
                                                System.out.println(i);
                                            }

                                        }
                                    }

      ==================================================================================================
                                 // Amstrong Number

                            public static void main(String[] args) {
                                Scanner Scn = new Scanner(System.in);
                                System.out.print("Enter Number:");

                                int num = Scn.nextInt();

                                int temp = num;

                                int rem, sum = 0;

                                while (num > 0) {
                                    rem = num % 10;
                                    sum = sum+ rem* rem * rem;
                                    num = num / 10;

                                }
                                if(temp == sum) {
                                    System.out.println(sum+" Is Amstrong Number");

                                }else  {
                                    System.out.println(sum+" Is Not Amstrong Number");
                                }
                            }


   ==================================================================================================

                       // Count odd numbers between 1 and 100

                            public static void main(String[] args) {

                                int count = 0;
                                for(int i =0; i<=100; i++) {
                                    if(i%2==0) {
                                        count++;
                                    }
                                }
                                System.out.println(count);

                            }

  ==================================================================================================
              //Print numbers from 50 to 100. in for-loop
                    public static void main(String[] args) {

                        int i =1;

                        for(i=50;i<=100;i++){
                            System.out.println(i);
                        }
                    }


     ==================================================================================================
                     Print numbers 100 to 1 skipping every 5th number

                        public static void main(String[] args) {

                            for(int i=100;i>=1;i--){
                                if(i%5==0){
                                    continue;

                                }
                                System.out.println(i);

                            }




                        }
     ==================================================================================================

                    //Count even numbers between 1 and 100
                            public static void main(String[] args) {

                                //int i = 1;
                                int count = 0;

                                for(int i= 1; i<=100; i++){
                                    if(i%2==0){
                                        count++;
                                    }

                                }
                                System.out.println(count);

                            }


    ==================================================================================================


                    //Print even numbers between 1 and 100

                        public static void main(String[] args) {

                            for(int i=1;i<=100;i++){
                                System.out.println(i);

                            }


                        }



  ==================================================================================================

public static void main(String[] args) {

        Scanner Scn  = new Scanner(System.in);
        System.out.print("Enter Amstrong Number: ");
        int num = Scn.nextInt();
        int temp =  num ;

        int rem = 0, sum = 0;

        while(num>0){
            num = num%10;
            sum = sum + rem* rem* rem;
            num = num /10;

        }

        if( temp == sum ){
            System.out.println( num + " It is Amstrong Number");
        }else {
            System.out.println( num + " It is not a Amstrong Number");
        }



    }
         ==================================================================================================

                          public static void main(String[] args) {
                           for(int i=0; i<=20; i++){
                               if(i%2!=0){
                                   System.out.println(i);
                               }

                           }

                       }

        ==================================================================================================


    Palindrome.
    public static void main(String[] args) {

        Scanner Scn = new Scanner(System.in);
        System.out.print(" Enter Number:");
        int num = Scn.nextInt();

        int temp = num;

        int rem, rev =0;

        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;

        }

        if(temp==rev){
            System.out.println( " This is Palindrome " );

        }else{
            System.out.println(" This is not Palindrome ");
        }


    }



    ==================================================================================================

                        //Reverse number using While-loop

                            public static void main(String[] args) {

                                Scanner scn = new Scanner(System.in);
                                System.out.print(" Enter Number:");
                                int num = scn.nextInt();

                                int rem,rev= 0;
                                while (num > 0) {
                                    rem= num%10;
                                    rev = rev * 10 + rem;
                                    num = num/10;
                                }
                                System.out.print(rev);

                            }









=========================================== do-While Loop ==========================================
    // Write a program to print numbers from 1 to 10 using a do-while loop.

            public static void main(String[] args) {
                int i = 1;

                do{
                    System.out.println(i);
                    i++;

                }while(i<=10);

            }
  ==================================================================================================

           // Write a program to print numbers from 10 to 1 using a do-while loop

                        public static void main(String[] args) {
                            int i= 10;
                            do{
                                System.out.println(i);
                                i--;

                            }while(i>=0);


                        }
   ==================================================================================================
       // Write a program to find the sum of numbers from 1 to 10 using a do-while loop.
                public static void main(String[] args) {

                    int i = 1;
                    int sum = 0;
                    do{
                        sum = sum + i;
                        System.out.println("sum Is " +sum);
                        i++;
                    }while(i<=10);

                }
      ==================================================================================================

                //Write a program to print numbers from 1 to 20 except 10 using a do-while loop.

                public static void main(String[] args) {
                    int i = 1;

                    do{
                        if(i<=9 || i>=20){
                            System.out.println(i);
                        }
                        i++;

                    }while(i<=20);

                }

    ==================================================================================================

              //Write a program to count numbers from 1 to 100 using a do-while loop
                        public static void main(String[] args) {

                            int i =0;
                            do{
                                System.out.println(i);
                                i++;
                            }while(i<=100);

                        }
   ==================================================================================================
               // Write a program to print squares of numbers from 1 to 10 using a do-while loop.

                        public static void main(String[] args) {

                            int i = 1;
                            int square = i * i;
                            do{
                                square = square * i;
                                System.out.println(" Square Is "+square);
                                i++;
                            }while(i<=10);

                        }
      ==================================================================================================

                // Write a program to reverse a number using a do-while loop

                public static void main(String[] args) {

                    Scanner scn  = new Scanner(System.in);

                    System.out.print("Enter Number:");
                    int num = scn.nextInt();

                    int reverse = 0;
                    int digit;

                    do{
                        digit = num % 10;
                        reverse = reverse * 10 + digit;
                        num = num/10;
                    }while(num!=0);

                    System.out.println("You Entered Reversed Number Is:"+reverse);


                }
    ==================================================================================================

            //Write a program to print numbers from 1 to 20 but stop when the number becomes 15.

                public static void main(String[] args) {
                    int i = 1;
                    do{
                        if(i<=15 || i>=20){
                            System.out.println(i);
                        }
                        i++;
                    }while(i<=20);

                }


  ==================================================================================================

                        // Write a program to print even numbers from 1 to 20 using a do-while loop

                            public static void main(String[] args) {
                                int i = 2;
                                do{
                                    if (i%2==0){
                                        System.out.println(i);
                                    }
                                    i++;

                                }while(i<=20);

                            }

     ==================================================================================================

                // Write a program to print odd numbers from 1 to 20 using a do-while loop.

                           public static void main(String[] args) {

                              int  i = 20;
                               do{
                                   System.out.println(i);
                                   i--;

                               }while(i>=1);

                           }

      ===================================================================================================

                           //7- table by using do-while loop

                                public static void main(String[] args) {
                                    int num1 = 1;
                                    int num2 = 7;

                                    do{
                                       System.out.println(num2+ " * " + num1+ " = "+(num2*num1));
                                       num1++;

                                    }while(num1<=10);



                                     }

     ===================================================================================================
                //Write a program to print numbers from 1 to 50 that are divisible by 5 using a do-while loop
                                 public static void main(String[] args) {
                                     int i = 1;
                                     do{
                                         if (i%5==0){
                                             System.out.println(i);
                                         }
                                         i++;

                                     }while(i<=50);


                                 }

 ==================================================================================================
*/








