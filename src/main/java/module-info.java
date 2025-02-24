module edu.missouriwestern.wwuerfele.homework04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.missouriwestern.wwuerfele.homework04 to javafx.fxml;
    exports edu.missouriwestern.wwuerfele.homework04;
}