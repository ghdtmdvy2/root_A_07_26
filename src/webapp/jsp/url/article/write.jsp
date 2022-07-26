<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>게시물 작성</h1>
<form onsubmit="article__submit(this); return false;">
    <div><span>제목</span><input type="text" name="title"/></div>
    <div><span>내용</span><input type="text" name="body"/></div>
    <div><span>작성</span><input type="submit" value="작성"/></div>
</form>
<script>
    function article__submit(form){
        form.title.value = form.title.value.trim();
        form.body.value = form.body.value.trim();
        if (form.title.value == 0){
            alert("제목을 입력해주세요.");
            form.title.focus();
            return;
        }
        if (form.body.value == 0){
            alert("내용을 입력해주세요.");
            form.body.focus();
            return;
        }
        form.submit();
    }
</script>