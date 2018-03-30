import java.util.Scanner;
import static java.lang.System.exit;


public abstract class Account{
    static int acc_count=1;
    int ac_id=1;
    String date_created;
    int balance;
     abstract void enter_account_info();
     abstract void withdrawl();
    abstract double conversion_rupees_to_dollar(double rs);
     abstract void deposit();
     abstract String write_into_file();
             abstract void print_info();
}


class Saving_Account extends Account{

    int Curr_balance;
    int a_i_r;
    int with_draw_limit,num;
        int limit=0;
    String currency;
    String str;

    Scanner read = new Scanner(System.in);  // Reading from System.in
        Saving_Account(){
            acc_count++;
           enter_account_info();
        }
    @Override
    public void enter_account_info(){
                ac_id++;
            System.out.println("Enter The Date format(22-12-2016");
            str = read.nextLine();
            date_created=str;
            currency = "Rupees";
            with_draw_limit=25000;
            Curr_balance = 5000;
            acc_count++;
            balance=5000;
    }
    

    
    @Override
         public void withdrawl(){
         System.out.println("Enter The Money That you Want to WithDraw");
            num = read.nextInt();

            if( Curr_balance-num <5000 ){
                System.out.println("You cannot withdraw any money");
            }
            else{
                if(limit>25000){
                   System.out.println("You cannot withdraw any money Because Your Limit Is Exceeded");
                   exit(0);
                }
                Curr_balance = Curr_balance-num;
                limit=limit+num;
                System.out.println("You Successfully withdraw money");
                System.out.println("New Balance Is  :  " + Curr_balance);
                balance=balance-num;

            }       
    }
         
    @Override
    public void deposit(){
         System.out.println("Enter The Money That you Want to Deposit");
            num = read.nextInt();
            if(num>0){
            Curr_balance = Curr_balance + num;
            System.out.println("You Successfully Deposit the Money");
            System.out.println("New Balance Is  :  " + Curr_balance);
            balance=balance+num;
            }       
    }
    
    @Override
    public double conversion_rupees_to_dollar(double rs){
        return (rs/103);
    }
    public int annual_intrest_rate(int t_amount){
        a_i_r = 17;
        return (a_i_r /t_amount);
    } 
    
        public void print_info(){
        System.out.println("Your Account ID is " + ac_id);
        System.out.println("Your Account date is " + date_created); 
        System.out.println("Your Account WithDraw Limit is " + with_draw_limit);
        System.out.println("Your Account Current Balance is " + Curr_balance); 
        System.out.println("Your Account Currency Balance is " + currency); 
               
    }
        
        
    @Override
            public String write_into_file(){
            return (ac_id + "   " + Curr_balance + "  " +date_created + "  " + currency + "  ");
        }

}









class Current_Account extends Account{
    int ac_id;
    int Curr_balance;
    String date_created;
    String currency;
    int a_i_r;
    String str;
    int with_draw_limit,num;
    Scanner read = new Scanner(System.in);  // Reading from System.in
    int limit=0;
    
    Current_Account(){
        acc_count++;
        enter_account_info();
        
    }
    
    @Override
     public void enter_account_info(){
            ac_id++;
            System.out.println("Enter The Date format(22-12-2016");
            str = read.nextLine();
            date_created=str;
            currency = "Rupees";
            with_draw_limit=-1;
            Curr_balance = 0;
            acc_count++;
            balance=0;
     }
    @Override
         public void withdrawl(){
         System.out.println("Enter The Money That you Want to WithDraw");
            num = read.nextInt();
            if( Curr_balance-num < 0 ){
                System.out.println("You cannot withdraw any money");
            }
            else{

                Curr_balance = Curr_balance-num;
                limit=limit+num;
                System.out.println("You Successfully withdraw money");
                System.out.println("New Balance Is  :  " + Curr_balance);
                balance=balance-num;
            }       
    }
    
    @Override
    public void deposit(){
         System.out.println("Enter The Money That you Want to Deposit");
            num = read.nextInt();
            if(num>1){
            Curr_balance = Curr_balance + num;
            System.out.println("You Successfully Deposit the Money");
            System.out.println("New Balance Is  :  " + Curr_balance);
            balance=balance+num;
            }       
    }
    
    @Override
    public double conversion_rupees_to_dollar(double rs){
        return (rs/103);
    }
    public int annual_intrest_rate(int t_amount){
        a_i_r = 17;
        return (a_i_r /t_amount);
    }
    
        public void print_info(){
        System.out.println("Your Account ID is " + ac_id);
        System.out.println("Your Account date is " + date_created); 
        System.out.println("Your Account WithDraw Limit is " + with_draw_limit);
        System.out.println("Your Account Current Balance is " + Curr_balance); 
        System.out.println("Your Account Currency Balance is " + currency); 
               
    }
        
        
            public String write_into_file(){
            return (ac_id + "   " + Curr_balance + "  " +date_created + "  " + currency + "  ");
        }
}

























class Basic_Account extends Account{
    int ac_id;
    int Curr_balance;
    String date_created;
    String currency;
    int a_i_r;
    String str;
    int with_draw_limit,num;
    int limit=0;
//    String account_type = c.get_account_type();
  //  Scanner read = new Scanner(System.in);
  Scanner read = new Scanner(System.in);  // Reading from System.in
 


        
    public Basic_Account(){
        acc_count++;
          enter_account_info();       
        }
    @Override
    public void enter_account_info(){
                  ac_id++;
                  with_draw_limit=30000;
                  Curr_balance = 1000;
                  System.out.println("Enter The Date That you Want to Create");
                  str = read.nextLine();
                  date_created=str;
                  currency = "Rupees";
                  acc_count++;
                  balance = 1000;
}    
    
    @Override
    public void withdrawl(){
         System.out.println("Enter The Money That you Want to WithDraw");
            num = read.nextInt();
            if( Curr_balance-num < 500 ){
                System.out.println("You cannot withdraw any money");
            }
            else{
                if(limit>25000){
                   System.out.println("You cannot withdraw any money Because Your Limit Is Exceeded");
                   exit(0);
                }
                Curr_balance = Curr_balance-num;
                limit=limit+num;
                System.out.println("You Successfully withdraw money");
                System.out.println("New Balance Is  :  " + Curr_balance);
                balance=balance-Curr_balance;
                
            }      
    }
    
    @Override
    public void deposit(){
         System.out.println("Enter The Money That you Want to Deposit");
            num = read.nextInt();
            if(num>1){
            Curr_balance = Curr_balance + num;
            System.out.println("You Successfully Deposit the Money");
            System.out.println("New Balance Is  :  " + Curr_balance);
                        balance=balance+num;
            }       
    }
    
    @Override
    public double conversion_rupees_to_dollar(double rs){
        return (rs/103);
    }
    public int annual_intrest_rate(int t_amount){
        a_i_r = 17;
        return (a_i_r /t_amount);
    }
    
    public void print_info(){
        System.out.println("Your Account ID is " + ac_id);
        System.out.println("Your Account date is " + date_created); 
        System.out.println("Your Account WithDraw Limit is " + with_draw_limit);
        System.out.println("Your Account Current Balance is " + Curr_balance); 
        System.out.println("Your Account Currency Balance is " + currency); 
               
    }
                public String write_into_file(){
            return (ac_id + "   " + Curr_balance + "  " +date_created + "  " + currency + "  ");
        }
    
}

    
    
 
    
    
    
    
    
   