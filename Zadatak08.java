/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak08;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class Zadatak08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of a stack: ");
        System.out.print("-> ");
        int stackLength = sc.nextInt();

        for (int i = 0; i < stackLength; i++) {
            System.out.println("Enter " + (i + 1) + " element of a stack: ");
            System.out.print("-> ");
            int stackElement = sc.nextInt();
            if (stackElement == -1) {
                break;
            }
            stack.push(stackElement);
        }

        System.out.println(stack);
        System.out.println(stackAvg(stack));
    }

    public static double stackAvg(Stack<Integer> stack) {
        int i = 0;
        double sum = 0;
        while (!stack.isEmpty()) {
            int n = stack.pop();
            sum = sum + n;
            i++;
        }
        return sum / i;
    }

}
