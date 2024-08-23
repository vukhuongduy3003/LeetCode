import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String fractionAddition(String expression) {
        Pattern pattern = Pattern.compile("[+-]?\\d+/\\d+");
        Matcher matcher = pattern.matcher(expression);
        List<String[]> list = new ArrayList<String[]>();
        while (matcher.find()) {
            String s = matcher.group();
            String[] arr = s.split("/");
            list.add(arr);
        }
        int[] ans = new int[]{0, Integer.valueOf(list.get(0)[1])};
        for (String[] s : list) {
            int tu = Integer.valueOf(s[0]);
            int mau = Integer.valueOf(s[1]);
            int gcd = (ans[1] * mau) / timUCLN(ans[1], mau);
            int newTu = tu * (gcd / mau);
            int newAnsTu = ans[0] * (gcd / ans[1]);
            ans[0] = newAnsTu + newTu;
            ans[1] = gcd;
        }
        if (ans[0] == 0) {
            return "0/1";
        }
        int rutGon = timUCLN(ans[0], ans[1]);
        if (rutGon < 0) {
            return -1 * ans[0] / rutGon + "/" + (-1) * ans[1] / rutGon;
        }
        return ans[0] / rutGon + "/" + ans[1] / rutGon;
    }
}