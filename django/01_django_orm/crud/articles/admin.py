from django.contrib import admin
from .models import Article
# .은 현재 디렉토리라는 뜻.
# 현재 디렉토리의 모델스에서 아티클을 임포트하겠다.
# Register your models here.

class ArticleAdmin(admin.ModelAdmin):
    list_display = ['pk', 'title', 'content', 'created_at']
    list_editable = ['title']

admin.site.register(Article, ArticleAdmin)
# admin site에 등록(register) 하겠다.
