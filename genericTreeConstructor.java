package generic_trees;
import java.util.*;

import org.w3c.dom.Node;



public static genericTreeConstructor tree{
  

  int data;
  ArrayList<Node> children  =new ArrayList<>();
}

 public static void main(String[] args) {

  int arr[]= {50,60,80, -1, 2, -1, 0, -1, 6, -9};
  Node root = null;


  Stack<Node> st =new Stack<>();

 

  for(int i = 0; i< arr.length; i++) {

    if(arr[i] == -1){
      st.pop();
    }
    else{
      Node t = new Node();
      t.data = arr[i];

      if(st.size() >0) {
        st.peek().children.add(t);

      }
      else{
        root = t;
      }
      st.push(t);
    }
  }
}

public static void display(Node node) {
for(Node child : children) {
  System.out.println(child.data);
}

for(Node child: children) {
  display(child);
}
  }


// public static genericTreeConstructor{

//   public static class Node {
//     int data;
//     ArrayList<Node> children = new ArrayList<>();
//   }

//   public static void main(String[] args) {
    
//     int arr[]= {50,60,80, -1, 2, -1, 0, -1, 6, -9};
//     Stack<Node> st = new Stack<>();

//     Node root = null;

//     for(int i =0; i<arr.length; i++) {
//       if(arr[i] == -1) {
//         st.pop();
//       }
//       else {
//         Node t = new Node();
//         t.data = arr[i];

//         if(st.size() >0) {
//           st.peek().children.add(t);
//         }
//         else {
//           root  =t;
//         }
//         st.push(t);
//       }
      
//     }
//   }

//   public static void display(Node node) {

//     String str = node.data+ "->";
     
//     for(Node child : node.children) {
//       str+= child.data+",";
//     }
//     str+=".";
//     System.out.println(str);

//     for(Node child : node.children) {
//       display(child);
//     }
//   }
// }


public static int size(Node node) {
  int s = 0;
  for(Node child: children) {
   s +=size(child);
  }

  s = s+1;
  return s;
}

public class tree {
  int data;
  ArrayList<Node> children = new ArrayList<>();

  public static void main(String[] args){
    int arr[]= {50,60,80, -1, 2, -1, 0, -1, 6, -9};

    Stack<Node> st = new Stack<>();
Node root = null;
    for(int i =0;i<arr.length; i++) {
      if(arr[i] == -1) {
        st.push();
      }
      else{
        Node t = new Node();
        t.data = arr[i];

        if(st.size()>0) {
          st.peek().children.add(t);
        }
        else{
          root = t;
        }
        st.push(t);
      }
    }


  }
}

public static void display(Node node) {

  for(Node child :node.children) {
    Systsem.out.println(child.data);
  }
  for(Node child:node.children) {
    display(child);
  }
}