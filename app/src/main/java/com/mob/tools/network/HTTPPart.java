package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class HTTPPart implements PublicMemberKeeper {

    /* renamed from: a */
    private long f9119a;

    /* renamed from: b */
    private OnReadListener f9120b;

    public abstract InputStream a();

    public abstract long b();

    public Object getInputStreamEntity() {
        InputStream inputStream = toInputStream();
        long b10 = b() - this.f9119a;
        ReflectHelper.importClass("org.apache.http.entity.InputStreamEntity");
        return ReflectHelper.newInstance("InputStreamEntity", inputStream, Long.valueOf(b10));
    }

    public void setOffset(long j10) {
        this.f9119a = j10;
    }

    public void setOnReadListener(OnReadListener onReadListener) {
        this.f9120b = onReadListener;
    }

    public InputStream toInputStream() {
        return new ByteCounterInputStream(a());
    }
}
