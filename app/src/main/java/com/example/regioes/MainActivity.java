package com.example.regioes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRegioes, btnEstados;
    private String[] regioes = getResources().getStringArray(R.array.regioes);
    private String[] regiaoNorte = getResources().getStringArray(R.array.regiaoNorte);
    private String[] regiaoNordeste = getResources().getStringArray(R.array.regiaoNordeste);
    private String[] regiaoCentroOeste = getResources().getStringArray(R.array.regiaoCentroOeste);
    private String[] regiaoSudeste = getResources().getStringArray(R.array.regiaoSudeste);
    private String[] regiaoSul = getResources().getStringArray(R.array.regiaoSul);

    private Button estado;
    private int contador, selecao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegioes = (Button) findViewById(R.id.btnRegioes);
        btnEstados = (Button) findViewById(R.id.btnEstados);


        btnRegioes.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                if(btnRegioes){
                    selecao ++;
                }
                contador ++;
                tvAfirmacao.setText( afirmacoes[contador]);
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                if( !gabarito[contador]){
                    acertos ++;
                }
                contador ++;
                tvAfirmacao.setText( afirmacoes[contador]);
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
            }
        });
    }
}
