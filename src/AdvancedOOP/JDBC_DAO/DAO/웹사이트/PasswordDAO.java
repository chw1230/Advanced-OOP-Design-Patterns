package AdvancedOOP.JDBC_DAO.DAO.웹사이트;

import java.util.List;

// 어떤 데이터 작업을 할 수 있는지 정의, 어떻게 하는 지는 모름
public interface PasswordDAO {
    public void insert(PasswordInfo p);

    public List<PasswordInfo> findAll();

    public PasswordInfo findByKey(String url);

    public void update(PasswordInfo p);

    public void delete(String url);

    public void delete(PasswordInfo p);
}
