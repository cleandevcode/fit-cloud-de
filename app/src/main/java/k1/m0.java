package k1;

import android.text.TextUtils;
import android.view.View;
import k1.o0;

/* loaded from: classes.dex */
public final class m0 extends o0.b<CharSequence> {
    public m0(int i10, Class cls) {
        super(i10, cls, 64, 30);
    }

    @Override // k1.o0.b
    public final CharSequence b(View view) {
        return o0.o.a(view);
    }

    @Override // k1.o0.b
    public final void c(View view, CharSequence charSequence) {
        o0.o.b(view, charSequence);
    }

    @Override // k1.o0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
