package com.mob.commons;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class t {

    /* renamed from: e */
    private static volatile t f8503e;

    /* renamed from: a */
    private volatile String f8504a = null;

    /* renamed from: b */
    private volatile String f8505b = null;

    /* renamed from: c */
    private volatile String f8506c = null;

    /* renamed from: d */
    private volatile String f8507d = null;

    /* renamed from: f */
    private HashMap<String, Integer> f8508f;

    private t() {
    }

    public static t a() {
        if (f8503e == null) {
            synchronized (t.class) {
                if (f8503e == null) {
                    f8503e = new t();
                }
            }
        }
        return f8503e;
    }

    private boolean a(PackageInfo packageInfo) {
        int i10 = packageInfo.applicationInfo.flags;
        return ((i10 & 1) == 1) || ((i10 & 128) == 1);
    }

    private byte[] a(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = (7 - i10) * 8;
            bArr[i10] = (byte) (mostSignificantBits >>> i11);
            bArr[i10 + 8] = (byte) (leastSignificantBits >>> i11);
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056 A[Catch: all -> 0x00af, LOOP:0: B:53:0x0053->B:55:0x0056, LOOP_END, TryCatch #0 {all -> 0x00af, blocks: (B:41:0x0008, B:45:0x001a, B:47:0x0021, B:49:0x0030, B:50:0x0035, B:52:0x003e, B:55:0x0056, B:56:0x005e, B:57:0x0067, B:59:0x006d, B:60:0x007f, B:62:0x0099, B:51:0x0039, B:44:0x0015), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006d A[Catch: all -> 0x00af, LOOP:1: B:57:0x0067->B:59:0x006d, LOOP_END, TryCatch #0 {all -> 0x00af, blocks: (B:41:0x0008, B:45:0x001a, B:47:0x0021, B:49:0x0030, B:50:0x0035, B:52:0x003e, B:55:0x0056, B:56:0x005e, B:57:0x0067, B:59:0x006d, B:60:0x007f, B:62:0x0099, B:51:0x0039, B:44:0x0015), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0099 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:41:0x0008, B:45:0x001a, B:47:0x0021, B:49:0x0030, B:50:0x0035, B:52:0x003e, B:55:0x0056, B:56:0x005e, B:57:0x0067, B:59:0x006d, B:60:0x007f, B:62:0x0099, B:51:0x0039, B:44:0x0015), top: B:67:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key_drds"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto Lb7
            com.mob.commons.w r1 = com.mob.commons.w.a()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r1.a(r0)     // Catch: java.lang.Throwable -> Laf
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L15
            goto L1a
        L15:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
        L1a:
            boolean r2 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> Laf
            r3 = 1
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> Laf
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Laf
            r4 = 100000(0x186a0, float:1.4013E-40)
            if (r2 >= r4) goto L3e
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Laf
        L35:
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> Laf
            goto L3e
        L39:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Laf
            goto L35
        L3e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laf
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Laf
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            com.mob.commons.t$2 r1 = new com.mob.commons.t$2     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.util.Collections.sort(r6, r1)     // Catch: java.lang.Throwable -> Laf
            int r1 = r6.size()     // Catch: java.lang.Throwable -> Laf
        L53:
            r2 = 7
            if (r1 <= r2) goto L5e
            int r2 = r1 + (-1)
            r6.remove(r2)     // Catch: java.lang.Throwable -> Laf
            int r1 = r1 + (-1)
            goto L53
        L5e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> Laf
        L67:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Laf
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Laf
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Laf
            goto L67
        L7f:
            com.mob.commons.w r2 = com.mob.commons.w.a()     // Catch: java.lang.Throwable -> Laf
            r2.a(r0, r1)     // Catch: java.lang.Throwable -> Laf
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Throwable -> Laf
            r5.f8508f = r0     // Catch: java.lang.Throwable -> Laf
            r0 = 3
            int r1 = r6.size()     // Catch: java.lang.Throwable -> Laf
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r1 = 0
        L97:
            if (r1 >= r0) goto Lb7
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> Laf
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Laf
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f8508f     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Laf
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> Laf
            int r1 = r1 + 1
            goto L97
        Laf:
            r6 = move-exception
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
            r0.d(r6)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.t.b(java.lang.String):void");
    }

    private String c(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        String manufacturer = DH.SyncMtd.getManufacturer();
        String model = DH.SyncMtd.getModel();
        if (!TextUtils.isEmpty(manufacturer)) {
            sb2.append(manufacturer.trim().toUpperCase());
        }
        if (!TextUtils.isEmpty(model)) {
            sb2.append(model.trim().toUpperCase());
        }
        return Data.MD5(sb2.toString());
    }

    private String j() {
        StringBuilder a10;
        String uuid;
        if (!TextUtils.isEmpty(h())) {
            a10 = android.support.v4.media.d.a("12");
            uuid = h();
        } else if (!TextUtils.isEmpty(g())) {
            a10 = android.support.v4.media.d.a("22");
            uuid = g();
        } else if (!TextUtils.isEmpty(l())) {
            a10 = android.support.v4.media.d.a("32");
            uuid = this.f8507d;
        } else {
            a10 = android.support.v4.media.d.a("42");
            uuid = UUID.randomUUID().toString();
        }
        a10.append(c(uuid));
        return a10.toString();
    }

    private String k() {
        StringBuilder a10;
        String uuid;
        if (!TextUtils.isEmpty(h())) {
            a10 = android.support.v4.media.d.a("12");
            uuid = h();
        } else {
            a10 = android.support.v4.media.d.a("42");
            uuid = UUID.randomUUID().toString();
        }
        a10.append(c(uuid));
        return a10.toString();
    }

    private String l() {
        DH.requester(MobSDK.getContext()).getOD().request(new DH.DHResponder() { // from class: com.mob.commons.t.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                String od2 = dHResponse.getOD();
                List<String> asList = Arrays.asList("00000000-0000-0000-0000-000000000000", "00000000000000000000000000000000");
                a.c d10 = w.a().d();
                if (d10 != null && d10.g() != null) {
                    asList = d10.g();
                }
                if (TextUtils.isEmpty(od2) || asList.contains(od2)) {
                    return;
                }
                t.this.f8507d = od2;
            }
        });
        return this.f8507d;
    }

    private String m() {
        MediaDrm mediaDrm;
        int i10 = Build.VERSION.SDK_INT;
        final ApplicationInfo[] applicationInfoArr = new ApplicationInfo[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        DH.requester(MobSDK.getContext()).getAInfo().request(new DH.DHResponder() { // from class: com.mob.commons.t.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                applicationInfoArr[0] = dHResponse.getAInfo();
                countDownLatch.countDown();
            }
        });
        String b10 = n.b("0611dcckibBiBhdedhdVh%eghgggEhNcfdk^iGdchdefcf9hCeg]g2ihdkcdeecdebhghdibhgfidkTc<eeckcfckgdebcfebdkdbefeegdWgPfjfkfjcfhdfkfkhghgcffked");
        UUID uuid = new UUID(-1301668207276963122L, -6645017420763422227L);
        MediaDrm mediaDrm2 = null;
        String str = null;
        try {
            mediaDrm = new MediaDrm(uuid);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            countDownLatch.await(80L, TimeUnit.MILLISECONDS);
            if (applicationInfoArr[0] != null) {
                com.mob.tools.a.h.a(MobSDK.getContext(), applicationInfoArr[0].targetSdkVersion).a(mediaDrm.getClass(), mediaDrm, "native_setup", new Class[]{Object.class, byte[].class, String.class}, new Object[]{new WeakReference(mediaDrm), a(uuid), b10});
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                str = Data.byteToHex(propertyByteArray, 0, propertyByteArray.length);
            }
            try {
                if (i10 >= 28) {
                    mediaDrm.close();
                } else {
                    mediaDrm.release();
                }
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
            }
            return str;
        } catch (Throwable th4) {
            th = th4;
            mediaDrm2 = mediaDrm;
            try {
                MobLog.getInstance().d(th);
                throw th;
            } catch (Throwable th5) {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (mediaDrm2 != null) {
                            mediaDrm2.close();
                        }
                    } else if (mediaDrm2 != null) {
                        mediaDrm2.release();
                    }
                } catch (Throwable th6) {
                    MobLog.getInstance().d(th6);
                }
                throw th5;
            }
        }
    }

    private String n() {
        String b10;
        String str = null;
        if (b.a(n.b("003Icedcdc"))) {
            try {
                b10 = w.a().b("key_pddt", (String) null);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (!TextUtils.isEmpty(b10)) {
                    long b11 = w.a().b("key_lgpdt", 0L);
                    long j10 = 604800000;
                    try {
                        j10 = Long.parseLong(String.valueOf(b.a(n.b("006Refchefeece7d"), 604800))) * 1000;
                    } catch (Throwable unused) {
                    }
                    if (System.currentTimeMillis() - b11 < j10) {
                        MobLog.getInstance().d("rddd che p useable", new Object[0]);
                        return b10;
                    }
                }
                if ((!n.b("004iCcd7i]db").equalsIgnoreCase(DH.SyncMtd.getManufacturer()) || Build.VERSION.SDK_INT > 25) && (!n.b("006b$cbceec5hScd").equalsIgnoreCase(DH.SyncMtd.getManufacturer()) || Build.VERSION.SDK_INT > 22)) {
                    List<String> o10 = o();
                    if (!o10.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder();
                        PackageManager packageManager = MobSDK.getContext().getPackageManager();
                        int i10 = 0;
                        for (int i11 = 0; i11 < o10.size(); i11++) {
                            try {
                                String str2 = o10.get(i11);
                                PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                                if (packageInfo != null && a(packageInfo)) {
                                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 1);
                                    sb2.append(str2);
                                    sb2.append(applicationInfo.uid);
                                    i10++;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                MobLog.getInstance().d(e10);
                            }
                        }
                        if (i10 > 0) {
                            String str3 = Build.BRAND;
                            Locale locale = Locale.ROOT;
                            sb2.append(str3.toUpperCase(locale));
                            sb2.append(Build.MODEL.toUpperCase(locale));
                            sb2.append(Build.MANUFACTURER.toUpperCase(locale));
                            sb2.append(i10);
                            b10 = Data.MD5(sb2.toString());
                            w.a().a("key_pddt", b10);
                            w.a().a("key_lgpdt", System.currentTimeMillis());
                        }
                    }
                    return b10;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                str = b10;
                MobLog.getInstance().d(th);
                return str;
            }
        }
        return null;
    }

    private List<String> o() {
        ArrayList arrayList = new ArrayList();
        for (String str : com.mob.tools.a.b.a(MobSDK.getContext()).G()) {
            if (!str.contains("com.google.android") && !str.contains("com.miui.packageinstaller")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.f8505b)) {
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = android.support.v4.media.d.a("rddd saveRD pre is ");
            a10.append(this.f8505b);
            a10.append(" cur is ");
            a10.append(str);
            mobLog.d(a10.toString(), new Object[0]);
            w.a().a("key_rdt2", str);
        }
    }

    public String b() {
        return "2";
    }

    public String c() {
        if (TextUtils.isEmpty(this.f8505b)) {
            String b10 = w.a().b("key_rdt2", (String) null);
            if (!TextUtils.isEmpty(b10)) {
                this.f8505b = b10;
            }
        }
        return this.f8505b;
    }

    public boolean d() {
        if (TextUtils.isEmpty(this.f8505b)) {
            synchronized (this) {
                if (TextUtils.isEmpty(this.f8505b)) {
                    return TextUtils.isEmpty(w.a().b("key_rdt2", (String) null));
                }
                return false;
            }
        }
        return false;
    }

    public synchronized String e() {
        String c10;
        c10 = c();
        if (TextUtils.isEmpty(c10)) {
            c10 = j();
            this.f8505b = c10;
            if (!TextUtils.isEmpty(c10)) {
                w.a().a("key_rdt2", c10);
            }
        }
        return c10;
    }

    public synchronized String f() {
        String c10;
        c10 = c();
        if (TextUtils.isEmpty(c10)) {
            c10 = k();
            this.f8505b = c10;
            if (!TextUtils.isEmpty(c10)) {
                w.a().a("key_rdt2", c10);
            }
        }
        return c10;
    }

    public synchronized String g() {
        if (TextUtils.isEmpty(this.f8506c)) {
            this.f8506c = n();
        }
        return this.f8506c;
    }

    public synchronized String h() {
        if (TextUtils.isEmpty(this.f8504a)) {
            this.f8504a = m();
            b(this.f8504a);
        }
        return this.f8504a;
    }

    public HashMap<String, Integer> i() {
        return this.f8508f;
    }
}
