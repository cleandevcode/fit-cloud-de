package com.mob.tools.network;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class StringPart extends HTTPPart {

    /* renamed from: a */
    private StringBuilder f9161a = new StringBuilder();

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() {
        return new ByteArrayInputStream(this.f9161a.toString().getBytes("utf-8"));
    }

    public StringPart append(String str) {
        this.f9161a.append(str);
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() {
        return this.f9161a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f9161a.toString();
    }
}
