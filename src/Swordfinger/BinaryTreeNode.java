package Swordfinger;


public class BinaryTreeNode {
	private int m_nValue;
	public int getM_nValue() {
		return m_nValue;
	}
	public void setM_nValue(int m_nValue) {
		this.m_nValue = m_nValue;
	}
	public BinaryTreeNode getM_pleft() {
		return m_pleft;
	}
	public void setM_pleft(BinaryTreeNode m_pleft) {
		this.m_pleft = m_pleft;
	}
	public BinaryTreeNode getM_pright() {
		return m_pright;
	}
	public void setM_pright(BinaryTreeNode m_pright) {
		this.m_pright = m_pright;
	}
	private BinaryTreeNode m_pleft;
	private BinaryTreeNode m_pright;
}
