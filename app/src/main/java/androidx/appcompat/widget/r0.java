package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.s0;

/* loaded from: classes.dex */
public final class r0 extends o1 {

    /* renamed from: j */
    public final /* synthetic */ s0.g f1494j;

    /* renamed from: k */
    public final /* synthetic */ s0 f1495k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, View view, s0.g gVar) {
        super(view);
        this.f1495k = s0Var;
        this.f1494j = gVar;
    }

    @Override // androidx.appcompat.widget.o1
    public final l.f b() {
        return this.f1494j;
    }

    @Override // androidx.appcompat.widget.o1
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        if (!this.f1495k.getInternalPopup().a()) {
            s0 s0Var = this.f1495k;
            s0Var.f1535f.n(s0.c.b(s0Var), s0.c.a(s0Var));
            return true;
        }
        return true;
    }
}
