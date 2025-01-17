from collections import defaultdict

# 1, 2 계단 문제는 피보나치로 풀 수 있음.
# 메모이제이션 풀이법 

def solution(n):
    answer = 0
    dic = defaultdict(int)

    def jump(n):
        if n <= 2:
            return n
        
        if dic[n]:
            return dic[n]
        dic[n] = jump(n - 1) + jump(n - 2)

        return dic[n]
    
    answer = jump(n)
    return answer % 1234567

def solution(n):
    n1, n2 = 1, 2
    for i in range(n - 1):
        n1, n2 = n2, n1 + n2
    return n1 % 1234567


print(solution(4))


# 효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
# (1칸, 1칸, 1칸, 1칸)
# (1칸, 2칸, 1칸)
# (1칸, 1칸, 2칸)
# (2칸, 1칸, 1칸)
# (2칸, 2칸)
# 의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 
# 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 
# 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 
# 5를 return하면 됩니다.