class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        k %= size;
        if (k == 0) return head; // 🔥 important early exit

        curr = head;
        int pointer = 1;

        while (curr.next != null) {
            if (pointer == size - k) {
                ListNode temp = curr.next;
                curr.next = null;

                // move to end of second half
                ListNode tail = temp;
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = head;
                return temp; //  return immediately (avoid extra variable reuse)
            }
            curr = curr.next;
            pointer++;
        }

        return head; // fallback (won’t usually hit)
    }
}