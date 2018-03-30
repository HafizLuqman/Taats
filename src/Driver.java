import java.util.Scanner;
import java.io.IOException;


public class Driver {
  public static void main(String[] args) throws IOException{          // Main Function
          int index=0;
    int t_customer=20;                                                // Total Account Capacity in the Bank
    Customer[] cus=new Customer[t_customer];
    for(int i=0 ; i<t_customer ; i++){
        cus[i]=new Customer();                                        // Each Customer Give A value 
    }
    int input=0;
    
        while (input!=10){                                            // Run till You Cannot Exit By Pressing 10
  System.out.println("********************* MENU ***************************"); // Menu
   System.out.println("*****************************************************");
      System.out.println("Press 1 For Enter New Account");
          System.out.println("Press 2 For Deposit Money");
              System.out.println("Press 3 For Withdraw");
                    System.out.println("Press 4 For Show All Records");
                           System.out.println("Press 5 For Show Only Basic Accounts");
                                  System.out.println("Press 6 For Show Only Current Accounts");
                                         System.out.println("Press 7 For Show Only Current Accounts");
                                         System.out.println("Press 8 For Show Only Accounts Which Starts At A particular Date");
                                               System.out.println("Press 10 For Exit");
                                                     System.out.println("*****************************************************");
                                                           System.out.println("*****************************************************");
                 
    Scanner in = new Scanner(System.in);
    input=in.nextInt();



    if(input==1){
        cus[index].Enter_Information();             // if u pree 1 then it enter a new customer
        index++;
    }
  if(input==2){
      System.out.println("Enter Your Account ID");  // If u press 2 for only deposit into it's account
      int input1=in.nextInt();
      cus[input1].acc.deposit(); 
              }
    if(input==3){
      System.out.println("ENter Your Account ID");  // If u press 3 for only WithDraw into it's account
      int input1=in.nextInt();
      cus[input1].acc.withdrawl();
              }
        if(input==4){
        cus[index].Show_All_Record();               // Press 4 for only Show All Record of All Accounts
              }
                if(input==5){
                    for(int s=0 ; s<t_customer ; s++){ // press 5 for show only Basic Accounts
                              if("Basic".equals(cus[s].ac_type)){
                                  cus[s].print_info();
                                  cus[s].acc.print_info();
                              }
                    }
                }
                    if(input==6){                       // press 6 for show only Current Accounts
                    for(int d=0 ; d<t_customer ; d++){
                              if("Current".equals(cus[d].ac_type)){
                                  cus[d].print_info();
                                  cus[d].acc.print_info();
                              }
                    }
                    }
                    if(input==7){                       // press 5 for show only Saving Accounts
                    for(int j=0 ; j<t_customer ; j++){
                              if("Saving".equals(cus[j].ac_type)){
                                  cus[j].print_info();
                                  cus[j].acc.print_info();
                              }
                    }
                    
                    }
                if(input==8){                         // press 8 for show All Accounts on the basis of their date creative
                System.out.println("Enter the Date format is (22-02-2002)");
                String inp=in.nextLine();
                for(int r=0; r<t_customer ; r++){
                    if(cus[r].acc.date_created.equals(inp)){
                        cus[r].print_info();
                    }
                }
              }
              if(input==10){                          // Press 10 for Exit
                   break;
              }
        }
  }
}




