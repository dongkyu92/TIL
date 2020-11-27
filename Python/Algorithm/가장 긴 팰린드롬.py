def solution(s):
    answer = 0
    
    for i in range(len(s) - 1):
        temp_before = s[:i + 1]
        temp_after = s[:i + 2]
        
        print(temp_before)
        print(temp_after)
    return answer


print(solution('abacde'))
# print(solution('abcdcba'))
