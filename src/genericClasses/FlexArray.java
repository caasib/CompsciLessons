package genericClasses;

import java.util.ArrayList;
import java.util.Random;

//T is some generic class/object type --> String, Integer (not int), Double (not double)
public class FlexArray <T>{
    ArrayList<T> flex;

    public FlexArray() {
        flex = new ArrayList<T>();
    }

    //we can choose the functionality of our flex array
    public boolean add(T element) {
        //This condition prevents empty objects and duplicates from being added
        if (!flex.contains(element) && element != null) {
            flex.add(element);
            return true;
        }
        else {
            System.out.println(element + " cannot be added to the flex array.");
            return false;
        }
    }

    public int size() {
        return flex.size();
    }

    public void showElements() {
        System.out.print("[");
        for (int i = 0; i < size() - 1; i++) {
            System.out.print(flex.get(i) + ", ");
        }
        System.out.println(flex.get(size() - 1) + "]");
    }

    public void trim(int num) {
        int count = 0;
        if (Math.abs(num) <= flex.size()) {
            if (num >= 0) {
                while (count < num) {
                    flex.remove(flex.get(0));
                    count++;
                }
            }
            else {
                while (count < -num) {
                    flex.remove(flex.size() - 1);
                    count++;
                }
            }
        }
        else {
            System.out.printf("Not enough elements in flex array to remove %d elements.\n", Math.abs(num));
        }
    }

    public T give(int index) {
        if (index > 0 && index <= size()) {
            return flex.get(index);
        }
        return null;
    }

    public static void main(String[] args) {
        Random rand = new Random(1);
        FlexArray<Integer> flex = new FlexArray<>();
        for (int i = 0; i < 10; i++) {
            flex.add(rand.nextInt(30));
        }
        flex.showElements();
        flex.trim(-3);
        flex.showElements();
    }
}
