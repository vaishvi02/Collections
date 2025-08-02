package main.java.LeetCodeBlind75;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        while (list1.next == null) {
            newList.val = list1.val;

        }
        return null;
    }
}
