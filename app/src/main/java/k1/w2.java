package k1;

import android.view.View;
import android.view.Window;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class w2 extends v2 {
    public w2(Window window, View view) {
        super(window, view);
    }

    @Override // ie.b
    public final void g(boolean z10) {
        if (z10) {
            this.f18182d.clearFlags(67108864);
            this.f18182d.addFlags(Integer.MIN_VALUE);
            i(DfuBaseService.ERROR_REMOTE_MASK);
            return;
        }
        j(DfuBaseService.ERROR_REMOTE_MASK);
    }
}
