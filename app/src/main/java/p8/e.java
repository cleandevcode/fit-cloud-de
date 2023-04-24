package p8;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f23962a;

    /* renamed from: b */
    public final /* synthetic */ Intent f23963b;

    public e(Context context, Intent intent) {
        this.f23962a = context;
        this.f23963b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f23962a.startActivity(this.f23963b);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
