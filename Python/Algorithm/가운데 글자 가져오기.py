def solution(s):
    answer = []
    s = list(s)
    if len(s) % 2 == 0:
        answer.append(s[int(len(s) / 2) -1])
        answer.append(s[int(len(s) / 2)])
    else:
        answer.append(s[int((len(s) - 1) / 2)])

    return ''.join(answer)

print(solution('abcde'))
print(solution('abcdef'))
