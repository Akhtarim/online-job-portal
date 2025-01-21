package com.example.jobportal.controllers;

import com.example.jobportal.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            request.setAttribute("error", "All fields are required!");
            request.getRequestDispatcher("views/register.jsp").forward(request, response);
            return;
        }

        User user = new User(username, email, password);
        // Mock Database (or save to an actual database)
        request.getSession().setAttribute("user", user);
        response.sendRedirect("login.jsp");
    }
}