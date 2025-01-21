<h1>Job Listings</h1>
<c:forEach var="job" items="${jobs}">
    <h2>${job.title}</h2>
    <p>${job.description}</p>
</c:forEach>