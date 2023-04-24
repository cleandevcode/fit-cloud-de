package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.g;
import s0.d;
import s0.f;
import s0.k;

/* loaded from: classes.dex */
public class Flow extends g {

    /* renamed from: k */
    public f f1918k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.g, androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1918k = new f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f1918k.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    f fVar = this.f1918k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.f26394u0 = dimensionPixelSize;
                    fVar.f26395v0 = dimensionPixelSize;
                    fVar.f26396w0 = dimensionPixelSize;
                    fVar.f26397x0 = dimensionPixelSize;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    f fVar2 = this.f1918k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.f26396w0 = dimensionPixelSize2;
                    fVar2.f26398y0 = dimensionPixelSize2;
                    fVar2.f26399z0 = dimensionPixelSize2;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1918k.f26397x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1918k.f26398y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1918k.f26394u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1918k.f26399z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1918k.f26395v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1918k.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1918k.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1918k.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1918k.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1918k.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1918k.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1918k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1918k.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1918k.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1918k.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1918k.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1918k.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1918k.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1918k.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1918k.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1918k.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1918k.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1918k.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2003d = this.f1918k;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(d dVar, boolean z10) {
        f fVar = this.f1918k;
        int i10 = fVar.f26396w0;
        if (i10 > 0 || fVar.f26397x0 > 0) {
            if (z10) {
                fVar.f26398y0 = fVar.f26397x0;
                fVar.f26399z0 = i10;
                return;
            }
            fVar.f26398y0 = i10;
            fVar.f26399z0 = fVar.f26397x0;
        }
    }

    @Override // androidx.constraintlayout.widget.g
    public final void l(k kVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (kVar != null) {
            kVar.S(mode, size, mode2, size2);
            setMeasuredDimension(kVar.B0, kVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        l(this.f1918k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1918k.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1918k.H0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1918k.O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1918k.I0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1918k.T0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1918k.L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1918k.R0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1918k.F0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1918k.P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1918k.J0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1918k.Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1918k.K0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1918k.W0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1918k.X0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        f fVar = this.f1918k;
        fVar.f26394u0 = i10;
        fVar.f26395v0 = i10;
        fVar.f26396w0 = i10;
        fVar.f26397x0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1918k.f26395v0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1918k.f26398y0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1918k.f26399z0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1918k.f26394u0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1918k.U0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1918k.M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1918k.S0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1918k.G0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1918k.V0 = i10;
        requestLayout();
    }
}
