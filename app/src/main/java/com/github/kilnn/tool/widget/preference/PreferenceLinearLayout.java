package com.github.kilnn.tool.widget.preference;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gm.l;
import kotlin.Metadata;
import l7.a;
import l7.b;

@Metadata
/* loaded from: classes.dex */
public class PreferenceLinearLayout extends LinearLayout implements a {

    /* renamed from: a */
    public final b f5954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        b bVar = new b(this);
        this.f5954a = bVar;
        b.a(bVar, context, attributeSet);
    }

    @Override // l7.a
    public final void c(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    @Override // l7.a
    public final void e(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public Drawable getPreferenceDividerDrawable() {
        return this.f5954a.f19397c;
    }

    public Drawable getPreferenceIndicatorDrawable() {
        return this.f5954a.f19399e;
    }

    public int getShowPreferenceDividers() {
        return this.f5954a.f19398d;
    }

    public boolean getShowPreferenceIndicator() {
        return this.f5954a.f19400f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        this.f5954a.d(canvas);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f5954a.f(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        this.f5954a.g(i10, i11, i12, i13);
    }

    public void setPreferenceDividerDrawable(Drawable drawable) {
        this.f5954a.h(drawable);
    }

    public void setPreferenceIndicatorDrawable(Drawable drawable) {
        this.f5954a.i(drawable);
    }

    public void setShowPreferenceDividers(int i10) {
        this.f5954a.j(i10);
    }

    public void setShowPreferenceIndicator(boolean z10) {
        this.f5954a.k(z10);
    }
}
