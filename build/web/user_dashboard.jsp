<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Dashboard</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        header h2 {
            color: #343a40;
        }
        .dashboard-list {
            list-style: none;
            padding: 0;
        }
        .dashboard-list li {
            margin: 15px 0;
        }
        footer {
            text-align: center;
            margin-top: 30px;
        }
        .logout-btn {
            margin-top: 30px;
            text-align: center;
        }
    </style>
</head>
<body>

    <div class="container">
        <!-- Header Section -->
        <header>
            <h2>Welcome, User</h2>
        </header>

        <!-- User Dashboard Navigation -->
        <section>
            <h4>Select an option to proceed:</h4>
            <ul class="dashboard-list">
                <li><a href="reports.jsp" class="btn btn-primary btn-lg btn-block">Generate Reports</a></li>
                <li><a href="transactions.jsp" class="btn btn-success btn-lg btn-block">Transactions</a></li>
            </ul>
        </section>

        <!-- Logout Button -->
        <div class="logout-btn">
            <form action="LogoutServlet" method="get">
                <button type="submit" class="btn btn-danger btn-lg btn-block">Logout</button>
            </form>
        </div>

        <!-- Footer Section -->
        <footer>
            <p>@This application was developed by Pushpendra Kumar Shah</p>
        </footer>
    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
