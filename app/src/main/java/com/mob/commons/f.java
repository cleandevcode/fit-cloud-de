package com.mob.commons;

import android.os.Message;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private static final String f8401a = com.mob.commons.a.d.a("004Mfm7i'ejfe");

    /* renamed from: b */
    private static f f8402b;

    /* renamed from: c */
    private NetCommunicator f8403c;

    /* renamed from: f */
    private String f8406f;

    /* renamed from: h */
    private Runnable f8408h;

    /* renamed from: d */
    private SimpleDateFormat f8404d = new SimpleDateFormat(com.mob.commons.a.d.a("0254ejejejejijhjhjij[ii1jdieie:gmmg7ghghfmfififijdhd"));

    /* renamed from: e */
    private HashMap<String, Object> f8405e = new HashMap<>();

    /* renamed from: g */
    private int f8407g = -1;

    private f() {
        this.f8406f = null;
        try {
            this.f8406f = UUID.randomUUID().toString();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        this.f8408h = new com.mob.tools.utils.e() { // from class: com.mob.commons.f.1
            @Override // com.mob.tools.utils.e
            public void a() {
                if (b.c()) {
                    f.this.c();
                }
            }
        };
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (f8402b == null) {
                f8402b = new f();
            }
            fVar = f8402b;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0033 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:69:0x002f, B:71:0x0033, B:75:0x003f), top: B:89:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:69:0x002f, B:71:0x0033, B:75:0x003f), top: B:89:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.Throwable r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            r1 = 0
            r2 = r5
        L7:
            if (r2 == 0) goto L13
            boolean r3 = r2 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto Le
            return r0
        Le:
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L2e
            goto L7
        L13:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r5.printStackTrace(r1)     // Catch: java.lang.Throwable -> L2b
            r1.flush()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            r0.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r5
        L2b:
            r5 = move-exception
            r1 = r0
            goto L2f
        L2e:
            r5 = move-exception
        L2f:
            boolean r0 = r5 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L3f
            java.lang.String r5 = "023DggLje9fi,e1egehekfjeiegeh6j(fiEeIeiefelggjdfdfd!m"
            java.lang.String r5 = com.mob.commons.a.d.a(r5)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r5
        L3f:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L48
        L48:
            return r5
        L49:
            r5 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.f.a(java.lang.Throwable):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void a(int i10, Throwable th2, String str, boolean z10) {
        if (th2 == null) {
            MobLog.getInstance().d(str, new Object[0]);
        } else {
            MobLog.getInstance().d(th2);
        }
        if (e.a()) {
            return;
        }
        final Message message = new Message();
        message.what = 1;
        message.arg1 = z10 ? 1 : 0;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(System.currentTimeMillis());
        if (th2 == null) {
            th2 = str;
        }
        objArr[1] = th2;
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Integer.valueOf(b());
        message.obj = objArr;
        u.f8517d.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.f.2
            @Override // com.mob.tools.utils.e
            public void a() {
                f.this.a(message);
            }
        });
    }

    public void a(Message message) {
        String valueOf;
        if (this.f8405e.size() > 10) {
            c(this.f8405e);
            this.f8405e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f8405e.put("saa", Integer.valueOf(message.arg1));
        this.f8405e.put(com.mob.commons.a.d.a("0025gh1i"), this.f8406f);
        ArrayList arrayList = (ArrayList) this.f8405e.get(com.mob.commons.a.d.a("004-feefgh>e"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.a.d.a("002+ehWe"), objArr[0]);
        Object obj = objArr[1];
        if (obj instanceof Throwable) {
            valueOf = a((Throwable) obj);
        } else {
            valueOf = String.valueOf(obj);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            valueOf = valueOf.replaceAll("\r\n\t", " ").replaceAll("\n\t", " ").replaceAll("\n", " ");
        }
        String a10 = com.mob.commons.a.d.a("002m'gg");
        StringBuilder a11 = android.support.v4.media.d.a("[");
        a11.append(this.f8404d.format(objArr[0]));
        a11.append("][");
        a11.append(objArr[2]);
        a11.append("][");
        a11.append(objArr[3]);
        a11.append("] ");
        a11.append(valueOf);
        hashMap.put(a10, a11.toString());
        hashMap.put(com.mob.commons.a.d.a("002je"), objArr[2]);
        hashMap.put(com.mob.commons.a.d.a("002fOfd"), objArr[3]);
        arrayList.add(hashMap);
        this.f8405e.put(com.mob.commons.a.d.a("004[feefgh@e"), arrayList);
        if (e.a()) {
            return;
        }
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder() { // from class: com.mob.commons.f.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                com.mob.commons.a.d.a().b(!dHResponse.checkNetworkAvailable() ? 120L : 10L, f.this.f8408h);
            }
        });
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            return b(hashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            try {
                return b(hashMap);
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
                return false;
            }
        }
    }

    private synchronized int b() {
        return this.f8407g;
    }

    private boolean b(HashMap<String, Object> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return true;
        }
        HashMap<String, Object> f10 = q.f();
        f10.put(com.mob.commons.a.d.a("006j,eieifdeigh"), hashMap);
        d();
        String str = c.a(c.f8286f) + com.mob.commons.a.d.a("004hiXeife");
        if ("1".equals(String.valueOf(hashMap.get("saa")))) {
            str = c.a("sdrl") + "/sdrl";
        }
        HashMap hashMap2 = (HashMap) this.f8403c.requestSynchronized(f10, str, false);
        return hashMap2 == null || hashMap2.isEmpty();
    }

    public void c() {
        boolean z10;
        File[] listFiles;
        if (this.f8405e.size() > 0) {
            z10 = a(this.f8405e);
            if (!z10) {
                c(this.f8405e);
            }
            this.f8405e.clear();
        } else {
            z10 = true;
        }
        if (z10) {
            File e10 = e();
            if (!e10.exists() || !e10.isDirectory() || (listFiles = e10.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                if (a((HashMap) ResHelper.readObjectFromFile(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private void c(HashMap<String, Object> hashMap) {
        try {
            d(hashMap);
        } catch (Throwable th2) {
            try {
                d(hashMap);
            } catch (Throwable unused) {
                MobLog.getInstance().d(th2);
            }
        }
    }

    private void d() {
        if (this.f8403c == null) {
            this.f8403c = new NetCommunicator(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private void d(HashMap<String, Object> hashMap) {
        File[] listFiles;
        File e10 = e();
        if (!e10.exists() || !e10.isDirectory()) {
            e10.delete();
            e10.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        String str = f8401a;
        sb2.append(str);
        sb2.append("_");
        int i10 = 0;
        sb2.append(0);
        File file = new File(e10, sb2.toString());
        if (file.exists() && (listFiles = e10.listFiles()) != null && listFiles.length > 0) {
            file = new File(e10, str + "_0");
            while (file.exists()) {
                i10++;
                file = new File(e10, f8401a + "_" + i10);
            }
        }
        ResHelper.saveObjectToFile(file.getPath(), hashMap);
    }

    private File e() {
        return new File(ResHelper.getDataCache(MobSDK.getContext()), f8401a);
    }

    public synchronized void a(int i10, Throwable th2) {
        a(i10, th2, null, true);
    }
}
