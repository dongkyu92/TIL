import re
# 슬라이싱을 사용한 속도는 36ms 제일 빠르다
def isPalindrome(s: str) -> bool:
    s = s.lower()

    # 정규식으로 불필요한 문자 필터링
    s = re.sub("[^a-z0-9]", '', s)
    return s == s[::-1]

print('a의 Palindrome 여부 : ' , isPalindrome('hello olleh'))
print('b의 Palindrome 여부 : ' , isPalindrome('hello'))