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

    .hidden.menu {
      display: none;
    }

    .masthead.segment {
      min-height: 700px;
      padding: 1em 0em;
    }
    .masthead .logo.item img {
      margin-right: 1em;
    }
    .masthead .ui.menu .ui.button {
      margin-left: 0.5em;
    }
    .masthead h1.ui.header {
      margin-top: 3em;
      margin-bottom: 0em;
      font-size: 4em;
      font-weight: normal;
    }
    .masthead h2 {
      font-size: 1.7em;
      font-weight: normal;
    }

    .ui.vertical.stripe {
      padding: 8em 0em;
    }
    .ui.vertical.stripe h3 {
      font-size: 2em;
    }
    .ui.vertical.stripe .button + h3,
    .ui.vertical.stripe p + h3 {
      margin-top: 3em;
    }
    .ui.vertical.stripe .floated.image {
      clear: both;
    }
    .ui.vertical.stripe p {
      font-size: 1.33em;
    }
    .ui.vertical.stripe .horizontal.divider {
      margin: 3em 0em;
    }

    .quote.stripe.segment {
      padding: 0em;
    }
    .quote.stripe.segment .grid .column {
      padding-top: 5em;
      padding-bottom: 5em;
    }

    .footer.segment {
      padding: 5em 0em;
    }

    .secondary.pointing.menu .toc.item {
      display: none;
    }

    @media only screen and (max-width: 700px) {
      .ui.fixed.menu {
        display: none !important;
      }
      .secondary.pointing.menu .item,
      .secondary.pointing.menu .menu {
        display: none;
      }
      .secondary.pointing.menu .toc.item {
        display: block;
      }
      .masthead.segment {
        min-height: 350px;
      }
      .masthead h1.ui.header {
        font-size: 2em;
        margin-top: 1.5em;
      }
      .masthead h2 {
        margin-top: 0.5em;
        font-size: 1.5em;
      }
    }


  </style>
</head>
<body>
<!-- Page Contents -->
<div class="pusher">
  <div class="ui inverted vertical masthead center aligned segment">

    <div class="ui container">
      <div class="ui large secondary inverted pointing menu">
        <a class="toc item">
          <i class="sidebar icon"></i>
        </a>
        <a href="./adminIndex" class="item">所有书籍</a>
        <a href="./adminBookForm" class="active item">新增图书</a>
        <a href="./adminRecord" class="item">借还记录</a>
         <div class="right item">
          <a href="./login" class="ui inverted button">退出</a>
        </div>
      </div>
    </div>
     <div class="ui container">
  </div>
	    <form class="ui large form" role="form" action="addbook.action" method="post" name="form_" >
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="book icon"></i>
            <input type="text" id="name" name="book.name" placeholder="书名">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" id="author" name="book.author" placeholder="作者名">
        </div>
        </div>
          <div class="field">
          <div class="ui left icon input">
            <i class="money icon"></i>
            <input type="text" id="price" name="book.price" placeholder="价格">
          </div>
        </div>
             <div class="field">
          <div class="ui left icon input">
            <i class="genderless icon"></i>
            <input type="text" id="collection" name="book.collection" placeholder="数量">
          </div>
        </div>
        <button class="ui fluid large teal submit button" type="submit">新增</button>
        <button class="ui fluid large teal reset button" type="reset">重置</button>
      </div>
    </form>
</div>
</div>
<script src="statics/sui/examples/assets/library/jquery.min.js"></script>
<script src="statics/sui/dist/semantic.min.js"></script>
  <script>
      // fix menu when passed
      $('.masthead')
        .visibility({
          once: false,
          onBottomPassed: function() {
            $('.fixed.menu').transition('fade in');
          },
          onBottomPassedReverse: function() {
            $('.fixed.menu').transition('fade out');
          }
        })
      ;
      // create sidebar and attach to menu open
      $('.ui.sidebar')
        .sidebar('attach events', '.toc.item')
      ;
  </script>
</body>
</html>