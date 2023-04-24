package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes.dex */
public class SettingUtil {
    public static int getSecureInt(ContentResolver contentResolver, String str, int i10) {
        try {
            return Settings.Secure.getInt(contentResolver, str, i10);
        } catch (RuntimeException e10) {
            Logger.e("SettingUtil", "Settings Secure getInt throwFromSystemServer:", e10);
            return i10;
        }
    }

    public static int getSystemInt(ContentResolver contentResolver, String str, int i10) {
        try {
            return Settings.System.getInt(contentResolver, str, i10);
        } catch (RuntimeException e10) {
            Logger.e("SettingUtil", "Settings System getInt throwFromSystemServer:", e10);
            return i10;
        }
    }
}
