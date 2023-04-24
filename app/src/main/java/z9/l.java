package z9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.a0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c */
    public float f32154c;

    /* renamed from: e */
    public WeakReference<b> f32156e;

    /* renamed from: f */
    public da.e f32157f;

    /* renamed from: a */
    public final TextPaint f32152a = new TextPaint(1);

    /* renamed from: b */
    public final a f32153b = new a();

    /* renamed from: d */
    public boolean f32155d = true;

    /* loaded from: classes.dex */
    public class a extends a0 {
        public a() {
            l.this = r1;
        }

        @Override // androidx.fragment.app.a0
        public final void v(int i10) {
            l lVar = l.this;
            lVar.f32155d = true;
            b bVar = lVar.f32156e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.fragment.app.a0
        public final void w(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            l lVar = l.this;
            lVar.f32155d = true;
            b bVar = lVar.f32156e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public l(b bVar) {
        this.f32156e = new WeakReference<>(null);
        this.f32156e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f32155d) {
            return this.f32154c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.f32152a.measureText((CharSequence) str, 0, str.length());
        }
        this.f32154c = measureText;
        this.f32155d = false;
        return measureText;
    }

    public final void b(da.e eVar, Context context) {
        if (this.f32157f != eVar) {
            this.f32157f = eVar;
            if (eVar != null) {
                eVar.f(context, this.f32152a, this.f32153b);
                b bVar = this.f32156e.get();
                if (bVar != null) {
                    this.f32152a.drawableState = bVar.getState();
                }
                eVar.e(context, this.f32152a, this.f32153b);
                this.f32155d = true;
            }
            b bVar2 = this.f32156e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
