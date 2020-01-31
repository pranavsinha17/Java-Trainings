package Lab1;
class Checker{
	public Boolean checkNo(int no)
	{
		 String str=Integer.toString(no);
	        int arr[];
	        arr=new int[str.length()];
	        int k=0;
	        while(no!=0)
	        {
	            int temp=no%10;
	            arr[k++]=temp;
	            no=no/10;
	        }
	       
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=i+1;j<arr.length;j++)
	        {
	            if(arr[i]<arr[j]){
	                return false;
	            }
	        }
	       
	    }
	    return true;
	}
}
public class Exercise3 {
	public static void  main(String []args)
	{
	Checker c=new Checker();
	System.out.println(c.checkNo(134468));
	
	}

}
