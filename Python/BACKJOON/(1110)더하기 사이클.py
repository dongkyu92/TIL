import time
X = int(input())
X0 = X
circle = 1

while(True):
    if X < 10:
        X = X * 10

    # divmod(a, b) a를 b로 나눈 몫과 나머지를 튜플 형태로 리턴하는 내장 함수
    quotient = int(divmod(X, 10)[0]) # 몫
    remainder = int(divmod(X, 10)[1]) # 나머지
    X2 = quotient + remainder # 몫 + 나머지

    X2remainder = divmod(X2, 10)[1] # (몫 + 나머지)의 오른쪽 수
    print('X2remainder', X2remainder)
    time.sleep(1)
    result = remainder * 10 + X2remainder # 새로운 수
    print(result)
    if int(result) == X0:
        break
    else:
        X = result
        circle = circle + 1
        continue
print(circle)