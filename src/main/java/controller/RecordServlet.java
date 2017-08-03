package controller;

import model.Record;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RecordServlet", urlPatterns = "/record")
public class RecordServlet extends HttpServlet {

    private static final String REG_NAME = "^[A-Za-z]+{2,22}$";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (!validate(request, response)) {
            return;
        }

        Record record = new Record();
        record.setFirstName(request.getParameter("record.firstName"));
        record.setLastName(request.getParameter("lastName"));

//        request.setAttribute("record", record);
//        request.getRequestDispatcher("/WEB-INF/record").forward(request, response);
    }

    private boolean validate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("record.firstName");
        if (!firstName.matches(REG_NAME)) {
            response.getWriter().println("Illegal first name");
            return false;
        }

        return true;
    }

}

// ${record.firstName}
