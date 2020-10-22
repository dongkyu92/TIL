import sys

N = int(sys.stdin.readline())
result = []
for i in range(N):
    # temp1, temp2 = map(int, sys.stdin.readline().split())
    # result.append([temp1, temp2])
    result.append(list(map(int, sys.stdin.readline().split()))) # list로 바꿔주면 바로 append 가능

result.sort(key=lambda x:(x[0], x[1])) # x[0] : x, x[1] : y
for i in result:
    print(i[0], i[1])