import BinaryTree.BinarySearchTree;
import BinaryTree.BinaryTreeByArray;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("\t\t\tWelcome to menu driven program to play with tree");
            System.out.println("\t\t\tEnter your choice\n\n");
            System.out.println("\t\t\t1.Create Binary tree by using Linked List.");
            System.out.println("\t\t\t2.Create Binary tree by using Array.");
            System.out.println("\t\t\t3.EXIT\n\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> new BinarySearchTree().implement();
                case 2 -> {
                    System.out.println("\n\t\tEnter the size of the array :");
                    new BinaryTreeByArray(sc.nextInt()).implement();
                }
                case 3 -> {
                    flag = false;
                }
                default -> System.out.println("\t\t\tWrong choice selected.");
            }
        }
    }
}
