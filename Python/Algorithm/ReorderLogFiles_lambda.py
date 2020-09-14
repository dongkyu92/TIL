# sort는 리스트만을 위한 내장 함수, sorted는 리스트 포함 전체 가능
# sort는 리스트 자체를 변환, sorted는 정렬된 새로운 리스트를 반환한다.
# sort는 x.sort(), sorted는 sorted(x)
def reorderLogFiles(logs):
    letters, digits = [], []
    for log in logs:
        if log.split()[1].isdigit():
            digits.append(log)
        else:
            letters.append(log)

    # 2개의 키를 람다 표현식으로 정렬
    letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))
    return letters + digits

logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]
print(reorderLogFiles(logs))