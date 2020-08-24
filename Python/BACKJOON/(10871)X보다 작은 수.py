N, X = map(int, input().split())
M = list(map(int, input().split()))

for i in range(0,N):
    if M[i] < X:
        print(M[i], end=' ')