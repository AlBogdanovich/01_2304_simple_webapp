package by.itclass.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "ArrayParamServlet", value = "/arrayParams")
public class ArrayParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var params = req.getParameterValues("parameter");
        var writer = resp.getWriter();
        Arrays.stream(params).forEach(it -> writer.write("<h1>" + it + "</h1>"));
    }
}
