import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Customer {
    String Fname;
    String Lname;
    String Address;
    double age;
    String sex;
    String dob;
    String occupation;
    String password;
    String ac_type; 
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    
    Account acc=null;
                       
 public void Enter_Information(){
     
        try {
            enter_info();
        } catch (invaild_ageException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    Scanner in = new Scanner(System.in);

             
             System.out.println("Press 1 For Basic Account");
            System.out.println("Press 2 For Current Account");
                System.out.println("Press 3 For Saving Account");
                 int input=in.nextInt();
            if(input==1){
                ac_type="Basic";
                            acc=new Basic_Account();
            }
            
                if(input==2){
                                    ac_type="Current";
                                acc=new Current_Account();
            }
                
                    if(input==3){
                                        ac_type="Saving";
                                    acc=new Saving_Account();
            }
     
		PrintWriter RecordUpdate=null;
                
		try{
                    int x=0;
			RecordUpdate =new PrintWriter(new BufferedWriter(new FileWriter("BankDatabase.txt"))); 
			RecordUpdate.println(Fname);
                        RecordUpdate.println(Lname);
                        RecordUpdate.println(Address);
                        RecordUpdate.println("Customer"+1+".txt");
                        RecordUpdate.println(sex);
                        RecordUpdate.println(age);
                        RecordUpdate.println(dob);
			//age is an integer and DateOfBirth is a date object and being written successfully without converting to string (additional notes for ou Sohaib)
		
		    RecordUpdate.println(acc.write_into_file());;
		
		}catch(IOException e){System.out.println("Error Message"+e);
		}finally{
			if(RecordUpdate!=null){
				RecordUpdate.close();
			}
		}
	}
    

    public Customer() throws IOException{
        
    }

    
    public void enter_info() throws  invaild_ageException{
     System.out.println("Enter Your Fisrt_Name");
     Fname = reader.next();

     
     System.out.println("Enter Your Last_Name");
     Lname = reader.next();

     
     System.out.println("Enter Your Address");
     Address = reader.next();

     
     System.out.println("Enter Your Age");
     age = reader.nextInt();
     if(age<18){
         throw new invaild_ageException();
     }
     System.out.println("Enter Your Date Of Birth format is (11-02-2012) ");
    dob = reader.next();

     System.out.println("Enter Your Sex");
     sex = reader.next();
    
     System.out.println("Enter Your Occupation");
    occupation = reader.next();

     
     System.out.println("Enter Your Password");
    password = reader.next();
    }
    
    
    public void print_info(){
     System.out.println("Your Fisrt_Name" + Fname);
     
     System.out.println("Your Last_Name" +Lname);
     
     System.out.println("Your Address" + Address);
     
     System.out.println("Your Age" + age);
     
     System.out.println("Your Sex" + sex);
     
     System.out.println("Your Date Of Birth format is (11-02-2012) " + dob);

     System.out.println("Your Occupation" + occupation);
     
     System.out.println("Your Password" + password);

     System.out.println("Enter Your Account Type (Basic , Current , Saving )" + ac_type);
      
    }

    
    public String get_account_type(){
        return ac_type;
    }
    
    public void update_info(){
    System.out.println("Enter Any Attribute name");
    String update = reader.nextLine();
    int num2;
    
    if ("Fname".equals(update)){
    System.out.println("Enter Your First name");
    update = reader.nextLine();
        Fname = update;
    }
        if ("Lname".equals(update)){
        System.out.println("Enter Your Last name");
        update = reader.nextLine();
        Lname = update;
        }
            if ("Address".equals(update)){
            System.out.println("Enter Your Address");
            update = reader.nextLine();
            Address = update;
            }    
                if ("dob".equals(update)){
                System.out.println("Enter Your Date Of Birth");
                update = reader.nextLine();
                dob = update;
               }
                    if ("occupation".equals(update)){
                    System.out.println("Enter Your Occupation");
                    update = reader.nextLine();
                    occupation = update;
                    }
                        if ("password".equals(update)){
                        System.out.println("Enter Your Password");
                        update = reader.nextLine();
                        password = update;
                        }  
                            if ("age".equals(update)){
                            System.out.println("Enter Your Age");
                            num2 = reader.nextInt();
                            age = num2;
                            }
        }
    
    
public void Show_All_Record() throws FileNotFoundException{
    BufferedReader br;
    try{
           br = new BufferedReader(new FileReader("C:\\Users\\Luqman Aslam\\Desktop\\Assignment#1\\BankDatabase.txt")); 
    			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
    }
    catch (IOException e) {
			e.printStackTrace();
		}
}


public void Show_only(String str){
    if("basic".equals(str)){
        if("Basic".equals(ac_type)){
            
        }
    }
}

}
