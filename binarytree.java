class Node{
    int data;
    Node left;
    Node right;

public Node(int data){
    this.data=data;
}
}

public class binarytree {
    Node root;
    public void insert(int data){
        root=insertrec(root,data);
    }

    public Node insertrec(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        else if(data<root.data){
            root.left=insertrec(root.left,data);
        }
        else if(data>root.data){
            root.right=insertrec(root.right , data);
        }
        return root;

    }
    // public void inorder(){
    //     inorderrec(root);

    // }
    // public void inorderrec(Node root){
    //     if (root!= null){
    //         inorderrec(root.left);
    //         System.out.print(root.data + " ");
    //         inorderrec(root.right);

    //     }
    public void preorder(){
        preorderrec(root);

    }
    public void preorderrec(Node root){
        if (root!= null){
            System.out.print(root.data + " ");
            preorderrec(root.left);
            preorderrec(root.right);

        }
    }
    
    public static void main(String[] args) {
        binarytree nums=new binarytree();
        nums.insert(20);
        nums.insert(13);
        nums.insert(6);
        nums.insert(7);
        nums.insert(1);
        nums.insert(12);
        nums.insert(15);

       // nums.inorder();
       nums.preorder();
    }
    
}

