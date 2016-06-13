<%@page import="com.kaolafm.payment.utils.MD5Utils"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.kaolafm.user.util.StringUtils"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.kaolafm.payment.request.OrderHandler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<%
	String md5key = "9476cf76d0a82143d0030385e04ab301";
	String urlStr = request.getParameter("urlStr");
	TreeMap<String, String> parameterMap = new TreeMap<String, String>();
	if(StringUtils.isNotBlank(urlStr)){
		String[] urlArr = urlStr.split("\\?");
		if(urlArr.length <= 1){
			out.println("url错误!!!!!");
			return;
		}
		String params = urlArr[1];
		if(StringUtils.isNotBlank(params)){
			String[] paramArr = params.split("&");
			if(paramArr.length > 0){
				for(int i=0;i<paramArr.length;i++){
					String kv = paramArr[i];
					if(StringUtils.isNotBlank(kv)){
						String[] kvArr = kv.split("=");
						parameterMap.put(kvArr[0], kvArr[1]);
					}
				}
				
				StringBuffer sb = new StringBuffer();
				sb.append(md5key);
				int i=0;
				for (String key : parameterMap.keySet()) {
					sb.append(i).append(key).append("=").append(parameterMap.get(key));
					i++;
				}
				sb.append(md5key);
				out.println("签名顺序==="+sb.toString());
				
				String sign = MD5Utils.getMD5Str(sb.toString().substring(0, sb.toString().length()));
				
				out.println("签名值==="+sign);
				
				sb.append("signv2="+sign);
				
			}
			
		}
	}
%>

<body>
<h2>Hello Ladies and Gentlemen!</h2>
	<form action="" >
		<label>请求url:</label>
		<input type="text" name="urlStr">
		<input type="submit" value="签名">
	</form>
</body>
</html>
