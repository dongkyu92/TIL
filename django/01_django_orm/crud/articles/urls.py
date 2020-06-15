from django.urls import path
from . import views
# 현재 디렉토리의 뷰즈를 임포트해줘야 밑에서 views.index를 불러올 수 있음.

app_name = 'articles' # 애플리케이션의 이름 지정해줘야 메인프로젝트에서 여기로 찾아옴.
urlpatterns = [
    path('', views.index, name='index') # url의 이름 붙여줌 보통 똑같이 줌.
]
