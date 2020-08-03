import re
class Palindrome:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()

        # 정규식으로 불필요한 문자 필터링
        s = re.sub("[^a-z0-9]", '', s)
        return s == s[::-1]

a = 'abc'
b = 'bbb'
ins = Palindrome()
result1 = ins.isPalindrome(a)
result2 = ins.isPalindrome(b)

print(result1, result2)