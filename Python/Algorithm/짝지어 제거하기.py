def solution(s):
    answer = 0
    s = list(s)
    flag = True
    while flag:
        if len(s) == 0:
            break
        else:
            for i in range(0, len(s)):
                if i == len(s) - 1:
                    return 0
                else:
                    if s[i] == s[i + 1]:
                        s.pop(s.index(s[i]))
                        s.pop(s.index(s[i]))
                        break
                    else:
                        continue
    answer = 1
    return answer

# print(solution('cdcd'))
print(solution('baabaa'))