package x5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o5.q0;
import o5.v;
import p5.m;
import p5.p;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public static final l f30324a = new l();

    /* renamed from: b */
    public static final String f30325b = l.class.getCanonicalName();

    /* renamed from: c */
    public static final long[] f30326c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void b(String str, String str2, Context context) {
        if (i6.a.b(l.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f30324a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", m6.a.a(context));
            p5.m mVar = new p5.m(str, str2);
            v vVar = v.f22837a;
            if (q0.b()) {
                mVar.d(bundle, "fb_mobile_activate_app");
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = p5.m.f23923c;
            if (m.a.b() != p5.k.EXPLICIT_ONLY && !i6.a.b(mVar)) {
                String str3 = p5.i.f23913a;
                p5.i.c(p.EXPLICIT);
            }
        } catch (Throwable th2) {
            i6.a.a(l.class, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x00d5, code lost:
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0069 A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:94:0x0010, B:96:0x0016, B:98:0x001c, B:102:0x0026, B:106:0x0033, B:114:0x004f, B:116:0x0053, B:119:0x0058, B:123:0x0069, B:131:0x0085, B:145:0x00b6, B:151:0x00d9, B:155:0x00eb, B:157:0x010a, B:154:0x00e7, B:148:0x00d1, B:101:0x0022, B:103:0x0029, B:126:0x0075, B:136:0x00a3, B:138:0x00a8, B:109:0x003f, B:160:0x0111), top: B:168:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d1 A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #2 {all -> 0x0124, blocks: (B:94:0x0010, B:96:0x0016, B:98:0x001c, B:102:0x0026, B:106:0x0033, B:114:0x004f, B:116:0x0053, B:119:0x0058, B:123:0x0069, B:131:0x0085, B:145:0x00b6, B:151:0x00d9, B:155:0x00eb, B:157:0x010a, B:154:0x00e7, B:148:0x00d1, B:101:0x0022, B:103:0x0029, B:126:0x0075, B:136:0x00a3, B:138:0x00a8, B:109:0x003f, B:160:0x0111), top: B:168:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e7 A[Catch: all -> 0x0124, TryCatch #2 {all -> 0x0124, blocks: (B:94:0x0010, B:96:0x0016, B:98:0x001c, B:102:0x0026, B:106:0x0033, B:114:0x004f, B:116:0x0053, B:119:0x0058, B:123:0x0069, B:131:0x0085, B:145:0x00b6, B:151:0x00d9, B:155:0x00eb, B:157:0x010a, B:154:0x00e7, B:148:0x00d1, B:101:0x0022, B:103:0x0029, B:126:0x0075, B:136:0x00a3, B:138:0x00a8, B:109:0x003f, B:160:0x0111), top: B:168:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r19, x5.k r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.l.c(java.lang.String, x5.k, java.lang.String):void");
    }

    public final String a(Context context) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String k10 = gm.l.k(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(k10, null);
            if (string == null || string.length() != 32) {
                String b10 = j.b(context);
                if (b10 == null) {
                    b10 = j.a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(k10, b10).apply();
                return b10;
            }
            return string;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
