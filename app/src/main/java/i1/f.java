package i1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final d f16213a = new d(null, false);

    /* renamed from: b */
    public static final d f16214b = new d(null, true);

    /* renamed from: c */
    public static final d f16215c;

    /* renamed from: d */
    public static final d f16216d;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a */
        public static final a f16217a = new a();

        @Override // i1.f.b
        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = f.f16213a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements e {

        /* renamed from: a */
        public final b f16218a;

        public c(a aVar) {
            this.f16218a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
                b bVar = this.f16218a;
                if (bVar == null) {
                    return a();
                }
                int a10 = bVar.a(charSequence, i10);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    return a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b */
        public final boolean f16219b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f16219b = z10;
        }

        @Override // i1.f.c
        public final boolean a() {
            return this.f16219b;
        }
    }

    static {
        a aVar = a.f16217a;
        f16215c = new d(aVar, false);
        f16216d = new d(aVar, true);
    }
}
