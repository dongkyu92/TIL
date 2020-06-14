from django.urls import path
# 자기 위치의 views이니까 from articles을 안써도된다.
# 하지만 장고는 from을 안쓰는것은 불명시적이다.
# 그래서 아래와 같이 사용한다.
from . import views

app_name= 'articles'

urlpatterns = [
    path('index/', views.index), # views.index -> views안에 index:  함수이름
    path('dinner/', views.dinner),
    path('pictures/', views.pictures),
    path('hello/<str:name>/', views.hello),
    # str 타입은 기본값이라서 생략 가능
    # path('hello/<name>/', views.hello)
    path('introduce/<name>/<int:age>/', views.introduce),
    path('multi/<int:num1>/<int:num2>/', views.multi),
    # url에서는 _안쓰는게 좋다 인식 못함!
    path('dtl-practice/', views.dtl_practice), # 혼합형 할 때 _쓰는것을 snake case라고 한다.
    path('palindrome/<text>/', views.palindrome),
    path('throw/', views.throw), # trailing comma !! 잊지말것!
    path('catch/', views.catch),
    path('setlotto/', views.setlotto),
    path('getlotto/', views.getlotto),
    path('artii/', views.artii, name='artii'),
    path('artii-result/', views.artii_result, name='artii_result'),
]
