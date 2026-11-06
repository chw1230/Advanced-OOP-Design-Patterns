package AdvancedOOP.JDBC_DAO.DAO.웹사이트;

public class MainPasswordDAO {
    public static void main(String[] args) {
        final String DB_FILE_PATH = "src/AdvancedOOP/JDBC_DAO/DAO/웹사이트/passwordInfo.db";

        // 데이터베이스 및 테이블 생성
        PasswordInfoTableCreator.createNewDatabase(DB_FILE_PATH);
        SQLiteConnector sqlite = new SQLiteConnector();
        PasswordDAO passwordDAO = new PasswordDAOImpl(sqlite.connect(DB_FILE_PATH));

        try {
            // 새로운 정보를 데이터베이스에 추가
            System.out.println("새로운 정보를 데이터베이스에 추가");
            passwordDAO.insert(new PasswordInfo(
                    "https://www.smu.ac.kr",
                    "smu",
                    "abcde"
                    )
            );
            passwordDAO.insert(new PasswordInfo(
                            "https://www.smu2.ac.kr",
                            "smu2",
                            "abcde"
                    )
            );

            // 모든 데이터 출력
            System.out.println("\n모든 데이터 출력 ");
            for (PasswordInfo p : passwordDAO.findAll()) {
                System.out.println(p);
            }
            System.out.println("\n");

            // smu2를 smu1로 수정
            passwordDAO.update(new PasswordInfo(
                    "https://www.smu2.ac.kr",
                    "smu1",
                    "abcde"
            ));

            // 해당 데이터가 제대로 수정되었는지 데이터를 출력해서 확인
            System.out.println("수정된 데이터 확인");
            System.out.println(passwordDAO.findByKey("https://www.smu2.ac.kr"));

            // "https://www.smu2.ac.kr" 데이터 삭제
            passwordDAO.delete("https://www.smu2.ac.kr");

            // 전체 데이터 출력
            System.out.println("\n삭제 후 전체 데이터 출력");
            for (PasswordInfo p : passwordDAO.findAll()) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("SQL failed: " + e);
        } finally {
            sqlite.close();
        }
    }
}
