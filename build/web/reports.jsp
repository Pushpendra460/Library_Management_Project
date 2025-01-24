<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Reports</title>
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
            <h2 class="text-center">Generate Library Reports</h2>

            <form action="GenerateReportServlet" method="post">

                <!-- Report Type -->
                <div class="form-group">
                    <label for="reportType">Select Report Type:</label>
                    <select class="form-control" name="report_type" required>
                        <option value="issued_books" selected>Issued Books Report</option>
                        <option value="returned_books">Returned Books Report</option>
                        <option value="fines_report">Fines Report</option>
                        <option value="membership_report">Membership Report</option>
                    </select>
                </div>

                <!-- Submit Button -->
                <button type="submit" class="btn btn-primary btn-custom">Generate Report</button>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>
