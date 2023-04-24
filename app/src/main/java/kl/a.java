package kl;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a */
    public final Object[] f18616a;

    /* renamed from: b */
    public Object[] f18617b;

    /* renamed from: c */
    public int f18618c;

    /* renamed from: kl.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0322a<T> extends wk.f<T> {
        @Override // wk.f
        boolean test(T t10);
    }

    public a() {
        Object[] objArr = new Object[5];
        this.f18616a = objArr;
        this.f18617b = objArr;
    }

    public final void a(T t10) {
        int i10 = this.f18618c;
        if (i10 == 4) {
            Object[] objArr = new Object[5];
            this.f18617b[4] = objArr;
            this.f18617b = objArr;
            i10 = 0;
        }
        this.f18617b[i10] = t10;
        this.f18618c = i10 + 1;
    }

    public final void b(InterfaceC0322a<? super T> interfaceC0322a) {
        Object obj;
        for (Object[] objArr = this.f18616a; objArr != null; objArr = objArr[4]) {
            for (int i10 = 0; i10 < 4 && (obj = objArr[i10]) != null; i10++) {
                if (interfaceC0322a.test(obj)) {
                    return;
                }
            }
        }
    }
}
