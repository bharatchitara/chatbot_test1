
package chatbot_test1;
import chatbot_test1.Secondinput.*;


import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

interface Inputs{
 Scanner sc = new Scanner(System.in);
    
    void welcome();
    void firstinput();    
    void choice1();
    void choice2();
    void choice3();
    void choice4();
    void choice5();
    void choice6();
    void choice7();
  //void secondinput();
   }

class Feathers implements Inputs{
public void welcome(){
        System.out.println("\t\t\t\t\t\t hiiiii......"); 
    }
    public void firstinput(){
    
    
    String str1= "hi";                                                                           //possible outputs
    String str2= null;
    String str3 = "hello";
    String str4 = "greetings";
    String str5= "hii";
    String str6 = "greeting";
    String str7 = "ey yo";
    String str8 = "hey";
    
    
    try{
    str2= sc.nextLine();
    
                                                                                                                //put an output delay at here
    if(str2.isEmpty()){
    System.out.println("\t\t\t\t\t\t no input detected");
    }
    
  Thread.sleep(1500);
    }
    
    catch(InterruptedException e){
    System.out.println(e);
            }
    
    
    if(str2.equals(str1) || str2.equals(str3) || str2.equals(str4) || str2.equals(str5)|| str2.equals(str6)|| str2.equals(str7)|| str2.equals(str8))
    {
       System.out.println("\t\t\t\t\t\t hello !!! how are you......\n");
    }    
    else{
                  System.out.println("\t\t\t\t\t\t I am on testing phase.....sorry for the inconvenience\n");
    }                         
    }    
    
    public void choice1(){                                                                                          
    
    System.out.println("\t\t\t\t\t\t opening notepad....\n");
     Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("notepad");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
     }
    
    public void choice2()
   {
   System.out.println("\t\t\t\t\t\t opening image folder\n");
   
  try{
      File file= new File("C:\\Users\\bharat\\Pictures");
   Desktop desk = Desktop.getDesktop();
   desk.open(file);
   }
   
   catch (IOException e) {
      System.out.println(e);
      System.out.println("\t\t\t\t\t\t you are possibilly on linux....I am only designed for Windows" );
    
   }}
   
   
   public void choice3(){                                                                                       //calculator using desktop api 
   
   try
   {
   File file= new File("C:\\Windows\\System32\\calc.exe");
   Desktop desk = Desktop.getDesktop();
   desk.open(file);
   }
   
   catch (IOException e) {
      System.out.println(e);
     System.out.println("\t\t\t\t\t\t you are possibilly on linux....I am only designed for Windows" );
    
   }
   }
   
   public void choice4(){
   
   try
   {
   File file= new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
   Desktop desk = Desktop.getDesktop();
   desk.open(file);
   }
   
   catch (IOException e) {
      System.out.println(e);
      
      System.out.println("\t\t\t\t\t\t seems like the google chrome is not installed on this pc");
   }
   }
   
   
   public void choice5(){
   
   System.out.println("\t\t\t\t\t\t ChatBot 'JOE' ");
   System.out.println("\t\t\t\t\t\t develpoed by bharat Chitara ");
   System.out.println("\t\t\t\t\t\t version 1.0.0.1");
     
   }
   
   public void choice6(){
   
   System.out.println("\t\t\t\t\t\t 5 star : excellent");
   System.out.println("\t\t\t\t\t\t 4 star : great");
   System.out.println("\t\t\t\t\t\t 3 star : good  ");
   System.out.println("\t\t\t\t\t\t 2 star : fair");
   System.out.println("\t\t\t\t\t\t 1 star : poor");
   System.out.println("\t\t\t\t\t\t enter your responce"); 
   int response = sc.nextInt();
   
  System.out.println("\t\t\t\t\t\t your responce was submitted...Thank You");
   }
   
   
   //void choice7(){
   
//}
          
  
    
Scanner sc = new Scanner(System.in);
 
 void one(){
     
     try{
           Thread.sleep(1500);
       
     System.out.println("\t\t\t\t\t\t what is your favorite programming langage\n");
     }
     catch(InterruptedException e){
         System.out.println(e);
     
     
     }
     String p_lang= sc.nextLine();
     if(p_lang.isEmpty()){
    System.out.println("\t\t\t\t\t\t no input detected");
    }
    
     System.out.println("\t\t\t\t\t\t interest to see some facts about your favorite prog. language ?");
     
     String choice= sc.nextLine();                                                                 //input for seeing facts 
      if(choice.isEmpty()){
    System.out.println("\t\t\t\t\t\t no input detected");
    }
                                      
     String choice1="yes";
     String choice2= "no";
     
     
       String lang1="c";
       String lang2="c++";
       String lang3="java";
       String lang4="python";
       String lang5="javascript";
       
     if(choice.equals(choice1))
     { 
   if(p_lang.equals(lang1))
   {
       JOptionPane.showMessageDialog(null,"c programming is the second most language for making projects");
   }
   
   else if(p_lang.equals(lang2)){
  JOptionPane.showMessageDialog(null,"The c++17 is the current version of c++ programming released in dec.2017");
          
   }
  
   else if(p_lang.equals(lang3)){
  JOptionPane.showMessageDialog(null,"java was the first portable programming langage when build");
  }   
  
   else if(p_lang.equals(lang4)){
   JOptionPane.showMessageDialog(null,"The average salary of python developer was 114000$ per annum in 2017.");
  }
  
   else if(p_lang.equals(lang5)){
   JOptionPane.showMessageDialog(null,"javascript can be use in both front end and back end programming very efficiently");
 }
   else{
     JOptionPane.showMessageDialog(null,"this language is not popular or may you spell it wrong....lol ");
       
   }}
 
     else
 {
     
     System.out.println("\t\t\t\t\t\t maybe later .....");
 }
 }

 void two(){                                                                  

System.out.println("\t\t\t\t\t\t what is your current mood");
 String mood=sc.nextLine();       
     
 if(mood.isEmpty()){
    System.out.println("\t\t\t\t\t\t no input detected");
    }  
       
     String mood1="happy";
       String mood2="angry";

    if(mood.equals(mood1) ){
        try{
            Thread.sleep(1500);
    System.out.println("\t\t\t\t\t\t a happy mood is a myth in ENGINEERING");
        }
        catch(InterruptedException e){
         System.out.println(e);
        }
  }
    else if(mood.equals(mood2)){
        try{
            Thread.sleep(1500);
            System.out.println("\t\t\t\t\t\t don't be angry we are in ENGINEERING");
        }
  
        catch(InterruptedException e){
         System.out.println(e);
        }
    }
 
    else{
    try{
        Thread.sleep(1500);
    System.out.println("\t\t\t\t\t\t I am still learning.....thank you");
    }
    

    catch(InterruptedException e){
         System.out.println(e);
        }
  }
}     

    @Override
    public void choice7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 class Image  {
     
    void show() throws IOException{                                                 //java image code using applets 
        
        BufferedImage img=ImageIO.read(new File("C:\\Users\\bharat\\Downloads\\download.png"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300,200);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
   }
 
public class Chatbot_test1 {

    public static void main(String[] args) throws IOException{
    int choice=0;
    JOptionPane.showMessageDialog(null,"--------------------------------------------------welcome to the chatbot 'JOE'------------------------------------------------------");
    
   Scanner sc = new Scanner(System.in);
   // Inputs obj = new Inputs();                                                        //class objects
    Inputs obj = new Feathers();
    Feathers obj1 = new Feathers();
    Image obj2 =new Image();
    
    obj.welcome();                                                                         
    obj.firstinput();
   chatbot_test1.Secondinput out = new chatbot_test1.Secondinput();
   out.secondinput();
    
    
    System.out.println("\t\t\t\t\t\t ok...choose one option to use more feathers \n");
        System.out.println("\t\t\t\t\t\t 1.open notepad");
        
        System.out.println("\t\t\t\t\t\t 2. open image folder ");
        System.out.println("\t\t\t\t\t\t 3. open calculator");
        System.out.println("\t\t\t\t\t\t 4.open internet ");
        System.out.println("\t\t\t\t\t\t 5.about me");
        System.out.println("\t\t\t\t\t\t 6.rate me  ");
        //System.out.println("\t\t\t\t\t\t\t\t\t\t 7.return back to the chat mode"); 
        choice =sc.nextInt();
        
        switch(choice){
            
            case 1 :   obj.choice1();break;
            case 2 :   obj.choice2();break;
            case 3 :   obj.choice3();break;
            case 4 :   obj.choice4();break;
            case 5 :   obj.choice5();break;
            case 6 :   obj.choice6();break;
            //case 7 :   obj.choice7(); break;
        }
        obj1.one();
         obj1.two();
         obj2.show();
    }
    }
   
