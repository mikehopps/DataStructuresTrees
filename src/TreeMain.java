import java.util.Arrays;

/**
 * Created by michael_hopps on 10/2/17.
 */
public class TreeMain {

    public static void main(String[] args) {


        int[] arr = {4, 2, 7, 8, 10, 11, 9, 12};

        Node head = new Node(8);
        head.add(6);
        head.add(4);
        head.add(7);
        head.add(10);
        head.add(9);
        head.add(11);

        System.out.println(head);

    }

    //returns the head of well built binary search tree
    //that contains the contents of arr.
    public static Node treeFromArray(int[] arr){
        Arrays.sort(arr);

        return null;
    }

}
