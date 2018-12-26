package sample;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    int move = 0;
    boolean AI = false;
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

    public void restart() {
        blokeB9 = false;
        blokeB8 = false;
        blokeB7 = false;
        blokeB6 = false;
        blokeB5 = false;
        blokeB4 = false;
        blokeB3 = false;
        blokeB2 = false;
        blokeB1 = false;
        value1.set(null);
        value2.set(null);
        value3.set(null);
        value4.set(null);
        value5.set(null);
        value6.set(null);
        value7.set(null);
        value8.set(null);
        value9.set(null);
        winner = false;
        move = 0;
        AI = false;
    }

    public void exit() {
        System.exit(0);
    }

    public void AIActice() {
        blokeB9 = false;
        blokeB8 = false;
        blokeB7 = false;
        blokeB6 = false;
        blokeB5 = false;
        blokeB4 = false;
        blokeB3 = false;
        blokeB2 = false;
        blokeB1 = false;
        value1.set(null);
        value2.set(null);
        value3.set(null);
        value4.set(null);
        value5.set(null);
        value6.set(null);
        value7.set(null);
        value8.set(null);
        value9.set(null);
        move = 0;
        shag = 0;
        OneHod = 0;
        AI = true;
        winner = false;
        AI();
    }


    int shag = 0;
    int OneHod;
    int road =0;

    public void AI() {
        System.out.println("Start");
        if(!winner) {
            switch (shag) {
                case 0:
                    OneHod = 1 + (int) (Math.random() * 4);
                    switch (OneHod) {
                        case 1:
                            value1.set("X");
                            move = 1;
                            blokeB1 = true;
                            System.out.println("1");
                            break;
                        case 2:
                            value1.set("X");
                            move = 1;
                            blokeB1 = true;
                            System.out.println("3");
                            break;
                        case 3:
                            value1.set("X");
                            move = 1;
                            blokeB1 = true;

                            System.out.println("7");
                            break;
                        case 4:
                            value1.set("X");
                            move = 1;
                            blokeB1 = true;

                            System.out.println("9");
                            break;
                    }
                    break;

                case 1:
                    if (blokeB5) {
                        value9.set("X");
                        move = 1;
                        blokeB9 = true;
                        road = 1;
                    } else if (blokeB3) {
                        value7.set("X");
                        move = 1;
                        blokeB7 = true;
                        road = 2;
                    } else if (blokeB9) {
                        value3.set("X");
                        move = 1;
                        blokeB3 = true;
                        road = 2;
                    } else if (blokeB7) {
                        value3.set("X");
                        move = 1;
                        blokeB3 = true;
                        road = 2;
                    }

                    else if(blokeB3 || blokeB9){
                        value7.set("X");
                        blokeB5 = true;
                        road = 2;
                        move = 1;
                    }else if(blokeB7){
                        value3.set("X");
                        blokeB3 = true;
                        road = 2;
                        move = 1;
                    }

                    else if(blokeB2||blokeB4||blokeB6||blokeB8){
                        value5.set("X");
                        blokeB5 = true;
                        road = 3;
                        move = 1;
                    }
                    break;
                case 2:
                    if (road == 1) {
                        if (blokeB7) {
                            value3.set("X");
                            blokeB3 = true;
                            move = 1;
                        } else if (blokeB3) {
                            value7.set("X");
                            blokeB7 = true;
                            move = 1;
                        } else if (blokeB4) {
                            value6.set("X");
                            blokeB6 = true;
                            move = 1;
                            road = 12;
                        } else if (blokeB6) {
                            value4.set("X");
                            blokeB4 = true;
                            move = 1;
                            road = 12;
                        } else if (blokeB2) {
                            value8.set("X");
                            blokeB8 = true;
                            move = 1;
                            road = 12;
                        } else if (blokeB8) {
                            value2.set("X");
                            blokeB2 = true;
                            move = 1;
                            road = 12;
                        }
                    } else if (road == 2) {
                        if(!blokeB4 && value7.getValue() == "X"){
                            value4.set("X");
                            blokeB4= true;
                            move = 1;
                        }
                        else{
                            if(value9.getValue() == null && value7.getValue() == "X"){
                                value9.set("X");
                                blokeB9 = true;
                                move = 1;
                            }else if(value7.getValue()==null && value3.getValue() == "X"){
                                System.out.println("a");
                                value7.set("X");
                                blokeB7 = true;
                                move = 1;
                            }
                        }
                    } else if (road == 3) {
                        if(!blokeB9){
                            value9.set("X");
                            blokeB9 = true;
                            move = 1;
                        }else if(blokeB9){
                            if(blokeB2||blokeB8) {
                                value7.set("X");
                                blokeB7 = true;
                                move = 1;
                            }else if(blokeB4||blokeB6){
                                value3.set("X");
                                blokeB3 = true;
                                move = 1;
                            }
                        }
                    }
                    break;
                case 3:
                    if (road == 1) {
                        if (value1.getValue() == value3.getValue() && value3.getValue() == value9.getValue() && value3.getValue() == "X") {
                            if (blokeB2 || blokeB4 || blokeB8) {
                                value6.set("X");
                                blokeB6 = true;
                                move = 1;
                            } else if (blokeB6 || blokeB4 || blokeB8) {
                                value2.set("X");
                                blokeB2 = true;
                                move = 1;
                            }
                        }
                        if (value1.getValue() == value7.getValue() && value7.getValue() == value9.getValue() && value7.getValue() == "X") {
                            if (blokeB2 || blokeB4 || blokeB6) {
                                value8.set("X");
                                blokeB8 = true;
                                move = 1;
                            } else if (blokeB2 || blokeB6 || blokeB8) {
                                value8.set("X");
                                blokeB8 = true;
                                move = 1;
                            }
                        }

                    } else if (road == 12) {
                        if (value4.getValue() == value5.getValue() && value5.getValue() == "0") {
                            if (blokeB2 || blokeB7 || blokeB8) {
                                value3.set("X");
                                blokeB3 = true;
                                road = 13;
                                move = 1;
                            } else if (blokeB3) {
                                value7.set("X");
                                blokeB7 = true;
                                road = 13;
                                move = 1;
                            }
                        } else if (value5.getValue() == value6.getValue() && value6.getValue() == "0") {
                            if (blokeB2 || blokeB3 || blokeB8) {
                                value7.set("X");
                                blokeB7 = true;
                                road = 13;
                                move = 1;
                            } else if (blokeB7) {
                                value3.set("X");
                                blokeB3 = true;
                                road = 13;
                                move = 1;
                            }
                        } else if (value5.getValue() == value2.getValue() && value2.getValue() == "0") {
                            if (blokeB3 || blokeB4 || blokeB6) {
                                value7.set("X");
                                blokeB7 = true;
                                road = 13;
                                move = 1;
                            } else if (blokeB7) {
                                value3.set("X");
                                blokeB3 = true;
                                road = 13;
                                move = 1;
                            }
                        } else if (value5.getValue() == value8.getValue() && value8.getValue() == "0") {
                            if (blokeB7 || blokeB4 || blokeB6) {
                                value3.set("X");
                                blokeB3 = true;
                                road = 13;
                                move = 1;
                            } else if (blokeB3) {
                                value7.set("X");
                                blokeB7 = true;
                                road = 13;
                                move = 1;
                            }
                        }
                    } else if (road == 2) {
                        if (!blokeB5){
                            value5.set("X");
                            blokeB5 = true;
                            move = 1;
                        }else if(value9.getValue()=="X"){
                            value8.set("X");
                            blokeB8 = true;
                            move = 1;
                        }else if(value3.getValue()=="X"){
                            value2.set("X");
                            blokeB2 = true;
                            move = 1;
                        }
                    } else if (road == 3) {
                        if(value7.getValue()=="X") {
                            if (blokeB4) {
                                value3.set("X");
                                blokeB3 = true;
                                move = 1;
                            } else if (blokeB3) {
                                value4.set("X");
                                blokeB4 = true;
                                move = 1;
                            }else{
                                value4.set("X");
                                blokeB4 = true;
                                move = 1;
                            }
                        }else if(value3.getValue()=="X"){
                            if (blokeB2) {
                                value7.set("X");
                                blokeB7 = true;
                                move = 1;
                            } else if (blokeB7) {
                                value2.set("X");
                                blokeB2 = true;
                                move = 1;
                            }else{
                                value2.set("X");
                                blokeB2 = true;
                                move = 1;
                            }
                        }
                    }
                    break;
                case 4:
                    if (road == 13) {
                        if (value1.getValue() == null) {
                            value1.set("X");
                            blokeB1 = true;
                            move = 1;
                        }
                        if (value2.getValue() == null) {
                            value2.set("X");
                            blokeB2 = true;
                            move = 1;
                        }
                        if (value3.getValue() == null) {
                            value3.set("X");
                            blokeB3 = true;
                            move = 1;
                        }
                        if (value4.getValue() == null) {
                            value4.set("X");
                            blokeB4 = true;
                            move = 1;
                        }
                        if (value5.getValue() == null) {
                            value5.set("X");
                            blokeB5 = true;
                            move = 1;
                        }
                        if (value6.getValue() == null) {
                            value6.set("X");
                            blokeB6 = true;
                            move = 1;
                        }
                        if (value7.getValue() == null) {
                            value7.set("X");
                            blokeB7 = true;
                            move = 1;
                        }
                        if (value8.getValue() == null) {
                            value8.set("X");
                            blokeB8 = true;
                            move = 1;
                        }
                        if (value9.getValue() == null) {
                            value9.set("X");
                            blokeB9 = true;
                            move = 1;
                        }
                    }

            }

            shag += 1;
            check();
        }
    }



    public void globalEvent(ActionEvent actionEvent) {
        if(!AI) {
            if (move == 0 && !blokeB1 && ((Button) actionEvent.getTarget()).getText().equals("Button1")) {
                value1.set("X");
                move = 1;
                blokeB1 = true;
            } else if (move == 1 && !blokeB1 && ((Button) actionEvent.getTarget()).getText().equals("Button1")) {
                move = 0;
                blokeB1 = true;
                value1.set("0");
            }

            if (move == 0 && !blokeB2 && ((Button) actionEvent.getTarget()).getText().equals("Button2")) {
                value2.set("X");
                move = 1;
                blokeB2 = true;
            } else if (move == 1 && !blokeB2 && ((Button) actionEvent.getTarget()).getText().equals("Button2")) {
                move = 0;
                blokeB2 = true;
                value2.set("0");
            }

            if (move == 0 && !blokeB3 && ((Button) actionEvent.getTarget()).getText().equals("Button3")) {
                value3.set("X");
                move = 1;
                blokeB3 = true;
            } else if (move == 1 && !blokeB3 && ((Button) actionEvent.getTarget()).getText().equals("Button3")) {
                move = 0;
                blokeB3 = true;
                value3.set("0");
            }

            if (move == 0 && !blokeB4 && ((Button) actionEvent.getTarget()).getText().equals("Button4")) {
                value4.set("X");
                move = 1;
                blokeB4 = true;
            } else if (move == 1 && !blokeB4 && ((Button) actionEvent.getTarget()).getText().equals("Button4")) {
                move = 0;
                blokeB4 = true;
                value4.set("0");
            }

            if (move == 0 && !blokeB5 && ((Button) actionEvent.getTarget()).getText().equals("Button5")) {
                value5.set("X");
                move = 1;
                blokeB5 = true;
            } else if (move == 1 && !blokeB5 && ((Button) actionEvent.getTarget()).getText().equals("Button5")) {
                move = 0;
                blokeB5 = true;
                value5.set("0");
            }

            if (move == 0 && !blokeB6 && ((Button) actionEvent.getTarget()).getText().equals("Button6")) {
                value6.set("X");
                move = 1;
                blokeB6 = true;
            } else if (move == 1 && !blokeB6 && ((Button) actionEvent.getTarget()).getText().equals("Button6")) {
                move = 0;
                blokeB6 = true;
                value6.set("0");
            }

            if (move == 0 && !blokeB7 && ((Button) actionEvent.getTarget()).getText().equals("Button7")) {
                value7.set("X");
                move = 1;
                blokeB7 = true;
            } else if (move == 1 && !blokeB7 && ((Button) actionEvent.getTarget()).getText().equals("Button7")) {
                move = 0;
                blokeB7 = true;
                value7.set("0");
            }

            if (move == 0 && !blokeB8 && ((Button) actionEvent.getTarget()).getText().equals("Button8")) {
                value8.set("X");
                move = 1;
                blokeB8 = true;
            } else if (move == 1 && !blokeB8 && ((Button) actionEvent.getTarget()).getText().equals("Button8")) {
                move = 0;
                blokeB8 = true;
                value8.set("0");
            }

            if (move == 0 && !blokeB9 && ((Button) actionEvent.getTarget()).getText().equals("Button9")) {
                value9.set("X");
                move = 1;
                blokeB9 = true;
            } else if (move == 1 && !blokeB9 && ((Button) actionEvent.getTarget()).getText().equals("Button9")) {
                move = 0;
                blokeB1 = true;
                value9.set("0");
            }
            check();
        }else{
            if (move == 1 && !blokeB1 && ((Button) actionEvent.getTarget()).getText().equals("Button1")) {
                value1.set("0");
                move = 0;
                blokeB1 = true;
            }

            if (move == 1 && !blokeB2 && ((Button) actionEvent.getTarget()).getText().equals("Button2")) {
                value2.set("0");
                move = 0;
                blokeB2 = true;
            }

            if (move == 1 && !blokeB3 && ((Button) actionEvent.getTarget()).getText().equals("Button3")) {
                value3.set("0");
                move = 0;
                blokeB3 = true;
            }

            if (move == 1 && !blokeB4 && ((Button) actionEvent.getTarget()).getText().equals("Button4")) {
                value4.set("0");
                move = 0;
                blokeB4 = true;
            }

            if (move == 1 && !blokeB5 && ((Button) actionEvent.getTarget()).getText().equals("Button5")) {
                value5.set("0");
                move = 0;
                blokeB5 = true;
            }

            if (move == 1 && !blokeB6 && ((Button) actionEvent.getTarget()).getText().equals("Button6")) {
                value6.set("0");
                move = 0;
                blokeB6 = true;
            }

            if (move == 1 && !blokeB7 && ((Button) actionEvent.getTarget()).getText().equals("Button7")) {
                value7.set("0");
                move = 0;
                blokeB7 = true;
            }

            if (move == 1 && !blokeB8 && ((Button) actionEvent.getTarget()).getText().equals("Button8")) {
                value8.set("0");
                move = 0;
                blokeB8 = true;
            }

            if (move == 1 && !blokeB9 && ((Button) actionEvent.getTarget()).getText().equals("Button9")) {
                value9.set("0");
                move = 0;
                blokeB9 = true;
            }
            check();
            AI();
        }
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
