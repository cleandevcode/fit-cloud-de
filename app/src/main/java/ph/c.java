package ph;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pm.z1;
import sm.g1;
import vf.i;

/* loaded from: classes2.dex */
public abstract class c<T extends vf.i> extends v6.b<C0438c<T>> {

    /* renamed from: j */
    public final androidx.lifecycle.l0 f24115j;

    /* renamed from: k */
    public final sh.b<T> f24116k;

    /* renamed from: l */
    public final long f24117l;

    /* renamed from: m */
    public final g1 f24118m;

    /* renamed from: n */
    public final g1 f24119n;

    /* renamed from: o */
    public z1 f24120o;

    /* renamed from: p */
    public z1 f24121p;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$1", f = "AbsHealthDetailFragment.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f24122e;

        /* renamed from: f */
        public final /* synthetic */ c<T> f24123f;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$1$1", f = "AbsHealthDetailFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ph.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C0437a extends zl.i implements fm.p<b<T>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public /* synthetic */ Object f24124e;

            /* renamed from: f */
            public final /* synthetic */ c<T> f24125f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0437a(c<T> cVar, xl.d<? super C0437a> dVar) {
                super(2, dVar);
                this.f24125f = cVar;
            }

            @Override // fm.p
            public final Object A(Object obj, xl.d<? super tl.l> dVar) {
                return ((C0437a) p((b) obj, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                C0437a c0437a = new C0437a(this.f24125f, dVar);
                c0437a.f24124e = obj;
                return c0437a;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                mf.a0.k(obj);
                b bVar = (b) this.f24124e;
                if (bVar != null) {
                    c<T> cVar = this.f24125f;
                    Date a10 = bVar.f24127b.a();
                    androidx.lifecycle.l0 l0Var = cVar.f24115j;
                    gm.l.f(a10, "date");
                    l0Var.d("defaultDate", dg.a.a(a10));
                    c<T> cVar2 = this.f24125f;
                    T t10 = bVar.f24127b;
                    z1 z1Var = cVar2.f24120o;
                    if (z1Var != null) {
                        z1Var.h(null);
                    }
                    cVar2.f24120o = v6.b.f(cVar2, new f(cVar2, t10, null), null, g.f24147b, 3);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f24123f = cVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f24123f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f24122e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                c<T> cVar = this.f24123f;
                g1 g1Var = cVar.f24118m;
                C0437a c0437a = new C0437a(cVar, null);
                this.f24122e = 1;
                if (bi.r.o(g1Var, c0437a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T extends vf.i> {

        /* renamed from: a */
        public final int f24126a;

        /* renamed from: b */
        public final T f24127b;

        /* renamed from: c */
        public final boolean f24128c;

        /* renamed from: d */
        public final boolean f24129d;

        public b(int i10, T t10, boolean z10, boolean z11) {
            gm.l.f(t10, "value");
            this.f24126a = i10;
            this.f24127b = t10;
            this.f24128c = z10;
            this.f24129d = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f24126a == bVar.f24126a && gm.l.a(this.f24127b, bVar.f24127b) && this.f24128c == bVar.f24128c && this.f24129d == bVar.f24129d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = (this.f24127b.hashCode() + (this.f24126a * 31)) * 31;
            boolean z10 = this.f24128c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.f24129d;
            return i11 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SelectedInfo(index=");
            a10.append(this.f24126a);
            a10.append(", value=");
            a10.append(this.f24127b);
            a10.append(", leftClickable=");
            a10.append(this.f24128c);
            a10.append(", rightClickable=");
            return l2.o0.a(a10, this.f24129d, ')');
        }
    }

    /* renamed from: ph.c$c */
    /* loaded from: classes2.dex */
    public static final class C0438c<T extends vf.i> implements u6.o {

        /* renamed from: a */
        public final u6.a<List<T>> f24130a;

        /* renamed from: b */
        public final u6.a<T> f24131b;

        public C0438c() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0438c(u6.a<? extends List<? extends T>> aVar, u6.a<? extends T> aVar2) {
            gm.l.f(aVar, "asyncList");
            gm.l.f(aVar2, "asyncDetail");
            this.f24130a = aVar;
            this.f24131b = aVar2;
        }

        public /* synthetic */ C0438c(u6.a aVar, u6.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? u6.b0.f28527c : aVar, (i10 & 2) != 0 ? u6.b0.f28527c : aVar2);
        }

        public static C0438c copy$default(C0438c c0438c, u6.a aVar, u6.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = c0438c.f24130a;
            }
            if ((i10 & 2) != 0) {
                aVar2 = c0438c.f24131b;
            }
            c0438c.getClass();
            gm.l.f(aVar, "asyncList");
            gm.l.f(aVar2, "asyncDetail");
            return new C0438c(aVar, aVar2);
        }

        public final u6.a<List<T>> component1() {
            return this.f24130a;
        }

        public final u6.a<T> component2() {
            return this.f24131b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0438c) {
                C0438c c0438c = (C0438c) obj;
                return gm.l.a(this.f24130a, c0438c.f24130a) && gm.l.a(this.f24131b, c0438c.f24131b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f24131b.hashCode() + (this.f24130a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("State(asyncList=");
            a10.append(this.f24130a);
            a10.append(", asyncDetail=");
            a10.append(this.f24131b);
            a10.append(')');
            return a10.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0438c<T> c0438c, androidx.lifecycle.l0 l0Var, sh.b<T> bVar) {
        super(c0438c, l0Var);
        long j10;
        gm.l.f(c0438c, "initState");
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(bVar, "source");
        this.f24115j = l0Var;
        this.f24116k = bVar;
        Long l10 = (Long) l0Var.f2739a.get("friendId");
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        this.f24117l = j10;
        g1 c10 = bi.r.c(null);
        this.f24118m = c10;
        this.f24119n = c10;
        bi.z0.g(rm.l.h(this), null, 0, new a(this, null), 3);
        v6.b.f(this, new h(this, null), null, new i(this), 3);
    }

    public static final void j(c cVar, List list, Date date) {
        boolean z10;
        boolean z11;
        cVar.getClass();
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cVar.f24118m.setValue(null);
            return;
        }
        int size = list.size() - 1;
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            if (date != null) {
                Date a10 = ((vf.i) list.get(i10)).a();
                gm.l.f(a10, "date2");
                if (date.getYear() == a10.getYear() && date.getMonth() == a10.getMonth() && date.getDate() == a10.getDate()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    size = i10;
                    break;
                }
            }
            i10++;
        }
        cVar.k(size, list);
    }

    public final void k(int i10, List list) {
        if (i10 >= 0 && i10 < list.size()) {
            this.f24118m.setValue(new b(i10, (vf.i) list.get(i10), i10 > 0, i10 < list.size() - 1));
        } else {
            this.f24118m.setValue(null);
        }
    }
}
