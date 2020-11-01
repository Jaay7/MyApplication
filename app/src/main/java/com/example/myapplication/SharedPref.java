package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    SharedPreferences mySharedPref;
    public SharedPref(Context context){
        mySharedPref = context.getSharedPreferences("filename", Context.MODE_PRIVATE);

    }
    public void setNightModeState(Boolean state){
        SharedPreferences.Editor editor = mySharedPref.edit();
        editor.putBoolean("NightMode",state);
        editor.commit();
    }
    public Boolean loadNightModeState (){
        Boolean state = mySharedPref.getBoolean("NightMode",false);
        return state;
    }
    public void setYellowModeState(Boolean state1){
        SharedPreferences.Editor editor = mySharedPref.edit();
        editor.putBoolean("YellowTheme",state1);
        editor.commit();
    }
    public Boolean loadYellowModeState () {
        Boolean state1 = mySharedPref.getBoolean("YellowTheme",false);
        return state1;
    }
}
