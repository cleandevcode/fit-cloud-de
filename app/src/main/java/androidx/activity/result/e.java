package androidx.activity.result;

/* loaded from: classes.dex */
public final class e extends c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f753a;

    /* renamed from: b */
    public final /* synthetic */ e.a f754b;

    /* renamed from: c */
    public final /* synthetic */ g f755c;

    public e(g gVar, String str, e.a aVar) {
        this.f755c = gVar;
        this.f753a = str;
        this.f754b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        Integer num = (Integer) this.f755c.f761c.get(this.f753a);
        if (num != null) {
            this.f755c.f763e.add(this.f753a);
            try {
                this.f755c.b(num.intValue(), this.f754b, obj);
                return;
            } catch (Exception e10) {
                this.f755c.f763e.remove(this.f753a);
                throw e10;
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        a10.append(this.f754b);
        a10.append(" and input ");
        a10.append(obj);
        a10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(a10.toString());
    }

    @Override // androidx.activity.result.c
    public final void c() {
        this.f755c.f(this.f753a);
    }
}
