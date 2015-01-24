public class Permutation
{
	public static void main(String arg[])
	{
		int ar[] = {1,2,3};
		permute(ar,0,3);
	}
	public static void permute(int ar[],int index,int count)
	{
		if(count==0)
		{
			printArray(ar);
		}
		for(int i=index;i<ar.length;i++)
		{
			swap(ar,index,i);
			permute(ar,index+1,count-1);
			swap(ar,index,i);
		}
		
		

	}
	public static void printArray(int ar[])
	{
		for(int a :ar)
		{
			System.out.print(a+" ");
		}
		System.out.println("");

	}
	public static void swap(int ar[], int a , int b)
	{
		int temp = ar[a];
		ar[a]= ar[b];
		ar[b] = temp;
	
	}


}
