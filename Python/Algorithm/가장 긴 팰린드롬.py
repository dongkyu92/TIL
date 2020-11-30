# 실행시간 생각보다 풀 생각을 먼저
# slice, 재귀 활용해도 됨

def solution(s):
    answer = 0
    
    for i in range(len(s) - 1):
        temp_before = s[:i + 1]
        temp_after = s[:i + 2]
        
        m, l = 0, len(temp_before) - 1
        if len(temp_before) % 2 != 0:
            if len(temp_before) == 1:
                answer += 1
            else:
                
                if temp_before[m] == temp_before[l]:
                    answer += 1
                else:
                    continue
        else:
            continue
    return answer


print(solution('abacde'))
print(solution('abcdcba'))
