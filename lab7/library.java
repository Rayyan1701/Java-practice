// 4
// b. Create a class called Library. Write a program to manipulate the book
// information from files by using FileInputStream and FileOutputStream.

import java.util.*;
import java.io.*;

public class library {

    String read(FileReader fr,File file) {
        String s=" ";
       try{
           fr= new FileReader(file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
            s=s+(char)ch;
        }
       }
       catch(FileNotFoundException e){
        System.out.print("\n"+e.getMessage());
      }
      catch(IOException e){
        System.out.print("\n"+e.getMessage());
      }
      
      finally
      {
         
      }
      return s;
    }

    public static void main(String[] args)
    {
        library obj= new library();
        Console con=  System.console();
         File file=new File("bookinfo.txt");
          FileReader fr= null;
          FileWriter fw= null;
          String before;
       
          System.out.println("Reading data from file");
          before=obj.read(fr,file);

          //System.out.print("Enter y if you want to add data to library");
          String c= con.readLine("\nEnter y if you want to add data to library  or n if not");
          if(c.equals("y"))
          {
          try
          {
            fw=new FileWriter(file);
            String bname= con.readLine("\nEnter book name to add :");
            String bauthor= con.readLine("\nEnter book author  :");

            byte bytes[]=bname.getBytes();
            byte bytes1[]=bauthor.getBytes();

            fw.write(before+"\n"+bname+" "+bauthor); 
            fw.close();
          }
          catch(FileNotFoundException e){
            System.out.print("\n"+e.getMessage());
          }
          catch(IOException e){
            System.out.print("\n"+e.getMessage());
          }
          
          finally
          {
             
          }

          System.out.print("Reading data from file after manipulation\n");
          obj.read(fr,file);

        }
        else{
            System.out.print("Reading data from file after no manipulation\n");
          obj.read(fr,file);
        }


         
    }

}

