package om;

import fm.p;
import gm.m;

/* loaded from: classes2.dex */
public final class i extends m implements p<CharSequence, Integer, tl.f<? extends Integer, ? extends Integer>> {

    /* renamed from: b */
    public final /* synthetic */ char[] f23638b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(char[] cArr, boolean z10) {
        super(2);
        this.f23638b = cArr;
        this.f23639c = z10;
    }

    @Override // fm.p
    public final tl.f<? extends Integer, ? extends Integer> A(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        gm.l.f(charSequence2, "$this$$receiver");
        int i02 = l.i0(intValue, charSequence2, this.f23639c, this.f23638b);
        if (i02 < 0) {
            return null;
        }
        return new tl.f<>(Integer.valueOf(i02), 1);
    }
}
