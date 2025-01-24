<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up Success</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 100px;
            text-align: center;
        }
        h2 {
            color: #28a745;
        }
        p {
            font-size: 18px;
        }
        .btn {
            margin-top: 20px;
        }
    </style>
    <meta http-equiv="refresh" content="3;url=login.jsp"> <!-- Redirect after 3 seconds -->
</head>
<body>

    <div class="container">
        <h2>Your membership has been successfully created!</h2>
        <p>You will be redirected to the login page shortly. If not, click <a href="login.jsp">here</a> to log in.</p>
        <a href="login.jsp" class="btn btn-success">Go to Login</a>
    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
