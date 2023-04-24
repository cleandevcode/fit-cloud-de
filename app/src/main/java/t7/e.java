package t7;

import android.graphics.Color;
import java.util.ArrayList;
import t7.k;

/* loaded from: classes.dex */
public abstract class e<T extends k> extends j<T> implements x7.b<T> {

    /* renamed from: t */
    public int f27806t;

    public e(String str, ArrayList arrayList) {
        super(str, arrayList);
        this.f27806t = Color.rgb(255, 187, 115);
    }

    @Override // x7.b
    public final int U() {
        return this.f27806t;
    }
}
