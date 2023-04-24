package sm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class g1<T> extends tm.b<h1> implements r0<T>, f, tm.o<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: e */
    public int f27174e;

    @zl.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public g1 f27175d;

        /* renamed from: e */
        public g f27176e;

        /* renamed from: f */
        public h1 f27177f;

        /* renamed from: g */
        public pm.g1 f27178g;

        /* renamed from: h */
        public Object f27179h;

        /* renamed from: i */
        public /* synthetic */ Object f27180i;

        /* renamed from: j */
        public final /* synthetic */ g1<T> f27181j;

        /* renamed from: k */
        public int f27182k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1<T> g1Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f27181j = g1Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27180i = obj;
            this.f27182k |= Integer.MIN_VALUE;
            return this.f27181j.a(null, this);
        }
    }

    public g1(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00a7, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ab, code lost:
        if (gm.l.a(r0, r13) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0099 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:96:0x0039, B:116:0x0095, B:118:0x0099, B:121:0x00a0, B:122:0x00a4, B:124:0x00a7, B:134:0x00c8, B:139:0x00e1, B:140:0x00f9, B:146:0x010a, B:147:0x010f, B:150:0x0116, B:143:0x0102, B:126:0x00ad, B:130:0x00b4, B:101:0x0050, B:104:0x005c, B:115:0x0084), top: B:158:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e1 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:96:0x0039, B:116:0x0095, B:118:0x0099, B:121:0x00a0, B:122:0x00a4, B:124:0x00a7, B:134:0x00c8, B:139:0x00e1, B:140:0x00f9, B:146:0x010a, B:147:0x010f, B:150:0x0116, B:143:0x0102, B:126:0x00ad, B:130:0x00b4, B:101:0x0050, B:104:0x005c, B:115:0x0084), top: B:158:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x00df -> B:116:0x0095). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0118 -> B:116:0x0095). Please submit an issue!!! */
    @Override // sm.v0, sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super T> r18, xl.d<?> r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.g1.a(sm.g, xl.d):java.lang.Object");
    }

    @Override // tm.o
    public final f<T> b(xl.f fVar, int i10, rm.f fVar2) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((z10 || i10 == -2) && fVar2 == rm.f.DROP_OLDEST) || ((i10 == 0 || i10 == -3) && fVar2 == rm.f.SUSPEND)) {
            return this;
        }
        return new tm.i(i10, fVar, fVar2, this);
    }

    @Override // sm.q0
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // sm.q0
    public final boolean d(T t10) {
        setValue(t10);
        return true;
    }

    @Override // tm.b
    public final h1 f() {
        return new h1();
    }

    @Override // tm.b
    public final tm.c[] g() {
        return new h1[2];
    }

    @Override // sm.r0, sm.f1
    public final T getValue() {
        um.x xVar = h7.a.f15889a;
        T t10 = (T) this._state;
        if (t10 == xVar) {
            return null;
        }
        return t10;
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        setValue(t10);
        return tl.l.f28297a;
    }

    @Override // sm.r0
    public final void setValue(T t10) {
        int i10;
        Object obj;
        um.x xVar;
        boolean z10;
        boolean z11;
        if (t10 == null) {
            t10 = (T) h7.a.f15889a;
        }
        synchronized (this) {
            if (!gm.l.a(this._state, t10)) {
                this._state = t10;
                int i11 = this.f27174e;
                if ((i11 & 1) == 0) {
                    int i12 = i11 + 1;
                    this.f27174e = i12;
                    Object obj2 = this.f28301a;
                    tl.l lVar = tl.l.f28297a;
                    while (true) {
                        h1[] h1VarArr = (h1[]) obj2;
                        if (h1VarArr != null) {
                            for (h1 h1Var : h1VarArr) {
                                if (h1Var != null) {
                                    while (true) {
                                        Object obj3 = h1Var._state;
                                        if (obj3 != null && obj3 != (xVar = bi.r.f4344e)) {
                                            um.x xVar2 = bi.r.f4343d;
                                            if (obj3 == xVar2) {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h1.f27202a;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater.compareAndSet(h1Var, obj3, xVar)) {
                                                        z10 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater.get(h1Var) != obj3) {
                                                        z10 = false;
                                                        break;
                                                    }
                                                }
                                                if (z10) {
                                                    break;
                                                }
                                            } else {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h1.f27202a;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(h1Var, obj3, xVar2)) {
                                                        z11 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(h1Var) != obj3) {
                                                        z11 = false;
                                                        break;
                                                    }
                                                }
                                                if (z11) {
                                                    ((pm.j) obj3).l(tl.l.f28297a);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i10 = this.f27174e;
                            if (i10 == i12) {
                                break;
                            }
                            obj = this.f28301a;
                            tl.l lVar2 = tl.l.f28297a;
                        }
                        obj2 = obj;
                        i12 = i10;
                    }
                    this.f27174e = i12 + 1;
                } else {
                    this.f27174e = i11 + 2;
                }
            }
        }
    }
}
