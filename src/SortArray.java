import java.util.Scanner;

public class SortArray {
    int temp=0;
    String temp1;
    public void sort(int array[])
    {
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public void sortString(String array1[]){
        for(int i=0;i<array1.length;i++){
            for (int j=0;j<array1.length;j++){
                if(array1[i].compareTo(array1[j])>0)
                {
                    temp1=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp1;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size OF Arraay:");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter The Element :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        SortArray obj=new SortArray();
        obj.sort(array);

        System.out.println("Enter The Size OF Arraay:");
        int size1 = sc.nextInt();
        String array1[] = new String[size1];
        System.out.println("Enter The String :");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.next();
        }
        obj.sortString(array1);


    }

}

