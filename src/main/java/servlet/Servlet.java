package servlet;

import Dao.UserInfoDao;
import Dao.impl.UserInfoDaoImpl;
import com.google.gson.Gson;
import entry.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Howe
 * @version 2021.2
 * @date 2023/6/19 10:42
 */
@WebServlet("/hello.do")
public class Servlet extends HttpServlet {
    private UserInfoDao userInfoDao = new UserInfoDaoImpl();
    private Gson gson = new Gson();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<UserInfo> userInfoAll = null;
        try {
            userInfoAll = userInfoDao.getUserInfoAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(gson.toJson(userInfoAll));
    }
}
