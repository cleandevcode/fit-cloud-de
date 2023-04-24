package a0;

import a0.l0;
import java.util.Comparator;
import yj.b;

/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f135a;

    public /* synthetic */ m1(int i10) {
        this.f135a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f135a) {
            case 0:
                return ((l0.a) obj).b().compareTo(((l0.a) obj2).b());
            case 1:
                return (int) (((vf.g) obj).a().getTime() - ((vf.g) obj2).a().getTime());
            default:
                return (int) (((b.C0600b) obj).f31784a - ((b.C0600b) obj2).f31784a);
        }
    }
}
