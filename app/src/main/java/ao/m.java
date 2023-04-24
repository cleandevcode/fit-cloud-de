package ao;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ b f3835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar) {
        super(1);
        this.f3835b = bVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f3835b.cancel();
        return tl.l.f28297a;
    }
}
