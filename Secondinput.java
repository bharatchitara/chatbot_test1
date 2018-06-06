
package chatbot_test1;
import java.util.*;
 
class Secondinput {
    
        void secondinput() {
        Scanner sc =new Scanner (System.in);
  String name =null;
   String movie =null;
   String mtype1="action";
   String mtype2="sci-fi";
   String mtype3="romantic";
   String mtype4="sci fi";
   
   System.out.println("\t\t\t\t\t\t tell me about yourself..");
   System.out.println("\t\t\t\t\t\t what is your name");
   name =sc.nextLine();
   
   if(name.isEmpty()){
    System.out.println("\t\t\t\t\t\t no input detected");
    }
    
 try{                                                                                         //try - catch for timing delay
        
             Thread.sleep(1500);
             System.out.println("\t\t\t\t\t\t " + name +  " which kind of movies you like ");
   
    }
    
    catch(InterruptedException e){
    System.out.println(e);
            }
    
   movie = sc.nextLine();
   if(movie.isEmpty()){                                                                           //input cannot be empty
    System.out.println("\t\t\t\t\t\t no input detected");
    }
    
   if(movie.equals(mtype1) )                                                                                 //if else statement for movie type
   {  
       try{
           Thread.sleep(1500);
       
       System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
             System.out.println("\t\t\t\t\t\t   * Race 3");
             System.out.println("\t\t\t\t\t\t   * baaghi 2 ");
             System.out.println("\t\t\t\t\t\t   * Jurrassic World");
       }
         catch(InterruptedException e){
          System.out.println(e);
            }
   }
   
   else if(movie.equals(mtype2) || movie.equals(mtype4)){
 try{
     Thread.sleep(1500);
 
       System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
             System.out.println("\t\t\t\t\t\t    * Avengers : Infinity War");
             System.out.println("\t\t\t\t\t\t    * Deadpool 2 ");
             System.out.println("\t\t\t\t\t\t    * Robot 2 ");
   }
   catch(InterruptedException e){
    System.out.println(e);
            }
   }
   
   else if( movie.equals(mtype3)){
     try{
         Thread.sleep(1500);
          System.out.println("\t\t\t\t\t\t top 3 upcoming movies this year");
          System.out.println("\t\t\t\t\t\t   * Midnight Sun");
          System.out.println("\t\t\t\t\t\t   * October");
          System.out.println("\t\t\t\t\t\t   * Overboard");
   
}
    catch(InterruptedException e){
     System.out.println(e);
   }     
   }
   
 else{ 
       try{
           Thread.sleep(2000);
       
   System.out.println("\t\t\t\t\t\t this movie type is not in my database..\n");
   }
   
   catch(InterruptedException e){
    System.out.println(e);
            }
   } 
  }
  }
 
