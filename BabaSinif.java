package agac;

public class BabaSinif {
	public static void main(String[] args) {
		Node1 root = new Node1(10);
		root.addBST(8);
		root.addBST(12);
		root.addBST(7);
		root.inorderTraversel();
		root.addBST(9);
		root.addBST(11);
		root.addBST(15);
		System.out.println("******");
		root.inorderTraversel();
		Node1 a = root.searchParent(15, root);
		System.out.println("Out: " + a.id);
		System.out.println("R: " + root.id);
		System.out.println("B: " + root.searchMax().id);
		System.out.println("K: " + root.searchMin().id);
		System.out.println("D: " + root.searchMax(root.search(10)).id);
		System.out.println("C: " + root.searchMin(root.search(10)).id);
		System.out.println("******");
		root.addBST(18);
		root.remove(8);
		root.inorderTraversel();
		root.remove(root.searchMax().id);
		root.inorderTraversel();
	}
}
