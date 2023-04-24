package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: i */
    public int f1919i;

    /* renamed from: j */
    public int f1920j;

    /* renamed from: k */
    public s0.a f1921k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1921k.f26274v0;
    }

    public int getMargin() {
        return this.f1921k.f26275w0;
    }

    public int getType() {
        return this.f1919i;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1921k = new s0.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1921k.f26274v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f1921k.f26275w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2003d = this.f1921k;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0014, code lost:
        if (r0 == 6) goto L13;
     */
    @Override // androidx.constraintlayout.widget.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(s0.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1919i
            r3.f1920j = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L16
        Lb:
            if (r0 != r1) goto L18
            goto L10
        Le:
            if (r0 != r2) goto L14
        L10:
            r5 = 0
        L11:
            r3.f1920j = r5
            goto L18
        L14:
            if (r0 != r1) goto L18
        L16:
            r5 = 1
            goto L11
        L18:
            boolean r5 = r4 instanceof s0.a
            if (r5 == 0) goto L22
            s0.a r4 = (s0.a) r4
            int r5 = r3.f1920j
            r4.f26273u0 = r5
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(s0.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1921k.f26274v0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f1921k.f26275w0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1921k.f26275w0 = i10;
    }

    public void setType(int i10) {
        this.f1919i = i10;
    }
}
