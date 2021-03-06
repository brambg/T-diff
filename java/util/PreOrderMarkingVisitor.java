package util;

/*
 * A visitor to be used in marking preorder positions of each tree node
 */
public class PreOrderMarkingVisitor implements Visitor {
	private int position;
	private final Tree tree;

	public PreOrderMarkingVisitor(Tree tree) {
		position = 1;
		this.tree = tree;
	}

	@Override
	public void visit(TreeNode node) {
		tree.setNodeAt(position, node);
		position += 1;
	}
}