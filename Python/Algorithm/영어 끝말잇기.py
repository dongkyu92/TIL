from collections import defaultdict

def solution(n, words):
    answer = [0, 0]
    dic = defaultdict(int)
    for i, word in enumerate(words):
        if word in dic or (words[i - 1][-1] if i != 0 else word[0]) != word[0] :
            # print(words[i - 1][-1] if i!= 0 else word[0])
            # print(word[0])
            temp1 = (i + 1) % n if (i + 1) % n != 0 else n
            temp2 = (i + 1) // n + 1 if (i + 1) % n != 0 else (i + 1) // n
            # temp2 수정해야함. 어떨때는 n이고 어떨때는 n + 1
            answer = [temp1, temp2]
            return answer
        else:
            dic[word] += 1
    else:
        return answer


# print(solution(2, ["hello", "one", "even", "never", "now", "world", "draw"]))
print(solution(3, ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]))