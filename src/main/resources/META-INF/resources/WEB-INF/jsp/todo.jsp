<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

    <h1>Enter Todo Details</h1>

    <form:form method="post" modelAttribute="todo">
<%--        모델의 속성을 이렇게 받아와서 쓸 수 있음--%>
        <fieldset class="mb-3">
<%--            path 속성이 view에 전해진 모델의 속성을 뽑아쓸 수 있게 한다--%>
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>


<%--        hidden을 통해 안 보이게 만들어준다--%>
        <form:input type="hidden" path="id"/>

        <form:input type="hidden" path="done"/>

        <input type="submit" class="btn btn-success"/>

    </form:form>

</div>

<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>