/**
 *(a) Fill in blanks in the methods findFirst and findFirstHelper below such that they return the
index of the first Node with item n, or -1 if there is no such node containing that item.
b) Why do we use a helper method here? Why can’t we just have the signature for findFirst
also have a pointer to the curr node, such that the user of the function passes in the sentinel
each time?
*/

public class SLList {
    Node sentinel;

    public SLList() {
        this.sentinel = new Node();
    }

    private static class Node {
        int item;
        Node next;
    }

    public int findFirst(int n) {
        return ________________________________________;
    }

    private int findFirstHelper(int n, int index, Node curr) {
        if (____________________) {
            return -1;
        }
        if (____________________) {
            return index;
        } else {
            return ________________________________________;
        }
    }

}
