import java.io.*;
import java.util.Scanner;
public class Igra {

    public static String rez(int sluchChisla[], int intArr[], int kolsovpaden1)
    {
        for(int j=0;j<6; j++)
        {
            for(int l=0; l < sluchChisla.length; l++ )
            {
                if(sluchChisla[l]==intArr[j])
                {
                    kolsovpaden1=kolsovpaden1+1;
                    break;
                }
            }
        }
        String rez;
        if(kolsovpaden1>=3)
            	     
        {
            	rez="Lucky";
        }
        else
        {
        	rez="Unlucky";
        }
        return rez;
    }

    public static void main(String[] args)throws Exception {
        FileReader fr= new FileReader("file.txt");
        FileWriter fw = new FileWriter( "file1.txt" );
        Scanner scan = new Scanner(fr);

        int kolstrok=1;
        int[] sluchChisla=new int[10] ;
        while (scan.hasNextLine()) {

            String string = scan.nextLine();

            String stringArr[] = string.split(" ");
            int[] intArr = new int[stringArr.length];
            for (int i = 0; i < intArr.length; i++)
            {
                intArr[i] = Integer.parseInt(stringArr[i]);
            }

            if (kolstrok==1)
            {
                for(int i=0;i < sluchChisla.length; i++)
                {
                    sluchChisla[i]=intArr[i];
                }
            }

            if (kolstrok==2)
            {

            }

            if (kolstrok>2)
            {
            	String rez = rez(sluchChisla, intArr,0); 
            	fw.write(rez+"\n");
                
            }
            kolstrok++;
        }
        fw.close();
        fr.close();
    }
}
