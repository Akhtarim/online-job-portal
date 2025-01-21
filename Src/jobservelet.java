package com.example.jobportal.controllers;

import com.example.jobportal.models.Job;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jobs")
public class JobServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Software Engineer", "Develop and maintain software solutions."));
        jobs.add(new Job("Data Analyst", "Analyze and interpret complex data sets."));
        jobs.add(new Job("Web Developer", "Build and maintain websites."));

        request.setAttribute("jobs", jobs);
        request.getRequestDispatcher("views/jobs.jsp").forward(request, response);
    }
}