package com.jc;


import java.util.ArrayList;
import java.util.List;

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
//PARCOURIR L'ARBRE
    public void traversePreOrder(){
        traversePreOrder(root);

    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }
    public void traversePostOrder(){
        traversePostOrder(root);
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
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.printf(root.value  + " ");

    }
    //VERIFIER SI DEUX ARBRES SONT ÉGAUX
    public boolean equals(Tree other){
        if(other == null){
            return false;
        }
        return equals(root, other.root);
    }
    private boolean equals(Node node1, Node node2){
        if(node1 == null && node2 == null){

            return true;
        }
        if(node1 != null && node2 != null){

            return node1.value == node2.value
                    && equals(node1.leftChild, node2.leftChild)
                    && equals(node1.rightChild, node2.rightChild);
        }
        return false;
    }

    //CALCULER LA HAUTEUR DE L'ARBRE

    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node == null){
            return  -1;
        }
        if(node.leftChild==null && node.rightChild==null){
            return 0;
        }
        return 1 + Math.max(height(node.leftChild),height(node.rightChild));
    }
    //Calculer la distance des nœuds ayant une distance précise avec la racine
    public void printNodesAtDistance(int distance ){
        printNodesAtDistance(root, distance);
    }

    private void printNodesAtDistance(Node node, int distance){
        if(node == null){
            return ;
        }
        if(distance == 0){
            System.out.print(node.value + " ");
            return;
        }
        printNodesAtDistance(node.leftChild, distance - 1);
        printNodesAtDistance(node.rightChild, distance - 1);
    }

    //Affgicher les nœuds par rapport à la racine
    public List<Integer> getNodesAtDistance(int distance){
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);

        return list;

    }
    private void getNodesAtDistance(Node node , int distance, List<Integer> list){
        if(node == null){
            return;
        }
        if(distance == 0){
            list.add(node.value);
            return;
        }
        getNodesAtDistance(node.leftChild, distance - 1, list);
        getNodesAtDistance(node.rightChild, distance - 1, list);

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
