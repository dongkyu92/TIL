from django.urls import path
from . import views


app_name = 'pages' 
urlpatterns = [
    path('', views.index, name="index") #page/ 앞의 urls.py firstapp에서 이미 /붙여서
]
