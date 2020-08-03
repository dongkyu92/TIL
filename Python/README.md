# Algorithm

---

1. ## 유효한 팰린드롬

   - ###### 앞뒤가 똑같은 단어나 문장으로, 뒤집어도 같은 말이 되는 단어 또는 문장을 팰린드롬(Palindrome)이라고 한다. 우리말로는 '회문' 이라고 부름. ex) "race a car"

     - [a link](https://github.com/user/repo/blob/branch/other_file.md)



# Grammar

---

1. ## 클래스 인스턴스와 메소드

   - ```python
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
           
     ins = PalindromeTest()
     print(id(ins))
     ```

   - ###### PalindromeTest 클래스로 만들어진 ins는 인스턴스이다. PalindromeTest 클래스 안에 정의되어 있는 isPalindrome 메소드의 첫 번째 매개변수는 self인데 클래스의 인스턴스를 받아오는 역할을 한다.

   - ###### self의 id값을 찍어보면 (id는 Python 내장 클래스) xxxxxxxx번지로 나오게 되고, ins 인스턴스의 id 값을 찍으면 마찬가지로 동일한 xxxxxxxx번지가 나오게 된다.