package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.commons.h;
import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.utils.SharePrefrenceHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: c */
    private static h f8239c;

    /* renamed from: d */
    private static final String f8240d = d.a("014Nek?j;ejeeegeh1eVef<kj2eefefdgg");

    /* renamed from: e */
    private SharePrefrenceHelper f8241e;

    public b() {
        super(d.a("002Cgdef"), 0L, d.a("0054gdefggegNf"), 30L);
        a();
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f8241e = sharePrefrenceHelper;
        sharePrefrenceHelper.open(d.a("008e;fdEfOee1eFefYmj"));
    }

    private void a(long j10, long j11) {
        try {
            SharePrefrenceHelper sharePrefrenceHelper = this.f8241e;
            String str = f8240d;
            HashMap hashMap = (HashMap) sharePrefrenceHelper.get(str);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(Long.valueOf(j10), Long.valueOf(j11));
            this.f8241e.put(str, hashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private void b(long j10) {
        if (i.a().b()) {
            return;
        }
        d.a().a(k(), b.class, new Object[]{-1, new Long[]{3L, Long.valueOf(j10)}}, 0);
    }

    private void m() {
        try {
            HashMap hashMap = (HashMap) this.f8241e.get(f8240d);
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                long longValue = ((Long) entry.getKey()).longValue();
                long longValue2 = ((Long) entry.getValue()).longValue();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(d.a("0052edelGe!effe"), Long.valueOf(longValue2));
                hashMap2.put(d.a("0087eiedel]eXef8mjUgh"), Long.valueOf(longValue2 - longValue));
                a("BKIOMT", hashMap2);
            }
            this.f8241e.remove(f8240d);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private static synchronized boolean n() {
        boolean z10;
        synchronized (b.class) {
            if (f8239c == null) {
                f8239c = new h() { // from class: com.mob.commons.a.b.1

                    /* renamed from: a */
                    private volatile long f8245a = 0;

                    @Override // com.mob.commons.h
                    public void a(boolean z11, boolean z12, long j10) {
                        if (z12) {
                            this.f8245a = System.currentTimeMillis();
                            d.a().a(0L, b.class, new Object[]{-1, new Long[]{0L, Long.valueOf(this.f8245a), Long.valueOf(System.currentTimeMillis())}}, 1);
                        }
                        if (!z11) {
                            if (j10 > 0) {
                                d.a().a(0L, b.class, new Object[]{-1, new Long[]{2L, Long.valueOf(this.f8245a), Long.valueOf(System.currentTimeMillis())}}, 1);
                            }
                        } else if (z12) {
                        } else {
                            this.f8245a = System.currentTimeMillis();
                            d.a().a(0L, b.class, new Object[]{-1, new Long[]{1L, Long.valueOf(this.f8245a), Long.valueOf(System.currentTimeMillis())}}, 0);
                        }
                    }
                };
                i.a().a(f8239c);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.mob.commons.a.a
    public void h() {
        if (d()) {
            n();
            return;
        }
        Long[] lArr = (Long[]) this.f8217a;
        long longValue = lArr[0].longValue();
        long longValue2 = lArr[1].longValue();
        int i10 = (longValue > 3L ? 1 : (longValue == 3L ? 0 : -1));
        long longValue3 = (i10 != 0 || lArr.length >= 3) ? lArr[2].longValue() : System.currentTimeMillis();
        if (longValue == 0) {
            m();
        } else if (longValue != 1 && i10 != 0) {
            if (longValue == 2) {
                a(longValue2, longValue3);
                m();
                return;
            }
            return;
        }
        a(longValue2, longValue3);
        b(longValue2);
    }

    @Override // com.mob.commons.a.a
    public void i() {
    }
}
