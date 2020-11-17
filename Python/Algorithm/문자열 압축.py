# 문자열을 n개 단위로 잘라 최솟값을 리턴해야 함.

from collections import deque
def solution(s):
    answer = 0
    LENGTH = len(s_dq)
    s_dq = deque(s) # 문자열 s를 deque로 바꿈.
    
    for i in range(LENGTH):
        splited_s_dq = [ s[size:size + i] for size in range(0, LENGTH, i)]
        # n개 단위로 잘라내는 작업.
        # range의 3번째 인자는 숫자 사이의 거리
        # splited_s_dq라는 리스트를 만들어서 리스트컨프리헨젼으로 n개 단위로 나눈 값으로 초기화
    return answer

print(solution("aabbaccc"))
print(solution("ababcdcdababcdcd"))
print(solution("abcabcabcabcdededededede"))
print(solution("xababcdcdababcdcd"))
