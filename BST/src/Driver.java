/**
 Ishan Tandon; 5/4/22,
 This is the driver class for the BST lab
 **/
public class Driver {
    public static void main(String[] args) {
        //testing out all methods from Binary Search tree class
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("isEmpty method " + tree.isEmpty());

        System.out.println("Size method " + tree.size());

        System.out.println("Get method " + tree.get("well"));
        System.out.println("Contains method " + tree.contains("well"));


        System.out.println("Put method");
        tree.put(1, "indeed");
        tree.put(2, "lmao");
        tree.put(3, "lol");

        System.out.println("IsEmpty method " + tree.isEmpty());
        System.out.println("Size method " + tree.size());
        System.out.println("Get method " + tree.get(1));
        System.out.println("Contains method " + tree.contains(2));


        System.out.println("Max method " + tree.max());
        System.out.println("Min method " + tree.min());

    }
}
