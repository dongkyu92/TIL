import string
def solution(s):
    s = [ string.capwords(i.lower()) if i.isalpha() else i.lower() for i in s.split() ]
        
    return ' '.join(s)

print(solution('fdsjgsj fllf kfkef ww'))
print(solution('3people unFollowed me'))
