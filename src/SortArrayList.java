import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
    int a[] = {10,25,15,30,9,20,5};
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0;i<a.length;i++) {
    	al.add(a[i]);
    }
    System.out.println("Before sort : "+al);
    Collections.sort(al);
    System.out.println("After sort : "+al);
    }
}
