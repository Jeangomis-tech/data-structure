package com.jc;


public class Tree {

    private Node root;

    public void insert(int value){
         var node  = new Node(value);
         if(root==null){
             root=node;
             return;
         }
         var current = root;
         while(true){
             if(value <current.value){
                if(current.leftChild==null){

                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
             }else{
                 if(current.rightChild==null){

                     current.rightChild = node;
                     break;
                 }
                 current = current.rightChild;
             }
         }
    }
    public boolean contains(int value){
        var current = root;
        while(current != null){
            if(value<current.value){
                current = current.leftChild;
            }else if(value>current.value){
                current = current.rightChild;
            }else{
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);

    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    private void traverseInOrder(Node root){
        if(root==null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);

    }

    private void traversePostOrder(Node root){
        if(root==null){
            return;
        }
        traversePostOrder(root.rightChild);
        traversePostOrder(root.leftChild);
    }

    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }


}
