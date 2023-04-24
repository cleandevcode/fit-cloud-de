package ha;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f16067a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16067a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16067a.e();
    }
}
