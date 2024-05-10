N = int(input())
files = list(map(int, input().split()))
cluster = int(input())
cnt= 0
for file in files:
    if file%cluster != 0:
        cnt +=1
    cnt+=file//cluster
print(cnt*cluster)
