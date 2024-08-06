def find_shortest_sequence(C, N, operations):
    last_occurrence = {}
    for i, op in enumerate(operations):
        last_occurrence[op] = i
    sorted_columns = sorted(last_occurrence.keys(), key=lambda k: last_occurrence[k])
    M = len(sorted_columns)
    print(M)
    print(*sorted_columns)


C,N = map(int,input().split())
operations = list(map(int,input().split()))
find_shortest_sequence(C, N, operations)
