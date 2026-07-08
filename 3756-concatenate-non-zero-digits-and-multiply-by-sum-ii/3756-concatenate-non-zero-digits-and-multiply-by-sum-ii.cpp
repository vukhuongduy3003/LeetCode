class Solution {
public:
    vector<int> sumAndMultiply(string s, vector<vector<int>>& queries) {
        const long long MOD = 1000000007;
        int n = s.size();

        vector<long long> prefixSum(n + 1, 0);
        vector<int> prefixCnt(n + 1, 0);
        vector<long long> prefixVal(n + 1, 0);
        vector<long long> pow10(n + 1, 1);

        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i];
            prefixCnt[i + 1] = prefixCnt[i];
            prefixVal[i + 1] = prefixVal[i];

            if (s[i] != '0') {
                int digit = s[i] - '0';

                prefixSum[i + 1] += digit;
                prefixCnt[i + 1]++;
                prefixVal[i + 1] = (prefixVal[i + 1] * 10 + digit) % MOD;
            }
        }

        vector<int> answer;

        for (int i = 0; i < queries.size(); i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int cnt = prefixCnt[r + 1] - prefixCnt[l];
            long long sum = prefixSum[r + 1] - prefixSum[l];

            long long x = (prefixVal[r + 1] - prefixVal[l] * pow10[cnt]) % MOD;

            if (x < 0) {
                x += MOD;
            }

            long long result = (x * sum) % MOD;
            answer.push_back(result);
        }

        return answer;
    }
};