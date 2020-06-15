from django.db import models

# Create your models here.
class Article(models.Model):
    # 클래스 변수 영역

    # id = id는 장고가 만들어줌.
    title = models.CharField(max_length = 20) # 케릭터 클래스 Article의 길이는 20으로 제한한다. max_length는 필수 인자
    content = models.TextField() # 본문
    created_at = models.DateTimeField(auto_now_add=True) # 시간포함.. auto_now, auto_now_add 둘다 기본 false
    # auto_now_add는 최초 생성일자. 데이터베이스에 기록된 시각
    # django ORM이 최초 INSERT시에만 현재 날짜와 시간으로 갱신
    updated_at = models.DateTimeField(auto_now=True) # 최종 수정 일자
    # django ORM이 save를 할 때마다 현재 날짜와 시간으로 갱신