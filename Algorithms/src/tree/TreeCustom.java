package tree;

public class TreeCustom {
    Node root;

    public void addNode(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        }else{
            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;
                if(value < focusNode.value){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // traverse tree -> means how you are going to go throw nodes
    // in which order you will get contents of the tree
    // 3 ways of traversing tree: in order, pre-order, post-order

    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            preOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);

            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rightChild);
        }
    }

    public Node findNode(Integer value){
        Node focusNode = root;

        while(focusNode.value != value){
            if(value < focusNode.value){
                focusNode = focusNode.leftChild;
            } else{
                focusNode = focusNode.rightChild;
            }

            if(focusNode == null){
                return null;
            }
        }
        return focusNode;
    }
    public static void main(String[] args) {

        TreeCustom tree = new TreeCustom();
        tree.addNode(10);
        tree.addNode(1);
        tree.addNode(2);
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(8);
        tree.addNode(6);
        tree.addNode(9);
        tree.addNode(4);
        tree.addNode(11);
        tree.addNode(22);
        tree.addNode(14);
        tree.addNode(26);

        //tree.inOrderTraverseTree(tree.root);
        //tree.preOrderTraverseTree(tree.root);
        //tree.postOrderTraverseTree(tree.root);

        System.out.println(tree.findNode(11));
    }
}

class Node{
    int value;
    Node leftChild;
    Node rightChild;

    Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}