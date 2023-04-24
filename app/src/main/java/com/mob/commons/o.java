package com.mob.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    private static o f8482a;

    /* renamed from: b */
    private HashMap<String, Object> f8483b;

    private o() {
        HashMap<String, Object> c10 = c();
        this.f8483b = c10;
        if (c10 == null) {
            this.f8483b = new HashMap<>();
        }
        ArrayList<MobProduct> b10 = v.b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        Iterator<MobProduct> it = b10.iterator();
        while (it.hasNext()) {
            MobProduct next = it.next();
            if (!this.f8483b.containsKey(next.getProductTag())) {
                this.f8483b.put(next.getProductTag(), 0);
            }
        }
    }

    public static o a() {
        if (f8482a == null) {
            synchronized (o.class) {
                if (f8482a == null) {
                    f8482a = new o();
                }
            }
        }
        return f8482a;
    }

    public static String a(String str) {
        return C0744r.a(str, 99);
    }

    private void a(HashMap<String, Object> hashMap) {
        try {
            w.a().a(hashMap);
        } catch (Throwable unused) {
        }
    }

    private HashMap<String, Object> c() {
        try {
            return w.a().c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(MobProduct mobProduct, int i10) {
        if (mobProduct != null) {
            this.f8483b.put(mobProduct.getProductTag(), Integer.valueOf(i10));
            a(this.f8483b);
        }
    }

    public HashMap<String, Object> b() {
        return this.f8483b;
    }
}
