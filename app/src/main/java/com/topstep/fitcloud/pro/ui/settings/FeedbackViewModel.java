package com.topstep.fitcloud.pro.ui.settings;

import android.net.Uri;
import androidx.lifecycle.l0;
import java.util.ArrayList;
import kotlin.Metadata;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class FeedbackViewModel extends nh.e<l> {

    /* renamed from: h */
    public final sg.b f11856h;

    /* renamed from: i */
    public final ArrayList<Uri> f11857i;

    public FeedbackViewModel(l0 l0Var, sg.f fVar) {
        gm.l.f(l0Var, "savedStateHandle");
        this.f11856h = fVar;
        ArrayList<Uri> arrayList = (ArrayList) l0Var.f2739a.get("images");
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            l0Var.d("images", arrayList);
        }
        this.f11857i = arrayList;
    }
}
