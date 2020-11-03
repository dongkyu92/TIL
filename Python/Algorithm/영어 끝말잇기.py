from collections import defaultdict

def solution(n, words):
    answer = []
    dic = defaultdict(int)
    
    while True:
        for i, word in enumerate(words):
            print('for')
            if word in dic:
                print('for - if')
                print(i % 3 + 1, i + 1)
                answer.append(i % 3 + 1)
                answer.append(i + 1)
                break
            else:
                print('for - else')
                dic[word] += 1
             
        else:
            print('else')
            answer = [0, 0]
            break

    return answer

print(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))