package qi;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;

/* loaded from: classes2.dex */
public final class c extends j5.c<Bitmap> {

    /* renamed from: d */
    public final /* synthetic */ DialView f24844d;

    public c(DialView dialView) {
        this.f24844d = dialView;
    }

    @Override // j5.h
    public final void c(Object obj) {
        this.f24844d.setBackgroundBitmap((Bitmap) obj);
    }

    @Override // j5.h
    public final void h(Drawable drawable) {
        this.f24844d.setBackgroundBitmap(null);
    }
}
