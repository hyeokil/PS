N =  int(input())
se = set()
for _ in range(N):
    a,b = input().split()
    if a == 'ChongChong' or b == 'ChongChong':
        se.add(a)
        se.add(b)
    if a in se or b in se :
        se.add(a)
        se.add(b)
print(len(se))