package j0;

import a0.m0;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import d0.i;
import p0.c;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements d0.a {

    /* renamed from: a */
    public final /* synthetic */ d f17226a;

    /* renamed from: b */
    public final /* synthetic */ int f17227b;

    /* renamed from: c */
    public final /* synthetic */ Size f17228c;

    /* renamed from: d */
    public final /* synthetic */ Rect f17229d;

    /* renamed from: e */
    public final /* synthetic */ int f17230e;

    /* renamed from: f */
    public final /* synthetic */ boolean f17231f;

    public /* synthetic */ c(d dVar, int i10, Size size, Rect rect, int i11, boolean z10) {
        this.f17226a = dVar;
        this.f17227b = i10;
        this.f17228c = size;
        this.f17229d = rect;
        this.f17230e = i11;
        this.f17231f = z10;
    }

    @Override // d0.a
    public final na.a apply(Object obj) {
        d dVar = this.f17226a;
        int i10 = this.f17227b;
        Size size = this.f17228c;
        Rect rect = this.f17229d;
        int i11 = this.f17230e;
        boolean z10 = this.f17231f;
        dVar.getClass();
        ((Surface) obj).getClass();
        try {
            dVar.e();
            f fVar = new f(i10, size, rect, i11, z10);
            c.d dVar2 = fVar.f17246c;
            dVar2.f23758b.a(new androidx.activity.b(4, dVar), o8.b.i());
            dVar.f17240t = fVar;
            return d0.f.e(fVar);
        } catch (m0.a e10) {
            return new i.a(e10);
        }
    }
}
