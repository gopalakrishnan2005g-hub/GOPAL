//1)SUM OF ELEMENTS IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements = " + sum);
    }
}

//2)SECOND LARGEST ELEMNT IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];
        int secmax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
      }
        System.out.println(secmax);
    }
}

//3)ARRAY REVERSE

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

//4)POSITION OF AN ELEMENT IN ARRAY

public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10};
        int s = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println(i+1);
            }
        }
    }
}	

//5)REMOVE DUPLICATES IN AN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,10};
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length; j++){
            if (arr[i] == arr[j]) {
                arr[j]=-1;
            }
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=-1){
                System.out.println(arr[i]+" ");
            }
        }
    } 
}

//6)COUNT ODD OR EVEN

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 9, 35};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}

//7)SORT AN ARRAY (ASCENDING ORDER)

public class Main {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 23};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
}
    }
}

//8)FIND TARGET SUM IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 7, 3, 9};
        int t = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + t);
                }
            }
        }
    }
}

//9)FREQUENCY OF ELEMENTS IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 20, 10};
        for (int i=0;i<arr.length;i++) {
            int c=1;
            if (arr[i]==-1) {
                continue;
            }
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    arr[j]=-1;
                }
            }
            System.out.println(arr[i] + " occurs " + c + " times");
        }
    }
}

//10)ADD 3 NO.S TO FIND A TARGET IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t = 9;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == t) {
            System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + " " + "=" + t);
                    }
                }
            }
        }
    }
}

//11)DESCENDING ORDER IN ARRAY

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 40, 30};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
