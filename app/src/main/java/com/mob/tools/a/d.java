package com.mob.tools.a;

import android.content.Context;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0744r;
import com.mob.commons.o;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static d f8631a = null;

    /* renamed from: e */
    private static volatile boolean f8632e = false;

    /* renamed from: b */
    private Context f8633b;

    /* renamed from: c */
    private volatile String f8634c;

    /* renamed from: d */
    private HashMap<String, Object> f8635d;

    /* renamed from: h */
    private volatile File f8638h;

    /* renamed from: f */
    private byte[] f8636f = new byte[0];

    /* renamed from: g */
    private AtomicBoolean f8637g = new AtomicBoolean(false);

    /* renamed from: i */
    private ConcurrentLinkedQueue<CountDownLatch> f8639i = new ConcurrentLinkedQueue<>();

    /* renamed from: j */
    private volatile String f8640j = null;

    private d(Context context) {
        this.f8633b = context;
    }

    public static d a(Context context) {
        if (f8631a == null) {
            synchronized (d.class) {
                if (f8631a == null) {
                    f8631a = new d(context);
                }
            }
        }
        return f8631a;
    }

    public static /* synthetic */ String a(d dVar, String str) {
        dVar.f8634c = str;
        return str;
    }

    public String a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("#")) == null || split.length != 2) {
            return null;
        }
        return split[0];
    }

    public static /* synthetic */ HashMap a(d dVar, File file) {
        return dVar.a(file);
    }

    public HashMap<String, Object> a(File file) {
        String fromHashMap = HashonHelper.fromHashMap(new HashMap());
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f8635d == null) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            this.f8635d = hashMap2;
            hashMap2.put("cacheMap", new ConcurrentHashMap());
            this.f8635d.put("invokeTimesMap", new ConcurrentHashMap());
            this.f8635d.put("expireTimeMap", new ConcurrentHashMap());
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.mob.commons.cc.a.a(MobSDK.getContext(), file.getAbsolutePath(), fromHashMap, hashMap, this.f8635d);
            MobLog.getInstance().d(TextUtils.isEmpty(null) ? String.format("dhs l %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)) : null, new Object[0]);
        } catch (Throwable th2) {
            try {
                r3 = "dhs l e: " + th2.getMessage();
                com.mob.commons.f.a().a(6, th2);
                MobLog.getInstance().d(th2);
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(r3)) {
                r3 = String.format("dhs l %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            MobLog.getInstance().d(r3, new Object[0]);
        }
        return hashMap;
    }

    public static /* synthetic */ boolean a(d dVar, String str, File file) {
        return dVar.a(str, file);
    }

    public boolean a(String str, File file) {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str) && file != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                MobLog.getInstance().d("dhs d...", new Object[0]);
                new NetworkHelper().download(str, fileOutputStream, null);
                MobLog.getInstance().d(TextUtils.isEmpty(null) ? String.format("dhs d %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)) : null, new Object[0]);
                C0744r.a(fileOutputStream);
                return true;
            } catch (Throwable th3) {
                th = th3;
                try {
                    r1 = "dhs d e: " + th.getMessage();
                    MobLog.getInstance().d(th);
                    if (TextUtils.isEmpty(r1)) {
                        r1 = String.format("dhs d %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                    MobLog.getInstance().d(r1, new Object[0]);
                    C0744r.a(fileOutputStream);
                    return false;
                } catch (Throwable th4) {
                    if (TextUtils.isEmpty(r1)) {
                        r1 = String.format("dhs d %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                    MobLog.getInstance().d(r1, new Object[0]);
                    C0744r.a(fileOutputStream);
                    throw th4;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean a(boolean z10) {
        f8632e = z10;
        return z10;
    }

    public static /* synthetic */ byte[] a(d dVar) {
        return dVar.f8636f;
    }

    public static /* synthetic */ File b(d dVar, File file) {
        dVar.f8638h = file;
        return file;
    }

    public static /* synthetic */ String b(d dVar) {
        return dVar.e();
    }

    public String b(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("#")) == null || split.length != 2) {
            return null;
        }
        return split[1];
    }

    public static boolean b() {
        return f8632e;
    }

    public static /* synthetic */ boolean b(d dVar, String str) {
        return dVar.d(str);
    }

    public File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ResHelper.getDataCacheFile(this.f8633b, str);
    }

    public static /* synthetic */ String c(d dVar) {
        return dVar.f8634c;
    }

    public static /* synthetic */ String c(d dVar, String str) {
        return dVar.a(str);
    }

    public static /* synthetic */ File d(d dVar, String str) {
        return dVar.c(str);
    }

    public static /* synthetic */ AtomicBoolean d(d dVar) {
        return dVar.f8637g;
    }

    public static /* synthetic */ boolean d() {
        return f8632e;
    }

    public boolean d(String str) {
        return (TextUtils.isEmpty(a(str)) || TextUtils.isEmpty(b(str))) ? false : true;
    }

    public String e() {
        try {
            String str = (String) com.mob.commons.b.b(o.a("002Jfgfg"), (Object) null);
            return str == null ? (String) com.mob.commons.b.b(o.a("009Pfgfcdhehfdde+dRdg<c"), (Object) null) : str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public static /* synthetic */ String e(d dVar) {
        return dVar.f8640j;
    }

    public static /* synthetic */ String e(d dVar, String str) {
        return dVar.b(str);
    }

    public static /* synthetic */ File f(d dVar) {
        return dVar.f8638h;
    }

    public static /* synthetic */ String f(d dVar, String str) {
        dVar.f8640j = str;
        return str;
    }

    public static /* synthetic */ Context g(d dVar) {
        return dVar.f8633b;
    }

    public static /* synthetic */ ConcurrentLinkedQueue h(d dVar) {
        return dVar.f8639i;
    }

    public CountDownLatch a() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("dhs ofr: " + countDownLatch, new Object[0]);
            this.f8639i.offer(countDownLatch);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        u.f8519f.execute(new Runnable() { // from class: com.mob.tools.a.d.1
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:171:0x02b2
                	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
                	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    Method dump skipped, instructions count: 850
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.a.d.AnonymousClass1.run():void");
            }
        });
        return countDownLatch;
    }

    public CountDownLatch c() {
        ConcurrentLinkedQueue<CountDownLatch> concurrentLinkedQueue = this.f8639i;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        try {
            return this.f8639i.peek();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }
}
