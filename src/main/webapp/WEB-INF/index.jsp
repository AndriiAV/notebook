<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />

<fmt:setLocale value="${language}" />
<fmt:setBundle basename="messages" />


<html>
  <head>
    <meta charset="UTF-8">
    <title>Welcome</title>
  </head>
  <body>
  <form>
    <select id="language" name="language" onchange="submit()">
      <option value="uk_UA" ${language == 'uk_UA' ? 'selected' : ''}>Українська</option>
      <option value="en_EN" ${language == 'en_EN' ? 'selected' : ''}>English</option>
    </select>
  </form>

  <form method="post" action="/record">
    <p><b><fmt:message key="record.lastName" />:</b><br>
      <input size="50" name="lastName"></p>
    <p><b><fmt:message key="record.firstName" />:</b><br>
      <input size="50" name="firstName"></p>
    <p><b><fmt:message key="record.nickName" />:</b><br>
    <input size="50" name="nickName"></p>
    <p><b><fmt:message key="record.comment" />:</b><br>
      <textarea rows="5" cols="55" name="comment"></textarea></p>

    <p><b><fmt:message key="record.group" />:</b><Br>
      <input type="radio" name="group" value="FAMILY" name="group"> <fmt:message key="record.gFamily" /><Br>
      <input type="radio" name="group" value="WORK" name="group"> <fmt:message key="record.gWork" /><Br>
      <input type="radio" name="group" value="OTHER" name="group" checked> <fmt:message key="record.gOther" /><Br>
    </p>

    <input type="date" name="calendar" value="2017-08-03" min="2016-01-01" max="2019-12-31" >

    <p><input type="submit" value=<fmt:message key="record.send" />></p>
  </form>
  </body>
</html>
