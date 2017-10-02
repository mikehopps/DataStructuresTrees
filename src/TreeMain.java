/**
 * Created by michael_hopps on 10/2/17.
 */
public class TreeMain {

    public static void main(String[] args) {

        Node head = new Node(7);

        Node t = new Node(6);
        head.setLeftChild(new Node(4, null, t));
        //left side done.

        t = new Node(10, new Node(9), new Node(11));
        head.setRightChild(t);

        //I want to print the contents of the tree!
        //ideally, sorted, low to high.

        System.out.println(head);

    }

}
