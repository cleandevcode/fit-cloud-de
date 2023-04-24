package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PLSharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f7040a;

    public PLSharedPreferences(Context context, String str) {
        SharedPreferences sharedPreferences;
        Context createDeviceProtectedStorageContext;
        boolean moveSharedPreferencesFrom;
        if (context == null) {
            Logger.e("PLSharedPreferences", "context is null, must call init method to set context");
            sharedPreferences = null;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences2 = createDeviceProtectedStorageContext.getSharedPreferences("grs_move2DE_records", 0);
                if (!sharedPreferences2.getBoolean(str, false)) {
                    moveSharedPreferencesFrom = createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str);
                    if (moveSharedPreferencesFrom) {
                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                        edit.putBoolean(str, true);
                        edit.apply();
                    }
                }
                context = createDeviceProtectedStorageContext;
            }
            sharedPreferences = context.getSharedPreferences(str, 0);
        }
        this.f7040a = sharedPreferences;
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        int size;
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        StringBuilder a10 = android.support.v4.media.d.a("sp size ");
        if (all == null) {
            size = 0;
        } else {
            size = all.size();
        }
        a10.append(size);
        Logger.i("PLSharedPreferences", a10.toString());
        return all;
    }

    public Map<String, String> getHashMap(String str) {
        HashMap hashMap = new HashMap();
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString(str, ""));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i11 = 0; i11 < names.length(); i11++) {
                        String string = names.getString(i11);
                        hashMap.put(string, jSONObject.getString(string));
                    }
                }
            }
        } catch (JSONException e10) {
            Logger.w("PLSharedPreferences", "getHashMap parse Json to map error: %s", StringUtils.anonymizeMessage(e10.getMessage()));
        }
        return hashMap;
    }

    public long getLong(String str, long j10) {
        SharedPreferences sharedPreferences = this.f7040a;
        return sharedPreferences == null ? j10 : sharedPreferences.getLong(str, j10);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f7040a;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    public void putHashMap(String str, Map<String, String> map) {
        if (this.f7040a == null || map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e10) {
                Logger.w("PLSharedPreferences", "putHashMap one object error: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            }
        }
        jSONArray.put(jSONObject);
        this.f7040a.edit().putString(str, jSONArray.toString()).apply();
    }

    public void putLong(String str, long j10) {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j10).apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.f7040a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }
}
