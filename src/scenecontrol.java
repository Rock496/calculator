//import java.net.URL;
//import java.util.ResourceBundle;




import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
//import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class scenecontrol{
   @FXML private Pane titlePane;
   @FXML private ImageView btMin,btclose;
  //  @FXML private Label lblResult;
   @FXML private Label result;
    //@SuppressWarnings("unused")
   // @SuppressWarnings("unused")
    private double x,y;
    private double num1 = 0;
   private String operator = "+";



  public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        btclose.setOnMouseClicked(mouseEvent -> stage.close());
        btMin.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }
    @FXML
    void onNumberClicked(MouseEvent event) {
       int val=Integer.parseInt(((Pane)event.getSource()).getId().replace("bt",""));
       result.setText(Double.parseDouble(result.getText())==0?String.valueOf((double)val):String.valueOf(Double.parseDouble(result.getText())*10+val));
    }

    @FXML
    void onSymbolClicked(MouseEvent event) {
        //@SuppressWarnings("unused")
        String symbol=((Pane)event.getSource()).getId().replace("bt","");
        if(symbol.equals("equal")){
            double num2 = Double.parseDouble(result.getText());
            switch (operator) {
                case "+" -> result.setText((num1+num2) + "");
                case "-" -> result.setText((num1-num2) + "");
                case "*" -> result.setText((num1*num2) + "");
                case "/" -> result.setText((num1/num2) + "");
        }
        operator=".";
    }
    else if(symbol.equals("clear"))
    {
        result.setText(String.valueOf(0.0));
        operator=".";
    }
    else{
        switch(symbol){
                case "add" -> operator = "+";
                case "sub" -> operator = "-";
                case "multiply" -> operator = "*";
                case "divide" -> operator = "/";
        }
            num1 = Double.parseDouble(result.getText());
            result.setText(String.valueOf(0.0));
        }
    }
}


/*@Override
public void initialize(URL location, ResourceBundle resources) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'initialize'");*/



 