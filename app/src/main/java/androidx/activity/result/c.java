package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class c<I> {
    public final void a(@SuppressLint({"UnknownNullness"}) Intent intent) {
        b(intent);
    }

    public abstract void b(@SuppressLint({"UnknownNullness"}) Object obj);

    public abstract void c();
}
