import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**7)

def init(node, start, end):
    if start == end :
        tree[node] = [lst[start],start]
        return tree[node]
    mid = (start+end)//2
    tempA = init(2*node, start, mid)
    tempB = init(2*node+1,mid+1,end)
    if tempA[0] == tempB[0]:
        tree[node] = [tempA[0],min(tempA[1],tempB[1])]
    elif tempA[0] < tempB[0] :
        tree[node] = tempA
    else:
        tree[node] = tempB
    return tree[node]

def update(node,start,end,idx,val):
    if start > idx or end < idx :
        return
    if start == end:
        tree[node] = [val,idx]
        return
    mid = (start+end)//2
    update(2*node,start,mid,idx,val)
    update(2*node+1,mid+1,end,idx,val)
    if tree[2*node][0] == tree[2*node+1][0]:
        tree[node] = [tree[2*node][0],min(tree[2*node][1],tree[2*node+1][1])]
    elif tree[2*node][0] < tree[2*node+1][0] :
        tree[node] = tree[2*node]
    else:
        tree[node] = tree[2*node+1]


N = int(input())
lst = list(map(int, input().split()))
tree = [0]*(4*N)
init(1,0,N-1)
for m in range(int(input())):
    query = list(map(int,input().split()))
    if query[0] == 1:
        update(1,0,N-1,query[1]-1,query[2])
    else:
        print(tree[1][1]+1)
