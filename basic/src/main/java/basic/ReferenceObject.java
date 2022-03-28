package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fangzhou
 * @date 2022-03-28 15:21
 */
public class ReferenceObject {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("1");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("2");
        change(arr1, arr2);

        System.out.println("arr1 = " + arr1.toString());
        System.out.println("arr2 = " + arr2.toString());


    }

    public static void change(ArrayList<String> arr1, ArrayList<String> arr2) {
        arr1.add("123");
        ArrayList<String> temp = null;
        temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
}
