package com.topstep.fitcloud.pro.model.utils.moshi;

import dg.a;
import gm.l;
import java.util.Date;
import mf.k0;
import mf.o;
import tl.e;

@e
/* loaded from: classes2.dex */
public final class DateAdapter {
    @DateField
    @o
    public final Date fromJson(String str) {
        l.f(str, "str");
        return a.c(str);
    }

    @k0
    public final String toJson(@DateField Date date) {
        l.f(date, "date");
        return a.a(date);
    }
}
