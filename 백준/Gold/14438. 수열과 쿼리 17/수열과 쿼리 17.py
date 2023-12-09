import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**7)

def init(node, start, end):
    if start == end :
        tree[node] = start
        return tree[node]
    mid = (start+end)//2
    idxA = init(2*node, start, mid)
    idxB = init(2*node+1,mid+1,end)
    if lst[idxA] == lst[idxB]:
        tree[node] = min(idxA,idxB)
    elif lst[idxA] < lst[idxB] :
        tree[node] = idxA
    else:
        tree[node] = idxB
    return tree[node]

def update(node,start,end,idx):
    if start > idx or end < idx :
        return
    if start != end:
        mid = (start+end)//2
        update(2*node,start,mid,idx)
        update(2*node+1,mid+1,end,idx)
        if lst[tree[2*node]] == lst[tree[2*node+1]]:
            tree[node] = min(tree[2*node],tree[2*node+1])
        elif lst[tree[2*node]] < lst[tree[2*node+1]] :
            tree[node] = tree[2*node]
        else:
            tree[node] = tree[2*node+1]

def find_min(node, start, end, left, right):
    if right < start or left > end:
        return N
    if left <= start and end <= right :
        return tree[node]
    mid = (start+end)//2
    idxA = find_min(2*node, start, mid, left, right)
    idxB = find_min(2*node+1, mid+1, end, left, right)
    if idxA == N or idxB == N:
        return min(idxA,idxB)
    if lst[idxA] == lst[idxB]:
        result = min(idxA,idxB)
    elif lst[idxA] < lst[idxB]:
        result = idxA
    else:
        result = idxB
    return result


N = int(input())
lst = list(map(int, input().split()))
tree = [0]*(4*N)
init(1,0,N-1)
for m in range(int(input())):
    query = list(map(int,input().split()))
    if query[0] == 1:
        lst[query[1]-1] = query[2]
        update(1,0,N-1,query[1]-1)
    else:
        print(lst[find_min(1,0,N-1,query[1]-1,query[2]-1)])