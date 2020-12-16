public class SortsTester{

  public static void main(String[] args){
    int[] a = new int[]{1,3,6,4,7};
    Sorts.bubbleSort(a);
    for (int i = 0; i < a.length; i++){
      System.out.print(a[i] + ",");
    }
  }
}
