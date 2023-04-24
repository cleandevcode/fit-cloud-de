package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

/* loaded from: classes.dex */
public abstract class k0 extends RecyclerView.j {

    /* renamed from: g */
    public boolean f3128g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2956a;
        int i13 = cVar.f2957b;
        if (b0Var2.q()) {
            int i14 = cVar.f2956a;
            i11 = cVar.f2957b;
            i10 = i14;
        } else {
            i10 = cVar2.f2956a;
            i11 = cVar2.f2957b;
        }
        p pVar = (p) this;
        if (b0Var == b0Var2) {
            return pVar.h(b0Var, i12, i13, i10, i11);
        }
        float translationX = b0Var.f2927a.getTranslationX();
        float translationY = b0Var.f2927a.getTranslationY();
        float alpha = b0Var.f2927a.getAlpha();
        pVar.m(b0Var);
        b0Var.f2927a.setTranslationX(translationX);
        b0Var.f2927a.setTranslationY(translationY);
        b0Var.f2927a.setAlpha(alpha);
        pVar.m(b0Var2);
        b0Var2.f2927a.setTranslationX(-((int) ((i10 - i12) - translationX)));
        b0Var2.f2927a.setTranslationY(-((int) ((i11 - i13) - translationY)));
        b0Var2.f2927a.setAlpha(0.0f);
        pVar.f3160k.add(new p.a(b0Var, b0Var2, i12, i13, i10, i11));
        return true;
    }

    public abstract boolean h(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13);
}
