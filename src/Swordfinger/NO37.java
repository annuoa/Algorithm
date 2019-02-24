package Swordfinger;

public class NO37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode nodea=new ListNode(6);
		ListNode nodeb=new ListNode(7);
		
		ListNode phead = new ListNode(1);
		phead.next=new ListNode(2);
		phead.next.next=new ListNode(3);
		phead.next.next.next=nodea;
		nodea.next=nodeb;
		
		ListNode phead1=new ListNode(4);
		phead1.next=new ListNode(5);
		phead1.next.next=nodea;
//		phead1.next.next.next=new ListNode(7);
		
		System.out.println(FindFirstCommonNode(phead, phead1).val);
	}

	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int lenchang = lenthofListNode(pHead1);
		int lenduan = lenthofListNode(pHead2);
		System.out.println(lenchang);
		System.out.println(lenduan);
		if (lenchang==0||lenduan==0) {
			return null;
		}
		ListNode pnode1=null;//始终指向长的那个list
		ListNode pnode2=null;
		if (lenchang>lenduan) {
			pnode1=pHead1;
			pnode2=pHead2;
		}else {
			pnode1=pHead2;
			pnode2=pHead1;
		}
		int dif =Math.abs(lenchang-lenduan);//求出两者的差值，长的先走差值的部分；
		for (int i = 0; i < dif; i++) {
			pnode1=pnode1.next;
		}
		while (pnode1!=null&&pnode2!=null&&pnode1!=pnode2) {
			pnode1=pnode1.next;
			pnode2=pnode2.next;
		}
		return pnode1;
	}

	public static int lenthofListNode(ListNode phead) {
		int len = 0;
		if (phead == null) {
			return 0;
		}
		ListNode node = phead;
		while (node.next != null) {
			node = node.next;
			len++;
		}
		return len;
	}

}
