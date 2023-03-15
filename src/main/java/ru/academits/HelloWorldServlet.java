package ru.academits;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getOutputStream().write("Hello from HelloWorldServlet".getBytes(StandardCharsets.UTF_8));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getOutputStream().write("Post from HelloWorldServlet".getBytes(StandardCharsets.UTF_8));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}
