package com.satguru.artifactsdk;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public void showShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void showLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
