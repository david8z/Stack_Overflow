/*
  Program to scan all the words of a file with JAVA
  Author: David Alarcón Segarra
  Mail: alarconsegarradavid@gmail.com
*/
import java.util.*;//To import Scanner
import java.io.*; //to import File

public class ScanFile{
  public static void main(String[] args){
    try{
      File f = new File("path");      //We need to create first the file object this is
                                      //done with the constructor File(String path)
      Scanner input = new Scanner(f);
      while(input.hasNextLine()){
              while(input.hasNext()){

              }
        }
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }
  }
}
