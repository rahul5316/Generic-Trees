

public class HeightOfAGenericTre{
  

  private class Node{

    int data;

    ArrayList<Node> children = new ArrayList<>();
  }

  public static int height(Node node) {
    
    int h = -1;

    for(Node child:node.children) {
       int ch = height(child);

       if(ch > h) {
         h = ch;
       }

      //
      //  else{
      //    h = h;
      //  }
    }

    h+=1;
    return h;

  }
  
  public static void main(String[] args) {


  
}
}