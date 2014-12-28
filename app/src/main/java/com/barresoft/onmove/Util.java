package com.barresoft.onmove;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by BarresofT on 28/12/2014.
 */
public class Util {
    public static void msg(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
