def solution(num):
    answer = ''
    if num % 2 == 0:
        answer = 'Even'
    else:
        answer = 'Odd'

    return answer


print(solution(0))
print(solution(3))
print(solution(2))