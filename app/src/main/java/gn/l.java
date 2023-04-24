package gn;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f f15611e;

    /* renamed from: f */
    public final /* synthetic */ int f15612f;

    /* renamed from: g */
    public final /* synthetic */ List f15613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, f fVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f15611e = fVar;
        this.f15612f = i10;
        this.f15613g = list;
    }

    @Override // cn.a
    public final long a() {
        u uVar = this.f15611e.f15561l;
        List list = this.f15613g;
        uVar.getClass();
        gm.l.f(list, "responseHeaders");
        try {
            this.f15611e.f15574y.q(this.f15612f, b.CANCEL);
            synchronized (this.f15611e) {
                this.f15611e.A.remove(Integer.valueOf(this.f15612f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
