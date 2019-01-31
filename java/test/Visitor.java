package test;

import java.util.ArrayList;
import java.util.List;

import util.*;

public class Visitor implements util.Visitor {
	final List<String> traversal;

	/*
	 * Builds an array of node labels it visits
	 */
	public Visitor() {
		traversal = new ArrayList<>();
	}

	/*
	 * Records the label of the node visited
	 */
	public void visit(TreeNode node) {
		traversal.add(node.debug_string());
	}
}