package l2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l2.n0;

/* loaded from: classes.dex */
public abstract class b1<T> {

    /* loaded from: classes.dex */
    public static final class a<T> extends b1<T> {

        /* renamed from: a */
        public final r0 f18728a;

        /* renamed from: b */
        public final int f18729b;

        /* renamed from: c */
        public final int f18730c;

        /* renamed from: d */
        public final int f18731d;

        public a(r0 r0Var, int i10, int i11, int i12) {
            boolean z10;
            boolean z11;
            gm.l.f(r0Var, "loadType");
            this.f18728a = r0Var;
            this.f18729b = i10;
            this.f18730c = i11;
            this.f18731d = i12;
            if (r0Var != r0.REFRESH) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (b() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (i12 >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException(gm.l.k(Integer.valueOf(i12), "Invalid placeholdersRemaining ").toString());
                }
                throw new IllegalArgumentException(gm.l.k(Integer.valueOf(b()), "Drop count must be > 0, but was ").toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        public final int b() {
            return (this.f18730c - this.f18729b) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f18728a == aVar.f18728a && this.f18729b == aVar.f18729b && this.f18730c == aVar.f18730c && this.f18731d == aVar.f18731d;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f18728a.hashCode() * 31) + this.f18729b) * 31) + this.f18730c) * 31) + this.f18731d;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Drop(loadType=");
            a10.append(this.f18728a);
            a10.append(", minPageOffset=");
            a10.append(this.f18729b);
            a10.append(", maxPageOffset=");
            a10.append(this.f18730c);
            a10.append(", placeholdersRemaining=");
            return a1.b.a(a10, this.f18731d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends b1<T> {

        /* renamed from: g */
        public static final b<Object> f18732g;

        /* renamed from: a */
        public final r0 f18733a;

        /* renamed from: b */
        public final List<g3<T>> f18734b;

        /* renamed from: c */
        public final int f18735c;

        /* renamed from: d */
        public final int f18736d;

        /* renamed from: e */
        public final q0 f18737e;

        /* renamed from: f */
        public final q0 f18738f;

        /* loaded from: classes.dex */
        public static final class a {
            public static b a(List list, int i10, int i11, q0 q0Var, q0 q0Var2) {
                return new b(r0.REFRESH, list, i10, i11, q0Var, q0Var2);
            }
        }

        @zl.e(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {74}, m = "map")
        /* renamed from: l2.b1$b$b */
        /* loaded from: classes.dex */
        public static final class C0325b<R> extends zl.c {

            /* renamed from: d */
            public fm.p f18739d;

            /* renamed from: e */
            public b f18740e;

            /* renamed from: f */
            public r0 f18741f;

            /* renamed from: g */
            public Collection f18742g;

            /* renamed from: h */
            public Iterator f18743h;

            /* renamed from: i */
            public g3 f18744i;

            /* renamed from: j */
            public int[] f18745j;

            /* renamed from: k */
            public Collection f18746k;

            /* renamed from: l */
            public Iterator f18747l;

            /* renamed from: m */
            public Collection f18748m;

            /* renamed from: n */
            public Collection f18749n;

            /* renamed from: o */
            public /* synthetic */ Object f18750o;

            /* renamed from: p */
            public final /* synthetic */ b<T> f18751p;

            /* renamed from: q */
            public int f18752q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0325b(b<T> bVar, xl.d<? super C0325b> dVar) {
                super(dVar);
                this.f18751p = bVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18750o = obj;
                this.f18752q |= Integer.MIN_VALUE;
                return this.f18751p.a(null, this);
            }
        }

        static {
            List p10 = h7.a.p(g3.f18899e);
            n0.c cVar = n0.c.f19109c;
            n0.c cVar2 = n0.c.f19108b;
            f18732g = a.a(p10, 0, 0, new q0(cVar, cVar2, cVar2), null);
        }

        public /* synthetic */ b() {
            throw null;
        }

        public b(r0 r0Var, List<g3<T>> list, int i10, int i11, q0 q0Var, q0 q0Var2) {
            this.f18733a = r0Var;
            this.f18734b = list;
            this.f18735c = i10;
            this.f18736d = i11;
            this.f18737e = q0Var;
            this.f18738f = q0Var2;
            boolean z10 = false;
            if (!(r0Var == r0.APPEND || i10 >= 0)) {
                throw new IllegalArgumentException(gm.l.k(Integer.valueOf(i10), "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
            }
            if (!(r0Var == r0.PREPEND || i11 >= 0)) {
                throw new IllegalArgumentException(gm.l.k(Integer.valueOf(i11), "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            if (!((r0Var != r0.REFRESH || (list.isEmpty() ^ true)) ? true : true)) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
        /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0074 -> B:46:0x0091). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bb -> B:52:0x00c3). Please submit an issue!!! */
        @Override // l2.b1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <R> java.lang.Object a(fm.p<? super T, ? super xl.d<? super R>, ? extends java.lang.Object> r19, xl.d<? super l2.b1<R>> r20) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.b1.b.a(fm.p, xl.d):java.lang.Object");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f18733a == bVar.f18733a && gm.l.a(this.f18734b, bVar.f18734b) && this.f18735c == bVar.f18735c && this.f18736d == bVar.f18736d && gm.l.a(this.f18737e, bVar.f18737e) && gm.l.a(this.f18738f, bVar.f18738f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f18737e.hashCode() + ((((((this.f18734b.hashCode() + (this.f18733a.hashCode() * 31)) * 31) + this.f18735c) * 31) + this.f18736d) * 31)) * 31;
            q0 q0Var = this.f18738f;
            return hashCode + (q0Var == null ? 0 : q0Var.hashCode());
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Insert(loadType=");
            a10.append(this.f18733a);
            a10.append(", pages=");
            a10.append(this.f18734b);
            a10.append(", placeholdersBefore=");
            a10.append(this.f18735c);
            a10.append(", placeholdersAfter=");
            a10.append(this.f18736d);
            a10.append(", sourceLoadStates=");
            a10.append(this.f18737e);
            a10.append(", mediatorLoadStates=");
            a10.append(this.f18738f);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> extends b1<T> {

        /* renamed from: a */
        public final q0 f18753a;

        /* renamed from: b */
        public final q0 f18754b;

        public c(q0 q0Var, q0 q0Var2) {
            gm.l.f(q0Var, "source");
            this.f18753a = q0Var;
            this.f18754b = q0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return gm.l.a(this.f18753a, cVar.f18753a) && gm.l.a(this.f18754b, cVar.f18754b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f18753a.hashCode() * 31;
            q0 q0Var = this.f18754b;
            return hashCode + (q0Var == null ? 0 : q0Var.hashCode());
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("LoadStateUpdate(source=");
            a10.append(this.f18753a);
            a10.append(", mediator=");
            a10.append(this.f18754b);
            a10.append(')');
            return a10.toString();
        }
    }

    public <R> Object a(fm.p<? super T, ? super xl.d<? super R>, ? extends Object> pVar, xl.d<? super b1<R>> dVar) {
        return this;
    }
}
