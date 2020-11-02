def solution(strings, n):
    answer = []
    p = []
    strings = list(strings)
    for string in strings:
        p.append(string[n])

    strings = [[x, e] for e, x in zip(strings,p)]
    strings.sort(key=lambda x: (x[0], x[1]))

    answer = [ string[1] for string in strings ]
    return answer

print(solution(	["abce", "abcd", "cdx"], 2))