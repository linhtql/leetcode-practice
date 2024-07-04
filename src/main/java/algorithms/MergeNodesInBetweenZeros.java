package algorithms;

import java.util.Collections;

public class MergeNodesInBetweenZeros {

    public static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(), cur = dummy;
        head = head.next;
        int sum = 0;

        while (head != null) {
            if (head.val == 0) {
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode testCase1 = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
        System.out.println(mergeNodes(testCase1).toString());

//        ListNode testCase2 = new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))));
//        System.out.println(mergeNodes(testCase2).toString());
    }
}
