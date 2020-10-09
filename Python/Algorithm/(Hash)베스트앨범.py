from collections import defaultdict, Counter

def solution(genres, plays):
    answer = []
    
    dic = defaultdict(int)
    
    for genre, play in zip(genres, plays):
        dic[genre] += play
    
    playResult = list(dic.values())
    playResult.sort(reverse=True)

    populargenre = []
    for i, j in zip(range(0,len(playResult)), playResult):
        for k, v in dic.items():
            if playResult[i] == v:
                populargenre.append(k)
    
    ge = defaultdict(int)
    for j in populargenre:
        for i, gp in enumerate(zip(genres, plays)):
            if j == gp[0] and ge[j] < 2:
                answer.append(i)
                ge[j] += 1
    
    answer = sorted(answer, key = lambda x: (populargenre[0]))
    print(answer)
    return answer




solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500])