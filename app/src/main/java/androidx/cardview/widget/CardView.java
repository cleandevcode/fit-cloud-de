package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.R;
import n0.b;
import n0.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f1909f = {16842801};

    /* renamed from: g */
    public static final n0.a f1910g = new n0.a();

    /* renamed from: a */
    public boolean f1911a;

    /* renamed from: b */
    public boolean f1912b;

    /* renamed from: c */
    public final Rect f1913c;

    /* renamed from: d */
    public final Rect f1914d;

    /* renamed from: e */
    public final a f1915e;

    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a */
        public Drawable f1916a;

        public a() {
            CardView.this = r1;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1914d.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1913c;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1913c = rect;
        this.f1914d = new Rect();
        a aVar = new a();
        this.f1915e = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i10, R.style.CardView);
        int i12 = R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1909f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i11 = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f1911a = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.f1912b = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        n0.a aVar2 = f1910g;
        c cVar = new c(dimension, valueOf);
        aVar.f1916a = cVar;
        setBackgroundDrawable(cVar);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar2.a(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((c) this.f1915e.f1916a).f21916h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1913c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1913c.left;
    }

    public int getContentPaddingRight() {
        return this.f1913c.right;
    }

    public int getContentPaddingTop() {
        return this.f1913c.top;
    }

    public float getMaxCardElevation() {
        return ((c) this.f1915e.f1916a).f21913e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1912b;
    }

    public float getRadius() {
        return ((c) this.f1915e.f1916a).f21909a;
    }

    public boolean getUseCompatPadding() {
        return this.f1911a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        a aVar = this.f1915e;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        c cVar = (c) aVar.f1916a;
        cVar.b(valueOf);
        cVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f1910g.a(this.f1915e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1912b) {
            this.f1912b = z10;
            n0.a aVar = f1910g;
            a aVar2 = this.f1915e;
            aVar.a(aVar2, ((c) aVar2.f1916a).f21913e);
        }
    }

    public void setRadius(float f10) {
        c cVar = (c) this.f1915e.f1916a;
        if (f10 != cVar.f21909a) {
            cVar.f21909a = f10;
            cVar.c(null);
            cVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1911a != z10) {
            this.f1911a = z10;
            n0.a aVar = f1910g;
            a aVar2 = this.f1915e;
            aVar.a(aVar2, ((c) aVar2.f1916a).f21913e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c cVar = (c) this.f1915e.f1916a;
        cVar.b(colorStateList);
        cVar.invalidateSelf();
    }
}
