package insert;

public class Insertsort {
    public static void main(String[] args){
        int arr[]={34,23,52,1};
        for(int i=0;i<arr.length;i++){
            int ket=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>ket){
                arr[j++]=arr[j];
                j--;
            }
            arr[j++]=ket;
        }
        for(int num:arr)System.out.print(num+" ");
    }
}
