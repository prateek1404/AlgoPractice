class MergeSort
{
	int ar[] = {3,6324,6,634,843,45,78,343,7465};
	public static void main(String args[])
	{
                  MergeSort mS = new MergeSort();
                  mS.mergeSort(); 

	}
	public int[] mergeSort(int ar[],int start,int end)
        {
             if(ar.length==1)
             {
                
             }
             int mid = (start+end)/2
             int m1[] = mergeSort(ar,start,mid);
             int m2[] = mergeSort(ar,mid+1,end);
	     int m3[] = merge(m1,m2);	

        }
        public int[] merge(int a[], int b[])
	{
		int len1 = a.length;
		int len2 = b.length;
		
	}
}
