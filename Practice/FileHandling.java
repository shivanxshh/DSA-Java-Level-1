package Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        //File myNewFile=new File("Shivansh.txt");
        File myFile=new File("Shivansh.txt");
        //------------File creation
        /*try{
            myNewFile.createNewFile();
            System.out.println("File created succcessfully");
        }
        catch(IOException e){
            System.out.println(e);
            System.out.println("Can not create a new file");

        }*/
        //-------------------writing in file
       /* try{
            FileWriter fileWriter=new FileWriter("Shivansh.txt");
            fileWriter.write("he default whitespace delimiter used by a scanner is as recognized by Character.isWhitespace. The reset() method will reset the value of the scanner's delimiter to the default whitespace delimiter regardless of whether it was previously changed.\n" +
                    "\n" +
                    "A scanning operation may block waiting for input.\n" +
                    "\n" +
                    "The next() and hasNext() methods and their primitive-type companion methods (such as nextInt() and hasNextInt()) first skip any input that matches the delimiter pattern, and then attempt to return the next token. Both hasNext and next methods may block waiting for further input. Whether a hasNext method blocks has no connection to whether or not its associated next method will block.\n" +
                    "\n" +
                    "The findInLine(java.lang.String), findWithinHorizon(java.lang.String, int), and skip(java.util.regex.Pattern) methods operate independently of the delimiter pattern. These methods will attempt to match the specified pattern with no regard to delimiters in the input and thus can be used in special circumstances where delimiters are not relevant. These methods may block waiting for more input.");
            fileWriter.close();
            System.out.println("you have written in the file");
        }
        catch(IOException e){
            System.out.println(e);
            System.out.println("Can not write in the file");

        }*/
//  ------------------------------------------Reading file
        /*try {
            Scanner scn = new Scanner(myFile); /// ye input lega  hmari shivansh file s
            while (scn.hasNextLine()) {   //true
                String s = scn.nextLine();
                System.out.println(s);
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }*/

        //-------Deleting file
        if(myFile.delete()){
            System.out.println("File is deleted");
        }
        else{
            System.out.println("Couldn't delete file");
        }





    }
}
