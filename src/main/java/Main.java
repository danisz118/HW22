import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Group javaGroup = createJavaGroup();
        Group jsGroup = createJsGroup();

        try {
            UserDao userDao = new UserDao();
            userDao.insertGroup(javaGroup);
            userDao.insertGroup(jsGroup);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Group createJavaGroup() {
        Group group = new Group(MakeUUID.generateId(), "Java");
        group.addStudent(new Student(MakeUUID.generateId(), "Alex", 26));
        group.addStudent(new Student(MakeUUID.generateId(), "Oleg", 28));
        group.addStudent(new Student(MakeUUID.generateId(), "Igor", 15));
        return group;
    }

    private static Group createJsGroup() {
        Group group = new Group(MakeUUID.generateId(), "Js");
        group.addStudent(new Student(MakeUUID.generateId(), "Den", 26));
        group.addStudent(new Student(MakeUUID.generateId(), "Alex", 27));
        return group;
    }
}
