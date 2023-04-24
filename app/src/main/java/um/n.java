package um;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f28930a;

    /* renamed from: b */
    public final boolean f28931b;

    /* renamed from: c */
    public final int f28932c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f28933d;

    /* renamed from: g */
    public static final x f28929g = new x("REMOVE_FROZEN");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28927e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f28928f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f28934a;

        public a(int i10) {
            this.f28934a = i10;
        }
    }

    public n(int i10, boolean z10) {
        this.f28930a = i10;
        this.f28931b = z10;
        int i11 = i10 - 1;
        this.f28932c = i11;
        this.f28933d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0051, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(E r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.f28932c
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.f28931b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f28933d
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.f28930a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = um.n.f28928f
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f28933d
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La1
            um.n r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f28933d
            int r2 = r0.f28932c
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof um.n.a
            if (r2 == 0) goto L9e
            um.n$a r1 = (um.n.a) r1
            int r1 = r1.f28934a
            if (r1 != r12) goto L9e
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f28933d
            int r2 = r0.f28932c
            r2 = r2 & r12
            r1.set(r2, r7)
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto L73
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: um.n.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f28928f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<E> e() {
        long j10;
        while (true) {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) == 0) {
                long j11 = j10 | 1152921504606846976L;
                if (f28928f.compareAndSet(this, j10, j11)) {
                    j10 = j11;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            n<E> nVar = (n) this._next;
            if (nVar != null) {
                return nVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28927e;
            n nVar2 = new n(this.f28930a * 2, this.f28931b);
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f28932c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = this.f28933d.get(i13);
                if (obj == null) {
                    obj = new a(i10);
                }
                nVar2.f28933d.set(nVar2.f28932c & i10, obj);
                i10++;
            }
            nVar2._state = (-1152921504606846977L) & j10;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f28929g;
            }
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f28932c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f28933d.get(i13);
            if (obj == null) {
                if (this.f28931b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((i10 + 1) & 1073741823) << 0;
                if (f28928f.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    this.f28933d.set(this.f28932c & i10, null);
                    return obj;
                } else if (this.f28931b) {
                    n<E> nVar = this;
                    while (true) {
                        long j12 = nVar._state;
                        int i14 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            nVar = nVar.e();
                        } else {
                            if (f28928f.compareAndSet(nVar, j12, (j12 & (-1073741824)) | j11)) {
                                nVar.f28933d.set(nVar.f28932c & i14, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
