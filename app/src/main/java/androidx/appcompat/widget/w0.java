package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class w0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TextView f1590a;

    /* renamed from: b */
    public final /* synthetic */ Typeface f1591b;

    /* renamed from: c */
    public final /* synthetic */ int f1592c;

    public w0(TextView textView, Typeface typeface, int i10) {
        this.f1590a = textView;
        this.f1591b = typeface;
        this.f1592c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1590a.setTypeface(this.f1591b, this.f1592c);
    }
}
