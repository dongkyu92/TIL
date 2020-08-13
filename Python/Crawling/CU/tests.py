from django.test import TestCase
import urllib.request
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import time


# Driver, URL
pageUrl = 'https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=cu'
chromedriver = '/Users/dkmac/Desktop/TIL/chromedriver'

# CSS Selector
def Category(i: int) -> str:
    return '#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.tab_area > div > div > ul > li:nth-child(' + str(i) + ') > a > span'

def Category2(j: int) -> str:
    return '#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.sub_tab_area._sub_tab_wrap > div > div > ul > li:nth-child(' + str(j) +') > a > span'

def itemName(l: int, m: int) -> str:
    try:
        result = driver.find_element_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.item_list > div._pm_root > div > div:nth-child(' + str(l) + ') > div > ul > li:nth-child(' + str(m) + ') > div > a._info_area > div > strong > span.name_text._text').text
        print(result)
    except:
        print(result)
        result = None
    finally:
        return result

def itemPrice(l: int, m: int) -> str:
    return driver.find_element_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.item_list > div._pm_root > div > div:nth-child(' + str(l) + ') > div > ul > li:nth-child(' + str(m) + ') > div > a._info_area > div > p').text

def itemImg(l: int, m: int) -> str:
    return driver.find_elements_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.item_list > div._pm_root > div > div:nth-child(' + str(l) + ') > div > ul > li:nth-child(' + str(m) + ') > div > a.thumb > img').__getattribute__



# Chrome Driver 접속 및 Chrome 창 실행
driver = webdriver.Chrome(chromedriver)
driver.implicitly_wait(5)
driver.get(pageUrl)

# 스크롤 내리기
target = driver.find_element_by_link_text('1+1')
actions = ActionChains(driver)
actions.move_to_element(target)
actions.perform()

# list 생성
item_Name = list()
item_Price = list()
item_Img = list()
item_StoreInfo = list()
item_PromotionInfo = list()
item_Category = list()
nextBtn = driver.find_element_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.page_area._page_root > div > a.cmm_pg_next._next.on')

# Crawling 시작
for i in range(2,7):
    driver.find_element_by_css_selector(Category(i)).click() # 음료, 과자, 생활용품
    time.sleep(1)
    for j in range(1,6):
        driver.find_element_by_css_selector(Category2(j)).click() # 1+1, 2+1, 3+1
        time.sleep(1)

        # 페이지 인덱스 확인
        PageCount = '#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.page_area._page_root > div > span > span._total'
        PageCount = driver.find_element_by_css_selector(PageCount).text

        # 상품 정보가 없는 카테고리 확인
        if PageCount == '':
            time.sleep(1)
            continue
        else:
            PageCount = int(PageCount)
            print('Page의 수는:', PageCount)
            for k in range(1, PageCount+1):
                time.sleep(1)
                for m in range(1,5):
                    l = k % 3
                    if l == 0:
                        l = 3
                    print('k 값은 몇인가', k, 'm 의 값은?', m, 'l의 값은?', l)
                    temp = itemName(l, m)
                    if temp != None:
                        item_Name.append(temp)
                        item_Price.append(itemPrice(l, m))
                        item_Img.append(itemImg(l, m))
                        item_StoreInfo.append('CU')
                        item_PromotionInfo.append(driver.find_element_by_css_selector(Category2(j)).text)
                        item_Category.append(driver.find_element_by_css_selector(Category(i)).text)
                    else:
                        print('temp가 None입니당.')
                        continue
                if k == PageCount + 1:
                    print('k의 값은?' ,  k)
                    time.sleep(1)
                    continue
                else:
                    time.sleep(1)
                    print('else 들어옴')
                    #print(driver.find_element_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.page_area._page_root > div > a.cmm_pg_next._next.on'))
                    driver.find_element_by_css_selector('#ct > section.sc.cs_convenience_store._cs_convenience_store > div > div.page_area._page_root > div > a.cmm_pg_next._next.on').click()
                    time.sleep(2)
                print('페이지 넘어감..')
        time.sleep(1)

print(item_Name)
print(item_Category)
print(item_Img)

    

# Chrome 창 종료
#driver.quit()

# Create your tests here.

