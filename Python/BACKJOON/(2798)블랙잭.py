import itertools

N, M = map(int, input().split())
Number = list(map(int, input().split()))

# 유용한 itertools
result = list(itertools.combinations(Number, 3))

temp = 0
for i in result:
    if temp == 0 and sum(i) < M:
        temp = sum(i)
    else:
        if temp > sum(i):
            continue
        elif temp < sum(i) and sum(i) < M:
            temp = sum(i)
        else:
            continue

print(temp)