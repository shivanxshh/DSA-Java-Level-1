package Tree.BST;

import java.io.*;
import java.util.*;

public class AddNodeToBst {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static Node add(Node node, int data) {
        if(node==null){
            Node newNode=new Node(data,null,null);
            return newNode;
        }
        if(data<node.data){
            node.left=add(node.left,data);
        }
        else if(data>node.data){
            node.right=add(node.right,data);
        }
        return node;

        // write your code here
    }
    public static Node add1(Node root, int data) { // iterative
        Node curr = root;
        Node par = null;
        while(true){
            if(curr == null){
                break;
            }
            if(data == curr.data){
                // ignore
                return root;
            }else if(data > curr.data){
                par = curr;
                curr = curr.right;
            }else if(data < curr.data){
                par = curr;
                curr = curr.left;
            }
        }
        Node newnode = new Node(data,null,null);// new node
        if(par == null){
            return newnode;
        }else if(data < par.data){
            par.left = newnode;
        }else if(data > par.data){
            par.right = newnode;
        }
        return root;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        int data = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        //root = add(root, data);
        root = add1(root, data);

        display(root);
    }

}
