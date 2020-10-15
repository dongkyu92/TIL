# def solution(n, k):
#     results = []
#     prev_elements = []
#     nums = [ i for i in range(1, n + 1) ]

#     def dfs(elements):
#         if len(elements) == 0:
#             results.append(prev_elements[:])
        
#         for e in elements:
#             next_elements = elements[:]
#             next_elements.remove(e)

#             prev_elements.append(e)
#             dfs(next_elements)
#             prev_elements.pop()

#     dfs(nums)
#     return results[k-1]

# import itertools

# def solution(n, k):
#     return list(map(list, itertools.permutations(range(1, n+1))))[k-1]
    
# print(solution(3,1))


import math

def solution(n, k):
    answer = []
    numberList = [i for i in range(1, n+1)]
    while (n != 0):
        temp = math.factorial(n) // n # 한개에 몇개씩의 값이 있을지 알 수 잇음.
        index = k // temp
        k = k % temp
        if k == 0:
            answer.append(numberList.pop(index-1))
        else :
             answer.append(numberList.pop(index))

        n -= 1
    
    return answer