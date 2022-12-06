

public class DepthFirstSearch {   
	 Node root;
	 int height = 0;
	 int nodesTraversed = 0;
	    		
	 public DepthFirstSearch()
	 {               
		 System.out.println("Call DFS with root node to do a Depth First Search.");
     }
	 
	 /**
	  * creates root
	  * @param node - name of node being made
	  */
     public void DFS(Node node)        
     {
    	 height = 0;
    	 nodesTraversed = 0;
    	 DFS(node, 1);
     }
     /**
      * finds how many levels in tree, returns children
      * @param node - node we're searching for
      * @param level - current tree level
      */
     public void DFS(Node node, int level)
     {
    	 System.out.println(node.getData());
    	 if(height<level)
    	 {
    		 height = level;
    		 nodesTraversed++;
    	 }
    	 if(node.getlChild() != null)
    	 {
    		 DFS(node.getlChild(), level+1);
    	 }
    	 if(node.getrChild() != null)
    	 {
    		 DFS(node.getrChild(), level + 1);
    	 }
     }
     
     

}
