package l2;

import java.util.ArrayList;
import java.util.List;
import l2.b1;

/* loaded from: classes.dex */
public final class u2<R, T extends R> {

    /* renamed from: a */
    public final int f19278a;

    /* renamed from: b */
    public final fm.q<T, T, xl.d<? super R>, Object> f19279b;

    /* renamed from: c */
    public final ArrayList f19280c;

    /* renamed from: d */
    public boolean f19281d;

    /* renamed from: e */
    public boolean f19282e;

    /* renamed from: f */
    public final w0 f19283f;

    /* renamed from: g */
    public q0 f19284g;

    /* renamed from: h */
    public int f19285h;

    /* renamed from: i */
    public int f19286i;

    /* renamed from: j */
    public boolean f19287j;

    /* renamed from: k */
    public boolean f19288k;

    @zl.e(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {213, 215}, m = "onEvent")
    /* loaded from: classes.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public u2 f19289d;

        /* renamed from: e */
        public /* synthetic */ Object f19290e;

        /* renamed from: f */
        public final /* synthetic */ u2<R, T> f19291f;

        /* renamed from: g */
        public int f19292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u2<R, T> u2Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f19291f = u2Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19290e = obj;
            this.f19292g |= Integer.MIN_VALUE;
            return this.f19291f.a(null, this);
        }
    }

    @zl.e(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {305, 368, 380, 386, 398, 407, 429, 438, 451, 462}, m = "onInsert")
    /* loaded from: classes.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public u2 f19293d;

        /* renamed from: e */
        public b1.b f19294e;

        /* renamed from: f */
        public ArrayList f19295f;

        /* renamed from: g */
        public ArrayList f19296g;

        /* renamed from: h */
        public Object f19297h;

        /* renamed from: i */
        public Object f19298i;

        /* renamed from: j */
        public Object f19299j;

        /* renamed from: k */
        public Object f19300k;

        /* renamed from: l */
        public Object f19301l;

        /* renamed from: m */
        public ArrayList f19302m;

        /* renamed from: n */
        public boolean f19303n;

        /* renamed from: o */
        public int f19304o;

        /* renamed from: p */
        public int f19305p;

        /* renamed from: q */
        public int f19306q;

        /* renamed from: r */
        public int f19307r;

        /* renamed from: s */
        public /* synthetic */ Object f19308s;

        /* renamed from: t */
        public final /* synthetic */ u2<R, T> f19309t;

        /* renamed from: u */
        public int f19310u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u2<R, T> u2Var, xl.d<? super b> dVar) {
            super(dVar);
            this.f19309t = u2Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19308s = obj;
            this.f19310u |= Integer.MIN_VALUE;
            return this.f19309t.b(null, this);
        }
    }

    public u2(w2 w2Var) {
        gm.k.b(2, "terminalSeparatorType");
        this.f19278a = 2;
        this.f19279b = w2Var;
        this.f19280c = new ArrayList();
        this.f19283f = new w0();
    }

    public static g3 c(g3 g3Var) {
        int i10;
        Integer num;
        int intValue;
        Integer num2;
        int[] iArr = g3Var.f18900a;
        List q10 = h7.a.q(ul.q.H(g3Var.f18901b), ul.q.N(g3Var.f18901b));
        int i11 = g3Var.f18902c;
        Integer[] numArr = new Integer[2];
        List<Integer> list = g3Var.f18903d;
        if (list == null || (num2 = (Integer) ul.q.H(list)) == null) {
            i10 = 0;
        } else {
            i10 = num2.intValue();
        }
        numArr[0] = Integer.valueOf(i10);
        List<Integer> list2 = g3Var.f18903d;
        if (list2 == null) {
            num = null;
        } else {
            num = (Integer) ul.q.N(list2);
        }
        if (num == null) {
            intValue = h7.a.k(g3Var.f18901b);
        } else {
            intValue = num.intValue();
        }
        numArr[1] = Integer.valueOf(intValue);
        return new g3(iArr, q10, i11, h7.a.q(numArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00c2, code lost:
        if (r2 != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(l2.b1<T> r11, xl.d<? super l2.b1<R>> r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.u2.a(l2.b1, xl.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:334:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0496 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x05b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x06e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x07ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:602:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x08c4  */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:507:0x0497 -> B:508:0x04a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:573:0x06e5 -> B:574:0x06f0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:602:0x07eb -> B:603:0x07ec). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(l2.b1.b<T> r27, xl.d<? super l2.b1.b<R>> r28) {
        /*
            Method dump skipped, instructions count: 2282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.u2.b(l2.b1$b, xl.d):java.lang.Object");
    }
}
