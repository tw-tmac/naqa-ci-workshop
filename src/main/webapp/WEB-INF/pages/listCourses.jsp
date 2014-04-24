<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
        body {font-size:100%; font-family:"Verdana", sans-serif;}
    </style>
</head>
<h1>Courses</h1>
<img src="../../img/Starfleet_command_emblem.png" height="25%" length="25%"/>
    <form:form method="POST" modelAttribute="course" action="registered-courses.html">
        <table>
            <tbody>
                <tr>
                    <td>
                        <ul>
                            <form:radiobuttons element="li" path="courseName" items="${courseList}"/>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input value="Submit" type="submit">
                    </td>
                </tr>
            </tbody>
        </table>
    </form:form>
</html>
