
import heapq
import sys

input = sys.stdin.readline


def Main():
    N, M = map(int, input().split())
    arr = [list(input().rstrip()) for _ in range(M)]

    for i in range(M):
        for j in range(N):
            if arr[i][j] == "C":
                visited = set()
                dr = [(0, 1), (0, -1), (1, 0), (-1, 0)]
                q = []
                arr[i][j] = "*"
                for k in range(4):
                    heapq.heappush(q, (0, i, j, k))

                while q:
                    mirror, x, y, dir = heapq.heappop(q)
                    if (x, y, dir) in visited:
                        continue
                    visited.add((x, y, dir))

                    if arr[x][y] == "C":
                        print(mirror)
                        return

                    for d in range(4):
                        nx = x + dr[d][0]
                        ny = y + dr[d][1]
                        if 0 <= nx < M and 0 <= ny < N and arr[nx][ny] != "*":
                            if dir == d:
                                heapq.heappush(q, (mirror, nx, ny, d))
                            else:
                                heapq.heappush(q, (mirror + 1, nx, ny, d))


Main()
