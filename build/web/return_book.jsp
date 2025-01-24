<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Return Book</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 600px;
            margin-top: 50px;
        }

        .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }

        h2 {
            margin-bottom: 30px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .btn-custom {
            width: 100%;
        }
    </style>
</head>

<body>

    <div class="container">
        <div class="form-container">
            <h2 class="text-center">Return a Book</h2>

            <form action="ReturnBookServlet" method="post">

                <!-- Book Name -->
                <div class="form-group">
                    <label for="book_name">Book Name:</label>
                    <input type="text" class="form-control" id="book_name" name="book_name" required>
                </div>

                <!-- Author -->
                <div class="form-group">
                    <label for="author">Author:</label>
                    <input type="text" class="form-control" id="author" name="author" required>
                </div>

                <!-- Serial No -->
                <div class="form-group">
                    <label for="serial_no">Serial No:</label>
                    <input type="text" class="form-control" id="serial_no" name="serial_no" required>
                </div>

                <!-- Issue Date -->
                <div class="form-group">
                    <label for="issue_date">Issue Date:</label>
                    <input type="text" class="form-control" id="issue_date" name="issue_date" required>
                </div>

                <!-- Return Date -->
                <div class="form-group">
                    <label for="return_date">Return Date:</label>
                    <input type="date" class="form-control" id="return_date" name="return_date" required>
                </div>

                <!-- Submit Button -->
                <button type="submit" class="btn btn-primary btn-custom">Return Book</button>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>
