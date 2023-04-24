package n1;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import n1.f;
import s.i0;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ e f21923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, i0 i0Var) {
        super(inputConnection, false);
        this.f21923a = i0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        f fVar;
        e eVar = this.f21923a;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            fVar = null;
        } else {
            fVar = new f(new f.a(inputContentInfo));
        }
        if (((i0) eVar).c(fVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
