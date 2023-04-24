package l2;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements wk.f {
    public static String a(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    @Override // wk.f
    public boolean test(Object obj) {
        boolean z10;
        bj.b bVar = (bj.b) obj;
        if (bVar.f4397a == 5 && bVar.f4398b == 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10).booleanValue();
    }
}
