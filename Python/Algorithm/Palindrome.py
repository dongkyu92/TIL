# list로 변환
class PalindromeTest:
    def isPalindrome(self, s: str) -> bool:
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())
        
        # 팰린드롬 여부 판별
        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        print(id(self))
        return True
a = 'hello olleh'
c = 'hello hello'
ins = PalindromeTest()
print(id(ins))
ins.isPalindrome(a)


result1 = isPalindrome(a)
result2 = isPalindrome(b)
print('result1 의 결과 : ' + result1)
print('result2 의 결과 : ' + result2)

    
# deque 자료형을 이용한 최적화
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
    