package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.ResHelper;
import java.io.File;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    public static final String f8433a;

    /* renamed from: b */
    public static final String f8434b;

    /* renamed from: c */
    public static final String f8435c;

    /* renamed from: d */
    public static final String f8436d;

    /* renamed from: e */
    public static final String f8437e;

    /* renamed from: f */
    public static final String f8438f;

    /* renamed from: g */
    public static final String f8439g;

    /* renamed from: h */
    public static final Object f8440h;

    /* renamed from: i */
    public static final Object f8441i;

    /* renamed from: j */
    private static final String f8442j;

    static {
        String a10 = com.mob.commons.a.d.a("011Dehfd:mmh fefdehekgh^h");
        f8442j = a10;
        f8433a = a.b.b(a10, ".mrlock");
        StringBuilder a11 = android.support.v4.media.d.a(a10);
        a11.append(com.mob.commons.a.d.a("007@fm2id)fefdehek"));
        f8434b = a11.toString();
        StringBuilder a12 = android.support.v4.media.d.a(a10);
        a12.append(com.mob.commons.a.d.a("011Sfmggfefdgdegfeflfdehek"));
        f8435c = a12.toString();
        StringBuilder a13 = android.support.v4.media.d.a(a10);
        a13.append(com.mob.commons.a.d.a("008 fmIi1ejeefefdehek"));
        f8436d = a13.toString();
        StringBuilder a14 = android.support.v4.media.d.a(a10);
        a14.append(com.mob.commons.a.d.a("008_fmOiWgheefefdehek"));
        f8437e = a14.toString();
        f8438f = a.b.b(a10, ".cl_lock");
        f8439g = a.b.b(a10, ".gcf_lock");
        f8440h = new Object();
        f8441i = new Object();
    }

    public static synchronized File a(String str) {
        File dataCacheFile;
        synchronized (l.class) {
            dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
        }
        return dataCacheFile;
    }

    public static boolean a(File file, k kVar) {
        return a(file, true, kVar);
    }

    public static boolean a(File file, boolean z10, k kVar) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            synchronized (b(absolutePath)) {
                FileLocker fileLocker = new FileLocker();
                fileLocker.setLockFile(absolutePath);
                if (fileLocker.lock(z10)) {
                    if (!kVar.a(fileLocker)) {
                        fileLocker.release();
                    }
                    return true;
                }
                return false;
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return true;
        }
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = f8435c;
            if (str.endsWith(str2)) {
                return str2;
            }
            String str3 = f8434b;
            if (str.endsWith(str3)) {
                return str3;
            }
            String str4 = f8436d;
            if (str.endsWith(str4)) {
                return str4;
            }
            String str5 = f8437e;
            if (str.endsWith(str5)) {
                return str5;
            }
            String str6 = f8438f;
            if (str.endsWith(str6)) {
                return str6;
            }
            String str7 = f8439g;
            if (str.endsWith(str7)) {
                return str7;
            }
        }
        return str;
    }
}
