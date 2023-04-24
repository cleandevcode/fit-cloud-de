package jc;

/* loaded from: classes.dex */
public final class m extends gm.m implements fm.a<tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f17590b;

    /* renamed from: c */
    public final /* synthetic */ Boolean f17591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, Boolean bool) {
        super(0);
        this.f17590b = uVar;
        this.f17591c = bool;
    }

    @Override // fm.a
    public final tl.l m() {
        u uVar = this.f17590b;
        Boolean bool = this.f17591c;
        gm.l.e(bool, "granted");
        boolean booleanValue = bool.booleanValue();
        int i10 = u.f17601x0;
        if (uVar.c1()) {
            uVar.e1(new g(uVar, booleanValue));
        }
        return tl.l.f28297a;
    }
}
