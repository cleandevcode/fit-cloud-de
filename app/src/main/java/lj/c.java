package lj;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import gm.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final AudioManager f20040a;

    /* renamed from: b */
    public Integer f20041b;

    /* renamed from: c */
    public boolean f20042c;

    /* renamed from: d */
    public boolean f20043d;

    public c(Context context) {
        l.f(context, "context");
        Object systemService = context.getSystemService("audio");
        l.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f20040a = (AudioManager) systemService;
    }

    public final void a(int i10) {
        this.f20040a.dispatchMediaKeyEvent(new KeyEvent(0, i10));
        this.f20040a.dispatchMediaKeyEvent(new KeyEvent(1, i10));
    }
}
