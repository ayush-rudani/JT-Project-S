package user;

import def.FactoryProvider;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", value = "/Servlet")
public class RegisterUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		try {
			User user = new User(username, phone, email, "default.png", address, "user");

			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();

			int id = (int) session.save(user);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
