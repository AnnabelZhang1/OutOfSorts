import java.util.Random;
public class SortsTester{

  public static void main(String[] args){
    int[] a = new int[]{1,3,6,4,7};
    Sorts.bubbleSort(a);
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + ",");

    System.out.println("");

    int[] b = new int[]{0,0,0,0,0,0,0};
    Random rng = new Random();
    for(int i = 0; i < 7; i++)
      b[i] = (rng.nextInt() % 1000);
    Sorts.bubbleSort(b);
    for (int i = 0; i < a.length; i++){
      System.out.print(b[i] + ",");
    }
  }
}
