package fikt.domasna.domasnarabota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class AddWord extends AppCompatActivity {
    private Button button;
    EditText txtAng, txtMkd;
    TextView Results;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);


        button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                openDialog();

            }
        });



    }
    public void openDialog() {

       AddDialoginfo dialog=new AddDialoginfo();
        dialog.show(getSupportFragmentManager(),"Dialog Form");
    }



}
