package com.topstep.fitcloud.pro.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import f.q;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class j extends q {
    public static final /* synthetic */ int B0 = 0;

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        bVar.d(R.string.weather_location_dialog_msg);
        bVar.f(null);
        bVar.h(17039370, new rh.h(this, 2));
        return bVar.a();
    }
}
