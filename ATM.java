
package s1;

import java.util.Scanner;

public class ATM {
     double balance=0;
     double balance1;
 
     Scanner scan=new Scanner(System.in);
    
        public void withdraw_amount(){  
      
            System.out.println("Enter amount to withdraw");
            double withdrawing =scan.nextDouble();
           if(balance>=withdrawing)
           {
             balance=balance-withdrawing;
               System.out.println("please collect your money & card");
                 
           }
           else{
               System.out.println("Insufficient money!!!");
           }
         
        }
       public void deposit_amount(){
                System.out.println("Enter amount to deposit:");
                double depositing=scan.nextDouble();
                balance=balance+depositing;
                 System.out.println("Your money has successfully deposited");
                 
       }
                 public void chk_bal(){    /*Displaying current balance*/
                  balance1=balance;
                System.out.println("Current Balance:"+balance1);
                
            }
            
           }
       

      class Bank_account{           /* Creating a class that store the account balance*/
         public static void main(String[] args){ 
              Scanner scan=new Scanner(System.in);
               ATM atm=new ATM();    /*Creating object of ATM class & with the help of this object invoke all the methods*/
           
           System.out.println("Welcome to your bank account");
           while(true){
             
               System.out.println("Choose 1 for withdraw");
               System.out.println("Choose 2 for deposit");
                System.out.println("Choose 3 for Check Balance");
               System.out.println("Choose 4 for Exit");
               System.out.println("Enter choice:");
               int ch=scan.nextInt();
        
               if(ch==1){
                System.out.println(" withdraw operation:");
                 atm.withdraw_amount();
               }
               else if(ch==2){
                  System.out.println("deposit operation");
                   atm.deposit_amount(); 
               }
               else if(ch==3){
      
                   atm.chk_bal( );
                    
                   
               }
               else if(ch==4){
                   System.out.println("Collect your ATM card \n Thank You for using ATM machine");
                   System.exit(0);
               }
               else{
                   System.out.println("Invalid choice");
               }
           }
             
          
             
   
               
       
         }         
    
}
