package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.R;
import androidx.appcompat.widget.o;
import k1.o0;
import z9.c;

/* loaded from: classes.dex */
public class CheckableImageButton extends o implements Checkable {

    /* renamed from: g */
    public static final int[] f6619g = {16842912};

    /* renamed from: d */
    public boolean f6620d;

    /* renamed from: e */
    public boolean f6621e;

    /* renamed from: f */
    public boolean f6622f;

    /* loaded from: classes.dex */
    public static class a extends q1.a {
        public static final Parcelable.Creator<a> CREATOR = new C0095a();

        /* renamed from: c */
        public boolean f6623c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        /* loaded from: classes.dex */
        public class C0095a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6623c = parcel.readInt() == 1;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f6623c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f6621e = true;
        this.f6622f = true;
        o0.p(this, new c(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6620d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f6620d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f6619g);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f24504a);
        setChecked(aVar.f6623c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f6623c = this.f6620d;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f6621e != z10) {
            this.f6621e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f6621e || this.f6620d == z10) {
            return;
        }
        this.f6620d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f6622f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f6622f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6620d);
    }
}
