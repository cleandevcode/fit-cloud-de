package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.g;
import androidx.fragment.app.r;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a */
    public Random f759a = new Random();

    /* renamed from: b */
    public final HashMap f760b = new HashMap();

    /* renamed from: c */
    public final HashMap f761c = new HashMap();

    /* renamed from: d */
    public final HashMap f762d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f763e = new ArrayList<>();

    /* renamed from: f */
    public final transient HashMap f764f = new HashMap();

    /* renamed from: g */
    public final HashMap f765g = new HashMap();

    /* renamed from: h */
    public final Bundle f766h = new Bundle();

    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a */
        public final androidx.activity.result.b<O> f767a;

        /* renamed from: b */
        public final e.a<?, O> f768b;

        public a(androidx.activity.result.b<O> bVar, e.a<?, O> aVar) {
            this.f767a = bVar;
            this.f768b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final k f769a;

        /* renamed from: b */
        public final ArrayList<s> f770b = new ArrayList<>();

        public b(k kVar) {
            this.f769a = kVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f760b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f764f.get(str);
        if (aVar == null || aVar.f767a == null || !this.f763e.contains(str)) {
            this.f765g.remove(str);
            this.f766h.putParcelable(str, new androidx.activity.result.a(intent, i11));
            return true;
        }
        aVar.f767a.a(aVar.f768b.c(intent, i11));
        this.f763e.remove(str);
        return true;
    }

    public abstract void b(int i10, e.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final e c(final String str, r rVar, final e.a aVar, final androidx.activity.result.b bVar) {
        v vVar = rVar.Z;
        if (!vVar.f2790c.a(k.c.STARTED)) {
            e(str);
            b bVar2 = (b) this.f762d.get(str);
            if (bVar2 == null) {
                bVar2 = new b(vVar);
            }
            s sVar = new s() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.s
                public final void d(u uVar, k.b bVar3) {
                    if (k.b.ON_START.equals(bVar3)) {
                        g.this.f764f.put(str, new g.a(bVar, aVar));
                        if (g.this.f765g.containsKey(str)) {
                            Object obj = g.this.f765g.get(str);
                            g.this.f765g.remove(str);
                            bVar.a(obj);
                        }
                        a aVar2 = (a) g.this.f766h.getParcelable(str);
                        if (aVar2 != null) {
                            g.this.f766h.remove(str);
                            bVar.a(aVar.c(aVar2.f752b, aVar2.f751a));
                        }
                    } else if (k.b.ON_STOP.equals(bVar3)) {
                        g.this.f764f.remove(str);
                    } else if (k.b.ON_DESTROY.equals(bVar3)) {
                        g.this.f(str);
                    }
                }
            };
            bVar2.f769a.a(sVar);
            bVar2.f770b.add(sVar);
            this.f762d.put(str, bVar2);
            return new e(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + rVar + " is attempting to register while current state is " + vVar.f2790c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final f d(String str, e.a aVar, androidx.activity.result.b bVar) {
        e(str);
        this.f764f.put(str, new a(bVar, aVar));
        if (this.f765g.containsKey(str)) {
            Object obj = this.f765g.get(str);
            this.f765g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f766h.getParcelable(str);
        if (aVar2 != null) {
            this.f766h.remove(str);
            bVar.a(aVar.c(aVar2.f752b, aVar2.f751a));
        }
        return new f(this, str, aVar);
    }

    public final void e(String str) {
        if (((Integer) this.f761c.get(str)) != null) {
            return;
        }
        int nextInt = this.f759a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (this.f760b.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f759a.nextInt(2147418112);
            } else {
                this.f760b.put(Integer.valueOf(i10), str);
                this.f761c.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f763e.contains(str) && (num = (Integer) this.f761c.remove(str)) != null) {
            this.f760b.remove(num);
        }
        this.f764f.remove(str);
        if (this.f765g.containsKey(str)) {
            StringBuilder a10 = d.a("Dropping pending result for request ", str, ": ");
            a10.append(this.f765g.get(str));
            Log.w("ActivityResultRegistry", a10.toString());
            this.f765g.remove(str);
        }
        if (this.f766h.containsKey(str)) {
            StringBuilder a11 = d.a("Dropping pending result for request ", str, ": ");
            a11.append(this.f766h.getParcelable(str));
            Log.w("ActivityResultRegistry", a11.toString());
            this.f766h.remove(str);
        }
        b bVar = (b) this.f762d.get(str);
        if (bVar != null) {
            Iterator<s> it = bVar.f770b.iterator();
            while (it.hasNext()) {
                bVar.f769a.c(it.next());
            }
            bVar.f770b.clear();
            this.f762d.remove(str);
        }
    }
}
