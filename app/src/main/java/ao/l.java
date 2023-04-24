package ao;

/* loaded from: classes2.dex */
public final class l extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ b f3834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar) {
        super(1);
        this.f3834b = bVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f3834b.cancel();
        return tl.l.f28297a;
    }
}
