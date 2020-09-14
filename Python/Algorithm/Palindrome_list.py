# list를 이용한 팰린드롬 304ms
def isPalindrome(s: str) -> bool:
    # print(id(self))
    strs = []
    for char in s:
        if char.isalnum():
            strs.append(char.lower())
    
    # 팰린드롬 여부 판별
    while len(strs) > 1:
        if strs.pop(0) != strs.pop(): # strs.pop(0)을 지정해주면 맨 앞, 공란이면 맨 뒤의 리스트를 반환.
            return False
    return True

print('a의 Palindrome 여부 : ' , isPalindrome('hello olleh'))
print('b의 Palindrome 여부 : ' , isPalindrome('hello'))