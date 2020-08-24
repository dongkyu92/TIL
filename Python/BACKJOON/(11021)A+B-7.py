T = int(input())
result = []
for i in range(1,T+1):
    A, B = map(int, input().split())
    result.append(A + B)
    if i == T:
        for j in range(1, T+1):
            print('Case #'+ str(j) +': '+ str(result[j-1]))