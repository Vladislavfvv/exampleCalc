package com.example.web.servlet;

import com.example.entity.OperationEnum;
import com.example.service.Operation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;


//http://localhost:8080/hello?num1=3&num2=5&operation=SUM
@WebServlet("/hello")
public class MainServlet extends HttpServlet {
    private AtomicInteger counter = new AtomicInteger(0);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        HttpSession session = req.getSession();
        String oe = req.getParameter("operation");
        Operation op = new Operation(num1, num2, OperationEnum.valueOf(oe));
        String result = String.valueOf(op.calculate());
        PrintWriter pr = resp.getWriter();
        pr.write("Hello!!!/n");
        pr.write(result);
        pr.close();
    }
}