package da;

import android.graphics.Typeface;
import androidx.fragment.app.a0;

/* loaded from: classes.dex */
public final class a extends a0 {

    /* renamed from: a */
    public final Typeface f12922a;

    /* renamed from: b */
    public final InterfaceC0219a f12923b;

    /* renamed from: c */
    public boolean f12924c;

    /* renamed from: da.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0219a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0219a interfaceC0219a, Typeface typeface) {
        this.f12922a = typeface;
        this.f12923b = interfaceC0219a;
    }

    @Override // androidx.fragment.app.a0
    public final void v(int i10) {
        Typeface typeface = this.f12922a;
        if (this.f12924c) {
            return;
        }
        this.f12923b.a(typeface);
    }

    @Override // androidx.fragment.app.a0
    public final void w(Typeface typeface, boolean z10) {
        if (this.f12924c) {
            return;
        }
        this.f12923b.a(typeface);
    }
}
