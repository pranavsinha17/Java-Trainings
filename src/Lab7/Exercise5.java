package Lab7;
import java.util.*;
class Testing{
public int getSecondSmallest(int []a)
{
ArrayList<Integer> arList=new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
   arList.add(a[i]);
}
Collections.sort(arList);
return arList.get(1);
}
}
public class Exercise5{
public static void main(String[] args)
{
Testing t=new Testing();
int []a={5,4,3,2,1};
System.out.println(t.getSecondSmallest(a));
}
}

