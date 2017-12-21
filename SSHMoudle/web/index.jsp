<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/19
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <script language="JavaScript" src="js/jquery.min.js"></script>
    <script>
      $(document).ready(function () {
          $("#btn").click(function () {
              var sname = $("#sname").val();
              //jquery 获取选中radio的值
               var sex = $("input[name='sex']:checked").val();

               //发送ajax请求
               $.ajax({
                   url:"studentController",
                   type:"post",
                   data:"sname="+sname+"&sex="+sex,
                   success:function (msg) {
                    //js 解析 jsonObject
                       var obj = $.parseJSON(msg);
                       alert(obj.result)
                   }
               });
          });
      });
     /* $(function () {

      });*/
    </script>
  </head>
  <body>
   姓名：<input type="text" name="sname" id="sname">
   性别：<input type="radio" name="sex" value="0">男
         <input type="radio" name="sex" value="1">女
   <input type="button" value="增加" id="btn">
  </body>
</html>
