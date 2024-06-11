class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int lenNum1 = num1.length(), lenNum2 = num2.length();
        int[] arr = new int[lenNum1 + lenNum2];
        for (int i = lenNum1 - 1; i >= 0; i--) {
            for (int j = lenNum2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + arr[i + j + 1];
                arr[i + j] += sum / 10;
                arr[i + j + 1] = sum % 10;
            }
        }
        for (int i : arr) {
            if (i != 0 || ans.length() != 0) {
                ans.append(i);
            }
        }
        return ans.length() == 0? "0" : ans.toString();
    }
}