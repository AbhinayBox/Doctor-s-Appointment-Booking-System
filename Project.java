import java.util.*;
import java.io.*;
class AppointmentBooking{
    //use of collection classes for data structures like ArrayLists



    //details about doctors
           
    ArrayList<String> doctorName=new ArrayList<String>();
    ArrayList<String> doctorQualification=new ArrayList<String>();
   // ArrayList<String>doctorSpecialisation=new ArrayList<String>(); 
    ArrayList<String> doctorGender=new ArrayList<String>();
    ArrayList<String> doctorPassword=new ArrayList<String>();
    ArrayList<Integer> doctorAge=new ArrayList<Integer>();      /* boxing i.e converting primitive data type 'int' into
    //object by writing the wrapper class Integer*/
    ArrayList<Long>doctorMobileNo=new ArrayList<Long>();//wrapper class Long//boxing
ArrayList<String>doctorCity=new ArrayList<String>();

//details about patients

ArrayList<Integer>patientAge=new ArrayList<Integer>();
ArrayList<String> patientName=new ArrayList<String>();
ArrayList<String>patientGender=new ArrayList<String>();
ArrayList<String>patientPassword=new ArrayList<String>();
ArrayList<String>patientConfirmPassword=new ArrayList<String>();
ArrayList<Long>patientMobileNo=new ArrayList<Long>();                   //boxing
//details about booking doctor's appointment


ArrayList<Integer>patientAgeBooking=new ArrayList<Integer>();
ArrayList<String>patientNameBooking=new ArrayList<String>();
ArrayList<String>patientGenderBooking=new ArrayList<String>();
ArrayList<Byte> doctorID=new ArrayList<Byte>();

void dataAdd(){           //function to add doctor's information
    doctorName.add("Dr Vikas Jain"); //method for creating default doctors list in the database
    doctorName.add("Dr Lata Jain");
    doctorName.add("Dr Nilesh Jain");
    doctorName.add("Dr Shefali Jain");
    doctorName.add("Dr Vivek Jain");
    doctorName.add("Dr Julie Jain");
    doctorName.add("Dr Rajendra Jain");

    
    doctorQualification.add("MBBS,MS,FCPS,MNAMS");
    doctorQualification.add("MBBS,MD(ENT)");
    doctorQualification.add("MBBS,MD(Opthamology)");
    doctorQualification.add("MBBS,MD(Gynaecology)");
    doctorQualification.add("MBBS,DVD,DDV,DNB");
    doctorQualification.add("MBBS,MD(Pediatrics)");
    doctorQualification.add("MBBS,MS(General Surgery)");

    doctorGender.add("M");
    doctorGender.add("F");
    doctorGender.add("M");
    doctorGender.add("F");
    doctorGender.add("M");
    doctorGender.add("F");
    doctorGender.add("M");

    doctorPassword.add("123");
    doctorPassword.add("342");
    doctorPassword.add("756");
    doctorPassword.add("831");
doctorPassword.add("727");
doctorPassword.add("784");
doctorPassword.add("801");

    doctorAge.add(50);
    doctorAge.add(40);
    doctorAge.add(41);
    doctorAge.add(38);
    doctorAge.add(36);
    doctorAge.add(30);
    doctorAge.add(60);
    
    doctorMobileNo.add(123L);
    doctorMobileNo.add(457L);
    doctorMobileNo.add(789L);
    doctorMobileNo.add(456L);
    doctorMobileNo.add(342L);
    doctorMobileNo.add(444L);
    doctorMobileNo.add(134L);

    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");
    doctorCity.add("Nagpur");


}
void admin() throws Exception{
Scanner sc=new Scanner(System.in);
byte choice;
boolean flag=true;

while (flag){
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t  ---------------------------");
System.out.println("\t\t|                               |");
System.out.println("\t\t|         Welcome to Admin      |");
System.out.println("\t\t|                               |");
System.out.println("\t\t --------------------------------");
System.out.println("\n\n1. Doctor List \t2. Registered Patients \t3.Patients with Appointment \n4.Main menu \n\nEnter the required option no.");
choice=sc.nextByte();
switch(choice){
    case 1:
    for(int i=0;i<=doctorName.size()-1;i++){
        System.out.println("Name: \t "+doctorName.get(i));
    }
    byte menuCHoice;
    System.out.println("\n\n1. Main menu\t 2. Previous menu");
    menuCHoice=sc.nextByte();
    if(menuCHoice==1){
        flag=false;
    }
    else{
        break;
    }
    break;
    case 2:
    if(patientName.isEmpty()){
        System.out.println("No Registered Patients yet .");
        Thread.sleep(3000);
        break;
    }
    else{
        for(int i=0;i<=patientName.size()-1;i++){
            System.out.println(i+", "+patientName.get(i));
        }
        System.out.println("\n\n1. Main menu\t 2. Previous menu");
        menuCHoice=sc.nextByte();
        if(menuCHoice==1){
            flag=false;
        }
        else{
            break;
        }
    }
    break;
    case 3 :
    if(patientNameBooking.isEmpty()){
        System.out.println("\nNo Appointments yet.");
        Thread.sleep(3000);
        break;
    }
    else {
        for(int i=0;i<=patientNameBooking.size()-1;i++){
            System.out.println(i+"- "+patientNameBooking.get(i));
        }
        System.out.println("\n\n1. Main menu\t 2. Previous menu");
        menuCHoice=sc.nextByte();
        if(menuCHoice==1){
            flag=false;
        }
        else{
            break;
        }
    }
    
    case 4:
    flag=false;
    break;
    default:
    System.out.println("Wrong choice");
    Thread.sleep(1000); //for pausing the screen
    flag=true;
}


}
}
void patient()throws Exception{
    Scanner sc=new Scanner(System.in);
    boolean flag=true;
    while(flag){
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t -------------------------------");
System.out.println("\t\t|                                |");
System.out.println("\t\t|     Welcome to Patient Page    | ");
System.out.println("\t\t|                                |  ");
System.out.println("\t\t --------------------------------");
System.out.println(" ");
System.out.println("1.Login \t 2.Registration\n");
int ch=sc.nextInt();
switch(ch){
    case 1:
    if(patientMobileNo.isEmpty()){
        System.out.println("First register and then login..!");
        Thread.sleep(500);
        break;
    }
    else{
        patientLogin();
        flag=false;
    }
    break;
    case 2:
    patientRegistration();
    flag=false;
    break;
    default:
    System.out.println("\nYou entered wrong choice.enter your choice again.....!!!! ");
    flag=true;
    Thread.sleep(1000);
    break;
}

    }
}
void doctor()throws Exception{
    Scanner sc=new Scanner(System.in);
    int choice=0;
    boolean flag=true;
    while(flag){
        //Thread.sleep(1000);
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t -------------------------------");
System.out.println("\t\t|                                |");
System.out.println("\t\t|    Welcome to Doctor Page !     | ");
System.out.println("\t\t|                                |  ");
System.out.println("\t\t --------------------------------");
System.out.println(" ");
System.out.println("1.Login \t 2.Registration");
choice=sc.nextInt();
switch(choice){
    case 1:
    if(doctorMobileNo.isEmpty()){
        System.out.println("Register First...!");
        flag=false;
        Thread.sleep(500);
        break;
    }
    else{
        doctorLogin();
        flag=false;
    }
    break;
    case 2:
    doctorRegistration();
    flag=false;
    break;
    default:
    System.out.println("\nYou entered wrong choice.....!!! ");
    flag=true;
    
}

}
}
void patientLogin()throws Exception{
    Scanner sc=new Scanner(System.in);
boolean flag=true;
long mobileNumber;
byte choice;
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t -------------------------------");
System.out.println("\t\t|                                |");
System.out.println("\t\t|         Login Page             | ");
System.out.println("\t\t|                                |  ");
System.out.println("\t\t --------------------------------");

System.out.println("Enter your Username(mobilenumber)");//we are taking username as the patient's mobile number
mobileNumber=sc.nextLong();
System.out.println("Enter your Password");
String password=sc.next();
boolean flag1=false;
int j;
for(j=0;j<=patientMobileNo.size()-1;j++){
if((patientMobileNo.get(j)).equals(mobileNumber)&&(patientPassword.get(j)).equals(password)){
    flag1=true;
    break;
}
}
if(flag1=true){
    Thread.sleep(1000);
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t ------------------------------------- ");
System.out.println("\t\t|                                      |");
System.out.println("\t\t|    Book Doctor's appointment here    |");
System.out.println("\t\t|                                      | ");
System.out.println("\t\t ---------------------------------------");
System.out.println("\n Welcome "+patientName.get(j)+",to book appointment,choose the required Doctor...");
for(int i=0;i<=doctorName.size()-1;i++){
    System.out.println((i+1)+". "+doctorName.get(i));
}
choice=sc.nextByte();
doctorID.add(choice);
while(flag){
    Thread.sleep(1000);
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t                           ");
System.out.println("\t\t ------------------------------------- ");
System.out.println("\t\t|                                      |");
System.out.println("\t\t|    Book Doctor's appointment here    |");
System.out.println("\t\t|                                      | ");
System.out.println("\t\t ---------------------------------------");
if(choice<=doctorName.size()&& choice>0){
    System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\nAge: \t "+doctorAge.get(choice-1)+"\nMobile no: \t "+doctorMobileNo.get(choice-1)+"\nQualification: \t "+doctorQualification.get(choice-1));
    System.out.println("\n Enter your Name: \t");
    sc.nextLine();
    patientNameBooking.add(sc.nextLine());
    System.out.println("Enter your age: \t");
    patientAgeBooking.add(sc.nextInt());
    System.out.println("Enter your gender: \t");
    patientGenderBooking.add(sc.next());
    System.out.println("\n Your Booking is Successfull...");
    Thread.sleep(1000);
    flag=false;
    break;
}
else{
    System.out.println("\n Enter Correct Input...");
    flag=true;
    Thread.sleep(1000);
}
}
}
else{
    System.out.println("Login Unsuccessfull");
    Thread.sleep(900);
    flag=false;
}
}
void patientRegistration()throws Exception{
    Scanner sc=new Scanner(System.in);
    int i=0;
    long mobileNumber;
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    System.out.println("\n");
    System.out.println("\t\t | Welcome to patient Registration page! |");
    System.out.println("\n");
    System.out.println("Please enter your name");
    patientName.add(sc.nextLine());
    System.out.println("enter your age : ");
    patientAge.add(sc.nextInt());
    System.out.println("Please enter your mobile number");
    mobileNumber=sc.nextLong();
    long mno;
    boolean flag=true,flag1=true;
    if(patientMobileNo.isEmpty()){
patientMobileNo.add((mobileNumber));
System.out.println("Enter Password");
patientPassword.add(sc.next());
System.out.println("Registration is successfull.");
Thread.sleep(1000);
flag1=false;
    }
    else{
        for(i=0;i<=patientMobileNo.size()-1;i++){
            mno=patientMobileNo.get(i);
        }
    }
}
void doctorRegistration()throws Exception{
Scanner sc=new Scanner(System.in);
int i=0;
long mobileNumber;
boolean flag=true,flag1=true;
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t ------------------------------------");
System.out.println("\t\t|---This is Doctors Registration page|");
System.out.println("\t\t ------------------------------------");
System.out.println("\n");

System.out.println("Please enter your name");
doctorName.add(sc.nextLine());

System.out.println("Please enter your mobile number");
mobileNumber=(sc.nextLong());

long mno;
if(doctorMobileNo.isEmpty()){
    doctorMobileNo.add((mobileNumber));
    System.out.println("Enter password");
    doctorPassword.add(sc.next());
    System.out.println("Registration is successfull");
    Thread.sleep(900);
    flag1=false;
}
else{
    for(i=0;i<=doctorMobileNo.size()-1;i++){
        mno=doctorMobileNo.get(i);
        if (mno==mobileNumber){
            flag1=false;
            break;
        }
    }
    if(flag1==true){
        doctorMobileNo.add(mobileNumber);
        System.out.println("Enter age:");
        doctorAge.add(sc.nextInt());
        System.out.println("Enter City");
        doctorCity.add(sc.next());
        System.out.println("Enter password");
        doctorPassword.add(sc.next());
        System.out.println("Registration is successfull.");
        System.out.println("Details: Name: "+doctorName+" number:" +doctorMobileNo);
        Thread.sleep(900);
    }
    else{
        System.out.println("same mobile no is not allowed\n");
        int index=doctorName.size()-1;
        doctorName.remove(index);
        Thread.sleep(500);
    }
}

}
void doctorLogin() throws Exception{
    Scanner sc=new Scanner(System.in);
    long mobileNumber;
    //Thread.sleep(500);
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t ------------------------------------");
System.out.println("\t\t|----This is Doctors Login page------|");
System.out.println("\t\t ------------------------------------");
System.out.println("Enter your Username(mobileNumber)");
mobileNumber=sc.nextLong();
System.out.println("Enter your Password");
String password=sc.next();
int i=0;
byte choice;
boolean flag=false;
boolean flag11=true;

for(i=0;i<=doctorMobileNo.size()-1;i++){
    if((doctorMobileNo.get(i)).equals(mobileNumber)&&(doctorPassword.get(i)).equals(password));{
        flag=true;
        break;
    }

}
if (flag==true){
    while(flag11){
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("\t\t ----------------------------------------");
System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+" ------|");
System.out.println("\t\t -----------------------------------------");
System.out.println("\n\n1.Appointments. \n2. Logout");
choice=sc.nextByte();
byte j=0;
switch(choice){
    case 1:
    if((doctorID.isEmpty()!=true)){
        while(j<=doctorID.size()-1){
            if((i+1)==doctorID.get(j)){
                System.out.println("patient name: " +patientNameBooking.get(j));
                j++;
            }
        }
        Thread.sleep(4000);
    }
    else{
        System.out.println("No Appointments....!");
        Thread.sleep(3000);
        flag11=true;
    }
    break;
    case 2:
    flag11=false;
    break;
}
    }
}
else{
    System.out.println("Login unsuccessfull....");
    Thread.sleep(3000);

}

}
}



class Project{
    public static void main(String args[])throws Exception{
AppointmentBooking ap=new AppointmentBooking();
Scanner sc =new Scanner(System.in);
ap.dataAdd();
boolean flag=true;
while(flag=true){
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
System.out.println("----------------------------------------------------");
System.out.println("\t\t  | Book the Doctors' Appointment here  |");
System.out.println("--------------------------------------------------------------\n\n");
System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
int choice=sc.nextInt();
switch(choice){
    case 1:
    ap.doctor();
    flag=true;
    break;
    case 2:
    ap.patient();
    flag=true;
    break;
    case 3:
    ap.admin();
    flag=true;
    //Thread.sleep(1000);
    break;
    default:
    System.exit(0);

}
}
    }
}

