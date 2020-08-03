import collections

# deque 자료형을 이용한 최적화
class PalindromeTest:
    def isPalindrome(self, s: str) -> bool:
        # 자료형 데크로 선언
        strs: Deque = collections.deque()
        
        for char in s:
            if char.isalnum():
                strs.append(char.lower())
        
        while len(strs) > 1:
            if strs.popleft() != strs.pop():
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
