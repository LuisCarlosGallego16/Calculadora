package EjemploJLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EjemploJLabel {
    public static void main(String[] args) {
    JFrame ventana = new JFrame("MI PRIMERA VENTANA"); //Crear una ventana con un titulo
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar la ventana
    ventana.setSize(800, 600);
    ventana.setLayout(null);
        
    JLabel etiqueta = new JLabel("MI CALCULADORA ");
    etiqueta.setBounds(600, 10, 150, 30); //posicion centrado. 
    ventana.add(etiqueta); //Para añadir lo que se pone de texto en la ventana
    
     /* String informacioJLabel = etiqueta.getText(); //Obtener la informacion del JLabel */
    JLabel etiqueta2 = new JLabel();
    etiqueta2.setText("INGRESE EL NOMBRE: ");
    etiqueta2.setBounds(600, 100, 150, 30);
    ventana.add(etiqueta2);
   
    //CREAR CAMPO PARA ALMACENAR INFORMACION
    JTextField campo1 = new JTextField();
    campo1.setBounds(730, 100, 150, 30);
    campo1.setText("LUIS CARLOS");
   ventana.add(campo1);
    
    
    ventana.setVisible(true);
    }
}
