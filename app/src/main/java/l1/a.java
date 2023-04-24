package l1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a */
    public final int f18665a;

    /* renamed from: b */
    public final j f18666b;

    /* renamed from: c */
    public final int f18667c;

    public a(int i10, j jVar, int i11) {
        this.f18665a = i10;
        this.f18666b = jVar;
        this.f18667c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18665a);
        j jVar = this.f18666b;
        jVar.f18670a.performAction(this.f18667c, bundle);
    }
}
