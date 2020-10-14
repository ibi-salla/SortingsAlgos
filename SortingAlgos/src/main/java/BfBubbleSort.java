public class BfBubbleSort {

    public static void main (String [] args){

        int a[]={1,2,3,4,5};

        for ( int i=0; i<a.length; i++){
            for (int j=0; j<a.length -1; j++){
                if (a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;

                }
            }
        }
        System.out.println("after sorting");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }

}
