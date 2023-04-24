package a0;

import a0.b0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import s.a0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e */
    public int f40e;

    /* renamed from: a */
    public final StringBuilder f36a = new StringBuilder();

    /* renamed from: b */
    public final Object f37b = new Object();

    /* renamed from: d */
    public final HashMap f39d = new HashMap();

    /* renamed from: c */
    public final int f38c = 1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public b0.a f41a = null;

        /* renamed from: b */
        public final Executor f42b;

        /* renamed from: c */
        public final b f43c;

        public a(c0.g gVar, a0.b bVar) {
            this.f42b = gVar;
            this.f43c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public d0() {
        synchronized ("mLock") {
            this.f40e = 1;
        }
    }

    public final void a() {
        boolean z10;
        String str;
        if (y.u0.e("CameraStateRegistry")) {
            this.f36a.setLength(0);
            this.f36a.append("Recalculating open cameras:\n");
            this.f36a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f36a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f39d.entrySet()) {
            if (y.u0.e("CameraStateRegistry")) {
                if (((a) entry.getValue()).f41a != null) {
                    str = ((a) entry.getValue()).f41a.toString();
                } else {
                    str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                }
                this.f36a.append(String.format(Locale.US, "%-45s%-22s\n", ((y.g) entry.getKey()).toString(), str));
            }
            b0.a aVar = ((a) entry.getValue()).f41a;
            if (aVar != null && aVar.f28a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10++;
            }
        }
        if (y.u0.e("CameraStateRegistry")) {
            this.f36a.append("-------------------------------------------------------------------\n");
            this.f36a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f38c)));
            y.u0.a("CameraStateRegistry", this.f36a.toString());
        }
        this.f40e = Math.max(this.f38c - i10, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:45:0x0003, B:47:0x001a, B:49:0x0037, B:53:0x003e, B:54:0x0050, B:56:0x0054, B:58:0x0058, B:66:0x0069, B:68:0x0071, B:72:0x0080, B:74:0x0096, B:75:0x0099, B:65:0x0064), top: B:80:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:45:0x0003, B:47:0x001a, B:49:0x0037, B:53:0x003e, B:54:0x0050, B:56:0x0054, B:58:0x0058, B:66:0x0069, B:68:0x0071, B:72:0x0080, B:74:0x0096, B:75:0x0099, B:65:0x0064), top: B:80:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(y.g r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f37b
            monitor-enter(r0)
            java.util.HashMap r1 = r9.f39d     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            a0.d0$a r1 = (a0.d0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            s.h1.i(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = y.u0.e(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L50
            java.lang.StringBuilder r2 = r9.f36a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f36a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f40e     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 2
            a0.b0$a r8 = r1.f41a     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto L3d
            boolean r8 = r8.f28a     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto L3d
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            r10 = 3
            a0.b0$a r8 = r1.f41a     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L50:
            int r10 = r9.f40e     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L64
            a0.b0$a r10 = r1.f41a     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L5e
            boolean r10 = r10.f28a     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L5e
            r10 = 1
            goto L5f
        L5e:
            r10 = 0
        L5f:
            if (r10 == 0) goto L62
            goto L64
        L62:
            r10 = 0
            goto L69
        L64:
            a0.b0$a r10 = a0.b0.a.f21c     // Catch: java.lang.Throwable -> L9b
            r1.f41a = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 1
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = y.u0.e(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f36a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r4[r3] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f36a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            y.u0.a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.a()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d0.b(y.g):boolean");
    }
}
