import collections

# deque 자료형을 이용한 최적화 리스트보다 5배 빠른 실행속도. 약 64ms
def isPalindrome(s: str) -> bool:
    # 자료형 데크로 선언
    strs: Deque = collections.deque()
    
    for char in s:
        if char.isalnum():
            strs.append(char.lower())
    
    while len(strs) > 1:
        if strs.popleft() != strs.pop():
            return False
        
    return True

print('a의 Palindrome 여부 : ' , isPalindrome('hello olleh'))
print('b의 Palindrome 여부 : ' , isPalindrome('hello'))
