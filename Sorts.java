public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int len = data.length;
    for (int i = 0; i < len-1; i++){
      for (int j = 0; j < len-i-1 ; j++){
        if (data[j] > data[j+1]){
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
    }
  }
}

/*
check if int at index is less than index at i+1
yes do nothing
no, swap
*/
