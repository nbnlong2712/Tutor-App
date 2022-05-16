package com.nguyenhuyhoang.lettutor.components;

import android.app.Activity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class AuthDialog {

    public static void showSuccessDialog(Activity activity)
    {
        new SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Login successful!")
                .show();
    }

    public static void showErrorDialog(Activity activity, String errorMessage)
    {
        new SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Oops...")
                .setContentText(errorMessage)
                .show();
    }
}
