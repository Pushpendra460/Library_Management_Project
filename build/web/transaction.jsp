<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Transaction Management</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        h2 {
            text-align: center;
            margin-bottom: 40px;
        }
        .transaction-form {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group label {
            font-weight: bold;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Transaction Management</h2>
        
        <!-- Transaction Form -->
        <div class="transaction-form">
            <form action="TransactionServlet" method="post">
                <div class="form-group">
                    <label for="bookId">Book ID</label>
                    <input type="text" class="form-control" id="bookId" name="bookId" required>
                </div>

                <div class="form-group">
                    <label for="membershipNo">Membership Number</label>
                    <input type="text" class="form-control" id="membershipNo" name="membershipNo" required>
                </div>

                <div class="form-group">
                    <label for="transactionType">Transaction Type</label>
                    <select class="form-control" id="transactionType" name="transactionType" required>
                        <option value="borrow">Borrow</option>
                        <option value="return">Return</option>
                    </select>
                </div>

                <div class="form-group text-center">
                    <button type="submit" class="btn btn-primary btn-lg btn-block">Submit Transaction</button>
                </div>
            </form>
        </div>

        <!-- Transaction Status -->
        <div class="transaction-status text-center mt-4">
            <p class="text-success">
                <%= request.getAttribute("successMessage") != null ? request.getAttribute("successMessage") : "" %>
            </p>
            <p class="text-danger">
                <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
            </p>
        </div>

    </div>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
