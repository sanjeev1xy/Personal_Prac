package Danger;

public class Product_Array_Except_Self_Leet_Code 
{
	
	// Approach 1 -Incomplete
	/*public int [] productExceptSelf (int [] nums)
	{
	
		// Array to store all left multiplication
		
		int [] left=new int [nums.length];
		
		// Array to store all right multiplication
		
		int [] right=new int [nums.length];
		
		left[0]=1;
		for (int i=1 ;i<nums.length ; i++)
		{
			left[i]=left[i-1]*nums[i-1];
		}
		
		right [nums.length-1]=1;
		for(int i=nums.length-2 ; i>-1 ;i--)
		{
			right[i]=right[i+1]* nums[i+1];
		}
		
		int[] ans=new int[nums.length];
		for(int i=0 ; i<nums.length ;i++)
		{
			ans[i]=left[i]* right[i];
		}
		
		return ans;
	}
	*/
	// Approach 2 - Incomplete
	
	/*public void productArray(int arr[] , int n)
	{
		//Base Case
		if (n==1)
		{
			System.out.println(0);
			return;
		}
		
		//Initialize memory to all arrays
		int left []=new int[n];
		int right[]=new int[n];
		int prod[]=new int[n];
		
		
		// Left most element of left array is always 1
		left[0]=1;
		
		// Right most element of right array is always 1
		right[n-1]=1;
		
		// Construct the left array
		
		for(int i=1 ;i<n ;i++)
		{
			left[i]=arr[i-1]*left[i-1];
		}
		
		//Construst the right array
		
		for(int j=n-2 ;j>=0 ;j--)
		{
			right[j]=arr[j+1]*right[j+1];
		}
		
		//Construct bthe product array using left[] and right[]
		
		for(int i=0 ;i<n ;i++)
		{
			prod[i]=left[i]*right[i];
		}
		
		// print the constructed prod array
		
		for(int i=0 ;i<n ; i++)
		{
			System.out.println(prod[i]+" ");
			
			return;
		}
	}	*/
	
	/*public static void main(String[] args) 
	{
		Product_Array_Except_Self_Leet_Code pa=new Product_Array_Except_Self_Leet_Code();
		int [] nums= {1,2,3,4};
		//int n=nums.length;
		//System.out.println("The Product array is :  ");
		//pa.productExceptSelf(nums);
		System.out.println(pa.productExceptSelf(nums));
	}*/
	
	
	// Approach-3 
	
	public void prodArray(int a[], int n)
	{
	 int p[] = new int[n], prod=1;
     
     //Find product of all elements of a[]
     for(int i=0; i<n; i++){
         prod = prod * a[i];
     }
     
     //Create array p[] to store
     //product except self
     for(int i=0; i<n; i++){
         p[i] = prod / a[i];
     }
     
     for(int i=0; i<n; i++){
         System.out.print(p[i] + " ");
     }
 }
 
 public static void main(String[] args){
Product_Array_Except_Self_Leet_Code pa=new Product_Array_Except_Self_Leet_Code();
   int a[] = {1, 2, 3, 4};
   int n = a.length;
   pa.prodArray(a,n);
 }
	

}
