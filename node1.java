package agac;
//Mustafa Zuvin @mzuvin
public class Node1 {
	int id;
	Node1 left;
	Node1 right;

	public Node1(int id) {
		this.id = id;
		left = null;
		right = null;
	}

	// 1‐ EKLEME ALGORİTMASI
	public boolean addBST(int item) {
		if (item == id)
			// eğer girilen değişken birbirine eşitse false dönder
			return false;
		else if (item < id) {// value id den küçükse soluna ekle
			if (left == null) {// sol null mı
				// System.out.println("\nleft"+left);
				left = new Node1(item);
				return true;
			} else// sol boş değilse
				return left.addBST(item);
		} else if (item > id) {
			if (right == null) {// Boşluk bulunca ekleme yapar.
				right = new Node1(item);
				return true;
			} else
				return right.addBST(item);
		}
		return false;
	}

	// 2.Gezinme Algoritmaları
	// 2.1-Ara Gezinme+ inorderTraversel
	void inorderTraversel() {
		if (left != null)
			left.inorderTraversel();
		System.out.println(id);
		if (right != null)
			right.inorderTraversel();
	}

	// 3‐ ARAMA ALGORİTMASI
	// 3.1‐ Değer Arama+
	Node1 search(int item) {
		if (id == item)
			return this;
		else if (id > item)
			if (left != null) {
				return left.search(item);
			} else
				return null;
		else if (right != null) {
			return right.search(item);
		} else {
			return null;
		}
	}

	// 3.2‐ Ebeveyn Arama
	Node1 searchParent(int item, Node1 parent) {
		if (id == item)
			return parent;// bir önceki nesne
		else if (id > item)
			if (left != null) {
				return left.searchParent(item, this);
			} else
				return null;
		else if (right != null) {
			return right.searchParent(item, this);
		} else {
			return null;
		}
	}

	// 3.3‐ En Büyüğü Bulma
	Node1 searchMax() {
		// Node sonuc = this;
		if (right == null)
			return this;
		else
			return right.searchMax();
	}

	// 3.4. En Küçüğü Bul
	Node1 searchMin() {
		if (left == null)
			return this;
		else
			return left.searchMin();
	}

	// 3.5‐ Düğüm Alt Ağacında En Büyüğü Bul
	Node1 searchMax(Node1 nd) {
		if (nd.right == null)
			return nd;
		else
			return nd.right.searchMax(nd.right);
	}

	// 3.6‐ Düğüm Alt Ağacında En Küçüğünü Bul
	Node1 searchMin(Node1 nd) {
		if (nd.left == null)
			return nd;
		else
			return nd.left.searchMin(nd.left);
	}

	// silme recursive
	void remove(int item) {
		Node1 sItem = search(item);
		Node1 sp = searchParent(item, sItem);
		if (sp == null)
			return;
		else {
			if ((sItem.left == null) && (sItem.right == null)) {
				// hiç cocugu olmayan
				if (sp.left == sItem)
					sp.left = null;
				else
					sp.right = null;
			} else if ((sItem.left == null) && (sItem.right != null)) {
				// sadece sağ çocuğu olan
				sp.right = sItem.right;
			} else if ((sItem.left != null) && (sItem.right == null)) {
				// sadece sol cocugu olan
				sp.left = sItem.left;
			} else {// iki çocugu olan..
				int a = sItem.right.searchMin().id;
				Node1 nd = searchParent(a, sItem.right.searchMin());
				sItem.id = a;
				if (nd.left.id == a)
					nd.left = null;
				else
					nd.right = null;
			}
		}
	}

}
