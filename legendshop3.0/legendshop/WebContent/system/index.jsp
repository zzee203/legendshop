<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/common.jsp"%>
<html>
  <head>
  <base target="_blank">
    <title>开发者工具</title>
  </head>
  
  <body>
  <div style="font-weight: bold;">开发者工具</div><br>
  <a href='sql/sqlCode.jsp' target='_blank'>系统SQL配置管理和刷新SQL缓存</a><br>
  <a href='cookies/login_user.jsp' target='_blank'>查看当前登录用户的权限</a><br>
   <a href='file/log_view.jsp' target='_blank'>下载文件管理</a><br>
   <a href='file/secured_file_view.jsp' target='_blank'>安全文件管理</a><br>
   <a href='file/securest_file_view.jsp' target='_blank'>保密文件管理</a><br>
   <a href='cookies/ReadSession.jsp' target='_blank'>Session管理</a><br>
   <a href='cookies/ReadCookies.jsp' target='_blank'>Cookies管理</a><br>
  </body>
</html>