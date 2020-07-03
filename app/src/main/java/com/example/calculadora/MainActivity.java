package com.example.calculadora ;

    import   android.support.v7.app.AppCompatActivity ;
    import   android.os.Bundle ;
    import   android.view.View ;
    import   android.widget.Button ;
    import   android.widget.TextView ;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //variables privadas
    private String numero = "";
    private double numero1 = 0;
    private double numero2 = 0;
    private String symbol = "";

    private TextView solucion;
    private Button keyPadnum_nueve, keyPadnum_ocho, keyPadnum_siete, keyPadnum_seis, keyPadnum_cinco, keyPadnum_cuatro, keyPadnum_tres, keyPadnum_dos, keyPadnum_uno, keyPadnum_cero;
    private Button  keyPadclear,  keyPadactualizar,  keyPadporcentaje,  keyPaddividido, keyPadmultiplicacion, keyPadresta, keyPadsuma,  keyPadpunto, keypadigual;

    @Override
    protected void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.activity_main);

        solucion = findViewById(R.id.solucion);

        keyPadnum_nueve = findViewById(R.id.num_nueve);
        keyPadnum_ocho = findViewById(R.id.num_ocho);
        keyPadnum_siete = findViewById(R.id.num_siete);
        keyPadnum_seis = findViewById(R.id.num_seis);
        keyPadnum_cinco = findViewById(R.id.num_cinco);
        keyPadnum_cuatro = findViewById(R.id.num_cuatro);
        keyPadnum_tres = findViewById(R.id.num_tres);
        keyPadnum_dos = findViewById(R.id.num_dos);
        keyPadnum_uno = findViewById(R.id.num_uno);
        keyPadnum_cero = findViewById(R.id.num_cero);

        keyPadclear = findViewById(R.id.clear);
        keyPadactualizar = findViewById(R.id.actualizar);
        keyPadporcentaje = findViewById(R.id.porcentaje);
        keyPaddividido = findViewById(R.id.dividido);
        keyPadmultiplicacion = findViewById(R.id.multiplicacion);
        keyPadresta = findViewById(R.id.resta);
        keyPadsuma = findViewById(R.id.suma);
        keyPadpunto = findViewById(R.id.punto);
        keypadigual = findViewById(R.id.igual);

// escuchando constantemente

        keyPadnum_nueve.setOnClickListener(this);
        keyPadnum_ocho.setOnClickListener(this);
        keyPadnum_siete.setOnClickListener(this);
        keyPadnum_seis.setOnClickListener(this);
        keyPadnum_cinco.setOnClickListener(this);
        keyPadnum_cuatro.setOnClickListener(this);
        keyPadnum_tres.setOnClickListener(this);
        keyPadnum_dos.setOnClickListener(this);
        keyPadnum_uno.setOnClickListener(this);
        keyPadnum_cero.setOnClickListener(this);

        keyPadclear.setOnClickListener(this);
        keyPadactualizar.setOnClickListener(this);
        keyPadporcentaje.setOnClickListener(this);
        keyPaddividido.setOnClickListener(this);
        keyPadmultiplicacion.setOnClickListener(this);
        keyPadresta.setOnClickListener(this);
        keyPadsuma.setOnClickListener(this);
        keyPadpunto.setOnClickListener(this);
        keypadigual.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num_nueve:
                numero = numero + "9";
                solucion.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                solucion.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                solucion.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                solucion.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                solucion.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                solucion.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                solucion.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                solucion.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                solucion.setText(numero);
                break;
            case R.id.num_cero:
                numero = numero + "0";
                solucion.setText(numero);
                break;
            case R.id.porcentaje:
                symbol = "%";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.dividido:
                symbol =  "/";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.multiplicacion:
                symbol = "X";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.resta:
                symbol = "-";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.suma:
                symbol = "+";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.punto:
                symbol = ".";
                numero1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.igual:
                numero2 = Integer.parseInt(numero);
                switch (symbol){
                    case "%":
                        solucion. setText("resultado" + (numero1 * numero2 / 100));
                        break;
                    case "/":
                        solucion. setText("resultado" + (numero1 / numero2));
                        break;
                    case "X":
                        solucion. setText("resultado" + (numero1 * numero2));
                        break;
                    case "-":
                        solucion. setText("resultado" + (numero1 - numero2));
                        break;
                    case "+":
                        solucion. setText("resultado" + (numero1 + numero2));
                        break;
                }
        //limpiar
                numero1 = 0;
                numero2 = 0;
                numero = "";
                break;
            case R.id.clear:
                symbol = "";
                numero = "";
                numero1 = 0;
                numero2 = 0;
                solucion.setText(" 0 ");
                break;
            case R.id.actualizar:
                symbol = "";
                numero = "";
                numero1 = 0;
                numero2 = 0;
                solucion.setText(" ");
                break;
        }
    }
}

