package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class FeedbackDashboardServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/feedback";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "WJ28@krhps";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Query for feedback statistics
            String query = "SELECT status, COUNT(*) AS count FROM feedback GROUP BY status";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Create an HTML dashboard
            out.println("<html><head><title>Feedback Dashboard</title></head><body>");
            out.println("<h1>Feedback Dashboard</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>Status</th><th>Count</th></tr>");

            while (rs.next()) {
                String status = rs.getString("status");
                int count = rs.getInt("count");
                out.println("<tr><td>" + status + "</td><td>" + count + "</td></tr>");
            }

            out.println("</table>");

            // Additional visualizations (e.g., charts) can be added here
            out.println("<p><strong>Note:</strong> Use JavaScript libraries like Chart.js or Google Charts for graphical representation.</p>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace(out);
            out.println("<p>Error: Unable to fetch dashboard data.</p>");
        }
    }
}