package x2;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class w implements x {

    /* renamed from: a */
    public final WindowId f30192a;

    public w(View view) {
        this.f30192a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).f30192a.equals(this.f30192a);
    }

    public final int hashCode() {
        return this.f30192a.hashCode();
    }
}
