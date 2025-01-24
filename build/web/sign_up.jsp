<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Membership Sign-Up</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        .card {
            padding: 30px;
            margin-bottom: 20px;
        }
        h2 {
            color: #007bff;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn {
            width: 100%;
        }
        .error-message {
            color: red;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="text-center mb-4">Library Membership Registration</h2>

        <div class="card">
            <form action="SignUpServlet" method="post">
                <div class="form-group">
                    <label for="membership_no">Membership No</label>
                    <input type="number" class="form-control" name="membership_no" required>
                </div>

                <div class="form-group">
                    <label for="name">Full Name</label>
                    <input type="text" class="form-control" name="name" required>
                </div>

                <div class="form-group">
                    <label for="membership_type">Membership Type</label>
                    <select class="form-control" name="membership_type">
                        <option value="6 months">6 months</option>
                        <option value="1 year">1 year</option>
                        <option value="2 years">2 years</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" class="form-control" name="address">
                </div>

                <div class="form-group">
                    <label for="phone">Phone</label>
                    <input type="text" class="form-control" name="phone">
                </div>

                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" class="form-control" name="username" required>
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" required>
                </div>

                <div class="form-group">
                    <label for="role">Role</label>
                    <select class="form-control" name="role">
                        <option value="user">User</option>
                        <option value="admin">Admin</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Sign Up</button>
            </form>

            <p class="error-message mt-3">
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
