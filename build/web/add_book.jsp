<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Book</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

    <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
        <div class="card shadow-lg" style="width: 400px; border-radius: 15px;">
            <div class="card-header text-center bg-info text-white">
                <h4>Add New Book</h4>
            </div>
            <div class="card-body">
                <form action="AddBookServlet" method="post">
                    <div class="form-group">
                        <label for="title">Book Title</label>
                        <input type="text" class="form-control" name="title" required>
                    </div>

                    <div class="form-group">
                        <label for="author">Author</label>
                        <input type="text" class="form-control" name="author" required>
                    </div>

                    <div class="form-group">
                        <label for="category">Category</label>
                        <input type="text" class="form-control" name="category">
                    </div>

                    <div class="form-group text-center">
                        <button type="submit" class="btn btn-primary btn-block">Add Book</button>
                    </div>
                </form>

                <div class="text-center mt-3">
                    <a href="admin_dashboard.jsp" class="btn btn-link">Back to Dashboard</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
