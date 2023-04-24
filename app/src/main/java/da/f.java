package da;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.a0;

/* loaded from: classes.dex */
public final class f extends a0 {

    /* renamed from: a */
    public final /* synthetic */ Context f12941a;

    /* renamed from: b */
    public final /* synthetic */ TextPaint f12942b;

    /* renamed from: c */
    public final /* synthetic */ a0 f12943c;

    /* renamed from: d */
    public final /* synthetic */ e f12944d;

    public f(e eVar, Context context, TextPaint textPaint, a0 a0Var) {
        this.f12944d = eVar;
        this.f12941a = context;
        this.f12942b = textPaint;
        this.f12943c = a0Var;
    }

    @Override // androidx.fragment.app.a0
    public final void v(int i10) {
        this.f12943c.v(i10);
    }

    @Override // androidx.fragment.app.a0
    public final void w(Typeface typeface, boolean z10) {
        this.f12944d.g(this.f12941a, this.f12942b, typeface);
        this.f12943c.w(typeface, z10);
    }
}
