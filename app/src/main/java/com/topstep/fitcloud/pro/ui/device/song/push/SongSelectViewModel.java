package com.topstep.fitcloud.pro.ui.device.song.push;

import android.content.Context;
import androidx.lifecycle.l0;
import ci.d;
import ci.f;
import ci.t0;
import ci.u0;
import gm.l;
import kotlin.Metadata;
import v6.b;

@Metadata
/* loaded from: classes2.dex */
public final class SongSelectViewModel extends b<ei.a<f>> {

    /* renamed from: j */
    public final Context f11407j;

    /* renamed from: k */
    public final d f11408k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SongSelectViewModel(l0 l0Var, Context context) {
        super(new ei.a(null, 1, null), l0Var);
        l.f(l0Var, "savedStateHandle");
        l.f(context, "context");
        this.f11407j = context;
        if (l0Var.f2739a.containsKey("formats")) {
            Integer num = (Integer) l0Var.f2739a.get("formats");
            if (num != null) {
                if (l0Var.f2739a.containsKey("remainingSize")) {
                    Integer num2 = (Integer) l0Var.f2739a.get("remainingSize");
                    if (num2 != null) {
                        this.f11408k = new d(num.intValue(), num2.intValue());
                        b.f(this, new t0(this, null), null, u0.f4837b, 3);
                        return;
                    }
                    throw new IllegalArgumentException("Argument \"remainingSize\" of type integer does not support null values");
                }
                throw new IllegalArgumentException("Required argument \"remainingSize\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"formats\" of type integer does not support null values");
        }
        throw new IllegalArgumentException("Required argument \"formats\" is missing and does not have an android:defaultValue");
    }
}
