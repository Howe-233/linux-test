package Dao;

import entry.UserInfo;

import java.sql.SQLException;
import java.util.List;

public interface UserInfoDao {
    List<UserInfo> getUserInfoAll() throws SQLException;
}
