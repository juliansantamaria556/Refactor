public class Tercero
{     
	public  void Tercero(int P[]) 
	{
     	final int RR = 50;
	    final int CC = 4;
     	int PAGENUMBER = 1;
     	int PAGEOFFSET = 1;
     	int ROWOFFSET;
	    while (PAGEOFFSET <= 1000) 
		{
			System.out.println("The First 1000"+" Prime Numbers === Page "+Integer.toString(PAGENUMBER)+"\n");
       		for (ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+RR-1; ROWOFFSET++) 
			{
             		for (int C = 0; C <= CC - 1; C++)
	                     if (ROWOFFSET + C * RR <= 1000)
                     		System.out.printf("%10d", P[ROWOFFSET + C * RR]);
               
             	System.out.println();
         	}
     		System.out.println("\f");
     		PAGENUMBER++;
     		PAGEOFFSET += RR*CC;
       	}
   	} 
}