package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicBoolean;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b */
    public static boolean f6044b = false;

    /* renamed from: c */
    public static boolean f6045c = false;
    @Deprecated

    /* renamed from: a */
    public static final AtomicBoolean f6043a = new AtomicBoolean();

    /* renamed from: d */
    public static final AtomicBoolean f6046d = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:172:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x018e  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r8, int r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.a.a(android.content.Context, int):int");
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", DfuBaseService.ERROR_REMOTE_MASK).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
