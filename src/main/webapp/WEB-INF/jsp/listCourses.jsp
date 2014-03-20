<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <h1>Courses</h1>
    <form:form method="POST" modelAttribute="course" action="selection-result.html">
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