package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class u0 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f2596a;

    public u0(Rect rect) {
        this.f2596a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f2596a;
    }
}
