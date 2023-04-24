package n0;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public final class a {
    public final void a(b bVar, float f10) {
        CardView.a aVar = (CardView.a) bVar;
        c cVar = (c) aVar.f1916a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f10 != cVar.f21913e || cVar.f21914f != useCompatPadding || cVar.f21915g != preventCornerOverlap) {
            cVar.f21913e = f10;
            cVar.f21914f = useCompatPadding;
            cVar.f21915g = preventCornerOverlap;
            cVar.c(null);
            cVar.invalidateSelf();
        }
        b(aVar);
    }

    public final void b(b bVar) {
        float f10;
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar.f1916a;
        float f11 = ((c) drawable).f21913e;
        float f12 = ((c) drawable).f21909a;
        if (CardView.this.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - d.f21920a) * f12) + f11);
        } else {
            int i10 = d.f21921b;
            f10 = f11;
        }
        int ceil = (int) Math.ceil(f10);
        int ceil2 = (int) Math.ceil(d.a(f11, f12, CardView.this.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }
}
