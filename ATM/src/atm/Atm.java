
package atm;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Atm extends Application {

   
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        LogIn login = new LogIn(stage);
        stage.setTitle("ATM");
        login.gui();
        stage.setScene(login.getScene());
        
        MainMenu mainMenu = new MainMenu(stage);
        mainMenu.gui();
        Deposit deposit = new Deposit(stage);
        deposit.gui();
        Withdraw withdraw = new Withdraw(stage);
        withdraw.gui();
        login.setMainMenu(mainMenu);
        mainMenu.setDeposit(deposit);
        mainMenu.setWithdraw(withdraw);
        deposit.setMainMenu(mainMenu);
        withdraw.setMainMenu(mainMenu);
        
       
            

        
        stage.show();
        
        
    }
    
}
