package com.mob.commons;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.widget.u0;
import com.mob.MobSDK;
import com.mob.commons.clt.AtClt;
import com.mob.commons.clt.BSClt;
import com.mob.commons.clt.DEClt;
import com.mob.commons.clt.DEVClt;
import com.mob.commons.clt.DLClt;
import com.mob.commons.clt.LClt;
import com.mob.commons.clt.LOClt;
import com.mob.commons.clt.PClt;
import com.mob.commons.clt.PSClt;
import com.mob.commons.clt.PaClt;
import com.mob.commons.clt.SMClt;
import com.mob.commons.clt.VplClt;
import com.mob.commons.clt.WClt;
import com.mob.commons.clt.WLClt;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c */
    private static AtomicBoolean f8256c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f8257d = new AtomicBoolean(false);

    /* renamed from: e */
    private static AtomicBoolean f8258e = new AtomicBoolean(false);

    /* renamed from: f */
    private static volatile HashMap<String, Object> f8259f = null;

    /* renamed from: a */
    public static volatile HashSet<Class<? extends com.mob.commons.a.a>> f8254a = new HashSet<>();

    /* renamed from: g */
    private static ConcurrentHashMap<String, Object> f8260g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static ConcurrentHashMap<String, Object> f8261h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static CountDownLatch f8262i = new CountDownLatch(1);

    /* renamed from: j */
    private static CountDownLatch f8263j = new CountDownLatch(1);

    /* renamed from: b */
    public static volatile boolean f8255b = false;

    /* renamed from: k */
    private static volatile boolean f8264k = false;

    public static <T> T a(String str, T t10) {
        if (TextUtils.isEmpty(str) || f8259f == null) {
            return t10;
        }
        if (b(f8259f)) {
            f8259f.clear();
            f8259f = new HashMap<>();
            c(2);
        }
        return (T) ResHelper.forceCast(f8259f.get(str), t10);
    }

    private static <T> T a(HashMap<String, Object> hashMap, String str, T t10) {
        return (TextUtils.isEmpty(str) || b(hashMap) || !a(hashMap)) ? t10 : (T) ResHelper.forceCast(hashMap.get(str), t10);
    }

    private static void a(Object obj) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(i.a("004FgffghiOf"), obj);
            File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), i.a("005>gn>nUfigffg"));
            ResHelper.saveObjectToFile(dataCacheFile.getPath(), Data.AES128Encode(i.a("016)inimlelkjgkgkjiljjhgfhhefi6j?hjfg"), HashonHelper.fromHashMap(hashMap)));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private static void a(HashMap<String, Object> hashMap, boolean z10) {
        CountDownLatch countDownLatch;
        f8259f = new HashMap<>();
        if (hashMap != null) {
            f8259f.putAll(hashMap);
        }
        try {
            if (z10) {
                f8262i.countDown();
                countDownLatch = f8263j;
            } else {
                countDownLatch = f8262i;
            }
            countDownLatch.countDown();
        } catch (Throwable unused) {
        }
    }

    public static void a(CountDownLatch countDownLatch) {
        b(countDownLatch);
    }

    private static void a(final boolean z10, final boolean z11, final boolean z12, final int i10) {
        new com.mob.tools.utils.f(u0.a("PY-B", i10)) { // from class: com.mob.commons.b.3
            @Override // com.mob.tools.utils.f
            public void a() {
                NLog mobLog = MobLog.getInstance();
                StringBuilder a10 = android.support.v4.media.d.a("b enter:");
                a10.append(Process.myPid());
                a10.append(", lbms: ");
                a10.append(b.f8264k);
                a10.append(", fc");
                a10.append(z10);
                a10.append(", ol: ");
                a10.append(z11);
                a10.append(", gf: ");
                a10.append(z12);
                a10.append(", in: ");
                a10.append(i10);
                mobLog.d(a10.toString(), new Object[0]);
                if (!b.f8264k) {
                    NLog mobLog2 = MobLog.getInstance();
                    StringBuilder a11 = android.support.v4.media.d.a("b lk st: ");
                    a11.append(Process.myPid());
                    mobLog2.d(a11.toString(), new Object[0]);
                    l.a(l.a(l.f8438f), new k() { // from class: com.mob.commons.b.3.1
                        @Override // com.mob.commons.k
                        public boolean a(FileLocker fileLocker) {
                            boolean unused = b.f8264k = true;
                            NLog mobLog3 = MobLog.getInstance();
                            StringBuilder a12 = android.support.v4.media.d.a("b lk: ");
                            a12.append(Process.myPid());
                            a12.append(", proc st");
                            mobLog3.d(a12.toString(), new Object[0]);
                            long currentTimeMillis = System.currentTimeMillis();
                            b.c(z11);
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (!z10 || z12) {
                                b.b(i10);
                            }
                            NLog mobLog4 = MobLog.getInstance();
                            StringBuilder a13 = android.support.v4.media.d.a("b lk: ");
                            a13.append(Process.myPid());
                            a13.append(", proc ed, dur: ");
                            a13.append(System.currentTimeMillis() - currentTimeMillis);
                            a13.append(", release: n");
                            mobLog4.d(a13.toString(), new Object[0]);
                            Looper.prepare();
                            Looper.loop();
                            return true;
                        }
                    });
                    return;
                }
                NLog mobLog3 = MobLog.getInstance();
                StringBuilder a12 = android.support.v4.media.d.a("b lked already: ");
                a12.append(Process.myPid());
                mobLog3.d(a12.toString(), new Object[0]);
                b.c(z11);
                if (!z10 || z12) {
                    b.b(i10);
                }
            }
        }.start();
    }

    public static boolean a() {
        return ((Integer) a(i.a("002f2ge"), 0)).intValue() == 0;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a() && b() && ((Integer) a(str, 0)).intValue() != 0;
    }

    private static boolean a(HashMap<String, Object> hashMap) {
        return hashMap == null || ((Integer) ResHelper.forceCast(hashMap.get(i.a("002fYge")), 0)).intValue() == 0;
    }

    public static <T> T b(String str, T t10) {
        if (TextUtils.isEmpty(str)) {
            return t10;
        }
        return (T) a(f8259f != null ? f8259f : HashonHelper.fromJson(w.a().b()), str, t10);
    }

    public static HashMap<String, Object> b(DH.DHResponse dHResponse) {
        try {
            if (dHResponse.checkNetworkAvailable()) {
                String packageName = DH.SyncMtd.getPackageName();
                HashMap<String, Object> a10 = q.a(dHResponse.getDetailNetworkTypeForStatic());
                String appkey = MobSDK.getAppkey();
                a10.put(i.a("0068fh>gg:fl_k6fk"), appkey);
                a10.put(i.a("006Tfh^ggg9flhh"), packageName);
                int i10 = 1;
                a10.put(i.a("0038fhhhhi"), String.valueOf(dHResponse.isPackageInstalled(new int[0]) ? 1 : -1));
                a10.put(i.a("002fAhi"), String.valueOf(System.currentTimeMillis()));
                int privacyGrantedStatus = MobSDK.getPrivacyGrantedStatus();
                if (privacyGrantedStatus != -1) {
                    a10.put(i.a("0092fghiglhhfj6kkAijDg"), String.valueOf(privacyGrantedStatus == 1));
                }
                a10.put(i.a("002l_kg"), String.valueOf(MobSDK.checkV6() ? 1 : -1));
                a10.put(i.a("002Efefi"), String.valueOf(dHResponse.checkUA() ? 1 : 0));
                a10.put(i.a("002+fe(j"), String.valueOf(dHResponse.usbEnable() ? 1 : 0));
                a10.put(i.a("002jl"), String.valueOf(dHResponse.devEnable() ? 1 : 0));
                a10.put(i.a("002lg"), String.valueOf(dHResponse.vpn() ? 1 : 0));
                a10.put(i.a("002RhfNg"), String.valueOf(dHResponse.isWifiProxy() ? 1 : 0));
                a10.put(i.a("002XfjRf"), String.valueOf(dHResponse.isRooted() ? 1 : 0));
                a10.put(i.a("002Rfn7g"), String.valueOf(dHResponse.cx() ? 1 : 0));
                String a11 = i.a("002_fh^j");
                if (!dHResponse.debugable()) {
                    i10 = 0;
                }
                a10.put(a11, String.valueOf(i10));
                String httpGet = new NetworkHelper().httpGet(c.a(c.f8282b) + i.a("007il=jgIiMhhfihj"), a10, NetCommunicator.getCommonDefaultHeaders());
                HashMap fromJson = HashonHelper.fromJson(httpGet);
                if (fromJson == null) {
                    return null;
                }
                if (!"200".equals(String.valueOf(fromJson.get(i.a("0067hi]f]fh>fFfehi"))))) {
                    throw new Throwable("RS is illegal: " + httpGet);
                }
                byte[] rawMD5 = Data.rawMD5((appkey + ":" + packageName + ":" + fromJson.get(i.a("009fZfgKnkThi[f]fh0ng"))).getBytes("utf-8"));
                String str = (String) ResHelper.forceCast(fromJson.get(i.a("002;hifi")));
                if (str == null) {
                    throw new Throwable("RS is illegal: " + httpGet);
                }
                String str2 = new String(Data.AES128Decode(rawMD5, Base64.decode(str, 2)), "utf-8");
                NLog mobLog = MobLog.getInstance();
                mobLog.d("sw: " + str2, new Object[0]);
                HashMap<String, Object> fromJson2 = HashonHelper.fromJson(str2);
                if (fromJson2 == null || fromJson2.isEmpty()) {
                    throw new Throwable("RS is illegal: " + httpGet);
                }
                fromJson2.put(i.a("010jkl)fgfi9kEgkfg4nk"), Long.valueOf(SystemClock.elapsedRealtime()));
                w.a().b(str2);
                w.a().a(w.f8552u, System.currentTimeMillis());
                a(fromJson2.remove(i.a("011.fggfgf,k)hhfhgfikfhfihi")));
                return fromJson2;
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            try {
                w.a().b(null);
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    public static void b(int i10) {
        MobLog.getInstance().d("b ob st", new Object[0]);
        if (a() && b()) {
            final String str = (String) a("sbr", (Object) null);
            if (TextUtils.isEmpty(str)) {
                k();
            } else if (i10 == 3 || f8257d.compareAndSet(false, true)) {
                new com.mob.tools.utils.f(u0.a("DS-", i10)) { // from class: com.mob.commons.b.1
                    @Override // com.mob.tools.utils.f
                    public void a() {
                        l.a(l.a(l.f8437e), false, new k() { // from class: com.mob.commons.b.1.1
                            @Override // com.mob.commons.k
                            public boolean a(FileLocker fileLocker) {
                                try {
                                    synchronized (b.f8261h) {
                                        b.d(str);
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    MobLog.getInstance().d(th2);
                                    return false;
                                }
                            }
                        });
                    }
                }.start();
            }
            if (MobSDK.getDomain() == InternationalDomain.DEFAULT && !MobSDK.checkV6()) {
                c.a(new com.mob.tools.utils.b<Void>() { // from class: com.mob.commons.b.2
                    @Override // com.mob.tools.utils.b
                    public void a(Void r12) {
                    }
                });
                return;
            }
            return;
        }
        k();
    }

    public static void b(final com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
        com.mob.tools.b.a.f9105b.set(Boolean.TRUE);
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().getDetailNetworkTypeForStatic().isPackageInstalled(i.a("0221figeNnIgnhhgegehhgfPk?gnfhfm-jVfjgefg j2gnhhOn^hi")).checkUA().usbEnable().devEnable().vpn().isWifiProxy().isRooted().cx().debugable().request(new DH.DHResponder() { // from class: com.mob.commons.b.6
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                com.mob.tools.b.a.f9105b.set(Boolean.TRUE);
                try {
                    HashMap b10 = b.b(dHResponse);
                    long j10 = 2;
                    long j11 = 1;
                    while (true) {
                        if (b10 != null && !b10.isEmpty()) {
                            break;
                        }
                        Thread.sleep(1000 * j11);
                        b10 = b.b(dHResponse);
                        if (b10 == null || b10.isEmpty()) {
                            boolean checkNetworkAvailable = dHResponse.checkNetworkAvailable();
                            if (checkNetworkAvailable) {
                                if (j10 <= 0) {
                                    break;
                                }
                                j10--;
                            }
                            j11 *= 2;
                            if (!checkNetworkAvailable && j11 < 8) {
                                j11 = 8;
                            }
                            if (j11 > 300) {
                                j11 = 8;
                            }
                        }
                    }
                    bVar.a(b10);
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                    bVar.a(null);
                }
            }
        });
    }

    public static void b(HashMap<String, Object> hashMap, int i10) {
        if (hashMap != null) {
            a(hashMap, true);
            com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
            CountDownLatch a10 = com.mob.tools.a.d.a(MobSDK.getContext()).a();
            if (a10 != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("ge dhs_w cdl: " + a10, new Object[0]);
                    a10.await(3500L, TimeUnit.MILLISECONDS);
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("ge dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            a(false, true, true, i10);
        }
    }

    private static void b(CountDownLatch countDownLatch) {
        HashMap fromJson = HashonHelper.fromJson(w.a().b());
        if (b(fromJson)) {
            w.a().b(null);
            fromJson = null;
        }
        if (a()) {
            a((HashMap<String, Object>) fromJson, false);
            if (fromJson == null || fromJson.isEmpty()) {
                MobLog.getInstance().d("g ch: n", new Object[0]);
                c(1);
                return;
            }
            MobLog.getInstance().d("g ch: y", new Object[0]);
            boolean z10 = System.currentTimeMillis() - w.a().b(w.f8552u, 0L) < DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
            MobLog.getInstance().d("g ch fre: " + z10, new Object[0]);
            if (!z10) {
                c(2);
            }
            if (countDownLatch != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    MobLog.getInstance().d("g dhs_w cdl: " + countDownLatch, new Object[0]);
                    countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                    MobLog.getInstance().d("g dhs_w end, dur: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            a(true, false, z10, 2);
        }
    }

    public static boolean b() {
        return ((Integer) a(i.a("004Gfigefmfm"), 0)).intValue() == 1;
    }

    private static boolean b(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            long longValue = ((Long) ResHelper.forceCast(hashMap.get(i.a("010jkl+fgfi7k4gkfgHnk")), 0L)).longValue();
            return longValue != 0 && SystemClock.elapsedRealtime() - longValue >= 86400000;
        }
        return false;
    }

    private static void c(final int i10) {
        if (f8258e.compareAndSet(false, true)) {
            final String format = String.format(i.a("005Oiihmjkljhi"), Integer.valueOf(i10));
            if (i10 == 2) {
                u.f8516c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.b.4
                    @Override // com.mob.tools.utils.e
                    public void a() {
                        com.mob.tools.b.a.f9105b.set(Boolean.TRUE);
                        if (!TextUtils.isEmpty("M-")) {
                            Thread currentThread = Thread.currentThread();
                            StringBuilder a10 = android.support.v4.media.d.a("M-");
                            a10.append(format);
                            currentThread.setName(a10.toString());
                        }
                        try {
                            b.b(new com.mob.tools.utils.b<HashMap<String, Object>>() { // from class: com.mob.commons.b.4.1
                                @Override // com.mob.tools.utils.b
                                public void a(HashMap<String, Object> hashMap) {
                                    try {
                                        b.b(hashMap, i10);
                                    } finally {
                                        com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
                                        b.f8258e.set(false);
                                    }
                                }
                            });
                            com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
                        } catch (Throwable unused) {
                            b.f8258e.set(false);
                        }
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty("M-")) {
                Thread currentThread = Thread.currentThread();
                currentThread.setName("M-" + format);
            }
            try {
                b(new com.mob.tools.utils.b<HashMap<String, Object>>() { // from class: com.mob.commons.b.5
                    @Override // com.mob.tools.utils.b
                    public void a(HashMap<String, Object> hashMap) {
                        try {
                            b.b(hashMap, i10);
                        } finally {
                            com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
                            b.f8258e.set(false);
                        }
                    }
                });
                com.mob.tools.b.a.f9105b.set(Boolean.FALSE);
            } catch (Throwable unused) {
                f8258e.set(false);
            }
        }
    }

    public static void c(boolean z10) {
        if (b()) {
            MobLog.getInstance().d("b db st", new Object[0]);
            e.a((MobProduct) null);
            m.a().b();
            d(z10);
        }
    }

    public static boolean c() {
        return (((Integer) a(i.a("002)fmfj"), 0)).intValue() == 1) || s.a();
    }

    private static boolean c(String str) {
        List list = (List) a(i.a("002Ifigf"), (Object) null);
        return (list == null || list.size() == 0 || !list.contains(str)) ? false : true;
    }

    public static void d(String str) {
        String b10;
        File file;
        File file2 = null;
        try {
            b10 = C0744r.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), i.a("003]hihegf"));
            try {
            } catch (Throwable unused) {
                file2 = file;
                if (file2 != null) {
                    try {
                        ResHelper.deleteFileAndFolder(file2);
                    } catch (Throwable unused2) {
                    }
                }
                k();
            }
        } catch (Throwable unused3) {
        }
        if (g.a().b() && !TextUtils.isEmpty(b10)) {
            if (!c()) {
                k();
                return;
            }
            HashMap<String, Object> f10 = q.f();
            f10.put(i.a("007lkYfjhifggefm"), String.valueOf(com.mob.commons.cc.a.a()));
            ArrayList arrayList = (ArrayList) ((HashMap) new NetCommunicator(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(f10, b10, false)).get(i.a("0049gffghiNf"));
            synchronized (l.f8441i) {
                f8261h.clear();
                f8261h.put(i.a("002Pgf7f"), arrayList);
            }
            k();
        }
        ResHelper.deleteFileAndFolder(file);
        k();
    }

    private static synchronized void d(boolean z10) {
        synchronized (b.class) {
            HashSet<Class<? extends com.mob.commons.a.a>> j10 = j();
            Iterator<Class<? extends com.mob.commons.a.a>> it = j10.iterator();
            while (it.hasNext()) {
                Class<? extends com.mob.commons.a.a> next = it.next();
                try {
                    if (!f8254a.contains(next)) {
                        com.mob.commons.a.a newInstance = next.newInstance();
                        if (z10 || c(newInstance.b())) {
                            if (newInstance.e()) {
                                f8254a.add(next);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            j10.clear();
            NLog mobLog = MobLog.getInstance();
            mobLog.d("clt(" + z10 + ") over", new Object[0]);
        }
    }

    public static boolean d() {
        return c();
    }

    public static ConcurrentHashMap<String, Object> e() {
        return f8261h;
    }

    public static void f() {
        if (a()) {
            c(3);
        }
    }

    private static HashSet<Class<? extends com.mob.commons.a.a>> j() {
        HashSet<Class<? extends com.mob.commons.a.a>> hashSet = new HashSet<>();
        try {
            hashSet.add(AtClt.class);
        } catch (Throwable unused) {
        }
        try {
            hashSet.add(BSClt.class);
        } catch (Throwable unused2) {
        }
        try {
            hashSet.add(DEClt.class);
        } catch (Throwable unused3) {
        }
        try {
            hashSet.add(DEVClt.class);
        } catch (Throwable unused4) {
        }
        try {
            hashSet.add(DLClt.class);
        } catch (Throwable unused5) {
        }
        try {
            hashSet.add(LClt.class);
        } catch (Throwable unused6) {
        }
        try {
            hashSet.add(LOClt.class);
        } catch (Throwable unused7) {
        }
        try {
            hashSet.add(PaClt.class);
        } catch (Throwable unused8) {
        }
        try {
            hashSet.add(com.mob.commons.a.b.class);
        } catch (Throwable unused9) {
        }
        try {
            hashSet.add(PClt.class);
        } catch (Throwable unused10) {
        }
        try {
            hashSet.add(PSClt.class);
        } catch (Throwable unused11) {
        }
        try {
            hashSet.add(com.mob.commons.a.c.class);
        } catch (Throwable unused12) {
        }
        try {
            hashSet.add(SMClt.class);
        } catch (Throwable unused13) {
        }
        try {
            hashSet.add(VplClt.class);
        } catch (Throwable unused14) {
        }
        try {
            hashSet.add(WClt.class);
        } catch (Throwable unused15) {
        }
        try {
            hashSet.add(WLClt.class);
        } catch (Throwable unused16) {
        }
        return hashSet;
    }

    private static void k() {
        Object obj = l.f8441i;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
