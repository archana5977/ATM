
package s1;

public class ATM {
    
    public void display(double balance){    /*Displaying current balance*/
                System.out.println("Current Balance:"+balance);
            }
           
        public void withdraw_amount(double balance,double withdrawing){
           
           System.out.println("Withdrawn Operation");
            System.out.println("Withdrawing Amount:"+withdrawing);
           if(balance>=withdrawing)
           {
               double balance1=balance-withdrawing;
               System.out.println("please collect your money & card");
               System.out.println("Remaining Balance:"+balance1);
               
           }
           else{
               System.out.println("Insufficient money!!!");
           }
         
        }
       public void deposit_amount(double balance1,double depositing){
                System.out.println("\nNow Current Balance:"+balance1);
                System.out.println("Deposit Operation");
                 System.out.println("Depositing Amount:"+depositing);
               double  balance2=balance1+depositing;
                 System.out.println("Your money has successfully deposited");
                 System.out.println("Remaining Balance:"+balance2);
            
           }
}
      class Bank_account{           /* Creating a class that store the account balance*/
         public static void main(String[] args){
             double balance=10000;
            double withdrawing=5000;
            double depositing=3000;
            ATM atm=new ATM();      /*Creating object of ATM class & with the help of this object invoke all the methods*/
            atm.display(10000);
            atm.withdraw_amount(10000,5000);
            atm.deposit_amount(5000,3000 );
               
       
         }         
    
}
