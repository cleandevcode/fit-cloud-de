package sa;

/* loaded from: classes.dex */
public final class d implements p<Object> {

    /* renamed from: a */
    public final /* synthetic */ Class f26748a;

    public d(Class cls) {
        this.f26748a = cls;
    }

    @Override // sa.p
    public final Object a() {
        try {
            return v.f26807a.b(this.f26748a);
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Unable to create instance of ");
            a10.append(this.f26748a);
            a10.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(a10.toString(), e10);
        }
    }
}
