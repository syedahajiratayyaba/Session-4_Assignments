public class EvenProgram
{
    public static void main(String args[])
    {
        int a[]= new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i] = i+1;
        }
        System.out.println("Even Numbers:");

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}