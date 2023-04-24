package com.topstep.fitcloud.pro.model.utils.moshi;

import dg.a;
import gm.l;
import java.util.Date;
import mf.k0;
import mf.o;
import tl.e;

@e
/* loaded from: classes2.dex */
public final class TimeAdapter {
    @o
    @TimeField
    public final Date fromJson(String str) {
        l.f(str, "str");
        return a.d(str);
    }

    @k0
    public final String toJson(@TimeField Date date) {
        l.f(date, "date");
        return a.b(date);
    }
}
