package a0;

import a0.l0;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: h */
    public static final d f80h = l0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: i */
    public static final d f81i = l0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    public final List<m0> f82a;

    /* renamed from: b */
    public final l0 f83b;

    /* renamed from: c */
    public final int f84c;

    /* renamed from: d */
    public final List<j> f85d;

    /* renamed from: e */
    public final boolean f86e;

    /* renamed from: f */
    public final d2 f87f;

    /* renamed from: g */
    public final s f88g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final HashSet f89a;

        /* renamed from: b */
        public j1 f90b;

        /* renamed from: c */
        public int f91c;

        /* renamed from: d */
        public ArrayList f92d;

        /* renamed from: e */
        public boolean f93e;

        /* renamed from: f */
        public k1 f94f;

        /* renamed from: g */
        public s f95g;

        public a() {
            this.f89a = new HashSet();
            this.f90b = j1.B();
            this.f91c = -1;
            this.f92d = new ArrayList();
            this.f93e = false;
            this.f94f = k1.c();
        }

        public a(h0 h0Var) {
            HashSet hashSet = new HashSet();
            this.f89a = hashSet;
            this.f90b = j1.B();
            this.f91c = -1;
            this.f92d = new ArrayList();
            this.f93e = false;
            this.f94f = k1.c();
            hashSet.addAll(h0Var.f82a);
            this.f90b = j1.C(h0Var.f83b);
            this.f91c = h0Var.f84c;
            this.f92d.addAll(h0Var.f85d);
            this.f93e = h0Var.f86e;
            d2 d2Var = h0Var.f87f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : d2Var.b()) {
                arrayMap.put(str, d2Var.a(str));
            }
            this.f94f = new k1(arrayMap);
        }

        public static a e(w0 w0Var) {
            b A = w0Var.A();
            if (A != null) {
                a aVar = new a();
                A.a(w0Var, aVar);
                return aVar;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Implementation is missing option unpacker for ");
            a10.append(e0.h.a(w0Var, w0Var.toString()));
            throw new IllegalStateException(a10.toString());
        }

        public final void a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((j) it.next());
            }
        }

        public final void b(j jVar) {
            if (this.f92d.contains(jVar)) {
                return;
            }
            this.f92d.add(jVar);
        }

        public final void c(l0 l0Var) {
            for (l0.a<?> aVar : l0Var.d()) {
                j1 j1Var = this.f90b;
                Object obj = null;
                j1Var.getClass();
                try {
                    obj = j1Var.c(aVar);
                } catch (IllegalArgumentException unused) {
                }
                Object c10 = l0Var.c(aVar);
                if (obj instanceof h1) {
                    h1 h1Var = (h1) c10;
                    h1Var.getClass();
                    ((h1) obj).f96a.addAll(Collections.unmodifiableList(new ArrayList(h1Var.f96a)));
                } else {
                    if (c10 instanceof h1) {
                        c10 = ((h1) c10).clone();
                    }
                    this.f90b.D(aVar, l0Var.a(aVar), c10);
                }
            }
        }

        public final h0 d() {
            ArrayList arrayList = new ArrayList(this.f89a);
            n1 A = n1.A(this.f90b);
            int i10 = this.f91c;
            ArrayList arrayList2 = this.f92d;
            boolean z10 = this.f93e;
            k1 k1Var = this.f94f;
            d2 d2Var = d2.f45b;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : k1Var.b()) {
                arrayMap.put(str, k1Var.a(str));
            }
            return new h0(arrayList, A, i10, arrayList2, z10, new d2(arrayMap), this.f95g);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(w0 w0Var, a aVar);
    }

    public h0(ArrayList arrayList, n1 n1Var, int i10, List list, boolean z10, d2 d2Var, s sVar) {
        this.f82a = arrayList;
        this.f83b = n1Var;
        this.f84c = i10;
        this.f85d = Collections.unmodifiableList(list);
        this.f86e = z10;
        this.f87f = d2Var;
        this.f88g = sVar;
    }

    public final List<m0> a() {
        return Collections.unmodifiableList(this.f82a);
    }
}
