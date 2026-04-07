class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length(), n2 = b.length();

        // Make lengths equal
        if (n1 > n2) {
            b = "0".repeat(n1 - n2) + b;
        } else if (n2 > n1) {
            a = "0".repeat(n2 - n1) + a;
        }

        int n = Math.max(n1, n2);
        char arr[] = new char[n];

        int carry = 0;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;

            arr[i] = (char) ((sum % 2) + '0'); // store bit
            carry = sum / 2;                  // update carry
        }

        // If carry remains
        if (carry == 1) {
            return "1" + new String(arr);
        }

        return new String(arr);
    }
}