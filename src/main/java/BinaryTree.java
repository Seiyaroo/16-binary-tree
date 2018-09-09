public class BinaryTree<E> {
    private TreeNode<E> root;

    public void add(E value) {
        if (this.root == null) {
            this.root = new TreeNode<>(value);
        }
        this.add(value, this.root);
    }

    private void add (E value, TreeNode<E> current) {
        if () {

        }
    }
}






