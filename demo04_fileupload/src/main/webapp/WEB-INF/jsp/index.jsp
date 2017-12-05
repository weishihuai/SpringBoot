<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
单个文件上传：
<form method="post" enctype="multipart/form-data" action="/jspHandleFileUpload">
    <p>文件：<input type="file" name="file"/></p>
    <p><input type="submit" value="上传"/></p>
</form>

多个文件上传：
<form method="post" enctype="multipart/form-data" action="/uploads">
    <p>文件1：<input type="file" name="file"/></p>
    <p>文件2：<input type="file" name="file"/></p>
    <p>文件3：<input type="file" name="file"/></p>
    <p><input type="submit" value="上传"/></p>
</form>

</body>
</html>