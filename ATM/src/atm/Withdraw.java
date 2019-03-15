
package atm;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Withdraw {
    double[] money;
    Scene scene;
    Stage stage;
    String amount = "";
    double b;
    double balance;
    String[] history=new String[100];
    int pointer;
    int x;
    
    
    
    
    
    MainMenu mainMenu = new MainMenu(stage);

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    
    
    Withdraw(Stage stage) {
       this.stage=stage;
    }

   
    public Scene getScene() {
        return scene;
    }

    public Stage getStage() {
        return stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
    public void gui(){
         
         
        Button ok = new Button("ok");
         Label moneyfield =new Label();
         Button k0 = new Button("0");
         Button k1 = new Button("1");
         Button k2 = new Button("2");
         Button k3 = new Button("3");
         Button k4 = new Button("4");
         Button k5 = new Button("5");
         Button k6 = new Button("6");
         Button k7 = new Button("7");
         Button k8 = new Button("8");
         Button k9 = new Button("9");
         Label wrong = new Label();
         Button clear = new Button("clear");
         
         GridPane grid =new GridPane();
         grid.add(moneyfield,1,0 );
         grid.add(k1,0,1 );
         grid.add(k2,1,1 );
         grid.add(k3,2,1 );
         grid.add(k4,0,2 );
         grid.add(k5,1,2 );
         grid.add(k6,2,2 );
         grid.add(k7,0,3 );
         grid.add(k8,1,3 );
         grid.add(k9,2,3 );
         grid.add(k0,1,4 );
         grid.add(ok,2,4);
         grid.add(wrong,2,5);
         grid.add(clear,0,4);
         
         grid.setAlignment(Pos.CENTER);
         
         
         
         
         k0.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+0);
             amount=amount+0;
             
         });
         
         k1.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+1);
             amount=amount+1;
             
         });
         
         k2.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+2);
             amount=amount+2;
             
         });
         
         k3.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+3);
             amount=amount+3;
             
         });
         
         k4.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+4);
             amount=amount+4;
             
         });
         
         k5.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+5);
             amount=amount+5;
             
         });
         
         
         k6.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+6);
             amount=amount+6;
             
         });
         
         
         k7.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+7);
             amount=amount+7;
             
         });
         
         
         k8.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+8);
             amount=amount+8;
             
         });
         
         
         k9.setOnAction((ActionEvent event) -> {
             moneyfield.setText(moneyfield.getText()+9);
             amount=amount+9;
             
         });
         
         
         
         
         clear.setOnAction((ActionEvent event) -> {
             
              moneyfield.setText("");
             
         });
         
         
         
         ok.setOnAction((ActionEvent event) -> {
             b= Double.parseDouble(amount);
             balance=mainMenu.getBalance();
             if(balance>=b){
             balance=balance-b;
             mainMenu.setBalance( balance);
              pointer=mainMenu.getPointer();
             x=mainMenu.getX();
             history=mainMenu.getHistory();
             history[x]="withdraw"+b;
             pointer++;
             x++;
             mainMenu.setHistory(history);
             mainMenu.setPointer(pointer);
             mainMenu.setX(x);
             stage.setScene(mainMenu.getScene());
             }
             else{
                 wrong.setText("you can't withdraw this amount");
                 moneyfield.setText("");
                 amount="";
             }
             
             
             
             
          
             
             
             
         });
         
         
         
         
         
         
         scene = new Scene(grid, 600 , 400);
         
    }
}


