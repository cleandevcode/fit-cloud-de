package g8;

/* loaded from: classes.dex */
public final class j extends UnsupportedOperationException {

    /* renamed from: a */
    public final f8.c f15031a;

    public j(f8.c cVar) {
        this.f15031a = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15031a));
    }
}
