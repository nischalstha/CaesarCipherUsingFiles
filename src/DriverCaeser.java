import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DriverCaeser 
{
	 // Driver code
    public static void main(String[] args) throws IOException
    {
    	CaesarCipher c = new CaesarCipher();
    	
    	String output = "";
        Scanner input = new Scanner(System.in);
    	System.out.print("Enter the shift number: ");
        int i = input.nextInt();
        
        File reader = new File ("plain.txt");
        Scanner in = new Scanner(reader); // creates scanner
        
        while(in.hasNextLine())
        {
        	
        	String line = in.nextLine();
        	output += c.encrypt(line, i);
        }
              
        PrintWriter writer = new PrintWriter("output.txt");
        writer.println(output);
        
        writer.close();
        in.close();
        input.close();

        File outreader = new File ("output.txt");
        Scanner out = new Scanner(outreader);
        
        String outputtwo = "";
        while(out.hasNextLine())
        {
        	String outline = out.nextLine();
        	outputtwo += c.decrypt(outline, i);
        }
      
        System.out.println("The encrypted text: " + output);
        System.out.println("The decrypted text: " + outputtwo);
        
        out.close();      
    }
}
