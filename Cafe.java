import java.util.Scanner;
class Cafe {
    public static void main(String[] args) {
        int bill=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("May I Know Your Good Name ?");
        String name=sc.nextLine();
        System.out.println("Hey "+name+" would you like to take order. : ");
        int loop=0;
        while(loop!=1){
        System.out.println("The following Menu Items");
        System.out.println("(1) Tea");
        System.out.println("(2) Coffee");
        System.out.println("(3) Sandwitch");
        System.out.println("(4) Pizza");
        System.out.println("(5)Want to Add more or exit");
        int choice1=sc.nextInt();
        
        switch(choice1){
           
            case 1:
            int repeat1=0;
            while(repeat1!=1){ System.out.println("Here're More Such Flawers");
            System.out.println("(1) Regular Chai             Price:10rs/-");
            System.out.println("(2) Ilaichi Chai             Price:15rs/-");
            System.out.println("(3) Masala Chai              Price:20rs/-");
            System.out.println("(4) Bhopali Chai             Price:25rs/-");
            System.out.println("(5) Add more Items or exit");
            
            System.out.print("Enter your choice : ");
            int chai=sc.nextInt();
            switch(chai){
            case 1 : System.out.print("Enter Quantity : ");
                     int qun1=sc.nextInt();
                     qun1=10*qun1;
                     bill+=qun1;
            break; 
            case 2: System.out.print("Enter Quantity : ");
                    int qun2=sc.nextInt();
                    qun2=15*qun2;
                    bill+=qun2;
            break;
            case 3: System.out.print("Enter Quantity : ");
                int qun3=sc.nextInt();
                qun3=20*qun3;
                bill+=qun3;
            break;
            case 4: System.out.print("Enter Quantity : ");
                int qun4=sc.nextInt();
                qun4=25*qun4;
                bill+=qun4;
            break;
            case 5:
                    System.out.print("(1) Add more  ");
                    System.out.print("(2) Exit ");
                    int add=sc.nextInt();
                  if(add==1){
                    repeat1=0;
                  }else{
                    repeat1=1;
                  }
            break;
            default : System.out.println("***Choose Options Wisely***");
        }
    }
      break;
      case 2:  int repeat2=0;
      while(repeat2!=1){ System.out.println("Here're More Such Flawers");
      System.out.println("(1) Espresso Coffee               Price:100rs/-");
      System.out.println("(2) Cappuccino Coffee             Price:150rs/-");
      System.out.println("(3) Latte Coffee                  Price:160rs/-");
      System.out.println("(4) Cold Brew                     Price:200rs/-");
      System.out.println("(5) Add more Items or exit ");
      System.out.print("Enter your choice : ");
      int coffee=sc.nextInt();
      switch(coffee){
      case 1 : System.out.print("Enter Quantity : ");
               int qun1=sc.nextInt();
               qun1=100*qun1;
               bill+=qun1;
      break; 
      case 2: System.out.print("Enter Quantity : ");
              int qun2=sc.nextInt();
              qun2=150*qun2;
              bill+=qun2;
      break;
      case 3: System.out.print("Enter Quantity : ");
          int qun3=sc.nextInt();
          qun3=160*qun3;
          bill+=qun3;
      break;
      case 4: System.out.print("Enter Quantity : ");
          int qun4=sc.nextInt();
          qun4=200*qun4;
          bill+=qun4;
      break;
      case 5:
              System.out.print("(1) Add more ");
              System.out.print("(2) Exit ");
              int add=sc.nextInt();
            if(add==1){
              repeat2=0;
            }else{
              repeat2=1;
            }
      break;
      default : System.out.println("***Choose Options Wisely***");
  }
}
     break;
     case 3: int repeat3=0;
     while(repeat3!=1){ System.out.println("Here're More Such Flawers");
     System.out.println("(1) Grilled Cheese Sandwitch                Price:120rs/-");
     System.out.println("(2) Chicken Sandwitch                       Price:150rs/-");
     System.out.println("(3) Veggie Panini                           Price:160rs/-");
     System.out.println("(4) Club Sandwitch                         Price:210rs/-");
     System.out.println("(5) Add more Items or exit ");
     System.out.print("Enter your choice : ");
     int sand=sc.nextInt();
     switch(sand){
     case 1 : System.out.print("Enter Quantity : ");
              int qun1=sc.nextInt();
              qun1=120*qun1;
              bill+=qun1;
     break; 
     case 2: System.out.print("Enter Quantity : ");
             int qun2=sc.nextInt();
             qun2=150*qun2;
             bill+=qun2;
     break;
     case 3: System.out.print("Enter Quantity : ");
         int qun3=sc.nextInt();
         qun3=160*qun3;
         bill+=qun3;
     break;
     case 4: System.out.print("Enter Quantity : ");
         int qun4=sc.nextInt();
         qun4=210*qun4;
         bill+=qun4;
     break;
     case 5: 
             System.out.print("(1) Add more ");
             System.out.print("(2) Exit ");
             int add=sc.nextInt();
           if(add==1){
             repeat3=0;
           }else{
             repeat3=1;
           }
     break;
     default : System.out.println("***Choose Options Wisely***");
 }
}
  break;
   case 4:  int repeat4=0;
   while(repeat4!=1){ System.out.println("Here're More Such Flawers");
   System.out.println("(1) Margherita Pizza                   Price:200rs/-");
   System.out.println("(2) Veggie Pizza                       Price:250rs/-");
   System.out.println("(3) Pepperoni Pizza                    Price:300rs/-");
   System.out.println("(4) Chicken  Tikka Pizza               Price:450rs/-");
   System.out.println("(5) Add more Items or exit");
   System.out.print("Enter your choice : ");
   int pizza=sc.nextInt();
   switch(pizza){
   case 1 : System.out.print("Enter Quantity : ");
            int qun1=sc.nextInt();
            qun1=200*qun1;
            bill+=qun1;
   break; 
   case 2: System.out.print("Enter Quantity : ");
           int qun2=sc.nextInt();
           qun2=250*qun2;
           bill+=qun2;
   break;
   case 3: System.out.print("Enter Quantity : ");
       int qun3=sc.nextInt();
       qun3=300*qun3;
       bill+=qun3;
   break;
   case 4: System.out.print("Enter Quantity : ");
       int qun4=sc.nextInt();
       qun4=450*qun4;
       bill+=qun4;
   break;
   case 5: System.out.print("(1) Add more ");
           System.out.print("(2) Exit ");
           int add=sc.nextInt();
         if(add==1){
           repeat4=0;
         }else{
           repeat4=1;
         }
   break;
   default : System.out.println("***Choose Options Wisely***");
}
}
 case 5 : System.out.print("(1) Add nore ");
          System.out.print("(2) Exit ");
          int add=sc.nextInt();
          if(add==1){
        loop=0;
        }else{
        loop=1;
}
 break;
 default : System.out.println("***Choose Options Wisely***");
    }
    
    }
  System.out.println("Your Bill : "+bill);
  System.out.println("Thank you for visiting");
  }
}
