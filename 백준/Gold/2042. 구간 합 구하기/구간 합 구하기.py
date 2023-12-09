import sys,heapq
input = sys.stdin.readline


n, nUpdate, nQuery = map(int, input().split())
tree = [0] * (2 * n)

for i in range(n):
    tree[n + i] = int(input())
for i in range(n - 1, 0, -1):
    tree[i] = tree[2 * i] + tree[2 * i + 1]

for _ in range(nUpdate + nQuery):
    query, *temp = map(int, input().split())

    if query == 1:
        node = n + (temp[0] - 1)
        tree[node] = temp[1]
        node //= 2

        while node:
            tree[node] = tree[2 * node] + tree[2 * node + 1]
            node //= 2

    else:
        left = n + (temp[0] - 1)
        right = n + (temp[1] - 1)

        value = 0
        while left <= right:
            if left % 2:
                value += tree[left]
                left += 1
            left //= 2

            if not right % 2:
                value += tree[right]
                right -= 1
            right //= 2

        print(value)