package jj;

/* loaded from: classes2.dex */
public final class t extends gm.m implements fm.l<Byte, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ byte f17976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(byte b10) {
        super(1);
        this.f17976b = b10;
    }

    @Override // fm.l
    public final Boolean k(Byte b10) {
        Byte b11 = b10;
        boolean z10 = false;
        if (b11 != null && b11.byteValue() == this.f17976b) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
