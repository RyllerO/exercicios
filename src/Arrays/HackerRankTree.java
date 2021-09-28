package Arrays;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /*
    class Node 
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }
    }

    public static int altura(Node p) {
        if (p != null) {
            int he, hd;

            he = altura(p.left);
            hd = altura(p.right);

            if (he > hd) {
                return he + 1;
            } else {
                return hd + 1;
            }
        }

        return 0;
    }
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()){
            Node n = q.remove();
            if (n.left != null){
                q.add(n.left);
            }

            if (n.right != null){
                q.add(n.right);
            }
            System.out.print(n.data+" ");
        }
    }

    static String areBracketsBalanced(String s)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return "NO";
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return "NO";
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return "NO";
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return "NO";
                    break;
            }
        }
        // Check Empty Stack
        return stack.isEmpty() ? "YES":"NO";
    }
    
    public static int arraySum(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(integer -> integer).sum();
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum3 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        return sum;
    }
    
    public static void fizzBuzz(Integer n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); //numero de nós que a arvore terá
        Node root = null;
        while (t-- > 0) { //repete até dar a quantidade total de numero de nós
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
//        int height = altura(root);
//        System.out.println(height);
        levelOrder(root);
    }
}