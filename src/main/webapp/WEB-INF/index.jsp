<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title></title>
</head>
<body>
    <h2>Hello World!</h2>
    <form method="post" action="/hello1">
        <p><input name="name" type="text"/></p>
        <p><input name="age" type="text"/></p>
        <p><input name="birthday" type="text"/></p>
        <p><input type="checkbox" name="hobby" value="1"/>篮球
        <input type="checkbox" name="hobby" value="2"/>游泳
        <input type="checkbox" name="hobby" value="3"/>羽毛球</p>
        <p><input type="submit" value="提交"/></p>
    </form>
</body>
</html>
