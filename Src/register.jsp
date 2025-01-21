<h1>Register</h1>
<form action="register" method="post">
    <label>Username: <input type="text" name="username" /></label><br />
    <label>Email: <input type="email" name="email" /></label><br />
    <label>Password: <input type="password" name="password" /></label><br />
    <button type="submit">Register</button>
</form>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>