<%@page import="cn.gov.customs.casp.sdk.h4a.enumdefines.ListObjectCategories"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.enumdefines.RoleCategories"%>
<%@page
        import="cn.gov.customs.casp.sdk.h4a.enumdefines.AccreditCategory"%>
<%@page
        import="cn.gov.customs.casp.sdk.h4a.enumdefines.DelegationCategories"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.enumdefines.ViewCategory"%>
<%@page
        import="cn.gov.customs.casp.sdk.h4a.ogu.ws.OrganizationCategory"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.accredit.ws.UserCategory"%>
<%@page
        import="cn.gov.customs.casp.sdk.h4a.enumdefines.ListObjectCategories  "%>
<%@page
        import="cn.gov.customs.casp.sdk.h4a.enumdefines.ObjectStatusCategories  "%>
<%@page import="cn.gov.customs.casp.sdk.h4a.OguBeanReaderHelper"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.AccreditXmlReaderHelper"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.OguXmlReaderHelper"%>
<%@page import="cn.gov.customs.casp.sdk.h4a.entity.ObjectsDetail"%>
<%@page import="org.w3c.dom.Element"%>
<%@page import="org.w3c.dom.Node"%>
<%@page import="org.w3c.dom.NodeList"%>
<%@page import="org.w3c.dom.Text"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="cn.gov.customs.casp.sdk.h4a.passport.IAccreditBeanReader" %>
<%@ page import="cn.gov.customs.casp.sdk.h4a.BeanReaderHelper" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <title>Insert title here</title>
</head>
<body>

<form action="/testSDK/logout.jsp" method="post">
    
    <%
        Object o = request.getSession().getAttribute("user");
        ObjectsDetail objectDetail = new ObjectsDetail();
        if(o instanceof  ObjectsDetail){
            objectDetail = (ObjectsDetail)o;
        }
    %>

    <%if(objectDetail != null){%>
    <script>
        location.href="http://10.58.86.57:8080/reportedRarrier/index.html";
    </script>

    <% }%>

	<input type="submit" value="登出">
    欢迎<%= objectDetail.getDisplay_name()%>登陆系统
    <%= objectDetail.getAll_path_name() %>
    <br /> <br />


    <%
        Element elementResult =  OguXmlReaderHelper.getXmlOrganizationChildren(
                "BASE_VIEW",
                ViewCategory.ViewCode,
                "海关总署\\济南海关",
                OrganizationCategory.ORG_ALL_PATH_NAME,
                ListObjectCategories.All,
                ObjectStatusCategories.Common,
                1, "", "", "", 0,
                "OBJ_NAME,GLOBLA_SORT,CUSTOMS_CODE");

        //首先，先取到返回的结果集：diffgr:diffgram

        NodeList childNodes = elementResult.getChildNodes();



        //返回的xml结果中有两个最大的结果集，为：xs:schema、diffgr:diffgram，咱们需要取到第二个包含真正结果的diffgr:diffgram

        Node diffgrNode = childNodes.item(1);



        //接下来，取diffgr:diffgram中包含的下一层结果

        NodeList diffgrChildNodes = diffgrNode.getChildNodes();
        //diffgr:diffgram下面只包含一层子节点，所以我们来取第一个节点的值
        Node valueNode = diffgrChildNodes.item(0);
        //接下来，咱们再取下一层节点，下一层节点可能包含多个也可能只包含一个，所以我们要用for循环取并加个判断
        NodeList dataNodes = valueNode.getChildNodes();
        //如果包含多个结果集，使用循环获取下面的值

        if (dataNodes.getLength() > 0) {

            for (int i = 0; i < dataNodes.getLength(); i++) {
                //这层已经到了结果对象，接下来使用for循环取对象里面的每个属性的值
                Node objectNode = dataNodes.item(i);
                System.out.println(objectNode.getNodeName());
                NodeList fieldNodes = objectNode.getChildNodes();
                for(int j = 0 ; j < fieldNodes.getLength() ; j++){
                    Node fieldNode = fieldNodes.item(j);
                    //节点名称
                    String nodeName = fieldNode.getNodeName();
                    //节点值
                    String nodeValue = fieldNode.getFirstChild().getNodeValue();
                    System.out.println("nodeName="+nodeName+"  nodeValue="+nodeValue);
                }
            }
        }else{
            //如果只包含一个结果，直接获取下面的值就好
            //这层已经到了结果对象，接下来使用for循环取对象里面的每个属性的值
            Node objectNode = dataNodes.item(0);
            NodeList fieldNodes = objectNode.getChildNodes();
            for(int i = 0 ; i < fieldNodes.getLength() ; i++){
                Node fieldNode = fieldNodes.item(i);
                //节点名称
                String nodeName = fieldNode.getNodeName();
                //节点值
                String nodeValue = fieldNode.getFirstChild().getNodeValue();
                System.out.println(nodeName);
                System.out.println("nodeName="+nodeName+"  nodeValue="+nodeValue);
            }

        }

    %>


</form>
</body>
</html>