package g3;

import android.text.TextUtils;
import f3.p;
import f3.t;
import f3.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends t {

    /* renamed from: j */
    public static final String f14877j = f3.m.e("WorkContinuationImpl");

    /* renamed from: a */
    public final l f14878a;

    /* renamed from: b */
    public final String f14879b;

    /* renamed from: c */
    public final f3.f f14880c;

    /* renamed from: d */
    public final List<? extends u> f14881d;

    /* renamed from: e */
    public final ArrayList f14882e;

    /* renamed from: f */
    public final ArrayList f14883f;

    /* renamed from: g */
    public final List<f> f14884g;

    /* renamed from: h */
    public boolean f14885h;

    /* renamed from: i */
    public b f14886i;

    public f() {
        throw null;
    }

    public f(l lVar, String str, f3.f fVar, List<? extends u> list) {
        this(lVar, str, fVar, list, 0);
    }

    public f(l lVar, String str, f3.f fVar, List list, int i10) {
        this.f14878a = lVar;
        this.f14879b = str;
        this.f14880c = fVar;
        this.f14881d = list;
        this.f14884g = null;
        this.f14882e = new ArrayList(list.size());
        this.f14883f = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String uuid = ((u) list.get(i11)).f14112a.toString();
            this.f14882e.add(uuid);
            this.f14883f.add(uuid);
        }
    }

    public static boolean b(f fVar, HashSet hashSet) {
        hashSet.addAll(fVar.f14882e);
        HashSet c10 = c(fVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (c10.contains((String) it.next())) {
                return true;
            }
        }
        List<f> list = fVar.f14884g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                if (b(fVar2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(fVar.f14882e);
        return false;
    }

    public static HashSet c(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.f14884g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                hashSet.addAll(fVar2.f14882e);
            }
        }
        return hashSet;
    }

    public final p a() {
        if (!this.f14885h) {
            p3.d dVar = new p3.d(this);
            ((r3.b) this.f14878a.f14896d).a(dVar);
            this.f14886i = dVar.f23805b;
        } else {
            f3.m.c().f(f14877j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f14882e)), new Throwable[0]);
        }
        return this.f14886i;
    }
}
