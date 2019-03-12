package fikt.domasna.domasnarabota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class AddWord extends AppCompatActivity {

    EditText txtAng, txtMkd;
    TextView Results;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        txtAng=(EditText) findViewById(R.id.txtAng);
        txtMkd=(EditText) findViewById(R.id.txtMkd);
        Results=(TextView) findViewById(R.id.textView3);



    }




}
