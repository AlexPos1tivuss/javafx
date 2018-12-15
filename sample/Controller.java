package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    int move = 0;
    boolean blokeB1 = false;
    boolean blokeB2 = false;
    boolean blokeB3 = false;
    boolean blokeB4 = false;
    boolean blokeB5 = false;
    boolean blokeB6 = false;
    boolean blokeB7 = false;
    boolean blokeB8 = false;
    boolean blokeB9 = false;
    boolean winner = false;

    @FXML
    private TextField ONE;
    SimpleStringProperty value1 = new SimpleStringProperty();
    @FXML
    private TextField TWO;
    SimpleStringProperty value2 = new SimpleStringProperty();
    @FXML
    private TextField THREE;
    SimpleStringProperty value3 = new SimpleStringProperty();
    @FXML
    private TextField FOUR;
    SimpleStringProperty value4 = new SimpleStringProperty();
    @FXML
    private TextField FIVE;
    SimpleStringProperty value5 = new SimpleStringProperty();
    @FXML
    private TextField SIX;
    SimpleStringProperty value6 = new SimpleStringProperty();
    @FXML
    private TextField SEVEN;
    SimpleStringProperty value7 = new SimpleStringProperty();
    @FXML
    private TextField EIGHT;
    SimpleStringProperty value8 = new SimpleStringProperty();
    @FXML
    private TextField NINE;
    SimpleStringProperty value9 = new SimpleStringProperty();

    @FXML
    public void initialize() {
        ONE.textProperty().bind(value1);
        TWO.textProperty().bind(value2);
        THREE.textProperty().bind(value3);
        FOUR.textProperty().bind(value4);
        FIVE.textProperty().bind(value5);
        SIX.textProperty().bind(value6);
        SEVEN.textProperty().bind(value7);
        EIGHT.textProperty().bind(value8);
        NINE.textProperty().bind(value9);
    }


    public void button1(ActionEvent actionEvent) {
        if (move == 0 && blokeB1 != true) {
            value1.set("X");
            move = 1;
            blokeB1 = true;
        } else if (move == 1 && blokeB1 != true) {
            move = 0;
            blokeB1 = true;
            value1.set("0");
        }
        check();

        System.out.println("1");
    }

    public void button2(ActionEvent actionEvent) {
        if (move == 0 && blokeB2 != true) {
            value2.set("X");
            move = 1;
            blokeB2 = true;
        } else if (move == 1 && blokeB2 != true) {
            move = 0;
            blokeB2 = true;
            value2.set("0");
        }
        check();
        System.out.println("2");
    }

    public void button3(ActionEvent actionEvent) {
        if (move == 0 && blokeB3 != true) {
            value3.set("X");
            move = 1;
            blokeB3 = true;
        } else if (move == 1 && blokeB3 != true) {
            move = 0;
            blokeB3 = true;
            value3.set("0");
        }
        check();
        System.out.println("3");
    }

    public void button4(ActionEvent actionEvent) {
        if (move == 0 && blokeB4 != true) {
            value4.set("X");
            move = 1;
            blokeB4 = true;
        } else if (move == 1 && blokeB4 != true) {
            move = 0;
            blokeB4 = true;
            value4.set("0");
        }
        check();
        System.out.println("4");
    }

    public void button5(ActionEvent actionEvent) {
        if (move == 0 && blokeB5 != true) {
            value5.set("X");
            move = 1;
            blokeB5 = true;
        } else if (move == 1 && blokeB5 != true) {
            move = 0;
            blokeB5 = true;
            value5.set("0");
        }
        check();
        System.out.println("5");
    }

    public void button6(ActionEvent actionEvent) {
        if (move == 0 && blokeB6 != true) {
            value6.set("X");
            move = 1;
            blokeB6 = true;
        } else if (move == 1 && blokeB6 != true) {
            move = 0;
            blokeB6 = true;
            value6.set("0");
        }
        check();
        System.out.println("6");
    }

    public void button7(ActionEvent actionEvent) {
        if (move == 0 && blokeB7 != true) {
            value7.set("X");
            move = 1;
            blokeB7 = true;
        } else if (move == 1 && blokeB7 != true) {
            move = 0;
            blokeB7 = true;
            value7.set("0");
        }
        check();
        System.out.println("7");
    }

    public void button8(ActionEvent actionEvent) {
        if (move == 0 && blokeB8 != true) {
            value1.set("X");
            move = 1;
            blokeB8 = true;
        } else if (move == 1 && blokeB8 != true) {
            move = 0;
            blokeB8 = true;
            value8.set("0");
        }
        check();
        System.out.println("8");
    }

    public void button9(ActionEvent actionEvent) {
        if (move == 0 && blokeB9 != true) {
            value9.set("X");
            move = 1;
            blokeB9 = true;
        } else if (move == 1 && blokeB9 != true) {
            move = 0;
            blokeB9 = true;
            value9.set("0");
        }
        check();
        System.out.println("9");
    }
    public void check(){
        if(value1.getValue()==value2.getValue()&&value2.getValue()==value3.getValue()&&value2.getValue()!=null){/*проверка по строке*/
            winner =true;
            System.out.println(value2.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value4.getValue()==value5.getValue()&&value5.getValue()==value6.getValue()&&value5.getValue()!=null){/*проверка по строке*/
            winner =true;
            System.out.println(value8.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value7.getValue()==value8.getValue()&&value8.getValue()==value9.getValue()&&value8.getValue()!=null){/*проверка по строке*/
            winner =true;
            System.out.println(value8.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value1.getValue()==value4.getValue()&&value4.getValue()==value7.getValue()&&value4.getValue()!=null){/*проверка по столбикам*/
            winner =true;
            System.out.println(value4.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value2.getValue()==value5.getValue()&&value5.getValue()==value8.getValue()&&value5.getValue()!=null){/*проверка по столбикам*/
            winner =true;
            System.out.println(value5.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value3.getValue()==value6.getValue()&&value6.getValue()==value9.getValue()&&value6.getValue()!=null){/*проверка по столбикам*/
            winner =true;
            System.out.println(value6.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value1.getValue()==value5.getValue()&&value5.getValue()==value9.getValue()&&value5.getValue()!=null){/*проверка по диогонали*/
            winner =true;
            System.out.println(value5.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }else if(value3.getValue()==value5.getValue()&&value5.getValue()==value7.getValue()&&value5.getValue()!=null){/*проверка по диогонали*/
            winner =true;
            System.out.println(value5.getValue()+" winner");
            blokeB9 = true;
            blokeB8 = true;
            blokeB7 = true;
            blokeB6 = true;
            blokeB5 = true;
            blokeB4 = true;
            blokeB3 = true;
            blokeB2 = true;
            blokeB1 = true;
        }
    }
}
