package z6;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import z6.c;

/* loaded from: classes.dex */
public abstract class a<T extends View> {

    /* renamed from: a */
    public final c.a f31975a;

    /* renamed from: b */
    public final tl.d f31976b;

    /* renamed from: c */
    public boolean f31977c;

    /* renamed from: d */
    public final T f31978d;

    /* renamed from: e */
    public boolean f31979e;

    /* renamed from: f */
    public boolean f31980f;

    /* renamed from: g */
    public boolean f31981g;

    /* renamed from: h */
    public boolean f31982h;

    /* renamed from: z6.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0609a {
        void a(Bitmap bitmap);
    }

    public a(c.a aVar, FrameLayout frameLayout) {
        this.f31975a = aVar;
        new WeakReference(frameLayout);
        this.f31976b = fb.e.a(new b((f) this));
        h b10 = b(aVar.f31985a, null);
        this.f31978d = b10;
        frameLayout.addView(b10, 0);
        this.f31979e = true;
        this.f31980f = true;
    }

    public abstract h b(Context context, y6.c cVar);
}
