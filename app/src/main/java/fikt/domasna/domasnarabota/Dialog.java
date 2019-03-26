package fikt.domasna.domasnarabota;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import fikt.domasna.domasnarabota.MK_ANG;

import static fikt.domasna.domasnarabota.R.layout.activity_mk__ang;

public class Dialog extends DialogFragment {


    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Information");
        builder.setMessage("You have change the language or this dictionary");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            OpenActivity3();

        }


    });

        return builder.create();
}

    private void OpenActivity3() {



    }


}
