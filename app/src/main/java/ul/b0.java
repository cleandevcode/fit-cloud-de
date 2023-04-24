package ul;

import java.util.Iterator;
import java.util.List;

@zl.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.h implements fm.p<nm.i<? super List<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: c */
    public Object f28853c;

    /* renamed from: d */
    public Iterator f28854d;

    /* renamed from: e */
    public int f28855e;

    /* renamed from: f */
    public int f28856f;

    /* renamed from: g */
    public /* synthetic */ Object f28857g;

    /* renamed from: h */
    public final /* synthetic */ int f28858h;

    /* renamed from: i */
    public final /* synthetic */ int f28859i;

    /* renamed from: j */
    public final /* synthetic */ Iterator<Object> f28860j;

    /* renamed from: k */
    public final /* synthetic */ boolean f28861k;

    /* renamed from: l */
    public final /* synthetic */ boolean f28862l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i10, int i11, Iterator<Object> it, boolean z10, boolean z11, xl.d<? super b0> dVar) {
        super(dVar);
        this.f28858h = i10;
        this.f28859i = i11;
        this.f28860j = it;
        this.f28861k = z10;
        this.f28862l = z11;
    }

    @Override // fm.p
    public final Object A(nm.i<? super List<Object>> iVar, xl.d<? super tl.l> dVar) {
        return ((b0) p(iVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        b0 b0Var = new b0(this.f28858h, this.f28859i, this.f28860j, this.f28861k, this.f28862l, dVar);
        b0Var.f28857g = obj;
        return b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x019c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x00a4 -> B:143:0x00a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0119 -> B:189:0x0166). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x013f -> B:189:0x0166). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x015e -> B:188:0x0161). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x0193 -> B:204:0x0196). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ul.b0.t(java.lang.Object):java.lang.Object");
    }
}
