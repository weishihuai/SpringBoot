<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

单个文件上传：<br/>
<form action="/file_upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="提交上传"/>
</form>
<br/>


多个文件上传：
<form action="/file_uploads" method="post" enctype="multipart/form-data">
    文件1：<input type="file" name="file"/><br/>
    文件2：<input type="file" name="file"/><br/>
    文件3：<input type="file" name="file"/><br/>
    <input type="submit" value="上传多个文件"/>
</form>

</body>
</html>
