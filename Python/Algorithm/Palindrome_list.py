from collections import deque
# list로 변환
class PalindromeTest:
    def isPalindrome(self, s: str) -> bool:
        # print(id(self))
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())
        
        # 팰린드롬 여부 판별
        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        return True

a = 'hello olleh'
b = 'hello hello'

ins = PalindromeTest()
result1 = ins.isPalindrome(a)

ins2 = PalindromeTest()
result2 = ins2.isPalindrome(b)

print('a의 Palindrome 여부 : ' , result1)
print('b의 Palindrome 여부 : ' , result2)