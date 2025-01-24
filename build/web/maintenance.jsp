<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library Management - Maintenance</title>
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
            margin-bottom: 30px;
        }
        h3, h4 {
            color: #007bff;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn {
            width: 100%;
        }
        .navbar {
            margin-bottom: 40px;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2 class="text-center text-primary mb-5">Welcome to Library Management - Maintenance</h2>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
            <ul class="navbar-nav mx-auto">
                <li class="nav-item"><a class="nav-link" href="add_book.jsp">Add Book</a></li>
                <li class="nav-item"><a class="nav-link" href="update_book.jsp">Update Book</a></li>
                <li class="nav-item"><a class="nav-link" href="add_membership.jsp">Add Membership</a></li>
                <li class="nav-item"><a class="nav-link" href="update_membership.jsp">Update Membership</a></li>
                <li class="nav-item"><a class="nav-link" href="ManageUsers.jsp">Manage Users</a></li>
                <li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a></li>
            </ul>
        </nav>

        <!-- Maintenance Actions -->
        <div class="maintenance-actions">

            <h3>Select an option to perform maintenance tasks</h3>

            <!-- Add Book Form -->
            <div class="card">
                <div class="card-header">
                    <h4>Add Book</h4>
                </div>
                <div class="card-body">
                    <form action="AddBookServlet" method="post">
                        <div class="form-group">
                            <label for="bookTitle">Book Title</label>
                            <input type="text" class="form-control" id="bookTitle" name="bookTitle" required>
                        </div>

                        <div class="form-group">
                            <label for="author">Author</label>
                            <input type="text" class="form-control" id="author" name="author" required>
                        </div>

                        <div class="form-group">
                            <label for="genre">Genre</label>
                            <input type="text" class="form-control" id="genre" name="genre" required>
                        </div>

                        <div class="form-group">
                            <label for="publisher">Publisher</label>
                            <input type="text" class="form-control" id="publisher" name="publisher" required>
                        </div>

                        <div class="form-group">
                            <label for="price">Price</label>
                            <input type="number" class="form-control" id="price" name="price" required>
                        </div>

                        <button type="submit" class="btn btn-primary">Add Book</button>
                    </form>
                </div>
            </div>

            <!-- Update Book Form -->
            <div class="card">
                <div class="card-header">
                    <h4>Update Book</h4>
                </div>
                <div class="card-body">
                    <form action="UpdateBookServlet" method="post">
                        <div class="form-group">
                            <label for="bookId">Book ID</label>
                            <input type="text" class="form-control" id="bookId" name="bookId" required>
                        </div>

                        <div class="form-group">
                            <label for="newTitle">New Title</label>
                            <input type="text" class="form-control" id="newTitle" name="newTitle">
                        </div>

                        <div class="form-group">
                            <label for="newAuthor">New Author</label>
                            <input type="text" class="form-control" id="newAuthor" name="newAuthor">
                        </div>

                        <div class="form-group">
                            <label for="newPrice">New Price</label>
                            <input type="number" class="form-control" id="newPrice" name="newPrice">
                        </div>

                        <button type="submit" class="btn btn-warning">Update Book</button>
                    </form>
                </div>
            </div>

            <!-- Add Membership Form -->
            <div class="card">
                <div class="card-header">
                    <h4>Add Membership</h4>
                </div>
                <div class="card-body">
                    <form action="AddMembershipServlet" method="post">
                        <div class="form-group">
                            <label for="membershipNo">Membership No</label>
                            <input type="text" class="form-control" id="membershipNo" name="membershipNo" required>
                        </div>

                        <div class="form-group">
                            <label for="name">Member Name</label>
                            <input type="text" class="form-control" id="name" name="name" required>
                        </div>

                        <div class="form-group">
                            <label for="membershipType">Membership Type</label>
                            <select class="form-control" id="membershipType" name="membershipType">
                                <option value="6 Months" selected>6 Months</option>
                                <option value="1 Year">1 Year</option>
                                <option value="2 Years">2 Years</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <label for="phone">Phone</label>
                            <input type="text" class="form-control" id="phone" name="phone" required>
                        </div>

                        <button type="submit" class="btn btn-primary">Add Membership</button>
                    </form>
                </div>
            </div>

            <!-- Update Membership Form -->
            <div class="card">
                <div class="card-header">
                    <h4>Update Membership</h4>
                </div>
                <div class="card-body">
                    <form action="UpdateMembershipServlet" method="post">
                        <div class="form-group">
                            <label for="membershipNoToUpdate">Membership No</label>
                            <input type="text" class="form-control" id="membershipNoToUpdate" name="membershipNoToUpdate" required>
                        </div>

                        <div class="form-group">
                            <label for="newMembershipType">New Membership Type</label>
                            <select class="form-control" id="newMembershipType" name="newMembershipType">
                                <option value="6 Months" selected>6 Months</option>
                                <option value="1 Year">1 Year</option>
                                <option value="2 Years">2 Years</option>
                            </select>
                        </div>

                        <button type="submit" class="btn btn-warning">Update Membership</button>
                    </form>
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
