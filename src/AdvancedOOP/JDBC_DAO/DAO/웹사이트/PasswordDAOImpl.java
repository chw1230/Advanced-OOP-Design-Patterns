package AdvancedOOP.JDBC_DAO.DAO.웹사이트;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasswordDAOImpl implements PasswordDAO {
    private Connection connection;

    public PasswordDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(PasswordInfo p) {
        final String sql = "INSERT INTO passwordInfo (url, id, password)" + "VALUES ( ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getKey());
            ps.setString(2, p.getId());
            ps.setString(3, p.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PasswordInfo> findAll() {
        final String sql = "SELECT * FROM passwordInfo";
        List<PasswordInfo> passwordInfos = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                PasswordInfo passwordInfo = new PasswordInfo(
                        resultSet.getString("url"),
                        resultSet.getString("id"),
                        resultSet.getString("password")
                );
                passwordInfos.add(passwordInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passwordInfos;
    }

    @Override
    public PasswordInfo findByKey(String url) {
        final String sql = "SELECT * FROM passwordInfo WHERE url = ?";
        PasswordInfo passwordInfo = null;
        try (PreparedStatement ps = connection.prepareStatement(sql) ) {
            ps.setString(1, url); // 첫 번째 물음표(?) 자리에 변수 id의 값을 정수(int) 형태로 넣기

            // SELECT만 executeQuery()를 사용
            try ( ResultSet resultSet = ps.executeQuery() )   {
                if (resultSet.next()) {
                    passwordInfo = new PasswordInfo(
                            resultSet.getString("url"),
                            resultSet.getString("id"),
                            resultSet.getString("password")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passwordInfo;
    }

    @Override
    public void update(PasswordInfo p) {
        // url은 PRIMARY KEY이므로 WHERE 조건으로 쓰고, id와 password만 수정
        final String sql = "UPDATE passwordInfo SET id = ?, password = ? WHERE url = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getId());
            ps.setString(2, p.getPassword());
            ps.setString(3, p.getKey());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // key로 삭제
    @Override
    public void delete(String url) {
        final String sql = "DELETE FROM passwordInfo WHERE url = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, url);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void delete(PasswordInfo p) {
        delete(p.getKey()); // 객체를 이용해서 삭제 - 결국 이것고 key를 이용해서 지움!!!

    }
}
