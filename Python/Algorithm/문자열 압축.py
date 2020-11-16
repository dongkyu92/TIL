from collections import deque

def solution(s):
    answer = 0 
    temp = []

    flag = True
    while flag:
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                
            else:
                temp.append(s[i])
                
                  
            
            

    return answer

print(solution("aabbaccc"))
print(solution("ababcdcdababcdcd"))
print(solution("abcabcabcabcdededededede"))
print(solution("xababcdcdababcdcd"))
