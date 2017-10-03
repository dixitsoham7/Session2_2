public class PatternJava {

	public static void main(String[] args) {
	        int i=0, j, x;
	        char k;
	        for(x=1;x<6;x++)
	        {
	            if(x<=3)
	            i = x;
	            else
	            i--;
	            k=(char)('a'-1);
	            for(j=1;j<6;j++)
	            {
	                if(j>=3-(i-1)&&j<=3+(i-1))
	                {
	                    if(j<=3)
	                    k++;
	                    else
	                    k--;
	                    System.out.print(k);
	                }
	                else
	                {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	}

}
