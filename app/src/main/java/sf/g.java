package sf;

/* loaded from: classes2.dex */
public final class g extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ i f26927b;

    /* renamed from: c */
    public final /* synthetic */ h f26928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, h hVar) {
        super(1);
        this.f26927b = iVar;
        this.f26928c = hVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f26927b.f26931a.unregisterReceiver(this.f26928c);
        return tl.l.f28297a;
    }
}
