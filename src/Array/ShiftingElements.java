package Array;

public class ShiftingElements {
    public static void main(String[] args) {
        double [] myList = {1,2,3,4,5};
        double temp = myList[0];

        for (int i = 0; i < myList.length-1; i++){
            myList[i] = myList[i+1];
        }
        myList[myList.length - 1] = temp;

        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}
