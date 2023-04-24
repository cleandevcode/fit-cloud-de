package sm;

/* loaded from: classes2.dex */
public class d<T> extends tm.f<T> {

    /* renamed from: d */
    public final fm.p<rm.t<? super T>, xl.d<? super tl.l>, Object> f27135d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(fm.p<? super rm.t<? super T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.f fVar, int i10, rm.f fVar2) {
        super(fVar, i10, fVar2);
        this.f27135d = pVar;
    }

    @Override // tm.f
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("block[");
        a10.append(this.f27135d);
        a10.append("] -> ");
        a10.append(super.toString());
        return a10.toString();
    }
}
