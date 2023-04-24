package xh;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentView;

/* loaded from: classes2.dex */
public final class h extends j5.c<Bitmap> {

    /* renamed from: d */
    public final /* synthetic */ DialComponentView f30566d;

    public h(DialComponentView dialComponentView) {
        this.f30566d = dialComponentView;
    }

    @Override // j5.h
    public final void c(Object obj) {
        DialComponentView dialComponentView = this.f30566d;
        dialComponentView.f10976e = (Bitmap) obj;
        dialComponentView.invalidate();
    }

    @Override // j5.h
    public final void h(Drawable drawable) {
    }
}
