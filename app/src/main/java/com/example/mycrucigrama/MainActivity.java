package com.example.mycrucigrama;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaración de tipos de datos
    private TextView btnVer;
    private TextView btnHelp;
    private EditText editText;
    private Button reset;
    private Button button1, button2, button3, button4, button5;
    private Button button6, button8, button10;
    private Button button11, button12, button13, button14, button15;
    private Button button18, button20;
    private Button button21, button22, button23, button24, button25;
    private int rightWordsV1 = 0;
    private int rightWordsV2 = 0;
    private int rightWordsV3 = 0;
    private int rightWordsH1 = 0;
    private int rightWordsH2 = 0;
    private int rightWordsH3 = 0;

    // Arrays de las palabras del crucigrama
    private String[] words = new String[]{"OLA", "RADAR", "REARE",
            "OBRAR", "ALDEA", "BARRE"};

    // verifica si el editText esta vacio
    private void checkTextEmpty() {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "Ingrese una palabra", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del v1 tiene las letras correctas muestra encontrada
    private void checkTextV1() {

        // si el v1 = a la palabra OLA muestra encontrada
        if (button1.getText().equals("O") && button6.getText().equals("L") && button11.getText().equals("A")) {
            Toast.makeText(MainActivity.this,
                    "V1 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el v1 = a la palabra OLA muestra encontrada y si esta vacio el editText muestra encontrada
        if (button1.getText().equals("O") && button6.getText().equals("L") && button11.getText().equals("A") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "V1 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del v2 tiene las letras correctas muestra encontrada
    private void checkTextV2() {
        // si el v2 = a la palabra RADAR muestra que ya esta encontrada
        if (button3.getText().equals("R") && button8.getText().equals("A") && button13.getText().equals("D") && button18.getText().equals("A") && button23.getText().equals("R")) {
            Toast.makeText(MainActivity.this,
                    "V2 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el v1 = a la palabra RADAR muestra encontrada y si esta vacio el editText muestra encontrada
        if (button3.getText().equals("R") && button8.getText().equals("A") && button13.getText().equals("D") && button18.getText().equals("A") && button23.getText().equals("R") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "V2 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del v3 tiene las letras correctas muestra encontrada
    private void checkTextV3() {
        // si el v3 = a la palabra REARE muestra encontrada
        if (button5.getText().equals("R") && button10.getText().equals("E") && button15.getText().equals("A") && button20.getText().equals("R") && button25.getText().equals("E")) {
            Toast.makeText(MainActivity.this,
                    "V3 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el v3 = a la palabra REARE muestra encontrada y si esta vacio el editText muestra encontrada
        if (button5.getText().equals("R") && button10.getText().equals("E") && button15.getText().equals("A") && button20.getText().equals("R") && button25.getText().equals("E") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "V3 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del h1 tiene las letras correctas muestra encontrada
    private void checkTextH1() {
        // si el h1 = a la palabra REARE muestra encontrada
        if (button1.getText().equals("O") && button2.getText().equals("B") && button3.getText().equals("R") && button4.getText().equals("A") && button5.getText().equals("R")) {
            Toast.makeText(MainActivity.this,
                    "H1 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el h1 = a la palabra REARE muestra encontrada y si esta vacio el editText muestra encontrada
        if (button1.getText().equals("O") && button2.getText().equals("B") && button3.getText().equals("R") && button4.getText().equals("A") && button5.getText().equals("R") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "H1 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del h2 tiene las letras correctas muestra encontrada
    private void checkTextH2() {
        // si el h2 = a la palabra ALDEA muestra encontrada
        if (button11.getText().equals("A") && button12.getText().equals("L") && button13.getText().equals("D") && button14.getText().equals("E") && button15.getText().equals("A")) {
            Toast.makeText(MainActivity.this,
                    "H2 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el h2 = a la palabra ALDEA muestra encontrada y si esta vacio el editText muestra encontrada
        if (button11.getText().equals("A") && button12.getText().equals("L") && button13.getText().equals("D") && button14.getText().equals("E") && button15.getText().equals("A") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "H2 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // verifica si la palabra del h3 tiene las letras correctas muestra encontrada
    private void checkTextH3() {
        // si el h3 = a la palabra BARRE muestra encontrada
        if (button21.getText().equals("B") && button22.getText().equals("A") && button23.getText().equals("R") && button24.getText().equals("R") && button25.getText().equals("E")) {
            Toast.makeText(MainActivity.this,
                    "H3 encontrada", Toast.LENGTH_SHORT).show();
        }
        // si el h3 = a la palabra BARRE muestra encontrada y si esta vacio el editText muestra encontrada
        if (button21.getText().equals("B") && button22.getText().equals("A") && button23.getText().equals("R") && button24.getText().equals("R") && button25.getText().equals("E") && editText.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this,
                    "H3 encontrada", Toast.LENGTH_SHORT).show();
        }
    }

    // comprueba si el usuario gano el juego de crucigrama y se manda a llamar al final de cada boton presionado (v1,v2,v3,h1,h2,h3)
    // ya que en esos botones si esta bien la palabra las pone en el crucigrama ya sea en vertical u horizontal por eso es que se manda
    // a llamar en esos botones por que no se sabe en que boton pueda ganar
    private void checkGameWon() {
        if (button1.getText().equals("O") && button6.getText().equals("L") && button11.getText().equals("A") &&
                button3.getText().equals("R") && button8.getText().equals("A") && button13.getText().equals("D") && button18.getText().equals("A") && button23.getText().equals("R") &&
                button5.getText().equals("R") && button10.getText().equals("E") && button15.getText().equals("A") && button20.getText().equals("R") && button25.getText().equals("E") &&
                button1.getText().equals("O") && button2.getText().equals("B") && button3.getText().equals("R") && button4.getText().equals("A") && button5.getText().equals("R") &&
                button11.getText().equals("A") && button12.getText().equals("L") && button13.getText().equals("D") && button14.getText().equals("E") && button15.getText().equals("A") &&
                button21.getText().equals("B") && button22.getText().equals("A") && button23.getText().equals("R") && button24.getText().equals("R") && button25.getText().equals("E")
        ) {
            AlertDialog.Builder alertDialogBuilder = new
                    AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("You Win !!")
                    .setCancelable(false)
                    .setPositiveButton("New", new
                            DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    // metodo onCreate se ejecuta cuando la app esta activa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // se enlaza los recursos del xml
        btnVer = findViewById(R.id.btnVer);
        btnHelp = findViewById(R.id.btnHelp);
        editText = findViewById(R.id.editText1);
        reset = findViewById(R.id.btnReset);
        //V1
        button1 = findViewById(R.id.boton_01);
        button11 = findViewById(R.id.boton_11);
        button6 = findViewById(R.id.boton_06);
        //V2
        button3 = findViewById(R.id.boton_03);
        button8 = findViewById(R.id.boton_08);
        button13 = findViewById(R.id.boton_13);
        button18 = findViewById(R.id.boton_18);
        button23 = findViewById(R.id.boton_23);
        //V3
        button5 = findViewById(R.id.boton_05);
        button10 = findViewById(R.id.boton_10);
        button15 = findViewById(R.id.boton_15);
        button20 = findViewById(R.id.boton_20);
        button25 = findViewById(R.id.boton_25);
        //H1
        button2 = findViewById(R.id.boton_02);
        button4 = findViewById(R.id.boton_04);
        //H2
        button12 = findViewById(R.id.boton_12);
        button14 = findViewById(R.id.boton_14);
        //H3
        button21 = findViewById(R.id.boton_21);
        button22 = findViewById(R.id.boton_22);
        button24 = findViewById(R.id.boton_24);

        // si se presiona el boton VER se dirige hacia las pistas
        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se crea un intent para pasar a otro activity (donde estoy, hacia donde voy)
                Intent intent = new Intent(MainActivity.this, MainActivity2Ver.class);
                startActivity(intent);// arranca el activity
            }
        });

        // si se presiona el boton HELP se dirige hacia la ayuda
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se crea un intent para pasar a otro activity (donde estoy, hacia donde voy)
                Intent intent = new Intent(MainActivity.this, MainActivity3Help.class);
                startActivity(intent);// arranca el activity
            }
        });

        // si se presiona el boton RESET se reinicia el juego
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // si se presiona el boton6 = V1 hace esto
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextV1();
                // verifica si el editText = a la primera palabra vertical
                if (editText.getText().toString().equalsIgnoreCase(words[0])) {
                    Toast.makeText(MainActivity.this,
                            "V1 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[0]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "V1 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsV1++;
                }
                // si es correcta la palabra la pone en la vertical1 = v1
                if (rightWordsV1 == 1) {
                    button1.setText("O");
                    button6.setText("L");
                    button11.setText("A");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[0]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button1.getText().equals("O") && button6.getText().equals("L") && button11.getText().equals("A")) {
                        Toast.makeText(MainActivity.this,
                                "V1 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 4 muestra que son 3 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[0]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 4) {
                        Toast.makeText(MainActivity.this,
                                "Solo 3 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button1.getText().equals("O") && button6.getText().equals("L") && button11.getText().equals("A")) {
                            Toast.makeText(MainActivity.this,
                                    "V1 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });

        // si se presiona el boton8=V2 hace esto
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextV2();
                // verifica si el editText = a la segunda palabra vertical
                if (editText.getText().toString().equalsIgnoreCase(words[1])) {
                    Toast.makeText(MainActivity.this,
                            "V2 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[1]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "V2 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsV2++;
                }
                // si es correcta la palabra la pone en la vertical2 = v2
                if (rightWordsV2 == 1) {
                    button3.setText("R");
                    button8.setText("A");
                    button13.setText("D");
                    button18.setText("A");
                    button23.setText("R");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[1]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button3.getText().equals("R") && button8.getText().equals("A") && button13.getText().equals("D") && button18.getText().equals("A") && button23.getText().equals("R")) {
                        Toast.makeText(MainActivity.this,
                                "V2 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 6 muestra que son 5 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[1]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 6) {
                        Toast.makeText(MainActivity.this,
                                "Solo 5 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button3.getText().equals("R") && button8.getText().equals("A") && button13.getText().equals("D") && button18.getText().equals("A") && button23.getText().equals("R")) {
                            Toast.makeText(MainActivity.this,
                                    "V2 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });

        // si se presiona el boton10=V3 hace esto
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextV3();
                // verifica si el editText = a la tercera palabra vertical
                if (editText.getText().toString().equalsIgnoreCase(words[2])) {
                    Toast.makeText(MainActivity.this,
                            "V3 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[2]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "V3 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsV3++;
                }
                // si es correcta la palabra la pone en la vertical3 = v3
                if (rightWordsV3 == 1) {
                    button5.setText("R");
                    button10.setText("E");
                    button15.setText("A");
                    button20.setText("R");
                    button25.setText("E");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[2]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button5.getText().equals("R") && button10.getText().equals("E") && button15.getText().equals("A") && button20.getText().equals("R") && button25.getText().equals("E")) {
                        Toast.makeText(MainActivity.this,
                                "V3 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 6 muestra que son 5 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[2]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 6) {
                        Toast.makeText(MainActivity.this,
                                "Solo 5 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button5.getText().equals("R") && button10.getText().equals("E") && button15.getText().equals("A") && button20.getText().equals("R") && button25.getText().equals("E")) {
                            Toast.makeText(MainActivity.this,
                                    "V3 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });

        // si se presiona el boton3=h1 hace esto
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextH1();
                // verifica si el editText = a la primera palabra horizontal
                if (editText.getText().toString().equalsIgnoreCase(words[3])) {
                    Toast.makeText(MainActivity.this,
                            "H1 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[3]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "H1 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsH1++;
                }
                // si es correcta la palabra la pone en la horizontal1 = H1
                if (rightWordsH1 == 1) {
                    button1.setText("O");
                    button2.setText("B");
                    button3.setText("R");
                    button4.setText("A");
                    button5.setText("R");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[3]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button1.getText().equals("O") && button2.getText().equals("B") && button3.getText().equals("R") && button4.getText().equals("A") && button5.getText().equals("R")) {
                        Toast.makeText(MainActivity.this,
                                "H1 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 6 muestra que son 5 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[3]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 6) {
                        Toast.makeText(MainActivity.this,
                                "Solo 5 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button1.getText().equals("O") && button2.getText().equals("B") && button3.getText().equals("R") && button4.getText().equals("A") && button5.getText().equals("R")) {
                            Toast.makeText(MainActivity.this,
                                    "H1 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });

        // si se presiona el boton13=h2 hace esto
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextH2();
                // verifica si el editText = a la segunda palabra horizontal
                if (editText.getText().toString().equalsIgnoreCase(words[4])) {
                    Toast.makeText(MainActivity.this,
                            "H2 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[4]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "H2 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsH2++;
                }
                // si es correcta la palabra la pone en la horizontal2 = H2
                if (rightWordsH2 == 1) {
                    button11.setText("A");
                    button12.setText("L");
                    button13.setText("D");
                    button14.setText("E");
                    button15.setText("A");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[4]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button11.getText().equals("A") && button12.getText().equals("L") && button13.getText().equals("D") && button14.getText().equals("E") && button15.getText().equals("A")) {
                        Toast.makeText(MainActivity.this,
                                "H2 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 6 muestra que son 5 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[4]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 6) {
                        Toast.makeText(MainActivity.this,
                                "Solo 5 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button11.getText().equals("A") && button12.getText().equals("L") && button13.getText().equals("D") && button14.getText().equals("E") && button15.getText().equals("A")) {
                            Toast.makeText(MainActivity.this,
                                    "H2 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });

        // si se presiona el boton23=h3 hace esto
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTextEmpty();
                checkTextH3();
                // verifica si el editText = a la tercera palabra horizontal
                if (editText.getText().toString().equalsIgnoreCase(words[5])) {
                    Toast.makeText(MainActivity.this,
                            "H3 encontrada", Toast.LENGTH_SHORT).show();
                    // si el editText = a la palabra que se tiene que encontrar la muestra como encontrada
                    if (editText.getText().toString().equalsIgnoreCase(words[5]) && editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this,
                                "H3 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // incrementa las palabras correctas
                    rightWordsH3++;
                }
                // si es correcta la palabra la pone en la horizontal3 = H3
                if (rightWordsH3 == 1) {
                    button21.setText("B");
                    button22.setText("A");
                    button23.setText("R");
                    button24.setText("R");
                    button25.setText("E");
                }
                // si el editText es (diferente) != a la primera palabra vertical y si es (diferente) != a que no se escribio nada
                if (!editText.getText().toString().equalsIgnoreCase(words[5]) && !editText.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this,
                            "Palabra Incorrecta", Toast.LENGTH_SHORT).show();
                    // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                    // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                    if (button21.getText().equals("B") && button22.getText().equals("A") && button23.getText().equals("R") && button24.getText().equals("R") && button25.getText().equals("E")) {
                        Toast.makeText(MainActivity.this,
                                "H3 encontrada", Toast.LENGTH_SHORT).show();
                    }
                    // si el editText es (diferente) != a la primera palabra y si es (diferente) != a que no se escribio nada y si el editText es >= 6 muestra que son 5 letras (no más no menos)
                    if (!editText.getText().toString().equalsIgnoreCase(words[5]) && !editText.getText().toString().equals("") && editText.getText().toString().length() >= 6) {
                        Toast.makeText(MainActivity.this,
                                "Solo 5 letras", Toast.LENGTH_SHORT).show();
                        // si lo que esta en los botones es igual a la palabra que se tiene que encontrar la muestra como encontrada
                        // esta parte se tiene que validar letra por letra para cuando vuelva aqui y si las letras coinciden muestra encontrada
                        if (button21.getText().equals("B") && button22.getText().equals("A") && button23.getText().equals("R") && button24.getText().equals("R") && button25.getText().equals("E")) {
                            Toast.makeText(MainActivity.this,
                                    "H3 encontrada", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                checkGameWon();
            }
        });
/////////////////
    }
}