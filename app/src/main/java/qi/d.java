package qi;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;

/* loaded from: classes2.dex */
public final class d extends j5.c<Bitmap> {

    /* renamed from: d */
    public final /* synthetic */ DialView f24845d;

    /* renamed from: e */
    public final /* synthetic */ int f24846e;

    public d(DialView dialView, int i10) {
        this.f24845d = dialView;
        this.f24846e = i10;
    }

    @Override // j5.h
    public final void c(Object obj) {
        this.f24845d.a((Bitmap) obj, this.f24846e);
    }

    @Override // j5.h
    public final void h(Drawable drawable) {
        this.f24845d.a(null, this.f24846e);
    }
}
