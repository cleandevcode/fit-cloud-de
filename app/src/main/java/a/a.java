package a;

import gm.j;

/* loaded from: classes.dex */
public final class a implements c4.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c4.d f0a;

    public a(c4.d dVar) {
        this.f0a = dVar;
    }

    @Override // c4.g
    public final void a() {
        j.e("DefaultDataHandler", "check FGS send success...");
    }

    @Override // c4.g
    public final void b(int i10, String str) {
        c4.c cVar;
        c4.d dVar = this.f0a;
        if (dVar == null || (cVar = ((t3.a) dVar).f27528d) == null) {
            return;
        }
        cVar.b(0, "send FGS_MSG_TYPE_START_LP_AUTH_REQ failed");
    }
}
