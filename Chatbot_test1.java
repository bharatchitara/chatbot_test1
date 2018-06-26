
package chatbot_test1;
//import chatbot_test1.Secondinput.*;
//import chatbot_test1.thirdoption.*;

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
    while(!str2.matches("[a-zA-Z]+"))                                                     //regex are used to stop false inputs.
    {
    System.out.println("please enter the valid name!");
    str2= sc.nextLine();
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
                  System.out.println("\t\t\t\t\t\t sorry didn't understand ... still learning ;)\n");
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
   
   
   public void choice3(){                                                        //calculator using desktop api 
   
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
   System.out.println("\t\t\t\t\t\t version 1.0.0.3");
     
   }
   
   public void choice6(){
   
   System.out.println("\t\t\t\t\t\t 5 star : excellent");
   System.out.println("\t\t\t\t\t\t 4 star : great");
   System.out.println("\t\t\t\t\t\t 3 star : good  ");
   System.out.println("\t\t\t\t\t\t 2 star : fair");
   System.out.println("\t\t\t\t\t\t 1 star : poor");
   System.out.println("\t\t\t\t\t\t enter your responce"); 
   
   String response = sc.nextLine();
   while(!response.matches("[1-5]"))                                                     //regex are used to stop false inputs.
    {
    System.out.println("please enter a number ranging {1 - 5} ");
    response = sc.nextLine();
    }
   
  System.out.println("\t\t\t\t\t\t your responce was submitted...Thank You");
   }
   
   
   public void choice7(){
   System.out.println("info about previous versions & inprovements ");
   System.out.println("v1.0.0.1-- first chatbot code");
   System.out.println("v1.0.0.2-- multithreading & multiple java files in a project ");
   System.out.println("v1.0.0.3-- inproved input entries" );
   System.out.println("v1.0.0.4-- multi packages initailized");
   System.out.println("v1.0.0.5-- more option added in movie & prog. lang. options" );
}
  // public void choice8(){

   //} 
}

 class Image  {
     
    void show() throws IOException{                                                 //java image code using applets 
        
        BufferedImage img=ImageIO.read(new File("D:\\netbeans\\chatbot_test1\\src\\chatbot_test1\\download.png"));        //the image source atteched with the code 
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
   exitloop:  
   do{
    System.out.println("\t\t\t\t\t\t ok...choose one option to use more feathers \n");
        System.out.println("\t\t\t\t\t\t 1.open notepad");
        System.out.println("\t\t\t\t\t\t 2.open image folder ");
        System.out.println("\t\t\t\t\t\t 3.open calculator");
        System.out.println("\t\t\t\t\t\t 4.open internet ");
        System.out.println("\t\t\t\t\t\t 5.about me");
        System.out.println("\t\t\t\t\t\t 6.rate me  ");
        System.out.println("\t\t\t\t\t\t 7.info about versions"); 
        System.out.println("\t\t\t\t\t\t 8.press 0 to exit" );
        choice = sc.nextInt();
        
        
        switch(choice){
            
            case 1 :   obj.choice1();break;
            case 2 :   obj.choice2();break;
            case 3 :   obj.choice3();break;
            case 4 :   obj.choice4();break;
            case 5 :   obj.choice5();break;
            case 6 :   obj.choice6();break;
            case 7 :   obj.choice7(); break;
            case 0 :      break exitloop;  
             
        }
   }
   while(choice > 8 || choice < 8 );
        
   chatbot_test1.thirdoption src = new chatbot_test1.thirdoption();
        src.one();
        src.two();
        //obj1.one();
         //obj1.two();
         obj2.show();
    }
    }
   
