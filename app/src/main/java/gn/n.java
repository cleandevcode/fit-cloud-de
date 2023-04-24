package gn;

/* loaded from: classes2.dex */
public final class n extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ f f15617e;

    /* renamed from: f */
    public final /* synthetic */ int f15618f;

    /* renamed from: g */
    public final /* synthetic */ b f15619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, f fVar, int i10, b bVar) {
        super(str, true);
        this.f15617e = fVar;
        this.f15618f = i10;
        this.f15619g = bVar;
    }

    @Override // cn.a
    public final long a() {
        u uVar = this.f15617e.f15561l;
        b bVar = this.f15619g;
        uVar.getClass();
        gm.l.f(bVar, "errorCode");
        synchronized (this.f15617e) {
            this.f15617e.A.remove(Integer.valueOf(this.f15618f));
            tl.l lVar = tl.l.f28297a;
        }
        return -1L;
    }
}
