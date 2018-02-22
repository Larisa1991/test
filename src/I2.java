import java.util.Scanner;
public class I2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//создание массива 10 выигрышных чисел
		int[] sluchChisla = new int[10];
        for(int i=0;i < sluchChisla.length; i++)
        {
        	sluchChisla[i]=in.nextInt();
        	
        }
        int kolbilet=in.nextInt();
        String[]rezultat=new String[kolbilet];
                    
        	for(int i=0;i<kolbilet; i++)
            {
        		int kolsovpaden=0;
        		for(int j=0;j<6; j++)
            	{
        			 for(int l=0; l < sluchChisla.length; l++ )
        			 {
	            		if(sluchChisla[l]==in.nextInt())
	            		{
	            			kolsovpaden=kolsovpaden+1;
	            			break;
	            		}	            		
        			 }
        		}
        		if(kolsovpaden>=3)
   			 {rezultat[i]="Lucky";}
   			 else{rezultat[i]="Unlucky";}
        		
            }  
        	for(int i=0;i<kolbilet; i++)
            {
        		System.out.println(rezultat[i]);
            }
	}

}
