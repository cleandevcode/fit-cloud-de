package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.List;
import pl.droidsonroids.gif.d;

/* loaded from: classes2.dex */
public class GifImageView extends ImageView {

    /* renamed from: a */
    public boolean f24289a;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d.a aVar;
        List<String> list = d.f24314a;
        if (attributeSet != null && !isInEditMode()) {
            aVar = new d.a(this, attributeSet);
            int i10 = aVar.f24318b;
            if (i10 >= 0) {
                Drawable drawable = getDrawable();
                if (drawable instanceof b) {
                    ((b) drawable).f24299g.s(i10);
                }
                Drawable background = getBackground();
                if (background instanceof b) {
                    ((b) background).f24299g.s(i10);
                }
            }
        } else {
            aVar = new d.a();
        }
        this.f24289a = aVar.f24317a;
        int i11 = aVar.f24315c;
        if (i11 > 0) {
            super.setImageResource(i11);
        }
        int i12 = aVar.f24316d;
        if (i12 > 0) {
            super.setBackgroundResource(i12);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        Drawable drawable = getDrawable();
        long[] jArr = cVar.f24313a[0];
        if (jArr != null && (drawable instanceof b)) {
            b bVar = (b) drawable;
            bVar.a(bVar.f24299g.p(jArr, bVar.f24298f));
        }
        Drawable background = getBackground();
        long[] jArr2 = cVar.f24313a[1];
        if (jArr2 != null && (background instanceof b)) {
            b bVar2 = (b) background;
            bVar2.a(bVar2.f24299g.p(jArr2, bVar2.f24298f));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f24289a ? getDrawable() : null, this.f24289a ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (d.a(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f24289a = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (d.a(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setImageURI(android.net.Uri r3) {
        /*
            r2 = this;
            java.util.List<java.lang.String> r0 = pl.droidsonroids.gif.d.f24314a
            if (r3 == 0) goto L16
            pl.droidsonroids.gif.b r0 = new pl.droidsonroids.gif.b     // Catch: java.io.IOException -> L16
            android.content.Context r1 = r2.getContext()     // Catch: java.io.IOException -> L16
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L16
            r0.<init>(r1, r3)     // Catch: java.io.IOException -> L16
            r2.setImageDrawable(r0)     // Catch: java.io.IOException -> L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1c
            super.setImageURI(r3)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifImageView.setImageURI(android.net.Uri):void");
    }
}
