package com.example.productdiscountcalculator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "product discount", urlPatterns = "/discount")
public class Discount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double percent = Double.parseDouble(req.getParameter("percent"));
        double discountAmount = price*percent*0.01;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product: " +product+"</h1>");
        writer.println("<h3>Price " + price+"</h3>");
        writer.println("<h3>Discount amount " + discountAmount+"</h3>");
        writer.println("<h3>Discount Price " + (price-discountAmount)+"</h3>");
        writer.println("</html>");

    }
}