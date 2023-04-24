package tm;

import bi.m0;
import xl.f;

/* loaded from: classes2.dex */
public final class r<T> extends zl.c implements sm.g<T> {

    /* renamed from: d */
    public final sm.g<T> f28362d;

    /* renamed from: e */
    public final xl.f f28363e;

    /* renamed from: f */
    public final int f28364f;

    /* renamed from: g */
    public xl.f f28365g;

    /* renamed from: h */
    public xl.d<? super tl.l> f28366h;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.p<Integer, f.b, Integer> {

        /* renamed from: b */
        public static final a f28367b = new a();

        public a() {
            super(2);
        }

        @Override // fm.p
        public final Integer A(Integer num, f.b bVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(sm.g<? super T> gVar, xl.f fVar) {
        super(p.f28360a, xl.g.f30632a);
        this.f28362d = gVar;
        this.f28363e = fVar;
        this.f28364f = ((Number) fVar.Z(0, a.f28367b)).intValue();
    }

    @Override // zl.c, xl.d
    public final xl.f e() {
        xl.f fVar = this.f28365g;
        return fVar == null ? xl.g.f30632a : fVar;
    }

    @Override // zl.a, zl.d
    public final zl.d g() {
        xl.d<? super tl.l> dVar = this.f28366h;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        try {
            Object v10 = v(dVar, t10);
            return v10 == yl.a.COROUTINE_SUSPENDED ? v10 : tl.l.f28297a;
        } catch (Throwable th2) {
            this.f28365g = new m(dVar.e(), th2);
            throw th2;
        }
    }

    @Override // zl.a
    public final StackTraceElement q() {
        return null;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Throwable a10 = tl.g.a(obj);
        if (a10 != null) {
            this.f28365g = new m(e(), a10);
        }
        xl.d<? super tl.l> dVar = this.f28366h;
        if (dVar != null) {
            dVar.l(obj);
        }
        return yl.a.COROUTINE_SUSPENDED;
    }

    @Override // zl.c, zl.a
    public final void u() {
        super.u();
    }

    public final Object v(xl.d<? super tl.l> dVar, T t10) {
        xl.f e10 = dVar.e();
        m0.j(e10);
        xl.f fVar = this.f28365g;
        if (fVar != e10) {
            if (!(fVar instanceof m)) {
                if (((Number) e10.Z(0, new t(this))).intValue() == this.f28364f) {
                    this.f28365g = e10;
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a("Flow invariant is violated:\n\t\tFlow was collected in ");
                    a10.append(this.f28363e);
                    a10.append(",\n\t\tbut emission happened in ");
                    a10.append(e10);
                    a10.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(a10.toString().toString());
                }
            } else {
                StringBuilder a11 = android.support.v4.media.d.a("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                a11.append(((m) fVar).f28358a);
                a11.append(", but then emission attempt of value '");
                a11.append(t10);
                a11.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(om.d.Q(a11.toString()).toString());
            }
        }
        this.f28366h = dVar;
        Object j10 = s.f28368a.j(this.f28362d, t10, this);
        if (!gm.l.a(j10, yl.a.COROUTINE_SUSPENDED)) {
            this.f28366h = null;
        }
        return j10;
    }
}
