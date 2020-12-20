public class Sorts{

//Bubble Sort
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

//Selection Sort
  public static void selectionSort(int[] data){
    int len = data.length;
    for (int i = 0; i < len-1; i++){
      int min = i;
      for (int j = i + 1; j < len; j++){
        if (data[j] < data[min])
          min = j;
      }
      int temp = data[min]; //temp = 2
      data[min] = data[i]; // 2 = 1
      data[i] = temp; //1 = 2
    }
  }

/*Insertion Sort
  public static void insertionSort(int[] data){

  }*/
}

// time java Driver 4000 bubble
