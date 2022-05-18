package com.nguyenhuyhoang.lettutor.components;

import android.app.ProgressDialog;

public class ProgressIndicator {
    public static void showProgress(ProgressDialog progressDialog)
    {
        progressDialog.setCancelable(true);
        progressDialog.show();
    }

    public static void hideProgress(ProgressDialog progressDialog)
    {
        progressDialog.dismiss();
    }
}
