package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import d6.d0;
import d6.m0;
import gm.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class FacebookContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final String f5829a = FacebookContentProvider.class.getName();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        l.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair pair;
        String path;
        l.f(uri, "uri");
        l.f(str, "mode");
        File file = null;
        try {
            path = uri.getPath();
        } catch (Exception unused) {
            pair = null;
        }
        if (path != null) {
            String substring = path.substring(1);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = om.l.s0(substring, new String[]{"/"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                String str2 = strArr[0];
                String str3 = strArr[1];
                if (!"..".contentEquals(str2) && !"..".contentEquals(str3)) {
                    pair = new Pair(UUID.fromString(str2), str3);
                    if (pair != null) {
                        try {
                            d0 d0Var = d0.f12651a;
                            UUID uuid = (UUID) pair.first;
                            String str4 = (String) pair.second;
                            if (!m0.A(str4) && uuid != null) {
                                try {
                                    File e10 = d0.e(uuid, false);
                                    if (e10 != null) {
                                        try {
                                            file = new File(e10, URLEncoder.encode(str4, "UTF-8"));
                                        } catch (UnsupportedEncodingException unused2) {
                                        }
                                    }
                                    if (file != null) {
                                        return ParcelFileDescriptor.open(file, 268435456);
                                    }
                                    throw new FileNotFoundException();
                                } catch (IOException unused3) {
                                    throw new FileNotFoundException();
                                }
                            }
                            throw new FileNotFoundException();
                        } catch (FileNotFoundException e11) {
                            Log.e(f5829a, l.k(e11, "Got unexpected exception:"));
                            throw e11;
                        }
                    }
                    throw new FileNotFoundException();
                }
                throw new Exception();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.f(uri, "uri");
        return 0;
    }
}
