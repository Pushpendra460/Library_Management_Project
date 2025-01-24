<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Issue Book</title>

    <!-- Bootstrap CSS Link -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            padding-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="text-center mb-4">Issue a Book</h2>

        <!-- Form for Issuing a Book -->
        <form action="IssueBookServlet" method="post">
            <div class="form-group">
                <label for="book_name">Book Name</label>
                <input type="text" class="form-control" id="book_name" name="book_name" required>
            </div>

            <div class="form-group">
                <label for="author">Author</label>
                <input type="text" class="form-control" id="author" name="author" readonly>
            </div>

            <div class="form-group">
                <label for="issue_date">Issue Date</label>
                <input type="date" class="form-control" id="issue_date" name="issue_date" 
                    min="<%= new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) %>" required>
            </div>

            <div class="form-group">
                <label for="return_date">Return Date</label>
                <input type="date" class="form-control" id="return_date" name="return_date" required>
            </div>

            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary">Issue Book</button>
            </div>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies (jQuery, Popper.js) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
