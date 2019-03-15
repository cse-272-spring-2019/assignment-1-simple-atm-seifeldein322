
package atm;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogIn  {
    Scene scene;
    Stage stage;
    Validate v = new Validate();
    MainMenu mainMenu= new MainMenu(stage);

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
     
    
    public MainMenu getMainMenu() {
        return mainMenu;
    }
    
    LogIn(Stage stage) {
        this.stage=stage;
    }

    public Scene getScene() {
        return scene;
    }
    
    public void gui(){
         Label cardnumber = new Label ("cardnumber");
        TextField cardfield =new TextField();
        Button submit = new Button("sumbit");
        Label vlaidationlable = new Label();
        Button clear = new Button("clear");
        
        GridPane grid =new GridPane();
        grid.add(cardnumber,0,0 );
        grid.add(submit,1,1);
        grid.add(cardfield,1,0);
        grid.add(vlaidationlable,2,1);
        grid.setAlignment(Pos.CENTER);
        grid.add(clear,2,1); 
         submit.setOnAction((ActionEvent event) -> {
            String number = cardfield.getText();
            Boolean x = v.validate(number);
            
            if(x){
                stage.setScene(mainMenu.getScene()); 
            }
            else
            {
                vlaidationlable.setText("wrong cardnumber");
            }
      });
         
         clear.setOnAction((ActionEvent event) -> {
             
              cardfield.setText("");
             
         });
        
        
        
        
         scene = new Scene(grid, 600 , 400);
    }
}
