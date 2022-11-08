package calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	Calculadora calculadora = new Calculadora();

	public Controller() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public GridPane getView() {
		return view;
	}

	 @FXML
	    private Button button0;

	    @FXML
	    private Button button1;

	    @FXML
	    private Button button2;

	    @FXML
	    private Button button3;

	    @FXML
	    private Button button4;

	    @FXML
	    private Button button5;

	    @FXML
	    private Button button6;

	    @FXML
	    private Button button7;

	    @FXML
	    private Button button8;

	    @FXML
	    private Button button9;

	    @FXML
	    private Button buttonAdd;

	    @FXML
	    private Button buttonC;

	    @FXML
	    private Button buttonCE;

	    @FXML
	    private Button buttonComa;

	    @FXML
	    private Button buttonDiv;

	    @FXML
	    private Button buttonMult;

	    @FXML
	    private Button buttonResult;

	    @FXML
	    private Button buttonSub;
	    
	    @FXML
	    private GridPane view;

	    @FXML
	    private TextField windowField;

	@FXML
	void on0Action(ActionEvent event) {
		calculadora.insertar('0');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on1Action(ActionEvent event) {
		calculadora.insertar('1');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on2Action(ActionEvent event) {
		calculadora.insertar('2');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on3Action(ActionEvent event) {
		calculadora.insertar('3');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on4Action(ActionEvent event) {
		calculadora.insertar('4');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on5Action(ActionEvent event) {
		calculadora.insertar('5');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on6Action(ActionEvent event) {
		calculadora.insertar('6');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on7Action(ActionEvent event) {
		calculadora.insertar('7');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on8Action(ActionEvent event) {
		calculadora.insertar('8');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void on9Action(ActionEvent event) {
		calculadora.insertar('9');
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onCeAction(ActionEvent event) {
		calculadora.borrarTodo();
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onCAction(ActionEvent event) {
		calculadora.borrar();
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onComaAction(ActionEvent event) {
		calculadora.insertarComa();
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onAddAction(ActionEvent event) {
		calculadora.operar(Calculadora.SUMAR);
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onSubtractAction(ActionEvent event) {
		calculadora.operar(Calculadora.RESTAR);
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onMultiplyAction(ActionEvent event) {
		calculadora.operar(Calculadora.MULTIPLICAR);
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onDivideAction(ActionEvent event) {
		calculadora.operar(Calculadora.DIVIDIR);
		windowField.setText(calculadora.getPantalla());

	}

	@FXML
	void onResultAction(ActionEvent event) {
		calculadora.operar(Calculadora.IGUAL);
		windowField.setText(calculadora.getPantalla());

	}

}
