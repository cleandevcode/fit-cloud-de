package u0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import u0.d;

/* loaded from: classes.dex */
public final class c extends androidx.constraintlayout.widget.b implements d.c {

    /* renamed from: i */
    public boolean f28444i;

    /* renamed from: j */
    public boolean f28445j;

    /* renamed from: k */
    public float f28446k;

    /* renamed from: l */
    public View[] f28447l;

    @Override // u0.d.c
    public final void a() {
    }

    @Override // u0.d.c
    public final void b() {
    }

    public float getProgress() {
        return this.f28446k;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.f28444i = obtainStyledAttributes.getBoolean(index, this.f28444i);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.f28445j = obtainStyledAttributes.getBoolean(index, this.f28445j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f28446k = f10;
        int i10 = 0;
        if (this.f2001b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f2006g;
            if (viewArr == null || viewArr.length != this.f2001b) {
                this.f2006g = new View[this.f2001b];
            }
            for (int i11 = 0; i11 < this.f2001b; i11++) {
                this.f2006g[i11] = constraintLayout.f1923a.get(this.f2000a[i11]);
            }
            this.f28447l = this.f2006g;
            while (i10 < this.f2001b) {
                View view = this.f28447l[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof c;
            i10++;
        }
    }
}
