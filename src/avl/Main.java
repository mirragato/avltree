package avl;


import java.util.Iterator;

import java.util.Random;

public class Main {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] randomInts = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            randomInts[i] = random.nextInt(SIZE);
        }
        AVLTree tree = new AVLTree<>();
        for (int i = 1; i < SIZE; i++) {
            tree.add(randomInts[i]);
        }

        Iterator iterator= tree.iterator();

        while (iterator.hasNext())
            iterator.next();

        for (int i = 0; i < SIZE; ++i) {
            System.out.print(tree.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Empty? " + tree.isEmpty());
        System.out.println("Size: " + tree.size());
        System.out.println("Contain 5? " + tree.contains(5));
        System.out.println("String: " + tree.toString());
        System.out.println("Remove 6: " + tree.remove(6));

    }

}
