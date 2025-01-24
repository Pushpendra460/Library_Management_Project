<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Book Details</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        .form-container {
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        header h2 {
            color: #343a40;
        }
        footer {
            text-align: center;
            margin-top: 30px;
        }
    </style>
</head>
<body>

    <div class="container">
        <!-- Header Section -->
        <header>
            <h2>Update Book Details</h2>
            <nav>
                <ul class="list-unstyled">
                    <li><a href="admin_dashboard.jsp" class="btn btn-link">Back to Dashboard</a></li>
                </ul>
            </nav>
        </header>

        <!-- Update Book Form Section -->
        <section class="form-container">
            <h3>Update Book</h3>
            <form action="UpdateBookServlet" method="post">
                <div class="form-group">
                    <label for="bookId">Book ID:</label>
                    <input type="text" id="bookId" name="bookId" class="form-control" value="<%= request.getAttribute("bookId") %>" readonly required>
                </div>
                <div class="form-group">
                    <label for="title">Title:</label>
                    <input type="text" id="title" name="title" class="form-control" value="<%= request.getAttribute("title") %>" required>
                </div>
                <div class="form-group">
                    <label for="author">Author:</label>
                    <input type="text" id="author" name="author" class="form-control" value="<%= request.getAttribute("author") %>" required>
                </div>
                <div class="form-group">
                    <label for="quantity">Quantity:</label>
                    <input type="number" id="quantity" name="quantity" class="form-control" value="<%= request.getAttribute("quantity") %>" required>
                </div>
                <div class="form-group text-center">
                    <button type="submit" class="btn btn-primary">Update Book</button>
                </div>
            </form>
        </section>

        <!-- Footer Section -->
        <footer>
            <p>&copy; 2025 Library Management System</p>
        </footer>
    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
