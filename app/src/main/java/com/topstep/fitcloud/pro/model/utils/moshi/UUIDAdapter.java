package com.topstep.fitcloud.pro.model.utils.moshi;

import gm.l;
import java.util.Locale;
import java.util.UUID;
import mf.k0;
import mf.o;
import tl.e;

@e
/* loaded from: classes2.dex */
public final class UUIDAdapter {
    @o
    public final UUID fromJson(String str) {
        l.f(str, "str");
        UUID fromString = UUID.fromString(str);
        l.e(fromString, "fromString(str)");
        return fromString;
    }

    @k0
    public final String toJson(UUID uuid) {
        l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        l.e(uuid2, "uuid.toString()");
        Locale locale = Locale.US;
        l.e(locale, "US");
        String upperCase = uuid2.toUpperCase(locale);
        l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
