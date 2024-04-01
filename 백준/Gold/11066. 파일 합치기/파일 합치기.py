import sys
input = sys.stdin.readline


def solution():
    K = int(input())
    chapters = tuple(map(int, input().split()))
    sums = [0]
    for i in range(K):
        sums.append(sums[-1] + chapters[i])
    dp = [[0] * (K + 1) for _ in range(K + 1)]
    m_dp = [[0] * (K + 1) for _ in range(K + 1)]
    for i in range(K + 1):
        m_dp[i][i] = i

    for dist in range(1, K):
        for l in range(K - dist):
            r = l + dist
            min_price = 50_000_000
            min_price_mid = l
            for m in range(m_dp[l][r - 1], m_dp[l + 1][r] + 1):
                price = dp[l][m] + dp[m + 1][r] + sums[r + 1] - sums[l]
                if price < min_price:
                    min_price = price
                    min_price_mid = m
            dp[l][r] = min_price
            m_dp[l][r] = min_price_mid
    print(dp[0][K - 1])


def main():
    T = int(input())
    for _ in range(T):
        solution()


main()