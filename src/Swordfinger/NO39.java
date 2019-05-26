package Swordfinger;

public class NO39 {
	public static int treeDepth(BinaryTreeNode pRoot){
		if (pRoot==null) {
			return 0;
		}
		int nleft = treeDepth(pRoot.getM_pleft());
		int nright = treeDepth(pRoot.getM_pright());
		
		return (nleft>nright) ? (nleft+1):(nright+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode node = new BinaryTreeNode();
		node.setM_nValue(1);
		node.setM_pleft(null);
		node.setM_pright(null);
		
		System.out.println(NO39.treeDepth(node));
	}

}
