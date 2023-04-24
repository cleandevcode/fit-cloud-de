package h8;

import h8.h;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f15968a;

    /* renamed from: b */
    public final Object f15969b;

    /* renamed from: c */
    public final Object f15970c;

    public /* synthetic */ j0(Object obj, Object obj2, int i10) {
        this.f15968a = i10;
        this.f15969b = obj;
        this.f15970c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15968a) {
            case 0:
                h.b bVar = (h.b) this.f15970c;
                Object obj = ((h) this.f15969b).f15957b;
                if (obj == null) {
                    bVar.b();
                    return;
                }
                try {
                    bVar.a(obj);
                    return;
                } catch (RuntimeException e10) {
                    bVar.b();
                    throw e10;
                }
            default:
                ((pm.i) this.f15970c).H((pm.b0) this.f15969b, tl.l.f28297a);
                return;
        }
    }
}
