module ro.upt.student.sef.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens ro.upt.student.sef.studentmanager to javafx.fxml;
    exports ro.upt.student.sef.studentmanager;
}