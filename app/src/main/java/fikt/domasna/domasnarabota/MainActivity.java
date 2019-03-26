package fikt.domasna.domasnarabota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.button3);
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v){
                    OpenActivity2();

                }
            });

        button=findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                openDialog();

                OpenActivity3();

            }
        });

    }

    public void openDialog() {

        Dialog dialog=new Dialog();
        dialog.show(getSupportFragmentManager(),"Dialog Form");
    }

    public  void OpenActivity3(){
        Intent intent = new Intent(this, MK_ANG.class);
        startActivity(intent);
    }

    public  void  OpenActivity2(){
        Intent intent = new Intent(this,AddWord.class);
        startActivity(intent);
    }

    public void Search(View view) {
        EditText word = (EditText) findViewById(R.id.word);
        String theWord = word.getText().toString();


        String definition = findDefinition(theWord);

        TextView thedef = findViewById(R.id.def);

        if (definition != null)
            thedef.setText(definition);
        else
            thedef.setText("The Word not find");


    }

    private String findDefinition(String theWord) {
        InputStream input = getResources().openRawResource(R.raw.prevod);
        Scanner scan = new Scanner((input));

        while (scan.hasNext()) {
            String line = scan.nextLine();

            String[] pices = line.split("=");

            if (pices[0].equalsIgnoreCase(theWord.trim())) {
                return pices[1];
            }
        }
        return null;

    }
}
