import java.io.*;

public class Main {
    static class Node{
        int value;
        Node left,right;
        Node(int value) {
            this.value=value;
        }
        void addNode(Node node){
            if (this.value>node.value){
                if (this.left==null) this.left=node;
                else this.left.addNode(node);
            }else{
                if (this.right==null) this.right=node;
                else this.right.addNode(node);
            }
        }
    }
    static StringBuilder ans = new StringBuilder();
    static void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        ans.append(node.value+"\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder ans = new StringBuilder();
        String input = br.readLine();
        Node root = new Node(Integer.parseInt(input));
        while ((input=br.readLine())!=null){
            if (input.length()==0) break;
            Node node = new Node(Integer.parseInt(input));
            root.addNode(node);
        }
        postOrder(root);
        System.out.println(ans);
    }
}
