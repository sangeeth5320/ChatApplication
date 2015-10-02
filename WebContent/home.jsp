<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chat World</title>
</head>
<body>
<form name="chat" action="Post" method="post">
Enter Username <input type="text" name="userName"/>
<input type="submit" name="send" value="Enter"><br>
Start your chat:<br>
<textarea rows="10" cols="30" id="message" name="getMsg">${welcome}  </textarea>
<input type="button" name="send" value="send"   onclick="transfertext()"><br></br>

<textarea rows="5" cols="30" id="receive" name="chatMessage" disabled="disabled"> ${userName} ${chatMsg} </textarea>

</form> 

</body>
<script type="text/javascript">
        function transfertext()
        {
            var varSrcText = document.getElementById("message").value;
            document.getElementById("receive").value=varSrcText;

        }

    </script>
</html>