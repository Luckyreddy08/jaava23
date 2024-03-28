class Largest{
public static void main(String[] args)
{
int[] arr =new int[] {25,10,9,78,66,99};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
}
System.out.println(" Largest element present in given array:"+max);
}
}