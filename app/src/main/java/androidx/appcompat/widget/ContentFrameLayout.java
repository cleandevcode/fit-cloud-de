package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f1100a;

    /* renamed from: b */
    public TypedValue f1101b;

    /* renamed from: c */
    public TypedValue f1102c;

    /* renamed from: d */
    public TypedValue f1103d;

    /* renamed from: e */
    public TypedValue f1104e;

    /* renamed from: f */
    public TypedValue f1105f;

    /* renamed from: g */
    public final Rect f1106g;

    /* renamed from: h */
    public a f1107h;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1106g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1104e == null) {
            this.f1104e = new TypedValue();
        }
        return this.f1104e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1105f == null) {
            this.f1105f = new TypedValue();
        }
        return this.f1105f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1102c == null) {
            this.f1102c = new TypedValue();
        }
        return this.f1102c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1103d == null) {
            this.f1103d = new TypedValue();
        }
        return this.f1103d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1100a == null) {
            this.f1100a = new TypedValue();
        }
        return this.f1100a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1101b == null) {
            this.f1101b = new TypedValue();
        }
        return this.f1101b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1107h;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1107h;
        if (aVar != null) {
            f.j jVar = ((f.l) aVar).f13955a;
            i1 i1Var = jVar.f13904l;
            if (i1Var != null) {
                i1Var.j();
            }
            if (jVar.f13910q != null) {
                jVar.f13892f.getDecorView().removeCallbacks(jVar.f13911r);
                if (jVar.f13910q.isShowing()) {
                    try {
                        jVar.f13910q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jVar.f13910q = null;
            }
            k1.i2 i2Var = jVar.f13912s;
            if (i2Var != null) {
                i2Var.b();
            }
            androidx.appcompat.view.menu.f fVar = jVar.I(0).f13944h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0086  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1107h = aVar;
    }
}
