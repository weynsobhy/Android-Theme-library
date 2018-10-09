package com.module.otobus.otodatatheme;

import android.app.Activity;
import android.content.Intent;

public class ThemeUtils {

    private static int cTheme;
    public final static int DANGDUT = 0;
    public final static int POP = 1;
    public final static int ROCK = 2;
    public final static int JAZZ = 3;
    public final static int REGGAE = 4;
    public final static int DISCO = 5;

    public static void changeToTheme(Activity activity, int theme) {

        cTheme = theme;

        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    public static void onActivityCreateSetTheme(Activity activity){

        switch (cTheme) {

            default:

            case DANGDUT:
                activity.setTheme(R.style.DangdutTheme);
                break;

            case POP:
                activity.setTheme(R.style.PopTheme);
                break;

            case REGGAE:
                activity.setTheme(R.style.ReggaeTheme);
                break;

        }
    }

}