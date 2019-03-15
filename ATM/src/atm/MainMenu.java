
package atm;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainMenu {
    Stage stage;
    Scene scene;
    Deposit deposit;
    Withdraw withdraw;
    double balance;
    String[] history=new String[100];
    int pointer=0;
    int x=0;

    public String[] getHistory() {
        return history;
    }

    public void setHistory(String[] history) {
        this.history = history;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
   

    public MainMenu(double balance) {
        this.balance = balance;
    }

    

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }
    

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }
    

    public MainMenu(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    

    public Scene getScene() {
        return scene;
    }
    
    
    
    public void gui(){
        
        Button withdrawbutton = new Button("withdrawal");
        Button depositButton = new Button("deposit");
        Button balanceinquiry = new Button("balanceinquiry");
        Button previous = new Button("previous");
        Button next = new Button("next");
        Label field =new Label();
        
        
        
         GridPane grid =new GridPane();
         grid.add(withdrawbutton,0,0 );
        grid.add(depositButton,1,0);
        grid.add(balanceinquiry,2,0);
        grid.add(previous,0,1);
        grid.add(next,1,1);
        grid.add(field,2,2 );
        grid.setAlignment(Pos.CENTER);
        
        depositButton.setOnAction((ActionEvent event)->{
            stage.setScene(deposit.getScene());
            
        });
        withdrawbutton.setOnAction((ActionEvent event)->{
            stage.setScene(withdraw.getScene());
            
        });
        
        balanceinquiry.setOnAction((ActionEvent event)->{
            
            field.setText("your balance is"+balance);
            history[x]="your balance is"+balance;
            
        });
        
        
        
        
        next.setOnAction((ActionEvent event)->{
             field.setText("");
             pointer++;
             if(history[pointer]!=null){
                 field.setText(history[pointer]);
             }
             else{
                 field.setText("you don't have any more history");
             }
             
            
            
            
        });
        
        
        
        
        previous.setOnAction((ActionEvent event)->{
            field.setText("");
            pointer--;
            if(pointer>=0)
            {
                field.setText(history[pointer]);
                
            }
            else{
                field.setText("you don't have any more history");
            }
            
            
            
        });
                
        
        
        scene = new Scene(grid, 600 , 400);
         
    }

    
            
    
}
