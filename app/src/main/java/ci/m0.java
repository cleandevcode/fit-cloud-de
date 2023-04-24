package ci;

import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$enterTransfer$1", f = "SongPushViewModel.kt", l = {255, 261, 270, 274, 270, 274, 270, 274, 281}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public Object f4797e;

    /* renamed from: f */
    public int f4798f;

    /* renamed from: g */
    public int f4799g;

    /* renamed from: h */
    public int f4800h;

    /* renamed from: i */
    public int f4801i;

    /* renamed from: j */
    public final /* synthetic */ SongPushViewModel f4802j;

    /* renamed from: k */
    public final /* synthetic */ List<ci.a> f4803k;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ SongPushViewModel f4804a;

        /* renamed from: b */
        public final /* synthetic */ List<ci.a> f4805b;

        /* renamed from: c */
        public final /* synthetic */ int f4806c;

        public a(SongPushViewModel songPushViewModel, List<ci.a> list, int i10) {
            this.f4804a = songPushViewModel;
            this.f4805b = list;
            this.f4806c = i10;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            int intValue = ((Number) obj).intValue();
            this.f4804a.f11392t.setValue(new v0(this.f4806c, intValue, this.f4805b));
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(SongPushViewModel songPushViewModel, List<ci.a> list, xl.d<? super m0> dVar) {
        super(2, dVar);
        this.f4802j = songPushViewModel;
        this.f4803k = list;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((m0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new m0(this.f4802j, this.f4803k, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:53|54|55|56|(1:58)(7:59|60|61|(1:63)|45|46|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x011e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x011f, code lost:
        r16 = r10;
        r10 = r9;
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x013c -> B:137:0x0057). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.m0.t(java.lang.Object):java.lang.Object");
    }
}
