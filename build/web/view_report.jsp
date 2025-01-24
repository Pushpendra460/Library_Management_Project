<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Report</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        .report-title {
            color: #343a40;
            font-size: 1.8rem;
            font-weight: bold;
        }
        .report-content {
            background-color: #ffffff;
            border: 1px solid #ddd;
            padding: 20px;
            margin-top: 20px;
            border-radius: 8px;
        }
        .back-btn {
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <div class="container">
        <!-- Report Title Section -->
        <header>
            <h2 class="report-title"><%= request.getAttribute("reportTitle") %></h2>
        </header>

        <!-- Report Content Section -->
        <section class="report-content">
            <%= request.getAttribute("reportContent") %>
        </section>

        <!-- Back Button -->
        <div class="back-btn">
            <a href="reports.jsp" class="btn btn-primary">Back to Reports</a>
        </div>
    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
