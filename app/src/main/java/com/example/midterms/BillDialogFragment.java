package com.example.midterms;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

// TODO Milestone C: Add error dialog
public class BillDialogFragment extends DialogFragment {
    ErrorDialogListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Invalid input. Do you want to use the same reading difference as last month?")
                .setPositiveButton("Yes", new )


        return builder.create();
    }

}
