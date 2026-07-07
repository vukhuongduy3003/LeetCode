class Solution {
public:
    long long sumAndMultiply(int n) {
        string x = "";
        int sum = 0;
        string s = to_string(n);
        for(int i = 0; i < s.length(); i++) {
            if(s[i] == '0') {
                continue;
            }
            x += s[i];
            sum += s[i] - '0';
        }
        if(x == "") {
            return 0;
        }
        return stoll(x) * sum;
    }
};