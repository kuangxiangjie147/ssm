
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头部
${book}
<f:form modelAttribute="book" action="${pageContext.request.contextPath}/book/hello" method="post">
    书名:<f:input path="bookName"/><br>
    价格:<f:input path="bookPrice"/><br>
    备注:<f:input path="bookBrief"/><br>
    <input type="submit" value="确定">
</f:form>
<hr>
<%=System.currentTimeMillis()%>
<div>
    <a href="${pageContext.request.contextPath}/book/zh">zh</a>
    <a href="${pageContext.request.contextPath}/book/en">en</a>
</div>
<div>
    <p>
        <t:message code="yhzh.label"></t:message>
    </p>
    <p>
        <t:message code="yhzh.label"></t:message>
    </p>
    <p>
        ${msg}
    </p>
</div>
</body>
</html>
