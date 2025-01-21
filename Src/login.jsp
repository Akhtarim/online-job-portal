<h1>Login</h1>
<form action="login" method="post">
    <label>Email: <input type="email" name="email" /></label><br />
    <label>Password: <input type="password" name="password" /></label><br />
    <button type="submit">Login</button>
</form>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>