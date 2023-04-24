package gn;

import gn.f;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class i extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f.d f15601e;

    /* renamed from: f */
    public final /* synthetic */ int f15602f;

    /* renamed from: g */
    public final /* synthetic */ int f15603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, f.d dVar, int i10, int i11) {
        super(str, true);
        this.f15601e = dVar;
        this.f15602f = i10;
        this.f15603g = i11;
    }

    @Override // cn.a
    public final long a() {
        f fVar = f.this;
        int i10 = this.f15602f;
        int i11 = this.f15603g;
        fVar.getClass();
        try {
            fVar.f15574y.k(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            fVar.b(e10);
            return -1L;
        }
    }
}
