package jc;

/* loaded from: classes.dex */
public final class n extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17592b;

    /* renamed from: c */
    public final /* synthetic */ Boolean f17593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Boolean bool) {
        super(0);
        this.f17592b = uVar;
        this.f17593c = bool;
    }

    @Override // fm.a
    public final tl.l m() {
        u uVar = this.f17592b;
        Boolean bool = this.f17593c;
        gm.l.e(bool, "granted");
        boolean booleanValue = bool.booleanValue();
        int i10 = u.f17601x0;
        if (uVar.c1()) {
            uVar.e1(new h(uVar, booleanValue));
        }
        return tl.l.f28297a;
    }
}
