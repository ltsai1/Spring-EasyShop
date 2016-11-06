<%-- 
    Document   : addProduct
    Created on : Nov 5, 2016, 5:22:51 PM
    Author     : Camille
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>

            <p class="lead" >Fill the below information to add a product: 
            </p>
        </div>
        
        <%--><form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" 
                   commandName="product" enctype="multipart/form-data"> --%>
            
            <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" 
                   commandName="product">
            <div class="form-group">
                <label for="name">Product</label> <form:errors path="productName" cssStyle="color: #ff0000;" />
                <form:input path="productName" id="name" class="form-control" />
            </div>
            
            <div class="form-group"> <form:errors path="productBrand" cssStyle="color: #ff0000;" />
                <label for="brand">Brand</label>
                <form:input path="productBrand" id="brand" class="form-control" />
            </div>
            
            <div class="form-group"> <form:errors path="productDescription" cssStyle="color: #ff0000;" />
                <label for="description">Description</label>
                <form:textarea path="productDescription" id="description" class="form-control" />
            </div>
            
            <div class="form-group"> 
                <label for="category">Category/label> <form:errors path="productCategory" cssStyle="color: #ff0000;" />
                    <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="clothes"/> Clothes</label>
                    <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="shoes"/> Shoes</label>
                    <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="bags"/> Bags</label>
                    
               
            </div>
            
                    
            <div class="form-group"> 
                <label for="gender">Gender</label> <form:errors path="productGender" cssStyle="color: #ff0000;" /> 
                <label class="checkbox-inline"><form:radiobutton path="productGender" id="gender" value="M" />Male</label> 
                <label class="checkbox-inline"><form:radiobutton path="productGender" id="gender" value="F" />Female</label> 
            </div> 
 
            <div class="form-group"> 
                <label for="price">Price</label>  <form:errors path="productPrice" cssStyle="color: #ff0000;" /> 
                <form:input path="productPrice" id="price" class="form-Control"/> 
            </div> 
            
            <%--
                <div class="form-group">
                <label class="control-label" for="productImage">Upload Picture</label> 
                <form:input id="productImage" path="productImage" type="file" class="form:input-large"/> 
                </div>
            --%>

 
         <br><br> 
         <input type="submit" value="SUBMIT" class="btn btn-default"> 
         <a href="<c:url value="/admin/productInventory" />" class="btn btn-default">CANCEL</a> 
        </form:form> 

       
        <script src="<c:url value="/resources/js/controller.js" /> "></script>
        <%@include file="/WEB-INF/views/template/footer.jsp" %>

