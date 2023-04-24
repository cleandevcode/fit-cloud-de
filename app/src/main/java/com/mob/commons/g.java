package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private static g f8413a = new g();

    /* renamed from: b */
    private volatile boolean f8414b = false;

    /* renamed from: c */
    private volatile long f8415c = 0;

    private g() {
    }

    public static g a() {
        return f8413a;
    }

    private void a(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(i.a("005!figfEk$fhfj"), Integer.valueOf(!z10 ? 1 : 0));
        hashMap.put(i.a("002Lfefi"), Integer.valueOf(a(0) ? 1 : 0));
        hashMap.put(i.a("002=fe7j"), Integer.valueOf(a(1) ? 1 : 0));
        hashMap.put(i.a("002lg"), Integer.valueOf(a(2) ? 1 : 0));
        hashMap.put(i.a("002_hf8g"), Integer.valueOf(a(3) ? 1 : 0));
        hashMap.put(i.a("0023fj@f"), Integer.valueOf(a(4) ? 1 : 0));
        hashMap.put(i.a("0020fnWg"), Integer.valueOf(a(5) ? 1 : 0));
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(i.a("004fAfk;gk"), "ECMT");
        hashMap2.put(i.a("004jTfhHf2fh"), hashMap);
        hashMap2.put(i.a("008j.fh_fkf^fgLnk"), Long.valueOf(currentTimeMillis));
        d.a().a(currentTimeMillis, hashMap2);
    }

    private boolean a(final int i10) {
        final boolean[] zArr = {true};
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        if (i10 == 0) {
            requester.checkUA();
        } else if (i10 == 1) {
            requester.usbEnable();
        } else if (i10 == 2) {
            requester.vpn();
        } else if (i10 == 3) {
            requester.isWifiProxy();
        } else if (i10 == 4) {
            requester.isRooted();
        } else if (i10 == 5) {
            requester.cx();
        }
        requester.request(new DH.DHResponder() { // from class: com.mob.commons.g.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                int i11 = i10;
                if (i11 == 0) {
                    zArr[0] = dHResponse.checkUA();
                } else if (i11 == 1) {
                    zArr[0] = dHResponse.usbEnable();
                } else if (i11 == 2) {
                    zArr[0] = dHResponse.vpn();
                } else if (i11 == 3) {
                    zArr[0] = dHResponse.isWifiProxy();
                } else if (i11 == 4) {
                    zArr[0] = dHResponse.isRooted();
                } else if (i11 != 5) {
                } else {
                    zArr[0] = dHResponse.cx();
                }
            }
        });
        return zArr[0];
    }

    private boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            char[] charArray = str.toCharArray();
            HashMap hashMap = new HashMap();
            boolean z10 = false;
            for (int i10 = 0; i10 < charArray.length; i10++) {
                char c10 = charArray[i10];
                if (c10 == '1') {
                    z10 |= a(i10);
                } else if (c10 != '0') {
                    List list = (List) hashMap.get(Character.valueOf(c10));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Integer.valueOf(i10));
                    hashMap.put(Character.valueOf(charArray[i10]), list);
                }
                if (z10) {
                    return true;
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                boolean z11 = true;
                for (Integer num : (List) entry.getValue()) {
                    z11 &= a(num.intValue());
                }
                z10 |= z11;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return true;
        }
    }

    private synchronized boolean c() {
        try {
            long longValue = ((Long) b.a(i.a("004k+fiSkEfn"), 5L)).longValue() * 1000;
            if (this.f8415c != 0 && System.currentTimeMillis() - this.f8415c <= longValue) {
                return this.f8414b;
            }
            boolean a10 = a((String) b.a(i.a("002=fi+j"), i.a("0066imiminininin")));
            if (this.f8415c == 0 || a10 != this.f8414b) {
                a(a10);
            }
            this.f8415c = System.currentTimeMillis();
            this.f8414b = a10;
            return a10;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return true;
        }
    }

    public synchronized boolean b() {
        return !c();
    }
}
