import itertools
def solution(numbers):
    answer = []
    comb = list(itertools.combinations(numbers, 2))
    # itertools 모듈을 사용하여 2개 원소로 구성된 조합 리스트 생성
    
    answer = [ sum(i) for i in comb ]
    answer = list(set(answer))
    answer.sort()

    return answer
    



solution([2,1,3,4,1])