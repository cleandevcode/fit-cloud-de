package com.github.kilnn.sport.preference;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class PreferenceProvider extends ContentProvider {

    /* renamed from: b */
    public static final String[] f5865b = {"value"};

    /* renamed from: a */
    public UriMatcher f5866a;

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        l.f(context, "context");
        l.f(providerInfo, "info");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f5866a = uriMatcher;
        uriMatcher.addURI(providerInfo.authority, "*/string", 1);
        UriMatcher uriMatcher2 = this.f5866a;
        if (uriMatcher2 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher2.addURI(providerInfo.authority, "*/int", 2);
        UriMatcher uriMatcher3 = this.f5866a;
        if (uriMatcher3 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher3.addURI(providerInfo.authority, "*/long", 3);
        UriMatcher uriMatcher4 = this.f5866a;
        if (uriMatcher4 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher4.addURI(providerInfo.authority, "*/float", 4);
        UriMatcher uriMatcher5 = this.f5866a;
        if (uriMatcher5 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher5.addURI(providerInfo.authority, "*/boolean", 5);
        UriMatcher uriMatcher6 = this.f5866a;
        if (uriMatcher6 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher6.addURI(providerInfo.authority, "*/contains", 6);
        UriMatcher uriMatcher7 = this.f5866a;
        if (uriMatcher7 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher7.addURI(providerInfo.authority, "*/commit", 7);
        UriMatcher uriMatcher8 = this.f5866a;
        if (uriMatcher8 == null) {
            l.l("uriMatcher");
            throw null;
        }
        uriMatcher8.addURI(providerInfo.authority, "*/apply", 8);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        l.f(uri, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        l.f(uri, "uri");
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object string;
        int i10;
        l.f(uri, "uri");
        Object obj = null;
        if (strArr2 == null) {
            return null;
        }
        Context context = getContext();
        l.c(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(uri.getPathSegments().get(0), 0);
        UriMatcher uriMatcher = this.f5866a;
        if (uriMatcher == null) {
            l.l("uriMatcher");
            throw null;
        }
        int match = uriMatcher.match(uri);
        String str3 = strArr2[0];
        if (match == 6) {
            obj = Integer.valueOf(sharedPreferences.contains(str3) ? 1 : 0);
        } else if (sharedPreferences.contains(str3)) {
            if (match != 1) {
                if (match == 2) {
                    i10 = sharedPreferences.getInt(str3, 0);
                } else if (match == 3) {
                    string = Long.valueOf(sharedPreferences.getLong(str3, 0L));
                } else if (match == 4) {
                    string = Float.valueOf(sharedPreferences.getFloat(str3, 0.0f));
                } else if (match != 5) {
                    return null;
                } else {
                    i10 = sharedPreferences.getBoolean(str3, false);
                }
                string = Integer.valueOf(i10);
            } else {
                string = sharedPreferences.getString(str3, "");
            }
            obj = string;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f5865b, 1);
        matrixCursor.newRow().add(obj);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        l.f(uri, "uri");
        Context context = getContext();
        l.c(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(uri.getPathSegments().get(0), 0);
        UriMatcher uriMatcher = this.f5866a;
        if (uriMatcher == null) {
            l.l("uriMatcher");
            throw null;
        }
        int match = uriMatcher.match(uri);
        if (match == 7 || match == 8) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            l.e(edit, "preferences.edit()");
            if (strArr != null) {
                if ((!(strArr.length == 0)) && (str2 = strArr[0]) != null && Boolean.parseBoolean(str2)) {
                    edit.clear();
                }
            }
            if (contentValues != null) {
                for (String str3 : contentValues.keySet()) {
                    Object obj = contentValues.get(str3);
                    if (obj == null) {
                        edit.remove(str3);
                    } else if (obj instanceof String) {
                        edit.putString(str3, (String) obj);
                    } else if (obj instanceof Integer) {
                        edit.putInt(str3, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str3, ((Number) obj).longValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str3, ((Number) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str3, ((Boolean) obj).booleanValue());
                    }
                }
            }
            if (match != 7) {
                edit.apply();
            } else if (!edit.commit()) {
                return 0;
            }
            return 1;
        }
        return 0;
    }
}
