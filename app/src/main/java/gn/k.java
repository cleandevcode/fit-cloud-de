package gn;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class k extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f f15607e;

    /* renamed from: f */
    public final /* synthetic */ int f15608f;

    /* renamed from: g */
    public final /* synthetic */ ln.e f15609g;

    /* renamed from: h */
    public final /* synthetic */ int f15610h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, f fVar, int i10, ln.e eVar, int i11, boolean z10) {
        super(str, true);
        this.f15607e = fVar;
        this.f15608f = i10;
        this.f15609g = eVar;
        this.f15610h = i11;
    }

    @Override // cn.a
    public final long a() {
        try {
            u uVar = this.f15607e.f15561l;
            ln.e eVar = this.f15609g;
            int i10 = this.f15610h;
            uVar.getClass();
            gm.l.f(eVar, "source");
            eVar.skip(i10);
            this.f15607e.f15574y.q(this.f15608f, b.CANCEL);
            synchronized (this.f15607e) {
                this.f15607e.A.remove(Integer.valueOf(this.f15608f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
