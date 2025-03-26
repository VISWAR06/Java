package selectsor;
import java.util.*;
public class Selection {
    public static void main(String[] args){
    int[] a={34,5,23,12,1};
    for(int i=0;i<a.length;i++){
        int min=i;
        for(int j=i+1;j<a.length;j++){
               if(a[j]<a[min]){
                min=j;
               }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;
        
    }
    System.out.print(Arrays.toString(a));
    }
}
