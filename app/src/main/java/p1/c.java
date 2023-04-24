package p1;

import android.content.Context;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: h */
    public int f23770h;

    /* renamed from: i */
    public int f23771i;

    /* renamed from: j */
    public LayoutInflater f23772j;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.f23771i = i10;
        this.f23770h = i10;
        this.f23772j = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
