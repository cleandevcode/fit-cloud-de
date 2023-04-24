package gn;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class m extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f f15614e;

    /* renamed from: f */
    public final /* synthetic */ int f15615f;

    /* renamed from: g */
    public final /* synthetic */ List f15616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i10, List list) {
        super(str, true);
        this.f15614e = fVar;
        this.f15615f = i10;
        this.f15616g = list;
    }

    @Override // cn.a
    public final long a() {
        u uVar = this.f15614e.f15561l;
        List list = this.f15616g;
        uVar.getClass();
        gm.l.f(list, "requestHeaders");
        try {
            this.f15614e.f15574y.q(this.f15615f, b.CANCEL);
            synchronized (this.f15614e) {
                this.f15614e.A.remove(Integer.valueOf(this.f15615f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
