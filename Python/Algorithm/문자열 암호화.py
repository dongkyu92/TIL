from collections import deque

def solution(encrypted_text, key, rotation):
    answer = []
    key = list(key)
    for i, k in enumerate(key):
        key[i] = ord(k) - 96
        if key[i] > 26:
            key[i] -= 26

    dq = deque(list(encrypted_text))
    dq.rotate(-rotation)

    for char, k in zip(list(dq), key):
        if ord(char) - k > 122:
            answer.append(chr(ord(char) - k -26))
        elif ord(char) - k < 97:
            answer.append(chr(ord(char) - k +26))
        else:
            answer.append(chr(ord(char) - k))

    return ''.join(answer)


print(solution("qyyigoptvfb", "abcdefghijk", 3))