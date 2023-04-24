package com.mob.commons.a;

import com.mob.commons.h;
import com.mob.commons.i;
import com.mob.commons.o;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c */
    private static h f8251c;

    public c() {
        super("p", 0L, null, 0L);
        a(0);
        a();
    }

    private static synchronized boolean m() {
        boolean z10;
        synchronized (c.class) {
            if (f8251c == null) {
                f8251c = new h() { // from class: com.mob.commons.a.c.1
                    @Override // com.mob.commons.h
                    public void a(boolean z11, boolean z12, long j10) {
                        if (z11) {
                            d.a().a(0L, c.class, new Object[]{-1, Long.valueOf(System.currentTimeMillis())}, 0);
                        }
                    }
                };
                i.a().a(f8251c);
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
            m();
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(o.a("004dWdiHei"), "PVMT");
        hashMap.put(o.a("008h8df didQde(li"), this.f8217a);
        com.mob.commons.d.a().a(System.currentTimeMillis(), hashMap);
    }
}
