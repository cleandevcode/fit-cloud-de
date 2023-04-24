package b0;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator<Size> {

    /* renamed from: a */
    public boolean f3935a;

    public d(boolean z10) {
        this.f3935a = z10;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int signum = Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
        return this.f3935a ? signum * (-1) : signum;
    }
}
