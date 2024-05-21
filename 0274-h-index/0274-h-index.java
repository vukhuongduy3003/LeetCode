class Solution {
    public int hIndex(int[] citations) {
        //chúng ta tính chỉ số h như sau: Đầu tiên chúng ta sắp xếp các giá trị của f từ giá trị lớn nhất đến giá trị thấp nhất. Sau đó, chúng ta tìm vị trí cuối cùng trong đó f lớn hơn hoặc bằng vị trí đó (chúng ta gọi vị trí này là h )
        Arrays.sort(citations);
        int i, n = citations.length;
        for (i = 1; i <= n; i++) {
            if (citations[n - i] < i) {
                break;
            }
        }
        return i - 1;
    }
}