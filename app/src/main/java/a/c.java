package a;

/* loaded from: classes.dex */
public final class c implements c4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c4.d f1a;

    public c(c4.d dVar) {
        this.f1a = dVar;
    }

    @Override // c4.g
    public final void a() {
        c4.c cVar = ((t3.a) this.f1a).f27528d;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // c4.g
    public final void b(int i10, String str) {
        c4.d dVar = this.f1a;
        String b10 = b.b("send 2 bt device failed :", str);
        c4.c cVar = ((t3.a) dVar).f27528d;
        if (cVar != null) {
            cVar.b(i10, b10);
        }
    }
}
