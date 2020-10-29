# 에레토스테네스의 체 : 소수 판별
# def prime_list(n):
#     # 에라토스테네스의 체 초기화: n개 요소에 True 설정(소수로 간주)
#     sieve = [True] * n

#     # n의 최대 약수가 sqrt(n) 이하이므로 i=sqrt(n)까지 검사
#     m = int(n ** 0.5)
#     for i in range(2, m + 1):
#         if sieve[i] == True:           # i가 소수인 경우
#             for j in range(i+i, n, i): # i이후 i의 배수들을 False 판정
#                 sieve[j] = False

#     # 소수 목록 산출
#     return [i for i in range(2, n) if sieve[i] == True]

import itertools
def solution(numbers):
    answer = 0
    num_list = []
    total= []
    # 문자열을 순열로 리스트를 만들고 각 원소를 다시 int로 변환
    for i in range(1, len(numbers) + 1):
        num_list.append(list(map(list, itertools.permutations(list(numbers), i))))

    for i, num in enumerate(num_list):
        for j, _ in enumerate(num):
            total.append(''.join(num_list[i][j]))

    total = list(set(map(int, total)))
    total.sort()

    if 0 in total:
        total.pop(0)
    if 1 in total:
        total.pop(0)
    print(total)

    for number in total:
        for i in range(2, number):
            if number % i == 0:
                break
        else:
            answer += 1

    return answer

print(solution('011'))