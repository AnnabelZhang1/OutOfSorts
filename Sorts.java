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
      int min = i; //index of min
      for (int j = i + 1; j < len; j++){
        if (data[j] < data[min])
          min = j;
      }
      int temp = data[min];
      data[min] = data[i];
      data[i] = temp;
    }
  }

//Insertion Sort
  public static void insertionSort(int[] data){
    int len = data.length;
    for (int i = 1; i < len; i++){
      int switching = data[i];
      for (int j = i - 1; j >= 0 && data[j] > switching; j--){
        data[j + 1] = data[j];  //switch elements
        data[j] = switching;
      }
    }
  }
}

// time java Driver 4000 bubble
