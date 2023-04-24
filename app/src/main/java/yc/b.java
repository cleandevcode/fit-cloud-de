package yc;

import java.util.UUID;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public boolean f31435a = false;

    /* renamed from: b */
    public boolean f31436b = false;

    /* renamed from: c */
    public boolean f31437c = true;

    /* renamed from: d */
    public UUID f31438d = d.f31440f;

    /* renamed from: e */
    public int f31439e = 0;

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("BeeProParameters{");
        Boolean bool = Boolean.FALSE;
        a10.append(String.format("\n\tserverEnabled=%b,", bool));
        a10.append(String.format("\n\tconnectA2dp=%b,", Boolean.valueOf(this.f31436b)));
        a10.append(String.format("\n\tlistenA2dp=%b, listenHfp=%b\n", bool, Boolean.valueOf(this.f31435a)));
        a10.append(String.format("\n\tsyncDataWhenConnected=%b,", Boolean.valueOf(this.f31437c)));
        a10.append("\n}");
        return a10.toString();
    }
}
