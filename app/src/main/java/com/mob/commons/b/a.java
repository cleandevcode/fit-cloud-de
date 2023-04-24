package com.mob.commons.b;

import android.content.Context;
import android.text.TextUtils;
import com.mob.commons.C0744r;
import com.mob.commons.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final String f8277a = i.a("005+gnAn!hifhhi");

    /* renamed from: b */
    private static a f8278b;

    /* renamed from: c */
    private Context f8279c;

    /* renamed from: d */
    private HashMap<String, Object> f8280d = new HashMap<>();

    private a(Context context) {
        this.f8279c = context;
        try {
            HashMap hashMap = (HashMap) a(a(context, f8277a));
            if (hashMap == null || hashMap.size() <= 0) {
                return;
            }
            this.f8280d.putAll(hashMap);
        } catch (Throwable unused) {
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f8278b == null) {
                f8278b = new a(context);
            }
            aVar = f8278b;
        }
        return aVar;
    }

    private static File a(Context context, String str) {
        try {
            File file = new File(context.getFilesDir().getAbsolutePath() + i.a("005i>ikgeheXi"));
            if (!file.exists() || !file.isDirectory()) {
                file.delete();
                file.mkdirs();
            }
            return new File(file, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object a(File file) {
        ObjectInputStream objectInputStream;
        try {
            if (file.exists()) {
                try {
                    objectInputStream = new ObjectInputStream(new GZIPInputStream(new FileInputStream(file)));
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
                try {
                    Object readObject = objectInputStream.readObject();
                    C0744r.a(objectInputStream);
                    return readObject;
                } catch (Throwable th3) {
                    th = th3;
                    C0744r.a(objectInputStream);
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static boolean a(File file, Object obj) {
        try {
            if (file.exists()) {
                file.delete();
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            ObjectOutputStream objectOutputStream = null;
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
                try {
                    objectOutputStream2.writeObject(obj);
                    objectOutputStream2.flush();
                    C0744r.a(objectOutputStream2);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    C0744r.a(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public synchronized HashMap<String, Object> a() {
        return this.f8280d;
    }

    public synchronized boolean a(String str, String str2, String str3, String str4, boolean z10) {
        HashMap hashMap;
        try {
            hashMap = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(i.a("004Ugefhfg+j"), str);
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put(i.a("0045fhfhfg_j"), str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(i.a("004l,fhfg6j"), str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(i.a("004_fePjPfg$j"), str4);
            }
            hashMap.put(i.a("009;hifeMgg*gefj(fkj"), Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return false;
        }
        return a(a(this.f8279c, f8277a), hashMap);
    }
}
