import string
def solution(s):
    s = [ string.capwords(i.lower()) for i in s.split() ]
    # return ' '.join(s)
    # answer = []
    # s = s.split()
    # for i in s:
    #     if i[0].isdigit():
    #         answer.append(i.lower())
    #     else:
    #         answer.append(string.capwords(i.lower()))
    return ' '.join(s)

print(solution('fdsjgsj fllf kfkef ww'))
print(solution('3people unFollowed me'))
print(solution('3people unFollowed me'))
print(solution('34eople u4Followed me4'))
