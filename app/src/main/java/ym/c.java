package ym;

import gm.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.i;
import pm.j;
import pm.q0;
import tl.l;
import um.k;
import um.s;
import um.t;

/* loaded from: classes2.dex */
public final class c implements ym.b {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31805a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    /* loaded from: classes2.dex */
    public final class a extends b {

        /* renamed from: f */
        public final i<l> f31806f;

        /* renamed from: ym.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C0602a extends m implements fm.l<Throwable, l> {

            /* renamed from: b */
            public final /* synthetic */ c f31808b;

            /* renamed from: c */
            public final /* synthetic */ a f31809c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0602a(c cVar, a aVar) {
                super(1);
                this.f31808b = cVar;
                this.f31809c = aVar;
            }

            @Override // fm.l
            public final l k(Throwable th2) {
                this.f31808b.a(this.f31809c.f31811d);
                return l.f28297a;
            }
        }

        public a(j jVar) {
            c.this = r1;
            this.f31806f = jVar;
        }

        @Override // ym.c.b
        public final void R() {
            this.f31806f.i();
        }

        @Override // ym.c.b
        public final boolean S() {
            if (!b.f31810e.compareAndSet(this, 0, 1) || this.f31806f.r(l.f28297a, null, new C0602a(c.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("LockCont[");
            a10.append(this.f31811d);
            a10.append(", ");
            a10.append(this.f31806f);
            a10.append("] for ");
            a10.append(c.this);
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class b extends k implements q0 {

        /* renamed from: e */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f31810e = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* renamed from: d */
        public final Object f31811d = null;
        private volatile /* synthetic */ int isTaken = 0;

        public abstract void R();

        public abstract boolean S();

        @Override // pm.q0
        public final void c() {
            N();
        }
    }

    /* renamed from: ym.c$c */
    /* loaded from: classes2.dex */
    public static final class C0603c extends um.j {
        public volatile Object owner;

        public C0603c(Object obj) {
            this.owner = obj;
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("LockedQueue[");
            a10.append(this.owner);
            a10.append(']');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends um.d<c> {

        /* renamed from: b */
        public final C0603c f31812b;

        public d(C0603c c0603c) {
            this.f31812b = c0603c;
        }

        @Override // um.d
        public final void d(c cVar, Object obj) {
            c cVar2 = cVar;
            Object obj2 = obj == null ? rm.b.f25831k : this.f31812b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f31805a;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar2, this, obj2) && atomicReferenceFieldUpdater.get(cVar2) == this) {
            }
        }

        @Override // um.d
        public final Object i(c cVar) {
            boolean z10;
            C0603c c0603c = this.f31812b;
            if (c0603c.I() == c0603c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return rm.b.f25827g;
        }
    }

    public c(boolean z10) {
        this._state = z10 ? rm.b.f25830j : rm.b.f25831k;
    }

    @Override // ym.b
    public final void a(Object obj) {
        boolean z10;
        boolean z11;
        k kVar;
        boolean z12;
        while (true) {
            Object obj2 = this._state;
            boolean z13 = true;
            if (obj2 instanceof ym.a) {
                ym.a aVar = (ym.a) obj2;
                if (obj == null) {
                    if (aVar.f31804a != rm.b.f25829i) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (aVar.f31804a == obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        StringBuilder a10 = android.support.v4.media.d.a("Mutex is locked by ");
                        a10.append(aVar.f31804a);
                        a10.append(" but expected ");
                        a10.append(obj);
                        throw new IllegalStateException(a10.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31805a;
                ym.a aVar2 = rm.b.f25831k;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z13) {
                    return;
                }
            } else if (obj2 instanceof s) {
                ((s) obj2).c(this);
            } else if (obj2 instanceof C0603c) {
                if (obj != null) {
                    C0603c c0603c = (C0603c) obj2;
                    if (c0603c.owner == obj) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        StringBuilder a11 = android.support.v4.media.d.a("Mutex is locked by ");
                        a11.append(c0603c.owner);
                        a11.append(" but expected ");
                        a11.append(obj);
                        throw new IllegalStateException(a11.toString().toString());
                    }
                }
                C0603c c0603c2 = (C0603c) obj2;
                while (true) {
                    kVar = (k) c0603c2.I();
                    if (kVar == c0603c2) {
                        kVar = null;
                        break;
                    } else if (kVar.N()) {
                        break;
                    } else {
                        ((t) kVar.I()).f28939a.L();
                    }
                }
                if (kVar == null) {
                    d dVar = new d(c0603c2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31805a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z13 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13 && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) kVar;
                    if (bVar.S()) {
                        Object obj3 = bVar.f31811d;
                        if (obj3 == null) {
                            obj3 = rm.b.f25828h;
                        }
                        c0603c2.owner = obj3;
                        bVar.R();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x003c, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x003d, code lost:
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0041, code lost:
        return tl.l.f28297a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0042, code lost:
        r10 = h7.a.l(mf.a0.i(r10));
        r0 = new ym.c.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x004f, code lost:
        r1 = r9._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0053, code lost:
        if ((r1 instanceof ym.a) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0055, code lost:
        r6 = (ym.a) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x005c, code lost:
        if (r6.f31804a == rm.b.f25829i) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x005e, code lost:
        r7 = ym.c.f31805a;
        r8 = new ym.c.C0603c(r6.f31804a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x006b, code lost:
        if (r7.compareAndSet(r9, r1, r8) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0072, code lost:
        if (r7.get(r9) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0075, code lost:
        r6 = rm.b.f25830j;
        r7 = ym.c.f31805a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x007d, code lost:
        if (r7.compareAndSet(r9, r1, r6) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x007f, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0085, code lost:
        if (r7.get(r9) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0087, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0088, code lost:
        if (r1 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x008a, code lost:
        r10.C(tl.l.f28297a, r10.f24369c, new ym.d(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0099, code lost:
        if ((r1 instanceof ym.c.C0603c) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x009b, code lost:
        r6 = (ym.c.C0603c) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00a0, code lost:
        if (r6.owner == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00a2, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00a4, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00a5, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00af, code lost:
        if (r6.K().D(r0, r6) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00b3, code lost:
        if (r9._state == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00bb, code lost:
        if (ym.c.b.f31810e.compareAndSet(r0, 0, 1) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00be, code lost:
        r0 = new ym.c.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00c4, code lost:
        r10.z(new pm.v1(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00cc, code lost:
        r10 = r10.t();
        r0 = yl.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00d2, code lost:
        if (r10 != r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00d5, code lost:
        r10 = tl.l.f28297a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00d7, code lost:
        if (r10 != r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00d9, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00dc, code lost:
        return tl.l.f28297a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00e6, code lost:
        throw new java.lang.IllegalStateException("Already locked by null".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00e9, code lost:
        if ((r1 instanceof um.s) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00eb, code lost:
        ((um.s) r1).c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x010a, code lost:
        throw new java.lang.IllegalStateException(("Illegal state " + r1).toString());
     */
    @Override // ym.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(xl.d r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.c.b(xl.d):java.lang.Object");
    }

    public final String toString() {
        StringBuilder a10;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof ym.a) {
                a10 = android.support.v4.media.d.a("Mutex[");
                obj = ((ym.a) obj2).f31804a;
                break;
            } else if (obj2 instanceof s) {
                ((s) obj2).c(this);
            } else if (obj2 instanceof C0603c) {
                a10 = android.support.v4.media.d.a("Mutex[");
                obj = ((C0603c) obj2).owner;
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        a10.append(obj);
        a10.append(']');
        return a10.toString();
    }
}
