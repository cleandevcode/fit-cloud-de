package ci;

import android.view.View;
import ci.b;

/* loaded from: classes2.dex */
public final class c extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ boolean f4729b;

    /* renamed from: c */
    public final /* synthetic */ b f4730c;

    /* renamed from: d */
    public final /* synthetic */ a f4731d;

    /* renamed from: e */
    public final /* synthetic */ b.a f4732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, b bVar, a aVar, b.a aVar2) {
        super(1);
        this.f4729b = z10;
        this.f4730c = bVar;
        this.f4731d = aVar;
        this.f4732e = aVar2;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        b bVar;
        long j10;
        gm.l.f(view, "it");
        if (this.f4729b) {
            if (this.f4730c.f4718e.remove(this.f4731d)) {
                bVar = this.f4730c;
                j10 = bVar.f4719f - this.f4731d.f4710f;
                bVar.f4719f = j10;
            }
        } else if (this.f4730c.f4718e.add(this.f4731d)) {
            bVar = this.f4730c;
            j10 = bVar.f4719f + this.f4731d.f4710f;
            bVar.f4719f = j10;
        }
        b bVar2 = this.f4730c;
        bVar2.y(bVar2.f4717d);
        b bVar3 = this.f4730c;
        bVar3.f2947a.d(this.f4732e.d(), 1, null);
        b.InterfaceC0075b interfaceC0075b = this.f4730c.f4720g;
        if (interfaceC0075b != null) {
            interfaceC0075b.a();
        }
        return tl.l.f28297a;
    }
}
