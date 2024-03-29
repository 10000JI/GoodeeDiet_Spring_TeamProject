# 홈트레이닝 쇼핑몰 사이트 (중간)
## 목차

- [프로젝트 개요](#프로젝트-개요)
- [팀 역할 분배](#팀-역할-분배)
- [사용 기술 및 도구](#사용-기술-및-도구)
- [기능구현](#기능구현)
  - 회원
    - 회원 가입
    - 마이페이지
  - 이달의 루틴
    - 루틴 일정 및 컨텐츠 재생
    - 루틴 추가
    - 루틴 수정
    - 루틴 삭제
  - 짧강효확
    - 컨텐츠 재생
    - 컨텐츠 추가
    - 컨텐츠 수정
    - 컨텐츠 삭제
      
  - 스터디(상품)  
    - 상품 리스트 
    - 상품 장바구니 추가
    - 상품 추가
    - 상품 수정
    - 상품 삭제
      
  - 운동기구(상품)  
    - 상품 추가
    - 상품 옵션 추가
    - 상품 장바구니 추가
    - 상품 카테고리 추가
    - 상품 수정
    - 상품 상세정보 추가
    - 상품 옵션 삭제
    - 상품 삭제
  - 게시판
    - REVIEW
      - REVIEW 작성
      - REVIEW 수정
      - REVIEW 삭제
    - QNA
      - QNA 작성
      - QNA 수정
      - QNA 삭제
  - 주문 및 결제
    - 주문 성공
    - 주문 실패
    
  
- [배포](#배포)
- [ISSUE](#ISSUE)

## 프로젝트 개요


> **프로젝트:** 홈트레이닝 쇼핑몰 사이트
>
> **기획 및 제작:** 김민지, 김태현, 이진희, 정현민
>
> **분류:** 팀 프로젝트 
>
> **제작 기간:** 2023.03.13 ~ 04.14
>
> **배포일:** 미정
>
> **사용 언어:** JAVA
> 
> **프레임 워크:** Spring, MyBatis

## DB설계

<p align="center">
  <br>
   <img src="src/main/webapp/resources/images/database.png"> 
  <br>
</p>


## 팀 역할 분배
> **팀장:** 김민지
> 
> 담당업무 : 백엔드 및 디자인 담당
> 
> 담당파트 : 장바구니, 주문, 전체 리뷰 및 게시판 개발과 디자인
>

> **팀원:** 김태현
>
> 담당업무 : 전체적인 백엔드 총괄
>
> 담당파트 : 상품, 장바구니, 주문, 컨텐츠 페이지 백앤드 개발


> **팀원:** 이진희
>
> 담당업무 : 전체적인 디자인 총괄
> 
> 담당파트 : 루틴, 컨텐츠 페이지 기획 및 제작, 전체적인 페이지 개발과 디자인
> 

> **팀원:** 정현민
>
> 담당업무 : 회원
>
> 담당파트 : 회원가입, 마이페이지



## 사용 기술 및 도구

|**Category**|**Detail**|
|:--:|:--:|
|**FrontEnd**|`HTML5`, `JavaScript`, `JQuery`, `BootStrap`, `CSS`|
|**BackEnd**|`Java(11)`, `Servlet`, `Spring`, `Mybatis`|
|**OS**|`Windows 10`, `MAC`|
|**Libray & API**|`FileUpload`, `JavaMail API`, `KakaoLogin API`, ` I'mport API `, ` FullCalendar API `, `Youtube Data API`, `SweetAlert Library` |
|**IDE**|`STS3`, `VisualStudio Code`, `DBeaver`|
|**Server**|`Tomcat(v9,0)`|
|**Document**|`Google Drive`, `ERDCloud`, `Notion`|
|**CI**|`Github`|
|**DB**|`Docker`, `ORACLE`|

## 기능구현

  ####   1. 회원 *수정필요*
  - 회원가입
    <img src="src/main/webapp/resources/gif/member/member_join.gif">
    
  - 마이페이지
    <img src="src/main/webapp/resources/gif/member/member_myPage.gif">
    

  ####   2. 이달의 루틴
  - 루틴 일정 및 컨텐츠 재생
    <img src="src/main/webapp/resources/gif/routine/routine_Action.gif">
    
  - 루틴 추가
    <img src="src/main/webapp/resources/gif/routine/routine_Add.gif">
  
  - 루틴 수정
    <img src="src/main/webapp/resources/gif/routine/routine_Update.gif">
  
  - 루틴 삭제
    <img src="src/main/webapp/resources/gif/routine/routine_Delete.gif">
    
  ####   3. 짧강효확
  - 컨텐츠 재생
    <img src="src/main/webapp/resources/gif/exercise/exercise_Action.gif">
    
  - 컨텐츠 추가
    <img src="src/main/webapp/resources/gif/exercise/exercise_Add.gif">
    
  - 컨텐츠 수정
    <img src="src/main/webapp/resources/gif/exercise/exercise_Update.gif">
    
  - 컨텐츠 삭제
    <img src="src/main/webapp/resources/gif/exercise/exercise_Delete.gif">
    
      
  ####   4. 스터디(상품)
  - 상품 장바구니 추가
    <img src="src/main/webapp/resources/gif/studyClass/studyClass_cartAdd.gif">
  
  - 상품 추가
    <img src="src/main/webapp/resources/gif/studyClass/studyClass_ADD.gif">
  
  - 상품 수정
    <img src="src/main/webapp/resources/gif/studyClass/studyClass_update.gif">
  
  - 상품 삭제
    <img src="src/main/webapp/resources/gif/studyClass/studyClass_delete.gif">

  ####   5. 운동기구(상품)
  - 상품 추가
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_add.gif">
    
  - 상품 옵션 추가
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_optionAdd.gif">
    
  - 상품 장바구니 추가
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_addCart.gif">
    
  - 상품 카테고리 추가
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_categoryAdd.gif">
    
  - 상품 수정
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_update.gif">
  
  - 상품 상세정보 추가
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_update2.gif">
    
  - 상품 옵션 삭제
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_optionDelete.gif">
    
  - 상품 삭제
    <img src="src/main/webapp/resources/gif/healthMachine/healthMachine_delete.gif">

  ####   6. 게시판
  - REVIEW
      - REVIEW 작성
        <img src="src/main/webapp/resources/gif/study_review_Add.gif">
        
      - REVIEW 수정
        <img src="src/main/webapp/resources/gif/study_reivew_update.gif">
      
      - REVIEW 삭제
        <img src="src/main/webapp/resources/gif/study_review_delete.gif">

  - QNA
      - QNA 작성
        <img src="src/main/webapp/resources/gif/study_qna_Add.gif">
      
      - QNA 수정
        <img src="src/main/webapp/resources/gif/study_qna_update.gif">
      
      - QNA 삭제
        <img src="src/main/webapp/resources/gif/study_qna_Delte.gif">
        

  ####   7. 주문 및 결제
  - 주문 성공
    - 주문한 가격과 결제한 가격을 검증하여 통과하면 주문이 성공
      <img src="src/main/webapp/resources/gif/order/order_success.gif">
    
  - 주문 실패
    - 주문한 가격과 결제한 가격이 맞지 않으면 결제가 완료되지 않는다.
      <img src="src/main/webapp/resources/gif/order/order_fail.gif">
  
  
## 배포
**미정**

## ISSUE
  
