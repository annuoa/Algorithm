package Swordfinger;

public class NO39 {
	public static int treeDepth(BinaryTreeNode pRoot){
		if (pRoot==null) {
			return 0;
		}
		int nleft = treeDepth(pRoot.getM_pleft());
//		System.out.println(pRoot.getM_pleft().getM_nValue());
		int nright = treeDepth(pRoot.getM_pright());
//		System.out.println(pRoot.getM_pright().getM_nValue());
		
		return (nleft>nright) ? (nleft+1):(nright+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		BinaryTreeNode node7 = new BinaryTreeNode();
		
		node1.setM_nValue(1);
		node1.setM_pleft(node2);
		node1.setM_pright(node3);
		
		node2.setM_nValue(2);
		node2.setM_pleft(node4);
		node2.setM_pright(node5);
		
		node3.setM_nValue(3);
		node3.setM_pleft(null);
		node3.setM_pright(node6);
		
		node4.setM_nValue(4);
		node4.setM_pleft(null);
		node4.setM_pright(null);
		
		node5.setM_nValue(5);
		node5.setM_pleft(node7);
		node5.setM_pright(null);
		
		node6.setM_nValue(6);
		node6.setM_pleft(null);
		node6.setM_pright(null);
		
		node7.setM_nValue(7);
		node7.setM_pleft(null);
		node7.setM_pright(null);
		
		System.out.println(NO39.treeDepth(node1));
	}

}
