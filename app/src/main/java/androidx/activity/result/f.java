package androidx.activity.result;

/* loaded from: classes.dex */
public final class f extends c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f756a;

    /* renamed from: b */
    public final /* synthetic */ e.a f757b;

    /* renamed from: c */
    public final /* synthetic */ g f758c;

    public f(g gVar, String str, e.a aVar) {
        this.f758c = gVar;
        this.f756a = str;
        this.f757b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        Integer num = (Integer) this.f758c.f761c.get(this.f756a);
        if (num != null) {
            this.f758c.f763e.add(this.f756a);
            try {
                this.f758c.b(num.intValue(), this.f757b, obj);
                return;
            } catch (Exception e10) {
                this.f758c.f763e.remove(this.f756a);
                throw e10;
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        a10.append(this.f757b);
        a10.append(" and input ");
        a10.append(obj);
        a10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(a10.toString());
    }

    @Override // androidx.activity.result.c
    public final void c() {
        this.f758c.f(this.f756a);
    }
}
