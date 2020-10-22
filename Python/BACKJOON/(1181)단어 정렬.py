import sys

N = int(input())
words = []
for i in range(N):
    words.append(sys.stdin.readline()[:-1])

words = set(words)
words = list(map(str, words))
words.sort(key=lambda x: (len(x),x[0]))
print(words)