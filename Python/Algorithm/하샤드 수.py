def solution(x):
    answer = True
    x = str(x)
    result = sum([ int(i) for i in x ])
    if int(x) % result != 0:
        answer =  False
    return answer

print(solution(10))
print(solution(12))
print(solution(11))
print(solution(13))