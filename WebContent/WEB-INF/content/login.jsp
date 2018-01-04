<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>图书管理系统</title>
<link rel="stylesheet" type="text/css" href="statics/sui/dist/semantic.min.css">
 <style type="text/css">
    body {
      background-color: #DADADA;
    }
    body > .grid {
      height: 100%;
    }
    .image {
      margin-top: -100px;
    }
    .column {
      max-width: 450px;
    }
  </style>
</head>
<body>
<div class="ui middle aligned center aligned grid">
  <div class="column">
    <h2 class="ui teal image header">
      <img src="statics/sui/examples/assets/images/logo.png" class="image">
      <div class="content">
        	Library Management System
      </div>
    </h2>
    <form class="ui large form" role="form" action="userlogin.action" method="post" name="form_">
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" id="name" name="user.name" placeholder="用户名">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" id="password" name="user.password" placeholder="密码">
          </div>
        </div>
        <button class="ui fluid large teal submit button" type="submit">登录</button>
      </div>

      <div class="ui error message"></div>

    </form>

    <div class="ui message">
      	加入我们？ <a href="./register">注册</a>
    </div>
  </div>
</div>
<script src="statics/sui/examples/assets/library/jquery.min.js"></script>
<script src="statics/sui/dist/semantic.min.js"></script>
  <script>
  $(document)
    .ready(function() {
      $('.ui.form')
        .form({
          fields: {
        	  name: {
              identifier  : 'name',
              rules: [
                {
                  type   : 'empty',
                  prompt : '用户名不可为空'
                }
              ]
            },
            password: {
              identifier  : 'password',
              rules: [
                {
                  type   : 'empty',
                  prompt : '密码不可为空'
                }
              ]
            }
          }
        })
      ;
    })
  ;
  </script>
</body>
</html>