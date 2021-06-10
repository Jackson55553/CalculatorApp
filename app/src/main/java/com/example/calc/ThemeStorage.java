package com.example.calc;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {
    private static final String KEY_APP_THEME = "KEY_APP_THEME";

    private final Context context;

    private final SharedPreferences sharedPreferences;

    public ThemeStorage(Context context) {
        this.context = context;

        this.sharedPreferences = context.getSharedPreferences("app_theme", Context.MODE_PRIVATE);
    }

    public CalcTheme getTheme() {
        String key = sharedPreferences.getString(KEY_APP_THEME, CalcTheme.DEFAULT.getKey());

        for (CalcTheme calcTheme : CalcTheme.values()) {
            if (calcTheme.getKey().equals(key)) {
                return calcTheme;
            }
        }
        throw new IllegalStateException("wrong!");
    }

    public void setTheme(CalcTheme theme) {
        sharedPreferences.edit().putString(KEY_APP_THEME, theme.getKey()).apply();
    }
}
