import re

def isPalindrome(s: str) -> bool:
    s = s.lower()
    s = re.sub('[^a-z0-9]', '', s)

    return s == s[::-1]

print('a의 Palindrome 여부 : ' , isPalindrome('hello olleh'))
print('b의 Palindrome 여부 : ' , isPalindrome('hello'))

    