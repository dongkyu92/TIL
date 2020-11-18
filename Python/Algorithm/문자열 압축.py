# 문자열을 n개 단위로 잘라 최솟값을 리턴해야 함.

from collections import deque
def solution(s):
    answer = 0
    
    # 문자열 s를 deque로 바꿈.
    LENGTH = len(s)
    
    for i in range(1, LENGTH):
        splited_s_dq = [ s[size:size + i] for size in range(0, LENGTH, i) ]
        # n개 단위로 잘라내는 작업.
        # range의 3번째 인자는 숫자 사이의 거리
        # splited_s_dq라는 리스트를 만들어서 리스트컨프리헨젼으로 n개 단위로 나눈 값으로 초기화
        temp = []
        splited_s_dq = deque(splited_s_dq)
        
        for i in range(1, len(splited_s_dq)):
            if splited_s_dq[i] == splited_s_dq[i - 1]:
                answer += 1
                # 이전 문자와 동일하다면.
            else:
                continue
        print(answer)
    return answer

print(solution("aabbaccc"))
# print(solution("ababcdcdababcdcd"))
# print(solution("abcabcabcabcdededededede"))
# print(solution("xababcdcdababcdcd"))
