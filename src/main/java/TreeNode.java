public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public String toString() {
        if (this.data != null) {
            return data.toString();
        }
        return "null";
    }

    public TreeNode (int value) {
        this.data = value;
    }



}
