import java.io.*;
import java.util.Scanner;
public class Igra {

	public static int[] stroka(String string)
	{
		 String stringArr[] = string.split(" ");
         int[] intArr = new int[stringArr.length];
         for (int i = 0; i < intArr.length; i++)
         {
             intArr[i] = Integer.parseInt(stringArr[i]);                         
         }  
         return intArr;
     }
	
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
        if(kolsovpaden1>=3) {rez="Lucky";}
        else {rez="Unlucky";}
        return rez;
    }

    public static void main(String[] args)throws Exception {
    	Scanner in = new Scanner(System.in);
    	System.out.println("¬ведите: 0-если ввод с консоли");
    	System.out.println("         1-если ввод с файла");
    	int input=in.nextInt();
    	
    	System.out.println("¬ведите: 0-если вывод в консоль");
    	System.out.println("         1-если вывод в файл");
    	int conclusion=in.nextInt();
    	
    	FileReader fr= new FileReader("file.txt");
        FileWriter fw = new FileWriter( "file1.txt" );
        Scanner scan = new Scanner(fr);
        String string; 
        
        int[] sluchChisla=new int[10] ;
        string = scan.nextLine();
        for(int i=0;i < sluchChisla.length; i++)
            {
            	if(input==1){sluchChisla[i]= stroka(string)[i];}
            	if(input==0){sluchChisla[i]=in.nextInt();}
            }
         string = scan.nextLine();

         int kolbilet = 0;
         if(input==1){kolbilet= stroka(string)[0];}
         if(input==0){kolbilet=in.nextInt();}
         for (int i = 0; i < kolbilet; i++)
          {
        	 string = scan.nextLine();
        	 int[] Arr = new int[6];
        	 for(int j=0;j< Arr.length; j++)
        	 {
        		 if(input==1){Arr[j]= stroka(string)[j];}
        		 if(input==0){Arr[j]=in.nextInt();}
        	 }
        	 String rez = rez(sluchChisla, Arr,0);
        	 if(conclusion==1){fw.write(rez+"\n");}
        	 if(conclusion==0){System.out.println(rez);}
          }
         fw.close();
         fr.close();
         in.close();
    }
}
