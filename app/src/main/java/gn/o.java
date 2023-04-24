package gn;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class o extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f f15620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, f fVar) {
        super(str, true);
        this.f15620e = fVar;
    }

    @Override // cn.a
    public final long a() {
        f fVar = this.f15620e;
        fVar.getClass();
        try {
            fVar.f15574y.k(2, 0, false);
            return -1L;
        } catch (IOException e10) {
            fVar.b(e10);
            return -1L;
        }
    }
}
