package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.cardview.widget.CardView;
import com.topstep.fitcloud.pro.databinding.LayoutExericseCardBinding;
import g7.a;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class ExerciseCardLayout extends CardView {

    /* renamed from: h */
    public final LayoutExericseCardBinding f12337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseCardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        LayoutExericseCardBinding inflate = LayoutExericseCardBinding.inflate(LayoutInflater.from(context), this);
        l.e(inflate, "inflate(LayoutInflater.from(context), this)");
        this.f12337h = inflate;
        setRadius(a.a(getContext(), 8.0f));
        setCardElevation(a.a(context, 1.0f));
        setUseCompatPadding(true);
    }

    public final void setImgIcon(int i10) {
        this.f12337h.imgIcon.setImageResource(i10);
    }

    public final void setTvDes(int i10) {
        this.f12337h.tvDes.setText(i10);
    }

    public final void setTvUnit(int i10) {
        if (i10 == 0) {
            this.f12337h.tvUnit.setVisibility(8);
            return;
        }
        this.f12337h.tvUnit.setVisibility(0);
        this.f12337h.tvUnit.setText(i10);
    }

    public final void setTvValue(String str) {
        this.f12337h.tvValue.setText(str);
    }
}
