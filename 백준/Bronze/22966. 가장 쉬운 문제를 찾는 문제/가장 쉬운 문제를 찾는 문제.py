N= int(input())
arr = []
for i in range(N):
    s,a = input().split()
    arr.append((int(a),s))
arr.sort()
print(arr[0][1])