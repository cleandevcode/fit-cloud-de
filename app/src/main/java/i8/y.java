package i8;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f16730a;

    /* renamed from: b */
    public final /* synthetic */ Activity f16731b;

    /* renamed from: c */
    public final /* synthetic */ int f16732c = 2;

    public y(Activity activity, Intent intent) {
        this.f16730a = intent;
        this.f16731b = activity;
    }

    @Override // i8.a0
    public final void a() {
        Intent intent = this.f16730a;
        if (intent != null) {
            this.f16731b.startActivityForResult(intent, this.f16732c);
        }
    }
}
