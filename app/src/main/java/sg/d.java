package sg;

import android.net.Uri;
import fm.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.feedback.FeedbackRepositoryImpl$getImageUrls$2", f = "FeedbackRepository.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<e0, xl.d<? super String>, Object> {

    /* renamed from: e */
    public ArrayList f26985e;

    /* renamed from: f */
    public Iterator f26986f;

    /* renamed from: g */
    public File f26987g;

    /* renamed from: h */
    public int f26988h;

    /* renamed from: i */
    public final /* synthetic */ List<Uri> f26989i;

    /* renamed from: j */
    public final /* synthetic */ f f26990j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends Uri> list, f fVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f26989i = list;
        this.f26990j = fVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super String> dVar) {
        return ((d) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f26989i, this.f26990j, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:18|(1:19)|20|(1:22)|23|24|(1:26)(5:28|8|9|(0)(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00b3, code lost:
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00b5, code lost:
        r8.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00b9, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c0, code lost:
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00c3, code lost:
        r12 = r0;
        r0 = r14;
        r14 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00cf, code lost:
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00d2, code lost:
        r8 = p000do.a.f13275a;
        r8.t("Feedback");
        r8.q(r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b0 A[Catch: all -> 0x00bb, Exception -> 0x00be, TRY_LEAVE, TryCatch #2 {Exception -> 0x00be, blocks: (B:126:0x009f, B:131:0x00b0), top: B:164:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x009b -> B:164:0x009f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x00b5 -> B:149:0x00da). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x00cf -> B:149:0x00da). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x00d2 -> B:149:0x00da). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.d.t(java.lang.Object):java.lang.Object");
    }
}
