import java.io.*;
import java.util.Scanner;
public class I4 {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("file.txt"));
		
		
		//создание массива 10 выигрышных чисел
		int[] sluchChisla = new int[10];
        for(int i=0;i < sluchChisla.length; i++)
        {
        	sluchChisla[i]=in.nextInt();
        	
        }
        int kolbilet=in.nextInt();
        int[][]igroki= new int[kolbilet][6];
        for(int i=0;i<kolbilet; i++)
        {
        	for(int j=0;j<6; j++)
        	{
        		igroki[i][j]=in.nextInt();
        	}
        }
            
        	for(int i=0;i<kolbilet; i++)
            {
        		int kolsovpaden=0;
        		for(int j=0;j<6; j++)
            	{
        			 for(int l=0; l < sluchChisla.length; l++ )
        			 {
	            		if(sluchChisla[l]==igroki[i][j])
	            		{
	            			kolsovpaden=kolsovpaden+1;
	            			break;
	            		}	            		
        			 }
        			 if(kolsovpaden>=3)
        			 {break;}
            	}
        		PrintWriter pw= new PrintWriter("file1.txt");
        		if(kolsovpaden>=3)
   			 {
        			System.out.println("Lucky");
        			pw.println("Lucky");
   			}
   			 else{pw.println("Unlucky");
   			System.out.println("Unlucky");}
        	 }        	
	}

}
