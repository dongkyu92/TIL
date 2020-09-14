import re
import collections

paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]

def mostCommonWord(paragraph: str, banned)-> str:
    words = [word for word in re.sub(r'[^\w]', ' ', paragraph).lower().split() if word not in banned]

    # collections 패키지에서 제공하는 Counter 함수
    counts = collections.Counter(words)
    return counts.most_common(1)[0][0]

print(mostCommonWord(paragraph, banned))