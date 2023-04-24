package com.google.android.material.timepicker;

import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import l1.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends d implements ClockHandView.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public String[] E;
    public float F;
    public final ColorStateList H;

    /* renamed from: t */
    public final ClockHandView f6889t;

    /* renamed from: u */
    public final Rect f6890u;

    /* renamed from: v */
    public final RectF f6891v;

    /* renamed from: w */
    public final SparseArray<TextView> f6892w;

    /* renamed from: x */
    public final c f6893x;

    /* renamed from: y */
    public final int[] f6894y;

    /* renamed from: z */
    public final float[] f6895z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ClockFaceView(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.F - f10) > 0.001f) {
            this.F = f10;
            j();
        }
    }

    public final void j() {
        RadialGradient radialGradient;
        RectF rectF = this.f6889t.f6900e;
        for (int i10 = 0; i10 < this.f6892w.size(); i10++) {
            TextView textView = this.f6892w.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f6890u);
                offsetDescendantRectToMyCoords(textView, this.f6890u);
                textView.setSelected(rectF.contains(this.f6890u.centerX(), this.f6890u.centerY()));
                this.f6891v.set(this.f6890u);
                this.f6891v.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                if (!RectF.intersects(rectF, this.f6891v)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.f6891v.left, rectF.centerY() - this.f6891v.top, 0.5f * rectF.width(), this.f6894y, this.f6895z, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(1, this.E.length, 1).f18685a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.D / Math.max(Math.max(this.B / displayMetrics.heightPixels, this.C / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
