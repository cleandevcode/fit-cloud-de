package ph;

/* loaded from: classes2.dex */
public final class s extends gm.m implements fm.l<Integer, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ u f24222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar) {
        super(1);
        this.f24222b = uVar;
    }

    @Override // fm.l
    public final tl.l k(Integer num) {
        Integer num2 = num;
        u uVar = this.f24222b;
        gm.l.e(num2, "it");
        uVar.n1(Math.max(num2.intValue(), 0));
        return tl.l.f28297a;
    }
}
