<%-- 
    Document   : products
    Created on : Jul 20, 2024, 1:37:12 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1 class="text-center">Quản trị sản phẩm</h1>

<c:url value="/products" var="action" />
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <div class="mb-3 mt-3">
        <label for="email" class="form-label">Tên sản phẩm</label>
        <form:input path="name" type="text" class="form-control" id="name" placeholder="Tên sản phẩm" name="name" ></form:input>
        </div>
        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Giá sản phẩm</label>
        <form:input path="price" type="number" class="form-control" id="price" placeholder="Giá sản phẩm" name="price"></form:input>
        </div>
    <form:select path="categoryId"  class="form-select">
        <c:forEach items="${cates}" var="c">
            <option value="${c.id}">${c.name}</option>
        </c:forEach>
    </form:select>
    <div class="mb-3 mt-3">
        <label for="file" class="form-label">Ảnh sản phẩm:</label>
        <form:input path="file" type="file" accept=".jpg,.png" class="form-control" id="file" name="file" />
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>