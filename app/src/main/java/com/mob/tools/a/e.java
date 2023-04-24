package com.mob.tools.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class e implements j {

    /* renamed from: a */
    private Context f8643a;

    /* renamed from: b */
    private Object f8644b;

    /* renamed from: c */
    private PackageManager f8645c;

    /* renamed from: d */
    private ConcurrentHashMap<String, Object> f8646d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private ConcurrentHashMap<String, Integer> f8647e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private ConcurrentHashMap<String, Long> f8648f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private String f8649g;

    /* loaded from: classes.dex */
    public static abstract class a<T> {

        /* renamed from: a */
        private T f8656a;

        /* renamed from: b */
        private long f8657b;

        /* renamed from: d */
        public int f8658d;

        public a(T t10) {
            this(t10, 0L);
        }

        public a(T t10, int i10, long j10) {
            this.f8656a = t10;
            this.f8658d = i10;
            this.f8657b = j10;
        }

        public a(T t10, long j10) {
            this(t10, 1, j10);
        }

        public abstract T b();
    }

    public e(Context context) {
        this.f8643a = context;
        String packageName = context.getPackageName();
        this.f8649g = packageName;
        try {
            a(packageName, 193);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private <T> T a(String str, a<T> aVar) {
        return (T) a(str, aVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T a(java.lang.String r10, com.mob.tools.a.e.a<T> r11, boolean r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L9
            java.lang.Object r10 = r11.b()     // Catch: java.lang.Throwable -> L88
            goto L91
        L9:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = r9.f8647e     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L2a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = r9.f8646d     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r2.get(r10)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L2a
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L88
            int r3 = r11.f8658d     // Catch: java.lang.Throwable -> L88
            if (r2 < r3) goto L2a
            if (r12 != 0) goto L2a
            java.lang.Object r10 = com.mob.tools.a.e.a.a(r11)     // Catch: java.lang.Throwable -> L88
            return r10
        L2a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r9.f8648f     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L88
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L88
            long r7 = r2.longValue()     // Catch: java.lang.Throwable -> L88
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L43
            r3 = 1
        L43:
            if (r0 == 0) goto L49
            if (r3 != 0) goto L49
            if (r12 == 0) goto L90
        L49:
            java.lang.Object r0 = r11.b()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L70
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r12 = r9.f8646d     // Catch: java.lang.Throwable -> L88
            r12.put(r10, r0)     // Catch: java.lang.Throwable -> L88
            long r2 = com.mob.tools.a.e.a.b(r11)     // Catch: java.lang.Throwable -> L88
            r5 = 0
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 <= 0) goto L70
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r12 = r9.f8648f     // Catch: java.lang.Throwable -> L88
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L88
            long r5 = com.mob.tools.a.e.a.b(r11)     // Catch: java.lang.Throwable -> L88
            long r2 = r2 + r5
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L88
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> L88
        L70:
            if (r1 != 0) goto L7c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r12 = r9.f8647e     // Catch: java.lang.Throwable -> L88
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L88
        L78:
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L88
            goto L90
        L7c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r12 = r9.f8647e     // Catch: java.lang.Throwable -> L88
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L88
            int r1 = r1 + r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L88
            goto L78
        L88:
            r10 = move-exception
            com.mob.tools.log.NLog r12 = com.mob.tools.MobLog.getInstance()
            r12.d(r10)
        L90:
            r10 = r0
        L91:
            if (r10 != 0) goto L97
            java.lang.Object r10 = com.mob.tools.a.e.a.a(r11)
        L97:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.e.a(java.lang.String, com.mob.tools.a.e$a, boolean):java.lang.Object");
    }

    @Override // com.mob.tools.a.j
    public PackageInfo a(final String str, final int i10) {
        if (this.f8645c == null) {
            this.f8645c = this.f8643a.getPackageManager();
        }
        if (str.equals(this.f8649g)) {
            final int i11 = (i10 == 0 || i10 == 1 || i10 == 128 || i10 == 64) ? 193 : i10;
            PackageInfo packageInfo = (PackageInfo) a("gpisys-" + str + "-" + i11, new a<PackageInfo>(null) { // from class: com.mob.tools.a.e.1
                @Override // com.mob.tools.a.e.a
                /* renamed from: a */
                public PackageInfo b() {
                    return e.this.f8645c.getPackageInfo(str, i11);
                }
            });
            if (packageInfo == null && i11 == 193) {
                return (PackageInfo) a("gpisys-" + str + "-" + i10, new a<PackageInfo>(null) { // from class: com.mob.tools.a.e.2
                    @Override // com.mob.tools.a.e.a
                    /* renamed from: a */
                    public PackageInfo b() {
                        return e.this.f8645c.getPackageInfo(str, i10);
                    }
                });
            }
            return packageInfo;
        }
        return this.f8645c.getPackageInfo(str, i10);
    }

    @Override // com.mob.tools.a.j
    public String a(String str) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(n.b("027Ocecj0gOcgdbcd%g8dkdbefdkdgchef3chk4fgcgdb=dh9cg)c$cd_h3ef")), n.b("003FeeEhc"), str);
            return invokeStaticMethod != null ? String.valueOf(invokeStaticMethod) : "";
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    @Override // com.mob.tools.a.j
    public String a(String str, String str2) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(n.b("027<cecjBgXcgdbcd6g8dkdbefdkdgchefIchk@fgcgdb,dhAcgPcXcdLh@ef")), n.b("003+ee-hc"), str, str2);
            if (invokeStaticMethod != null) {
                return String.valueOf(invokeStaticMethod);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.j
    public Enumeration<NetworkInterface> a() {
        try {
            return NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.j
    public Enumeration<InetAddress> a(NetworkInterface networkInterface) {
        try {
            return (Enumeration) ReflectHelper.invokeInstanceMethod(networkInterface, "getInetAddresses", new Object[0]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.j
    public List<ResolveInfo> a(Intent intent, int i10) {
        try {
            return (List) ReflectHelper.invokeInstanceMethod(this.f8643a.getPackageManager(), n.b("019j$cbJhPcgchdfcj3chYcj]c=dg-h.cg^i9cdcf5hGef"), new Object[]{intent, Integer.valueOf(i10)}, new Class[]{Intent.class, Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.j
    public int b() {
        try {
            if (this.f8644b == null) {
                this.f8644b = b("phone");
            }
            return ((Integer) ReflectHelper.invokeInstanceMethod(this.f8644b, n.b("014Bee<hc9deXhcDecdbcgcidhchQdh"), new Object[0])).intValue();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    @Override // com.mob.tools.a.j
    public ApplicationInfo b(String str, int i10) {
        if (this.f8645c == null) {
            this.f8645c = this.f8643a.getPackageManager();
        }
        return this.f8645c.getApplicationInfo(str, i10);
    }

    @Override // com.mob.tools.a.j
    public ResolveInfo b(Intent intent, int i10) {
        try {
            return (ResolveInfo) ReflectHelper.invokeInstanceMethod(this.f8643a.getPackageManager(), n.b("015CcgLhPefdbdc(ihXdicf-c@cdZi$cdScYch"), new Object[]{intent, Integer.valueOf(i10)}, new Class[]{Intent.class, Integer.TYPE});
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public Object b(String str) {
        try {
            return this.f8643a.getSystemService(str);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    @Override // com.mob.tools.a.j
    public int c() {
        try {
            if (Build.VERSION.SDK_INT < 24 || !c.a(this.f8643a).b().h(n.b("035Ncecj-g$cgdbcd_g%dkQdh<cgKkXcdefefcddbcjdkfdfcdiehccfggcekdefcccdgdhdidhfc"))) {
                return -1;
            }
            if (this.f8644b == null) {
                this.f8644b = b("phone");
            }
            return ((Integer) ReflectHelper.invokeInstanceMethod(this.f8644b, n.b("0182eeVhc!ehceHc[cedeThcKecdbcgcidhch+dh"), new Object[0])).intValue();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    @Override // com.mob.tools.a.j
    public ApplicationInfo d() {
        return this.f8643a.getApplicationInfo();
    }
}
