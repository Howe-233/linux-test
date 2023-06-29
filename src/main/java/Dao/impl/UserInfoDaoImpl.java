package Dao.impl;

import Dao.UserInfoDao;
import com.mysql.cj.jdbc.Driver;
import entry.UserInfo;
import utils.BaseDao;
import utils.PropertiesUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Howe
 * @version 2021.2
 * @date 2023/6/19 10:44
 */
public class UserInfoDaoImpl extends BaseDao<UserInfo> implements UserInfoDao {
    static PreparedStatement preparedStatement;
    static Connection connection;
    static ResultSet resultSet;
    static String url = "jdbc:mysql:///background_management_system_db?useSSl=false & useUniCode=true & characterEncoding=utf-8 & serverTimezone=GMT  & serverTimezone=Asia/Shanghai";
    static String u = "root";
    static String p = "qbM9g&wjaCyC";

    @Override
    public List<UserInfo> getUserInfoAll() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, u, p);
            preparedStatement = connection.prepareStatement("select * from t_user_info");
            resultSet = preparedStatement.executeQuery();
            List<UserInfo> userInfoList = new ArrayList<UserInfo>();
            while (resultSet.next()) {
                UserInfo userInfo = new UserInfo();
                userInfo.setId(resultSet.getInt("id"));
                userInfo.setName(resultSet.getString("name"));
                userInfo.setUserName(resultSet.getString("user_name"));
                userInfo.setPassword(resultSet.getString("password"));
                userInfo.setTel(resultSet.getString("tel"));
                userInfo.setAddress(resultSet.getString("address"));
                userInfo.setSex(resultSet.getInt("sex"));
                userInfo.setAvatar(resultSet.getString("avatar"));
                userInfo.setCreateTime(resultSet.getDate("create_time"));
                userInfo.setStatus(resultSet.getInt("status"));
                userInfoList.add(userInfo);
            }

            return userInfoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        /*finally {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }*/


    }

//    public static void main(String[] args) {
//        UserInfoDaoImpl s=new UserInfoDaoImpl();
//        System.out.println(s.getUserInfoAll());
//    }

}

