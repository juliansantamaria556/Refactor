public class Segundo 
{     
	public int[]  Segundo() 
	{
       	final int M = 1000;
     	final int RR = 50;
	    final int CC = 4;
     	final int ORDMAX = 30;
     	int P[] = new int[M+1];
     	int J = 1;
    	int K = 1;
     	boolean JPRIME;
     	int ORD = 2;
     	int SQUARE = 9; 
    	int N=0;
     	int MULT[] = new int[ORDMAX+1];
     	P[1] = 2;
        while (K < M) 
		{
        	do 
			{
            	J += 2;
            	if( J == SQUARE) 
				{
		        	ORD++;
         		    SQUARE=P[ORD]*P[ORD];
         		    MULT[ORD-1]=J;
           		}
         		N=2;
	            JPRIME=true;
         		while (N < ORD && JPRIME) 
				{
	     			while (MULT[N]<J)
	     				MULT[N] += P[N] + P[N];
                    if (MULT[N] == J)
                    	JPRIME=false;
					N++;
                }
             }while (!JPRIME);
	        K++;
         	P[K]=J;
       	}
       	return P;
   	} 
}