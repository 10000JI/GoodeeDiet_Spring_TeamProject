<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다이어트</title>

	<style type="text/css">
		.redResult{
			color: red;
		}
		.blueResult{
			color: blue;
		}
/* 		.member__input-guide-area_set{ */
/* 			color: gray; */
/* 			font-size: 12px; */
/* 		} */
	</style>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous"> -->
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"> -->
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>




<input type="hidden" id="originId" value="${sessionScope.sessionMember.id}">



<div class="container-fluid">
	<div class="row">

<%-- <div class="col-2 border border-primary" style="background-color: rgb(169, 167, 167);">
<ul class="nav flex-column">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">주문/배송</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#">문의</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="./myPage">개인정보</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled" href="./delivery?id=${sessionMember.id}">배송지</a>
  </li>
</ul>
</div> --%>

<c:import url="./memberHeader.jsp"></c:import>



<div class="col-8">

    <h1 class="usermodify-title">회원정보 수정</h1>

    <table class="usermodify-table table table-striped">    
		<tbody>
		<tr>
			<th scope="row">비밀번호변경</th>
			<td><div class="usermodify-password">


<table class="table usermodify-input-table">
	<tbody>		
		<tr>
		    <th class="col-2">현재 비밀번호</th>
		    <td class="col-4">
		        <input type="password" class="password-change1"><div class="member__input-guide-area_set member__input-guide-area1"></div>
		    </td>
		</tr>
		<tr>
		    <th>새 비밀번호</th>
		    <td>
		        <input type="password" class="password-change2"><div class="member__input-guide-area_set member__input-guide-area2"></div>
		    </td>
		</tr>
		<tr>
		    <th>비밀번호 다시 입력</th>
		    <td>
		        <input type="password" class="password-change3"><div class="member__input-guide-area_set member__input-guide-area3"></div>
		    </td>
		</tr>
		<tr>
			<td>
			    <button type="button" class="password-submit">비밀번호 변경</button>
			</td>
		</tr>
					</tbody></table>
				</div></td>
		</tr>
    </tbody>
</table>

</div>


<!-- container, row -->
	</div>
</div>





<!-- <section class="vh-200" style="background-color: #eee;"> -->
<!--   <div class="container-fluid"> -->
<!--     <div class=" justify-content-center align-items-center"> -->
<!--       <div class=""> -->
<!--             <div class="row justify-content-center"> -->
<!--               <div class="col-md-10"> -->
              
              
              
              
<!-- 	<div class="card" style="width: 70%;"> -->
<!-- 		<div class="card-body"> -->
<!--     <h1 class="usermodify-title">회원정보 수정</h1> -->

<!--     <table class="usermodify-table table table-striped"> -->
<!--         <tbody> -->
            



<!-- <tr> -->
<!--     <th scope="row">아이디(이메일)</th> -->
<!--     <td><div class="usermodify-email"> -->
<!-- 	<input type="hidden" id="originEmail" value="gmdiaal@gmail.com"> -->
<!-- 	<input type="hidden" id="regEmail" value="gmdiaal@gmail.com"> -->
<!-- 	<input type="hidden" id="emailDupCheck" value="N"> -->
<!--     <input type="hidden" id="changeEmail" value=""> -->

<!--     <strong class="usermodify-email-current-mail">gmdiaal@gmail.com</strong> -->
<!--     <button type="button" class="usermodify-email-change-btn">이메일 변경</button> -->
<!--     <button type="button" class="usermodify-email-change-cancel" style="display: none;">이메일 변경취소</button> -->

<!--     <form class="usermodify-email-change-auth" action="/login/checkEmailDuplication.pang" method="POST" style="display: none;"> -->
<!--         <input data-errmsg="이미 가입된 메일주소입니다. 다른 이메일을 입력하여 주세요." data-target="usermodify-email-change-errmsg" class="usermodify-email-tf" type="text" value="gmdiaal@gmail.com"> -->
<!--         <button type="submit" class="usermodify-email-change-auth-send">인증메일 전송</button> -->
<!--         <div class="form-err usermodify-email-change-errmsg" style="display: none;"></div> -->
<!--     </form> -->

<!--     <form class="usermodify-email-change-form" action="/member/modify/sendEmail.pang" method="POST" style="display: none;"> -->
<!--         <input type="password" class="usermodify-email-change-tf"> -->
<!--         <button type="submit" class="usermodify-email-change-submit">비밀번호 확인</button> -->
<!--         <span class="usermodify-email-change-msg">안전한 변경을 위해 쿠팡 비밀번호를 입력해주세요.</span> -->
<!--     </form> -->

<!--     <div class="usermodify-email-change-done"> -->
<!--         <div class="usermodify-email-change-done-msg"> -->
<!--             회원님은 현재 이메일주소를 변경하여, 신청하신 이메일(<strong class="usermodify-email-change-done-email"></strong>)로 인증메일이 발송되었습니다. -->
<!--             <br> -->
<!--             이메일 확인 후 <strong>회원정보 수정 인증</strong> 버튼을 클릭하시면 이메일 변경이 완료되며, 변경하신 이메일주소로 로그인 하실 수 있습니다. -->
<!--         </div> -->
<!--         <div class="usermodify-email-change-done-foot"> -->
<!--             <button type="button" class="usermodify-email-change-done-cancel">이메일 변경취소</button> -->
<!--             <button type="button" class="usermodify-email-change-resend">인증메일 재전송</button> -->
<!--         </div> -->
<!--     </div> -->
<!-- 	</div> -->
<!-- 	</td> -->
<!-- </tr> -->



        
<!-- <tr> -->
<!-- 	<th scope="row">비밀번호변경</th> -->
<!-- 	<td><div class="usermodify-password"> -->
<!-- 		<table class="usermodify-input-table"><tbody> -->
		
<!-- <tr> -->
<!--     <th>현재 비밀번호</th> -->
<!--     <td> -->
<!--         <input type="password" class="password-change1"><div class="member__input-guide-area_set member__input-guide-area1"></div> -->
<!--     </td> -->
<!-- </tr> -->
<!-- <tr> -->
<!--     <th>새 비밀번호</th> -->
<!--     <td> -->
<!--         <input type="password" class="password-change2"><div class="member__input-guide-area_set member__input-guide-area2"></div> -->
<!--     </td> -->
<!-- </tr> -->
<!-- <tr> -->
<!--     <th>비밀번호 다시 입력</th> -->
<!--     <td> -->
<!--         <input type="password" class="password-change3"><div class="member__input-guide-area_set member__input-guide-area3"></div> -->
<!--     </td> -->
<!-- </tr> -->


<!-- <tr> -->
<!--     <td></td> -->
<!-- <td> -->
<!--     <button type="button" class="password-submit">비밀번호 변경</button> -->
<!-- </td> -->
<!-- </tr> -->
<!-- 			</tbody></table> -->
<!-- 		</div></td> -->
<!-- </tr> -->
            
            
            
            
<!--             <tr> -->
<!--                 <th scope="row">배송지</th> -->
<!--                 <td>배송지 주소 관리는 <a href="#" id="deliveryAddressPopUp"><strong>[배송지 관리]</strong></a>에서 수정, 등록 합니다.</td> -->
<!--             </tr> -->
<!--             <tr> -->
<!--                 <td> -->


<!--                 </td> -->
<!--             </tr> -->
<!--         </tbody> -->
<!--     </table> -->
<!--     <div class="usermodify-secession"> -->
<!--         탈퇴를 원하시면 우측의 회원탈퇴 버튼을 눌러주세요. -->
<!--         <a class="usermodify-secession-btn" href="secession.pang">회원탈퇴</a> -->
<!--     </div> -->
<!--     <div class="usermodify-foot"> -->
<!--         <button type="button" class="usermodify-cancel">나가기</button> -->
<!--     </div> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!--           </div> -->
<!--         </div> -->
<!--       </div> -->
<!--     </div> -->
<!--   </div> -->
<!-- </section> -->

<c:import url="../template/footer.jsp"></c:import>
<c:import url="../template/common_js.jsp"></c:import>
<script src="/resources/js/member/memberUpdate.js"></script>
<script src="/resources/js/member/memberAgree.js"></script>

</body>
</html>