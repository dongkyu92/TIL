import collections
a = ["eat", "tea", "tan", "ate", "nat", "bat"]

def groupAnagrams(strs):
    anagrams = collections.defaultdict(list)

    for word in strs:
        # 정렬하여 딕셔너리에 추가
        anagrams[''.join(sorted(word))].append(word)
        # word 를 정렬하여 키로 만든다음 word를 value로 추가해준다.
        # 빈칸을 구분자로하여
    return anagrams.values()

print(groupAnagrams(a))