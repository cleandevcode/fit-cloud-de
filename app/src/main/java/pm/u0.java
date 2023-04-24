package pm;

/* loaded from: classes2.dex */
public abstract class u0 extends b0 {

    /* renamed from: f */
    public static final /* synthetic */ int f24397f = 0;

    /* renamed from: c */
    public long f24398c;

    /* renamed from: d */
    public boolean f24399d;

    /* renamed from: e */
    public um.a<m0<?>> f24400e;

    public final void q0(boolean z10) {
        long j10 = this.f24398c - (z10 ? 4294967296L : 1L);
        this.f24398c = j10;
        if (j10 <= 0 && this.f24399d) {
            shutdown();
        }
    }

    public void shutdown() {
    }

    public final void t0(m0<?> m0Var) {
        um.a<m0<?>> aVar = this.f24400e;
        if (aVar == null) {
            aVar = new um.a<>();
            this.f24400e = aVar;
        }
        Object[] objArr = aVar.f28884a;
        int i10 = aVar.f28886c;
        objArr[i10] = m0Var;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f28886c = length;
        int i11 = aVar.f28885b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            ul.i.x(objArr, objArr2, 0, i11, 0, 10);
            Object[] objArr3 = aVar.f28884a;
            int length3 = objArr3.length;
            int i12 = aVar.f28885b;
            ul.i.x(objArr3, objArr2, length3 - i12, 0, i12, 4);
            aVar.f28884a = objArr2;
            aVar.f28885b = 0;
            aVar.f28886c = length2;
        }
    }

    public final void u0(boolean z10) {
        this.f24398c = (z10 ? 4294967296L : 1L) + this.f24398c;
        if (z10) {
            return;
        }
        this.f24399d = true;
    }

    public final boolean w0() {
        return this.f24398c >= 4294967296L;
    }

    public long x0() {
        return !y0() ? Long.MAX_VALUE : 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean y0() {
        um.a<m0<?>> aVar = this.f24400e;
        if (aVar == null) {
            return false;
        }
        int i10 = aVar.f28885b;
        m0 m0Var = null;
        if (i10 != aVar.f28886c) {
            ?? r32 = aVar.f28884a;
            ?? r62 = r32[i10];
            r32[i10] = 0;
            aVar.f28885b = (i10 + 1) & (r32.length - 1);
            if (r62 != 0) {
                m0Var = r62;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        m0 m0Var2 = m0Var;
        if (m0Var2 == null) {
            return false;
        }
        m0Var2.run();
        return true;
    }
}
