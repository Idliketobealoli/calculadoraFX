package com.idliketobealoli.calculadora_fx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Vista extends VBox {
    private VistaController vc = new VistaController();
    Label screen = new Label();
    GridPane grid = new GridPane();
    Button clear = new Button("C");
    Button parentheses = new Button("()");
    Button module = new Button("%");
    Button division = new Button("/");
    Button multiplication = new Button("*");
    Button subtraction = new Button("-");
    Button addition = new Button("+");
    Button equal = new Button("=");
    Button backspace = new Button ("<-");
    Button decimalDelimiter = new Button (".");
    Button zero = new Button("0");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");

/*        mas.setOnAction(e->pantalla.setText(String.valueOf(Integer.parseInt(pantalla.getText())+1)));
        menos.setOnAction(e->pantalla.setText(String.valueOf(Integer.parseInt(pantalla.getText())-1)));
        reset.setOnAction(e->pantalla.setText(String.valueOf(0)));*/

    public Vista(){
        screen.setAlignment(Pos.CENTER);
        screen.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        grid.setAlignment(Pos.CENTER);
        grid.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        grid.add(parentheses, 1, 1);
        grid.add(module, 2, 1);
        grid.add(division, 3, 1);
        grid.add(backspace, 4, 1);
        grid.add(seven, 1, 2);
        grid.add(eight, 2, 2);
        grid.add(nine, 3, 2);
        grid.add(multiplication, 4, 2);
        grid.add(four, 1, 3);
        grid.add(five, 2, 3);
        grid.add(six, 3, 3);
        grid.add(subtraction, 4, 3);
        grid.add(one, 1, 4);
        grid.add(two, 2, 4);
        grid.add(three, 3, 4);
        grid.add(addition, 4, 4);
        grid.add(clear, 1, 5);
        grid.add(zero, 2, 5);
        grid.add(decimalDelimiter, 3, 5);
        grid.add(equal, 4, 5);
        this.getChildren().addAll(screen, grid);
    }

}
