package com.mob.commons;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.io.Closeable;

/* renamed from: com.mob.commons.r */
/* loaded from: classes.dex */
public class C0744r {

    /* renamed from: com.mob.commons.r$3 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8489a;

        static {
            int[] iArr = new int[InternationalDomain.values().length];
            f8489a = iArr;
            try {
                iArr[InternationalDomain.JP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8489a[InternationalDomain.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Context a() {
        try {
            return b();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            java.lang.String r0 = "007bccdeff"
            java.lang.String r1 = com.mob.commons.n.b(r0)
            boolean r1 = r4.startsWith(r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L1d
            java.lang.String r1 = com.mob.commons.n.b(r0)
            java.lang.String r4 = r4.replace(r1, r2)
        L1d:
            java.lang.String r1 = "https://"
            boolean r3 = r4.startsWith(r1)
            if (r3 == 0) goto L29
            java.lang.String r4 = r4.replace(r1, r2)
        L29:
            boolean r1 = com.mob.MobSDK.checkV6()
            if (r1 == 0) goto L36
            java.lang.String r1 = "002i$hd"
        L31:
            java.lang.String r2 = com.mob.commons.n.b(r1)
            goto L4e
        L36:
            int[] r1 = com.mob.commons.C0744r.AnonymousClass3.f8489a
            com.mob.commons.InternationalDomain r3 = com.mob.MobSDK.getDomain()
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 1
            if (r1 == r3) goto L4c
            r3 = 2
            if (r1 == r3) goto L49
            goto L4e
        L49:
            java.lang.String r1 = "002Pcbef"
            goto L31
        L4c:
            java.lang.String r2 = "jp"
        L4e:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L6c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L59:
            java.lang.String r0 = com.mob.commons.n.b(r0)
        L5d:
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = b(r4)
            return r4
        L6c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L59
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = com.mob.commons.n.b(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "-"
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.C0744r.a(java.lang.String):java.lang.String");
    }

    public static String a(String str, int i10) {
        int i11 = 0;
        int i12 = 3;
        int parseInt = Integer.parseInt(str.startsWith("00") ? str.substring(2, 3) : str.startsWith("0") ? str.substring(1, 3) : str.substring(0, 3));
        char[] charArray = str.toCharArray();
        int[] iArr = new int[parseInt];
        boolean z10 = true;
        while (i12 < charArray.length) {
            char c10 = charArray[i12];
            if (c10 < 'a') {
                z10 = !z10;
            } else {
                int i13 = c10 - i10;
                if (z10) {
                    iArr[i11] = i13;
                } else {
                    int i14 = i13 * 10;
                    iArr[i11] = i14;
                    i12++;
                    iArr[i11] = (charArray[i12] - i10) + i14;
                }
                int i15 = iArr[i11];
                i11++;
            }
            i12++;
        }
        return d.a(iArr);
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
    }

    public static Context b() {
        try {
            Object c10 = c();
            if (c10 != null) {
                return (Context) ReflectHelper.invokeInstanceMethod(c10, n.b("014@eeYhcBdi+dd*dccdcfceHc)cddbcj"), new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static String b(String str) {
        Uri parse;
        String scheme;
        String str2;
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean checkForceHttps = MobSDK.checkForceHttps();
        if (checkForceHttps || (Build.VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted())) {
            str = str.trim();
            if (str.startsWith(n.b("007bccdeff")) && (parse = Uri.parse(str.trim())) != null && (scheme = parse.getScheme()) != null && scheme.equals(n.b("004bccd"))) {
                String host = parse.getHost();
                String path = parse.getPath();
                String query = parse.getQuery();
                String str3 = "";
                if (host != null) {
                    int port = parse.getPort();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(host);
                    if (port > 0 && port != 80) {
                        str2 = ":" + port;
                        sb2.append(str2);
                        host = sb2.toString();
                        if (!checkForceHttps && Build.VERSION.SDK_INT >= 24 && ((Boolean) ReflectHelper.invokeInstanceMethod(NetworkSecurityPolicy.getInstance(), n.b("027Ycdefffdc!hNcecg!chPck:c;dhcgceegegcdcffg<h,cgRk8cdRcchg"), host)).booleanValue()) {
                            return str;
                        }
                    }
                    str2 = "";
                    sb2.append(str2);
                    host = sb2.toString();
                    if (!checkForceHttps) {
                        return str;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https://");
                sb3.append(host);
                if (path == null) {
                    path = "";
                }
                sb3.append(path);
                if (query != null) {
                    str3 = "?" + query;
                }
                sb3.append(str3);
                return sb3.toString();
            }
        }
        return str;
    }

    public static Object c() {
        final ReflectHelper.a<Void, Object> aVar = new ReflectHelper.a<Void, Object>() { // from class: com.mob.commons.r.1
            @Override // com.mob.tools.utils.ReflectHelper.a
            public Object a(Void r32) {
                try {
                    return ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(n.b("0261cecj0g4cgdbcdDgEdkce(ddJdkdicfWcLcd-i cdPcTchdh$b8cgHh<ce^g")), n.b("021Xcfcbcgcg0h.cj5cHdicf_cNcdUiIcd%c.chdh%bXcgVh,ce?g"), new Object[0]);
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return null;
                }
            }
        };
        Thread.currentThread().getId();
        Looper.getMainLooper().getThread().getId();
        Object a10 = aVar.a(null);
        if (a10 != null) {
            return a10;
        }
        final Object obj = new Object();
        final Object[] objArr = new Object[1];
        synchronized (obj) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.r.2
                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:42:0x001a
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
                    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                    */
                @Override // android.os.Handler.Callback
                public boolean handleMessage(android.os.Message r5) {
                    /*
                        r4 = this;
                        java.lang.Object r5 = r1
                        monitor-enter(r5)
                        r0 = 0
                        java.lang.Object[] r1 = r2     // Catch: java.lang.Throwable -> L20
                        com.mob.tools.utils.ReflectHelper$a r2 = r3     // Catch: java.lang.Throwable -> L20
                        r3 = 0
                        java.lang.Object r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L20
                        r1[r0] = r2     // Catch: java.lang.Throwable -> L20
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L15
                        r1.notify()     // Catch: java.lang.Throwable -> L15
                        goto L34
                    L15:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                    L1a:
                        r2.w(r1)     // Catch: java.lang.Throwable -> L1e
                        goto L34
                    L1e:
                        r0 = move-exception
                        goto L46
                    L20:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L36
                        r2.w(r1)     // Catch: java.lang.Throwable -> L36
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L2e
                        r1.notify()     // Catch: java.lang.Throwable -> L2e
                        goto L34
                    L2e:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                        goto L1a
                    L34:
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
                        return r0
                    L36:
                        r0 = move-exception
                        java.lang.Object r1 = r1     // Catch: java.lang.Throwable -> L3d
                        r1.notify()     // Catch: java.lang.Throwable -> L3d
                        goto L45
                    L3d:
                        r1 = move-exception
                        com.mob.tools.log.NLog r2 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L1e
                        r2.w(r1)     // Catch: java.lang.Throwable -> L1e
                    L45:
                        throw r0     // Catch: java.lang.Throwable -> L1e
                    L46:
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.C0744r.AnonymousClass2.handleMessage(android.os.Message):boolean");
                }
            });
            obj.wait();
        }
        return objArr[0];
    }
}
