# for - else 구문 : for 문이 정상적으로 종료되면, else 구문 실행.
def solution(skill, skill_trees):
    answer = 0

    for skill_tree in skill_trees:
        skill_list = list(skill)
        # 문자열을 리스트로 형변환 해주면 자동으로 1개의 문자로 구성 된 리스트로 바뀐다.

        for s in skill_tree:
            if s in skill:
                if s != skill_list.pop(0):
                    break

        else:
            answer += 1

    return answer

solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"])