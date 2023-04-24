package androidx.recyclerview.widget;

import androidx.appcompat.widget.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import androidx.recyclerview.widget.r0;
import androidx.recyclerview.widget.z;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements z.b {

    /* renamed from: a */
    public final f f3101a;

    /* renamed from: c */
    public ArrayList f3103c = new ArrayList();

    /* renamed from: d */
    public final IdentityHashMap<RecyclerView.b0, z> f3104d = new IdentityHashMap<>();

    /* renamed from: e */
    public ArrayList f3105e = new ArrayList();

    /* renamed from: f */
    public a f3106f = new a();

    /* renamed from: b */
    public final r0 f3102b = new r0.a();

    /* renamed from: g */
    public final int f3107g = 1;

    /* renamed from: h */
    public final o0 f3108h = new o0.a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public z f3109a;

        /* renamed from: b */
        public int f3110b;

        /* renamed from: c */
        public boolean f3111c;
    }

    public g(f fVar) {
        this.f3101a = fVar;
    }

    public final void a() {
        int i10;
        Iterator it = this.f3105e.iterator();
        while (true) {
            if (it.hasNext()) {
                z zVar = (z) it.next();
                int i11 = zVar.f3338c.f2949c;
                i10 = 3;
                if (i11 == 3 || (i11 == 2 && zVar.f3340e == 0)) {
                    break;
                }
            } else {
                i10 = 1;
                break;
            }
        }
        f fVar = this.f3101a;
        if (i10 != fVar.f2949c) {
            fVar.w(i10);
        }
    }

    public final int b(z zVar) {
        z zVar2;
        Iterator it = this.f3105e.iterator();
        int i10 = 0;
        while (it.hasNext() && (zVar2 = (z) it.next()) != zVar) {
            i10 += zVar2.f3340e;
        }
        return i10;
    }

    public final a c(int i10) {
        a aVar = this.f3106f;
        if (aVar.f3111c) {
            aVar = new a();
        } else {
            aVar.f3111c = true;
        }
        Iterator it = this.f3105e.iterator();
        int i11 = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z zVar = (z) it.next();
            int i12 = zVar.f3340e;
            if (i12 > i11) {
                aVar.f3109a = zVar;
                aVar.f3110b = i11;
                break;
            }
            i11 -= i12;
        }
        if (aVar.f3109a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(u0.a("Cannot find wrapper for ", i10));
    }

    public final z d(RecyclerView.b0 b0Var) {
        z zVar = this.f3104d.get(b0Var);
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
