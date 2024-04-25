package com.example.discount;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class discount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String productDesc = request.getParameter("productDesc");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Kết quả giảm giá</title></head><body>");
        out.println("<h1>Kết quả giảm giá</h1>");
        out.println("<p><strong>Mô tả sản phẩm :</strong> " + productDesc + "</p>");
        out.println("<p><strong>Giá:</strong> " + listPrice + "</p>");
        out.println("<p><strong>Chiết khấu:</strong> " + discountPercent + "</p>");
        out.println("<p><strong>Tiền chiết khấu:</strong> " + discountAmount + "</p>");
        out.println("<p><strong>Giảm giá:</strong> " + discountPrice + "</p>");
        out.println("</body></html>");
    }
}