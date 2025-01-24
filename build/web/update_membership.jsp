<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Membership</title>
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
            <h2>Update Membership</h2>
            <nav>
                <ul class="list-unstyled">
                    <li><a href="admin_dashboard.jsp" class="btn btn-link">Back to Dashboard</a></li>
                </ul>
            </nav>
        </header>

        <!-- Update Membership Form Section -->
        <section class="form-container">
            <form action="UpdateMembershipServlet" method="post">
                <div class="form-group">
                    <label for="membership_no">Membership Number:</label>
                    <input type="text" id="membership_no" name="membership_no" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="extend_by">Extend Membership By:</label>
                    <select id="extend_by" name="extend_by" class="form-control" required>
                        <option value="6 months" selected>6 months</option>
                        <option value="1 year">1 year</option>
                        <option value="2 years">2 years</option>
                    </select>
                </div>
                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="cancel_membership" name="cancel_membership" value="yes">
                    <label class="form-check-label" for="cancel_membership">Cancel Membership</label>
                </div>
                <div class="form-group text-center">
                    <button type="submit" class="btn btn-primary">Update Membership</button>
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
