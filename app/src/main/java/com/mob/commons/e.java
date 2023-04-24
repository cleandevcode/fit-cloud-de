package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import java.util.HashMap;
import java.util.HashSet;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static volatile String f8388a = null;

    /* renamed from: b */
    private static volatile Boolean f8389b = null;

    /* renamed from: c */
    private static volatile String f8390c = null;

    /* renamed from: d */
    private static volatile boolean f8391d = false;

    /* renamed from: e */
    private static HashSet<String> f8392e = new HashSet<>();

    /* renamed from: f */
    private static final a f8393f = new a();

    public static String a(Context context) {
        return com.mob.tools.a.c.a(context).b().aY();
    }

    public static synchronized String a(MobProduct mobProduct) {
        synchronized (e.class) {
            HashMap<String, Object> b10 = b(mobProduct);
            if (b10 != null) {
                return (String) b10.get(NetCommunicator.KEY_DUID);
            }
            return null;
        }
    }

    public static boolean a() {
        return !b.a();
    }

    public static String b() {
        if (a()) {
            return null;
        }
        if (TextUtils.isEmpty(f8388a)) {
            String a10 = d().a();
            if (!TextUtils.isEmpty(a10) && TextUtils.isEmpty(f8388a)) {
                f8388a = a10;
            }
        }
        return f8388a;
    }

    public static synchronized HashMap<String, Object> b(final MobProduct mobProduct) {
        boolean z10;
        HashMap<String, Object> hashMap;
        synchronized (e.class) {
            boolean z11 = true;
            if (mobProduct != null) {
                v.a(mobProduct);
                z10 = !f8392e.contains(mobProduct.getProductTag());
                if (z10) {
                    f8392e.add(mobProduct.getProductTag());
                }
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty(f8388a)) {
                f8388a = d().b();
            } else {
                z11 = z10;
            }
            MobLog.getInstance().d("aut pro: " + mobProduct + ", ndReg: " + z11 + ", hsReged: " + f8391d, new Object[0]);
            if (z11 || !f8391d) {
                u.f8516c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.e.1
                    @Override // com.mob.tools.utils.e
                    public void a() {
                        if (b.a(com.mob.commons.a.d.a("002i(ef"))) {
                            boolean unused = e.f8391d = true;
                            if (!b.d()) {
                                int i10 = 0;
                                while (i10 < 5) {
                                    i10++;
                                    try {
                                        Thread.sleep(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                                        if (b.d()) {
                                            break;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            if (b.d()) {
                                e.c().a(mobProduct, new com.mob.tools.utils.b<Void>() { // from class: com.mob.commons.e.1.1
                                    @Override // com.mob.tools.utils.b
                                    public void a(Void r12) {
                                    }
                                });
                            }
                        }
                    }
                });
            }
            if (f8389b == null) {
                String b10 = w.a().b("key_curr_passed_duid", (String) null);
                f8390c = b10;
                f8389b = (TextUtils.isEmpty(b10) || b10.equals(f8388a)) ? Boolean.FALSE : Boolean.TRUE;
            }
            w.a().a("key_curr_passed_duid", f8388a);
            hashMap = new HashMap<>();
            hashMap.put(NetCommunicator.KEY_DUID, f8388a);
            hashMap.put(NetCommunicator.KEY_IS_MODIFIED, Boolean.valueOf(f8389b.booleanValue()));
            hashMap.put(NetCommunicator.KEY_DUID_PREVIOUS, f8390c);
        }
        return hashMap;
    }

    public static /* synthetic */ a c() {
        return d();
    }

    private static a d() {
        return f8393f;
    }
}
