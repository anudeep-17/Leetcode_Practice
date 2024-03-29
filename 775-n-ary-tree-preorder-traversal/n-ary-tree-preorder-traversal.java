/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> Tree = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) 
    {

        if(root == null)
        {
            return Tree;
        }
        if(root.children != null)
        {
            Tree.add(root.val);
            for(Node child: root.children)
            {
                preorder(child);
            }
        }
        
        return Tree;

    }
}