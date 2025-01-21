package com.example.jobportal.controllers;

import com.example.jobportal.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Mock login validation (replace with DB logic)
        User user = (User) request.getSession().getAttribute("user");
        if (user != null && user.getEmail().equals(email) && user.getPassword().equals(password)) {
            response.sendRedirect("jobs.jsp");
        } else {
            request.setAttribute("error", "Invalid credentials!");
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
        }
    }
}