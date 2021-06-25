import java.util.*;
public class ArraySecondMax {

    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter array");
        Long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.next();

            if(Long.parseLong(arr[i])>max)
            {
                max=Long.parseLong(arr[i]);
            }

        }
        Long floor=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(Long.parseLong(arr[i])>floor && Long.parseLong(arr[i])<max)
            {
                floor=Long.parseLong(arr[i]);
            }
        }

        System.out.println("Second Max is "+floor);
    }
}




