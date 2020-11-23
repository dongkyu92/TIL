from collections import Counter

def solution(n):
    answer = 0
    
    n_counter = Counter(bin(n))
    i = 0

    while True:

        i += 1
        number = Counter(bin(n + i))
        if number['1'] == n_counter['1']:
            answer = n + i
            break

    return answer
    
print(solution(5))