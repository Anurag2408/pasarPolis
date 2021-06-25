import java.util.*;
public class ArraySecondMax {
    public static Long findSecondMax(String[] arr,int length){
        //Set<String> setOfNumbers= new HashSet<>(Arrays.asList(arr));
        if(length ==0)
            return  -1L;
        Long max = Long.MIN_VALUE;
        for( int i=0; i< length;i++){
            if (Long.parseLong(arr[i]) > max) {
                max = Long.parseLong(arr[i]);
            }
        }
        Long floor = Long.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (Long.parseLong(arr[i]) > floor && Long.parseLong(arr[i]) < max) {
                floor = Long.parseLong(arr[i]);
            }
        }
        if(floor.equals(Long.MIN_VALUE))
            floor = -1L;
        return floor;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String arr[] = new String[length];
        if(length != 0) {
            System.out.println("Enter array");
            for (int i = 0; i < length; i++) {
                arr[i] = sc.next();
            }
        }
        System.out.println(findSecondMax(arr,length));
    }
}



