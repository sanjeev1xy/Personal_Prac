package Danger;

import java.util.Arrays;

public class Count_Occurence_Array
{
	
public static void main (String[] args)
{
	int [] intarr= {1,2,3,45,4,3,2,1,7,8,9,5,6,7,8,9,3,2,1,2,5};
	 Arrays.sort(intarr);
	 for(int i=0 ;i<intarr.length ;i++)
	 {
		 int count=1;
		 if(i!=intarr.length-1)
		 {
		 for (int j=i+1;j<intarr.length;j++)
		 {
			 if(intarr[i]==intarr[j])
			count++;
			 else
				 break;
		 }
		 }
		 System.out.println(intarr[i]+"- ->"+count);
		 i+=(count-1);
	 }
	
}

	}
